/**
 * EventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class EventType  implements java.io.Serializable {
    private org.openclinica.ws.beans.StudySubjectRefType studySubjectRef;

    private org.openclinica.ws.beans.StudyRefType studyRef;

    private org.apache.axis.types.NormalizedString eventDefinitionOID;

    private org.apache.axis.types.NormalizedString location;

    private java.util.Date startDate;

    private org.apache.axis.types.Time startTime;

    private java.util.Date endDate;

    private org.apache.axis.types.Time endTime;

    public EventType() {
    }

    public EventType(
           org.openclinica.ws.beans.StudySubjectRefType studySubjectRef,
           org.openclinica.ws.beans.StudyRefType studyRef,
           org.apache.axis.types.NormalizedString eventDefinitionOID,
           org.apache.axis.types.NormalizedString location,
           java.util.Date startDate,
           org.apache.axis.types.Time startTime,
           java.util.Date endDate,
           org.apache.axis.types.Time endTime) {
           this.studySubjectRef = studySubjectRef;
           this.studyRef = studyRef;
           this.eventDefinitionOID = eventDefinitionOID;
           this.location = location;
           this.startDate = startDate;
           this.startTime = startTime;
           this.endDate = endDate;
           this.endTime = endTime;
    }


    /**
     * Gets the studySubjectRef value for this EventType.
     * 
     * @return studySubjectRef
     */
    public org.openclinica.ws.beans.StudySubjectRefType getStudySubjectRef() {
        return studySubjectRef;
    }


    /**
     * Sets the studySubjectRef value for this EventType.
     * 
     * @param studySubjectRef
     */
    public void setStudySubjectRef(org.openclinica.ws.beans.StudySubjectRefType studySubjectRef) {
        this.studySubjectRef = studySubjectRef;
    }


    /**
     * Gets the studyRef value for this EventType.
     * 
     * @return studyRef
     */
    public org.openclinica.ws.beans.StudyRefType getStudyRef() {
        return studyRef;
    }


    /**
     * Sets the studyRef value for this EventType.
     * 
     * @param studyRef
     */
    public void setStudyRef(org.openclinica.ws.beans.StudyRefType studyRef) {
        this.studyRef = studyRef;
    }


    /**
     * Gets the eventDefinitionOID value for this EventType.
     * 
     * @return eventDefinitionOID
     */
    public org.apache.axis.types.NormalizedString getEventDefinitionOID() {
        return eventDefinitionOID;
    }


    /**
     * Sets the eventDefinitionOID value for this EventType.
     * 
     * @param eventDefinitionOID
     */
    public void setEventDefinitionOID(org.apache.axis.types.NormalizedString eventDefinitionOID) {
        this.eventDefinitionOID = eventDefinitionOID;
    }


    /**
     * Gets the location value for this EventType.
     * 
     * @return location
     */
    public org.apache.axis.types.NormalizedString getLocation() {
        return location;
    }


    /**
     * Sets the location value for this EventType.
     * 
     * @param location
     */
    public void setLocation(org.apache.axis.types.NormalizedString location) {
        this.location = location;
    }


    /**
     * Gets the startDate value for this EventType.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this EventType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startTime value for this EventType.
     * 
     * @return startTime
     */
    public org.apache.axis.types.Time getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this EventType.
     * 
     * @param startTime
     */
    public void setStartTime(org.apache.axis.types.Time startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endDate value for this EventType.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this EventType.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endTime value for this EventType.
     * 
     * @return endTime
     */
    public org.apache.axis.types.Time getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this EventType.
     * 
     * @param endTime
     */
    public void setEndTime(org.apache.axis.types.Time endTime) {
        this.endTime = endTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventType)) return false;
        EventType other = (EventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.studySubjectRef==null && other.getStudySubjectRef()==null) || 
             (this.studySubjectRef!=null &&
              this.studySubjectRef.equals(other.getStudySubjectRef()))) &&
            ((this.studyRef==null && other.getStudyRef()==null) || 
             (this.studyRef!=null &&
              this.studyRef.equals(other.getStudyRef()))) &&
            ((this.eventDefinitionOID==null && other.getEventDefinitionOID()==null) || 
             (this.eventDefinitionOID!=null &&
              this.eventDefinitionOID.equals(other.getEventDefinitionOID()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime())));
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
        if (getStudySubjectRef() != null) {
            _hashCode += getStudySubjectRef().hashCode();
        }
        if (getStudyRef() != null) {
            _hashCode += getStudyRef().hashCode();
        }
        if (getEventDefinitionOID() != null) {
            _hashCode += getEventDefinitionOID().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "eventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySubjectRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studySubjectRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studySubjectRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDefinitionOID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "eventDefinitionOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
