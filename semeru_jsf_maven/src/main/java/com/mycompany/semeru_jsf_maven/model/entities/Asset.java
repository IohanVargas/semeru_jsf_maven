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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iohan
 */


import com.redhat.gss.redhat_support_lib.parsers.Solution;
import com.sun.org.glassfish.gmbal.Description;
import com.sun.prism.Texture.Usage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.registry.infomodel.Classification;
import sun.java2d.cmm.Profile;


/**
 * xmi:ordered=true
 * 
 * association order is (these are role names)
 *  1. profile
 *  2. description
 *  3. classification
 *  4. solution
 *  5. usage
 *  6. relatedAsset
 * 
 * This is a descriptive container for an asset's artifacts. The artifacts may include models, source code, requirements, test cases, documentation, and so on.
 * 
 * Every RAS manifest document begins with a single Asset element.  This element defines the identity of the reusable software asset.
 * 
 * An asset package is always in RAS format.  However, it may not be RAS-compliant, meaning it passes all integrity constraints as documented in RAS (e.g., required content supplied).
 * 
 * An asset package contains or references the artifacts of the asset itself. The artifacts of the asset are the things that are actually reused. Some artifacts are descriptive content which helps the Asset Conumer understand the asset, and provide guidance on how to apply the asset. This guidance may be in the form of documentation, or may be executable install programs or scripts that automate the injection of an asset's artifacts into another project (such binaries can be included as part of the descriptive content of the asset's package).
 * 
 * Assets vary in their size, complexity, and variability.
 * 
 * The asset package, as a whole, should provide enough information to allow the Asset Consumer to decide if he/she wants to purchase/use the asset.
 * 
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classification" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}Classification" minOccurs="0"/&gt;
 *         &lt;element name="solution" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}Solution"/&gt;
 *         &lt;element name="usage" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}Usage" minOccurs="0"/&gt;
 *         &lt;element name="relatedAsset" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}RelatedAsset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="profile" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}Profile"/&gt;
 *         &lt;element name="description" type="{http://www.omg.org/spec/RAS/20060101/DefaultprofileXML.xsd}Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accessRights" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "classification",
    "solution",
    "usage",
    "relatedAsset",
    "profile",
    "description"
})
public class Asset {

    protected Classification classification;
    @XmlElement(required = true)
    protected Solution solution;
    protected Usage usage;
    protected List<RelatedAsset> relatedAsset;
    @XmlElement(required = true)
    protected Profile profile;
    protected Description description;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "date")
    protected String date;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "accessRights")
    protected String accessRights;
    @XmlAttribute(name = "shortDescription")
    protected String shortDescription;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link Classification }
     *     
     */
    public Classification getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classification }
     *     
     */
    public void setClassification(Classification value) {
        this.classification = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link Solution }
     *     
     */
    public Solution getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Solution }
     *     
     */
    public void setSolution(Solution value) {
        this.solution = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Usage }
     *     
     */
    public Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage }
     *     
     */
    public void setUsage(Usage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the relatedAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedAsset }
     * 
     * 
     */
    public List<RelatedAsset> getRelatedAsset() {
        if (relatedAsset == null) {
            relatedAsset = new ArrayList<RelatedAsset>();
        }
        return this.relatedAsset;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setProfile(Profile value) {
        this.profile = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the accessRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessRights() {
        return accessRights;
    }

    /**
     * Sets the value of the accessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessRights(String value) {
        this.accessRights = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

}
