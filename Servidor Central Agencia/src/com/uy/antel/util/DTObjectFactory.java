//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.09.23 a las 07:18:48 PM UYT 
//


package com.uy.antel.util;

import java.math.BigInteger;
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
public class DTObjectFactory {

    private final static QName _Dataticket_QNAME = new QName("", "dataticket");
    private final static QName _DatatickettypeImporteTotal_QNAME = new QName("", "importeTotal");
    private final static QName _DatatickettypeMensaje_QNAME = new QName("", "mensaje");
    private final static QName _DatatickettypeError_QNAME = new QName("", "error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uy.antel.util
     * 
     */
    public DTObjectFactory() {
    }

    /**
     * Create an instance of {@link Datatickettype }
     * 
     */
    public Datatickettype createDatatickettype() {
        return new Datatickettype();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Datatickettype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataticket")
    public JAXBElement<Datatickettype> createDataticket(Datatickettype value) {
        return new JAXBElement<Datatickettype>(_Dataticket_QNAME, Datatickettype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "importeTotal", scope = Datatickettype.class)
    public JAXBElement<BigInteger> createDatatickettypeImporteTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_DatatickettypeImporteTotal_QNAME, BigInteger.class, Datatickettype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mensaje", scope = Datatickettype.class)
    public JAXBElement<String> createDatatickettypeMensaje(String value) {
        return new JAXBElement<String>(_DatatickettypeMensaje_QNAME, String.class, Datatickettype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error", scope = Datatickettype.class)
    public JAXBElement<BigInteger> createDatatickettypeError(BigInteger value) {
        return new JAXBElement<BigInteger>(_DatatickettypeError_QNAME, BigInteger.class, Datatickettype.class, value);
    }

}
