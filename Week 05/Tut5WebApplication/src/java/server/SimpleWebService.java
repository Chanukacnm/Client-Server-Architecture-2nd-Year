/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.InetAddress;
import com.sun.jmx.snmp.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hasal
 */
@WebService(serviceName = "SimpleWebService")
public class SimpleWebService {

    private String name = "Hasal's SERVER";
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) throws Exception{
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd: HH.mm.ss").format(new Date());
        return "["+timeStamp+"] - "+this.name+": Connection from " + txt + " succeeded ! --- "+InetAddress.getLocalHost();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        System.out.println("[SERVER] - Testing if server is connected");
        return true;
    }
}
