package com.ipartek.mf0966_3.borja.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ipartek.mf0966_3.borja.global.Global;
import com.ipartek.mf0966_3.borja.modelos.Curso;

/**
 * Servlet implementation class CursoAPI
 */
@WebServlet("/api/cursos/*")
public class CursoAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private static final String URL_ID_VALIDA = "^/\\d+$";
	private static Gson gson = new Gson();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String path = request.getPathInfo();
		
		//Listado de todos los cursos
		if (path == null || path.equals("/")) {
			out.write(gson.toJson(Global.daoCurso.obtenerTodos()));
			response.setStatus(HttpServletResponse.SC_OK);
			return;
		}

		//Curso especifico
		if (path.matches(URL_ID_VALIDA)) {
			String identificador = path.substring(1);

			ArrayList<Curso> curso = Global.daoCurso.obtenerPorIdentificador(identificador);

			if(curso.size() == 0) {
				//Si no encuentra el curso sacamos codigo 404
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			} else {
				//Si encuentra el curso todo esta bien codigo 200
				out.write(gson.toJson(curso));
				response.setStatus(HttpServletResponse.SC_OK);
			}

			return;
		}else {
			//Si no coincide con el patron sacamos codigo 400
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
	}

}
