package com.uy.antel.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.math.BigDecimal;


public class xml {

	public void generarXML() {
		ATObjectFactory factory = new ATObjectFactory();

		JAXBElement<String> Matricula = factory.createAltatickettypeMatricula("AAA1234");

		
		JAXBContext context = JAXBContext.newInstance("generated");

		JAXBElement<ExpenseT> element = factory.createExpenseReport(expense);

		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);

		marshaller.marshal(element, System.out);

	}
}
