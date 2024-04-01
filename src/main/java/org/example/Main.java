package org.example;


import ar.unrn.modelo.Persona;
import ar.unrn.modelo.Personas;

public class Main {
	public static void main(String[] args) {
		var p1 = new Persona("Eko", "Trap");
		var p2 = new Persona("Toto", "Tato");
		var p3 = new Persona("Rosi", "Porte");

		var personas = new Personas();
		personas.agregarPersona(p1);
		personas.agregarPersona(p2);
		personas.agregarPersona(p3);

		var personasConInicialE = personas.filtrarPersonas((persona) -> persona.nombreEmpiezaConLetra("E"));
		System.out.println("Personas con la inicial 'E': " + personasConInicialE.toString());

		var personasConCantidadLetrasNombrePar = personas.filtrarPersonas((persona) -> persona.cantidadLetrasNombrePar());
		System.out.println("Personas con cantidad de Letras en el nombre par: " + personasConCantidadLetrasNombrePar.toString());
	}
}