package com.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTesting {
	public static void main(String[] args) {
		List<Persona> personas = Arrays.asList(
				new Persona("Ian McKeller", 87, Genero.HOMBRE, Arrays.asList(602252255, 965454545)),
				new Persona("Kelsi Monroe", 33, Genero.MUJER, Arrays.asList(602252255, 654545454)),
				new Persona("Jodi West", 52, Genero.MUJER, Arrays.asList(79895644, 654545454)));

		personas.stream().mapToInt(Persona::getEdad).average().ifPresent(System.out::println);

		Map<Genero, Double> mediaPorEdad = personas.stream()
				.collect(Collectors.groupingBy(Persona::getGenero, Collectors.averagingInt(Persona::getEdad)));
		System.out.println(mediaPorEdad);

		personas.stream().max(Comparator.comparing(Persona::getEdad)).ifPresent(System.out::println);

		personas.stream().filter(p -> Genero.MUJER == p.getGenero()).min(Comparator.comparing(Persona::getEdad))
				.ifPresent(System.out::println);

		boolean bool = personas.stream().map(Persona::getTelefonos).flatMap(Collection::stream).map(Object::toString)
				.allMatch(s -> s.startsWith("6") || s.startsWith("7"));

		personas.stream().map(persona -> persona.getEdad()).reduce(0, Integer::sum);
		personas.stream().map(persona -> persona.getEdad()).reduce(0, (suma, edad) -> suma + edad);
		
		int suma = 0;
		for (Persona persona : personas) {
			int edad = persona.getEdad();
			suma += edad;
		}

		personas.stream().mapToInt(persona -> persona.getEdad()).sum();

		personas.stream().mapToInt(persona -> persona.getEdad()).summaryStatistics();

		personas.stream().map(Persona::getNombre).reduce((acc, curr) -> acc + ", " + curr)
				.ifPresent(System.out::println);
		String s = personas.stream().map(Persona::getNombre).collect(Collectors.joining(", "));
		System.out.println(s);

	}
}
