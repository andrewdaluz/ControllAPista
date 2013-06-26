
package webService.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VeiculoWeb", targetNamespace = "http://webService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VeiculoWeb {


    /**
     * 
     * @param arg0
     * @return
     *     returns webService.cliente.Veiculo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVeiculo", targetNamespace = "http://webService/", className = "webService.cliente.GetVeiculo")
    @ResponseWrapper(localName = "getVeiculoResponse", targetNamespace = "http://webService/", className = "webService.cliente.GetVeiculoResponse")
    @Action(input = "http://webService/VeiculoWeb/getVeiculoRequest", output = "http://webService/VeiculoWeb/getVeiculoResponse")
    public Veiculo getVeiculo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setVeiculo", targetNamespace = "http://webService/", className = "webService.cliente.SetVeiculo")
    @ResponseWrapper(localName = "setVeiculoResponse", targetNamespace = "http://webService/", className = "webService.cliente.SetVeiculoResponse")
    @Action(input = "http://webService/VeiculoWeb/setVeiculoRequest", output = "http://webService/VeiculoWeb/setVeiculoResponse")
    public void setVeiculo(
        @WebParam(name = "arg0", targetNamespace = "")
        Veiculo arg0);

}
