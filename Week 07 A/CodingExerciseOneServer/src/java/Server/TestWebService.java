/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.sql.Timestamp;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gab
 */
@WebService(serviceName = "TestWebService")
public class TestWebService {

    private String serverName = "Hasal";
    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public String testConnection(String id) 
    {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        System.out.println("["+ts + "] [SERVER "+this.serverName+"] - Connection from client "+id+" succeeded");
        return "["+ts + "] [SERVER "+this.serverName+"] - Connection from client "+id+" succeeded";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendMessage")
    public String sendMessage(@WebParam(name = "message") String message) 
    {
        System.out.println("[SERVER] - Received: " + message);
        return "Server has received " + message;
    }
}
