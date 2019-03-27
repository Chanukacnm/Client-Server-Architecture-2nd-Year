/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hasal
 */
@WebService(serviceName = "TestWebService")
public class TestWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        System.out.println("[SERVER] - Server is connected");
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendMessage")
    public String sendMessage(@WebParam(name = "message") String message) {
        System.out.println("[SERVER] - Server received message "+message);
        return "[SERVER] - Server received message "+message;
    }
}
