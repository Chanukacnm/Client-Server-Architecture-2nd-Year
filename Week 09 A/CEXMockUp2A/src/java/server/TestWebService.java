/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gab
 */
@WebService(serviceName = "TestWebService")
public class TestWebService {
    ArrayList<String>   strings     =   new ArrayList<String>();
    ArrayList<Person>   people      =   new ArrayList<Person>();
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public Integer testConnection() {
        System.out.println("[SERVER] - Testing Server Connection...");
        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetween")
    public String findShortestBetween(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        System.out.println("[SERVER] - Finding which is the shortest between " + a + " and " + b);
        if(a.length() < b.length())
            return a;
        else
            return b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addString")
    public Integer addString(@WebParam(name = "str") String str) {
        System.out.println("[SERVER] - Adding " + str + " to " + strings);
        strings.add(str);
        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestAmongStrings")
    public String findShortestAmongStrings() {
        System.out.println("[SERVER] - Finding shortest among " + strings);
        Iterator    i           =   strings.iterator();
        String      shortest    =   strings.get(0);
        Integer     minLength   =   0;
        
        while(i.hasNext())
        {
            String  curr    =   (String) i.next();
            if(curr.length() < shortest.length())
                shortest = curr;
        }
        return shortest;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addPerson")
    public Integer addPerson(@WebParam(name = "person") server.Person person) {
        System.out.println("[SERVER] - Adding " + person + " to " + people);
        people.add(person);
        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findPersonWithLongestName")
    public Person findPersonWithLongestName() {
        System.out.println("[SERVER] - Finding person with longest name ");
        Iterator    i           =   people.iterator();
        Person      longest     =   people.get(0);
        
        while(i.hasNext())
        {
            Person  curr    =   (Person) i.next();
            if(curr.name.length() > longest.name.length())
                longest = curr;
        }
        return longest;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetweenWithException")
    public String findShortestBetweenWithException(@WebParam(name = "a") String a, @WebParam(name = "b") String b) throws Exception {
                System.out.println("[SERVER] - findShortestBetweenWithException("+a+","+b+")");

        if(a == null)
            throw new Exception();
        if(b == null)
            throw new Exception();
        
        if(a.length() < b.length())
            return a;
        else
            return b;

    }
}
