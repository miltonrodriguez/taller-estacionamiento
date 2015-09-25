package com.uy.antel.util;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import java.io.File;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;


public class xml {

	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException, SAXException{
		ObjectFactory factory = new ObjectFactory();

		AltaTicketT altaTicket = factory.createAltaTicketT();
		altaTicket.setCantidadMinutos(BigInteger.valueOf(30));
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				
		altaTicket.setFechaHoraInicioEst(xgc);
		
		altaTicket.setMatricula("SBT6668");
		
		

		
		JAXBContext context = JAXBContext.newInstance("com.uy.antel.util");

		JAXBElement<AltaTicketT> elemento = factory.createAltaTicket(altaTicket);
		
		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);

		marshaller.marshal(elemento, System.out);
		
		File fileo = new File("prueba.xml");
		marshaller.marshal(elemento, fileo);
		
		
//		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
//        Schema schema = sf.newSchema(new File("src/com/uy/antel/util/altaTicket.xsd"));
		
//		File filei = new File("prueba2.xml");
//		JAXBContext jaxbContext = JAXBContext.newInstance(AltaTicketT.class);
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		//jaxbUnmarshaller.setSchema(schema);
//		Object pru = jaxbUnmarshaller.unmarshal(filei);
//		System.out.println(pru);
				

	}
}
