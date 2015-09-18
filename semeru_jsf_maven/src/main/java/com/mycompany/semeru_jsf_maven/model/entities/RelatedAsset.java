/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.semeru_jsf_maven.model.entities;

/**
 *
 * @author iohan
 */
//package org.omg.spec.ras._20060101.defaultprofilexml;

import com.sun.org.glassfish.gmbal.Description;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * xmi:contentType=mixed
 * 
 * <p>Java class for RelatedAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedAsset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="assetId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="assetVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifact" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedAsset", propOrder = {
    "description"
})
public class RelatedAsset {

    protected Description description;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "relationshipType")
    protected String relationshipType;
    @XmlAttribute(name = "assetId")
    protected String assetId;
    @XmlAttribute(name = "assetVersion")
    protected String assetVersion;
    @XmlAttribute(name = "artifact")
    protected String artifact;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    /**
     * Sets the value of the assetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetVersion(String value) {
        this.assetVersion = value;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtifact() {
        return artifact;
    }

    /**
     * Sets the value of the artifact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtifact(String value) {
        this.artifact = value;
    }

}


