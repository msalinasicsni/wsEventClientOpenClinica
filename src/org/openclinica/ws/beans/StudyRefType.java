/**
 * StudyRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class StudyRefType  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString identifier;

    private org.openclinica.ws.beans.SiteRefType siteRef;

    public StudyRefType() {
    }

    public StudyRefType(
           org.apache.axis.types.NormalizedString identifier,
           org.openclinica.ws.beans.SiteRefType siteRef) {
           this.identifier = identifier;
           this.siteRef = siteRef;
    }


    /**
     * Gets the identifier value for this StudyRefType.
     * 
     * @return identifier
     */
    public org.apache.axis.types.NormalizedString getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this StudyRefType.
     * 
     * @param identifier
     */
    public void setIdentifier(org.apache.axis.types.NormalizedString identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the siteRef value for this StudyRefType.
     * 
     * @return siteRef
     */
    public org.openclinica.ws.beans.SiteRefType getSiteRef() {
        return siteRef;
    }


    /**
     * Sets the siteRef value for this StudyRefType.
     * 
     * @param siteRef
     */
    public void setSiteRef(org.openclinica.ws.beans.SiteRefType siteRef) {
        this.siteRef = siteRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyRefType)) return false;
        StudyRefType other = (StudyRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.siteRef==null && other.getSiteRef()==null) || 
             (this.siteRef!=null &&
              this.siteRef.equals(other.getSiteRef())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getSiteRef() != null) {
            _hashCode += getSiteRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudyRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "siteRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "siteRefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
