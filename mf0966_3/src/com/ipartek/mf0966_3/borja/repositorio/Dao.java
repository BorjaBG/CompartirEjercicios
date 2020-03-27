package com.ipartek.mf0966_3.borja.repositorio;

import java.util.ArrayList;


public interface Dao<T> {
	Iterable<T> obtenerTodos();
	T obtenerPorId(int id);
	ArrayList<T> obtenerPorIdentificador(String identificador);
	Integer agregar(T objeto);
	void eliminar(int id);
	void actualizar(T objeto);
}
