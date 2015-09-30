//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.09.29 a las 11:31:06 PM UYT 
//


package com.uy.antel.xml.AltaTicket;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricula" type="{}matriculaT"/>
 *         &lt;element name="fechaHoraInicioEst" type="{}fechaEstT"/>
 *         &lt;element name="cantidadMinutos" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="nroTerminal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "matricula",
    "fechaHoraInicioEst",
    "cantidadMinutos",
    "nroTerminal"
})
@XmlRootElement(name = "xmlAltaTicket")
public class XmlAltaTicket {

    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraInicioEst;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cantidadMinutos;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nroTerminal;

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraInicioEst.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraInicioEst() {
        return fechaHoraInicioEst;
    }

    /**
     * Define el valor de la propiedad fechaHoraInicioEst.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraInicioEst(XMLGregorianCalendar value) {
        this.fechaHoraInicioEst = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadMinutos.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadMinutos() {
        return cantidadMinutos;
    }

    /**
     * Define el valor de la propiedad cantidadMinutos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadMinutos(BigInteger value) {
        this.cantidadMinutos = value;
    }

    /**
     * Obtiene el valor de la propiedad nroTerminal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNroTerminal() {
        return nroTerminal;
    }

    /**
     * Define el valor de la propiedad nroTerminal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNroTerminal(BigInteger value) {
        this.nroTerminal = value;
    }

}
