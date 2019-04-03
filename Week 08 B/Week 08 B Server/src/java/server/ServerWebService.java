/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hasal
 */
@WebService(serviceName = "ServerWebService")
public class ServerWebService {

    private List<String> stringList = new ArrayList<>();
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
   
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() 
    {
        return true;
    }

    @WebMethod(operationName = "findShortestBetween")
    public String findShortestBetween(String a, String b) {
        if(a.length()<b.length()){
            return a;
        }
        else{
            return b;
        }
    }

    @WebMethod(operationName = "findShortestBetweenWithException")
    public String findShortestBetweenWithException(String a, String b) throws Exception{
        if(a!=null && b!=null){
            return findShortestBetween(a, b);
        }
        else{
            throw new Exception();
        }
    }

    @WebMethod(operationName = "addString")
    public void addString(String first_String) {
        stringList.add(first_String);
    }

    @WebMethod(operationName = "findShortestAmongAllStrings")
    public String findShortestAmongAllStrings() {
        String shortest = stringList.get(0);
        for(int i = 1; i<stringList.size(); i++){
            if(stringList.get(i).length()<shortest.length()){
                shortest = stringList.get(i);
            }
        }
        return shortest;
    }

    @WebMethod(operationName = "findShortestBetweenNameAndSurname")
    public String findShortestBetweenNameAndSurname(Person p) {
        
        if(p.name.length()<p.surname.length()){
            return p.name;
        }
        else{
            return p.surname;
        }
    }
}
