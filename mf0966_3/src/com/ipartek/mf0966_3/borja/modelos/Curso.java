package com.ipartek.mf0966_3.borja.modelos;


public class Curso {
	
	int nHoras;
	String nombre, identificador, nombreProf, apellidosProf, opinion;
	
	
	public Curso() {
		
	}
	
	public Curso(String identificador, String nombre, int nHoras) {
		setnHoras(nHoras);
		setNombre(nombre);
		setIdentificador(identificador);
	}
	
	public Curso(String identificador, String nombre, int nHoras, String nombreProf, String apellidosProf) {
		setnHoras(nHoras);
		setNombre(nombre);
		setIdentificador(identificador);
		setNombreProf(nombreProf);
		setApellidosProf(apellidosProf);
	}

	public Curso(String nombre, String identificador,int nHoras, String nombreProf, String apellidosProf, String opinion) {
		setnHoras(nHoras);
		setNombre(nombre);
		setIdentificador(identificador);
		setNombreProf(nombreProf);
		setApellidosProf(apellidosProf);
		setOpinion(opinion);
	}

	public int getnHoras() {
		return nHoras;
	}

	public void setnHoras(int nHoras) {
		this.nHoras = nHoras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getNombreProf() {
		return nombreProf;
	}

	public void setNombreProf(String nombreProf) {
		this.nombreProf = nombreProf;
	}

	public String getApellidosProf() {
		return apellidosProf;
	}

	public void setApellidosProf(String apellidosProf) {
		this.apellidosProf = apellidosProf;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidosProf == null) ? 0 : apellidosProf.hashCode());
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		result = prime * result + nHoras;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreProf == null) ? 0 : nombreProf.hashCode());
		result = prime * result + ((opinion == null) ? 0 : opinion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (apellidosProf == null) {
			if (other.apellidosProf != null)
				return false;
		} else if (!apellidosProf.equals(other.apellidosProf))
			return false;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		if (nHoras != other.nHoras)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreProf == null) {
			if (other.nombreProf != null)
				return false;
		} else if (!nombreProf.equals(other.nombreProf))
			return false;
		if (opinion == null) {
			if (other.opinion != null)
				return false;
		} else if (!opinion.equals(other.opinion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [nHoras=" + nHoras + ", nombre=" + nombre + ", identificador=" + identificador + ", nombreProf="
				+ nombreProf + ", apellidosProf=" + apellidosProf + ", opinion=" + opinion + "]";
	}
	
	

}
