/**
 * WsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.event.v1;

public class WsServiceLocator extends org.apache.axis.client.Service implements org.openclinica.ws.event.v1.WsService {

    public WsServiceLocator() {
    }


    public WsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsSoap11
    private java.lang.String wsSoap11_address = "http://WIN-C5TEAQ26TGA:8088/ws/eventWsdl";

    public java.lang.String getwsSoap11Address() {
        return wsSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsSoap11WSDDServiceName = "wsSoap11";

    public java.lang.String getwsSoap11WSDDServiceName() {
        return wsSoap11WSDDServiceName;
    }

    public void setwsSoap11WSDDServiceName(java.lang.String name) {
        wsSoap11WSDDServiceName = name;
    }

    public org.openclinica.ws.event.v1.Ws getwsSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsSoap11(endpoint);
    }

    public org.openclinica.ws.event.v1.Ws getwsSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.openclinica.ws.event.v1.WsSoap11Stub _stub = new org.openclinica.ws.event.v1.WsSoap11Stub(portAddress, this);
            _stub.setPortName(getwsSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsSoap11EndpointAddress(java.lang.String address) {
        wsSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.openclinica.ws.event.v1.Ws.class.isAssignableFrom(serviceEndpointInterface)) {
                org.openclinica.ws.event.v1.WsSoap11Stub _stub = new org.openclinica.ws.event.v1.WsSoap11Stub(new java.net.URL(wsSoap11_address), this);
                _stub.setPortName(getwsSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("wsSoap11".equals(inputPortName)) {
            return getwsSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "wsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://openclinica.org/ws/event/v1", "wsSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsSoap11".equals(portName)) {
            setwsSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
