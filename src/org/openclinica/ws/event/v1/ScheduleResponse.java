/**
 * ScheduleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.event.v1;

public class ScheduleResponse  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String eventDefinitionOID;

    private java.lang.String studySubjectOID;

    private java.lang.String studyEventOrdinal;

    private java.lang.String[] warning;

    private java.lang.String[] error;

    public ScheduleResponse() {
    }

    public ScheduleResponse(
           java.lang.String result,
           java.lang.String eventDefinitionOID,
           java.lang.String studySubjectOID,
           java.lang.String studyEventOrdinal,
           java.lang.String[] warning,
           java.lang.String[] error) {
           this.result = result;
           this.eventDefinitionOID = eventDefinitionOID;
           this.studySubjectOID = studySubjectOID;
           this.studyEventOrdinal = studyEventOrdinal;
           this.warning = warning;
           this.error = error;
    }


    /**
     * Gets the result value for this ScheduleResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this ScheduleResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the eventDefinitionOID value for this ScheduleResponse.
     * 
     * @return eventDefinitionOID
     */
    public java.lang.String getEventDefinitionOID() {
        return eventDefinitionOID;
    }


    /**
     * Sets the eventDefinitionOID value for this ScheduleResponse.
     * 
     * @param eventDefinitionOID
     */
    public void setEventDefinitionOID(java.lang.String eventDefinitionOID) {
        this.eventDefinitionOID = eventDefinitionOID;
    }


    /**
     * Gets the studySubjectOID value for this ScheduleResponse.
     * 
     * @return studySubjectOID
     */
    public java.lang.String getStudySubjectOID() {
        return studySubjectOID;
    }


    /**
     * Sets the studySubjectOID value for this ScheduleResponse.
     * 
     * @param studySubjectOID
     */
    public void setStudySubjectOID(java.lang.String studySubjectOID) {
        this.studySubjectOID = studySubjectOID;
    }


    /**
     * Gets the studyEventOrdinal value for this ScheduleResponse.
     * 
     * @return studyEventOrdinal
     */
    public java.lang.String getStudyEventOrdinal() {
        return studyEventOrdinal;
    }


    /**
     * Sets the studyEventOrdinal value for this ScheduleResponse.
     * 
     * @param studyEventOrdinal
     */
    public void setStudyEventOrdinal(java.lang.String studyEventOrdinal) {
        this.studyEventOrdinal = studyEventOrdinal;
    }


    /**
     * Gets the warning value for this ScheduleResponse.
     * 
     * @return warning
     */
    public java.lang.String[] getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this ScheduleResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String[] warning) {
        this.warning = warning;
    }

    public java.lang.String getWarning(int i) {
        return this.warning[i];
    }

    public void setWarning(int i, java.lang.String _value) {
        this.warning[i] = _value;
    }


    /**
     * Gets the error value for this ScheduleResponse.
     * 
     * @return error
     */
    public java.lang.String[] getError() {
        return error;
    }


    /**
     * Sets the error value for this ScheduleResponse.
     * 
     * @param error
     */
    public void setError(java.lang.String[] error) {
        this.error = error;
    }

    public java.lang.String getError(int i) {
        return this.error[i];
    }

    public void setError(int i, java.lang.String _value) {
        this.error[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleResponse)) return false;
        ScheduleResponse other = (ScheduleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.eventDefinitionOID==null && other.getEventDefinitionOID()==null) || 
             (this.eventDefinitionOID!=null &&
              this.eventDefinitionOID.equals(other.getEventDefinitionOID()))) &&
            ((this.studySubjectOID==null && other.getStudySubjectOID()==null) || 
             (this.studySubjectOID!=null &&
              this.studySubjectOID.equals(other.getStudySubjectOID()))) &&
            ((this.studyEventOrdinal==null && other.getStudyEventOrdinal()==null) || 
             (this.studyEventOrdinal!=null &&
              this.studyEventOrdinal.equals(other.getStudyEventOrdinal()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              java.util.Arrays.equals(this.warning, other.getWarning()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getEventDefinitionOID() != null) {
            _hashCode += getEventDefinitionOID().hashCode();
        }
        if (getStudySubjectOID() != null) {
            _hashCode += getStudySubjectOID().hashCode();
        }
        if (getStudyEventOrdinal() != null) {
            _hashCode += getStudyEventOrdinal().hashCode();
        }
        if (getWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", ">scheduleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDefinitionOID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "eventDefinitionOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studySubjectOID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "studySubjectOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyEventOrdinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "studyEventOrdinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
