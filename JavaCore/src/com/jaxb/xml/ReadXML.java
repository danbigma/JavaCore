package com.jaxb.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXML {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Libro.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Libro libro = (Libro) unmarshaller.unmarshal(new File("data/Libro.xml"));

			System.out.println(libro.getTitulo());
			System.out.println(libro.getPaginas());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}