//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.09.23 a las 07:28:23 PM UYT 
//


package com.uy.antel.util;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
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
public class ATObjectFactory {

    private final static QName _Altaticket_QNAME = new QName("", "altaticket");
    private final static QName _AltatickettypeCantidadMinutos_QNAME = new QName("", "cantidadMinutos");
    private final static QName _AltatickettypeMatricula_QNAME = new QName("", "matricula");
    private final static QName _AltatickettypeFechaHoraInicioEst_QNAME = new QName("", "fechaHoraInicioEst");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uy.antel.util
     * 
     */
    public ATObjectFactory() {
    }

    /**
     * Create an instance of {@link Altatickettype }
     * 
     */
    public Altatickettype createAltatickettype() {
        return new Altatickettype();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Altatickettype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "altaticket")
    public JAXBElement<Altatickettype> createAltaticket(Altatickettype value) {
        return new JAXBElement<Altatickettype>(_Altaticket_QNAME, Altatickettype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cantidadMinutos", scope = Altatickettype.class)
    public JAXBElement<BigInteger> createAltatickettypeCantidadMinutos(BigInteger value) {
        return new JAXBElement<BigInteger>(_AltatickettypeCantidadMinutos_QNAME, BigInteger.class, Altatickettype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "matricula", scope = Altatickettype.class)
    public JAXBElement<String> createAltatickettypeMatricula(String value) {
        return new JAXBElement<String>(_AltatickettypeMatricula_QNAME, String.class, Altatickettype.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fechaHoraInicioEst", scope = Altatickettype.class)
    public JAXBElement<XMLGregorianCalendar> createAltatickettypeFechaHoraInicioEst(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AltatickettypeFechaHoraInicioEst_QNAME, XMLGregorianCalendar.class, Altatickettype.class, value);
    }

}
