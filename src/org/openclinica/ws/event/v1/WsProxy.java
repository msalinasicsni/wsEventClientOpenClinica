package org.openclinica.ws.event.v1;

public class WsProxy implements org.openclinica.ws.event.v1.Ws {
  private String _endpoint = null;
  private org.openclinica.ws.event.v1.Ws ws = null;
  
  public WsProxy() {
    _initWsProxy();
  }
  
  public WsProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsProxy();
  }
  
  private void _initWsProxy() {
    try {
      ws = (new org.openclinica.ws.event.v1.WsServiceLocator()).getwsSoap11();
      if (ws != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ws)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ws)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ws != null)
      ((javax.xml.rpc.Stub)ws)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.openclinica.ws.event.v1.Ws getWs() {
    if (ws == null)
      _initWsProxy();
    return ws;
  }
  
  public org.openclinica.ws.event.v1.ScheduleResponse schedule(org.openclinica.ws.beans.EventType[] scheduleRequest) throws java.rmi.RemoteException{
    if (ws == null)
      _initWsProxy();
    return ws.schedule(scheduleRequest);
  }
  
  
}