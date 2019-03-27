/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.sql.Timestamp;
import java.util.Date;
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
    public String isConnected(String id){
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        System.out.println("["+ts+ "] [SERVER] - Server is connected to client "+id);
        return "["+ts+ "] [SERVER] - Connection from client "+id+" succeeded";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendMessage")
    public String sendMessage(@WebParam(name = "message") String message)  throws NullPointerException{
        if(message!=null){
            System.out.println("[SERVER] - Server received message "+message);
            return "[SERVER] - Server received message "+message;
        }
        else{
            throw new NullPointerException("The parameter is null");
        }
    }
}
