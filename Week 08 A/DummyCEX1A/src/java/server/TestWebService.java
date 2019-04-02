/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.Collections;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gab
 */
@WebService(serviceName = "TestWebService")
public class TestWebService {
    ArrayList<Double>   samples  =   new ArrayList<Double>();
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public String testConnection() {
        System.out.println("[SERVER] - Connection test started.");
        System.out.println("[SERVER] - Testing connection....");
        return "OK";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumBetween")
    public Double findMinimumBetween(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) {
        System.out.println("[SERVER] - findMinimumBetween("+a+","+b+")");
        if(a.doubleValue() < b.doubleValue())
            return a;
        else
            return b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumBetweenWithException")
    public Double findMinimumBetweenWithException(@WebParam(name = "a") Double a, @WebParam(name = "parameter1") Double b) throws Exception {
        System.out.println("[SERVER] - findMinimumBetweenWithException("+a+","+b+")");

        if(a == null)
            throw new Exception();
        if(b == null)
            throw new Exception();
        
        if(a.floatValue() < b.floatValue())
            return a;
        else
            return b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addSample")
    public String addSample(@WebParam(name = "sample") Double sample) {
        System.out.println("[SERVER] - Sample("+sample+") added");
        samples.add(sample);
        System.out.println("[SERVER] - samples now are " + samples);
        return "Done";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumAmongSamples")
    public Double findMinimumAmongSamples() {
        System.out.println("[SERVER] - findMinimumAmongSamples()");
        System.out.println("[SERVER] - samples are " + samples);
        return Collections.min(samples);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findMinimumCoordinate")
    public Double findMinimumCoordinate(@WebParam(name = "point") server.Point2D p) {
        if(p.x.floatValue() < p.y.floatValue()){
            System.out.println("Returning minimum coordinate "+p.x);
            return p.x;
        }
        else{
            System.out.println("Returning minimum coordinate "+p.y);
            return p.y;
        }
    }
}
