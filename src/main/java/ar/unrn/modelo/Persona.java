package ar.unrn.modelo;

public class Persona {
	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String nombre() {
		return nombre;
	}

	public String apellido() {
		return apellido;
	}

	public boolean nombreEmpiezaConLetra(String inicial) {
		return nombre.startsWith(inicial);
	}

	public boolean cantidadLetrasNombrePar() {
		return (nombre.length() % 2 == 0);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}


}
