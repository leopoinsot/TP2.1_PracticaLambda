package ar.unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public class Personas {
	List<Persona> personas;

	public Personas() {
		personas = new ArrayList<>();
	}

	public List<Persona> filtrarPersonas(Condicion c) {
		var personasFiltradas = new ArrayList<Persona>();
		for (Persona persona : personas) {
			if (c.condicion(persona)) {
				personasFiltradas.add(persona);
			}
		}
		return personasFiltradas;
	}

	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}

	@Override
	public String toString() {
		var listadoPersonas = "";
		for (Persona persona : personas) {
			listadoPersonas = listadoPersonas + persona.toString() + "\n";
		}
		return listadoPersonas;
	}
}
