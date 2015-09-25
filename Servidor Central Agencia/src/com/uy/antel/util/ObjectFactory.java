//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.09.24 a las 08:24:34 PM UYT 
//


package com.uy.antel.util;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uy.antel.util package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AltaTicket_QNAME = new QName("", "altaTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uy.antel.util
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AltaTicketT }
     * 
     */
    public AltaTicketT createAltaTicketT() {
        return new AltaTicketT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTicketT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "altaTicket")
    public JAXBElement<AltaTicketT> createAltaTicket(AltaTicketT value) {
        return new JAXBElement<AltaTicketT>(_AltaTicket_QNAME, AltaTicketT.class, null, value);
    }

}
