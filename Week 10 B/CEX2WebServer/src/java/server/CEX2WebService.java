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
@WebService(serviceName = "CEX2WebService")
public class CEX2WebService {

    private List<String> nameList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "isConnected")
    public Integer isConnected()
    {
        return 0;
    }
    /**
    Returns the length of the String passed as a parameter
    * @param test the string which length is being analysed
    * @return the length of the String passed as a parameter
    */
    @WebMethod(operationName = "getStringLength")
    public Integer getStringLength(String test) 
    {
        return test.length();
    }

    /**
    Returns the length of the String passed as a parameter
    * @param test the string which length is being analysed
    * @return the length of the String passed as a parameter
    * @throws Exception is the passed string is null
    */
    @WebMethod(operationName = "getStringLengthWithException")
    public Integer getStringLengthWithException(String test) throws Exception 
    {
        if(test==null){
            throw new Exception();
        }
        else{
            return getStringLength(test);
        }
    }
    
    /**
    Adds the String passed as a parameter to the ArrayList of names on the Server 
    * @param name the name which has to be added to the server
    * @return the String "Done"
    */
    @WebMethod(operationName = "addNameToServer")
    public String addNameToServer(String name)
    {
        nameList.add(name);
        return "Successfully added";
    }

    /**
    Returns the longest name present in the Server
    * @return the Longest name present in the server
    */
    @WebMethod(operationName = "findLongestNameInServer")
    public String findLongestNameInServer()
    {
        String longest = nameList.get(0);
        for(int i = 1; i<nameList.size(); i++){
            if(nameList.get(i).length()>longest.length()){
                longest = nameList.get(i);
            }
        }
        return longest;
    }

    /**
    Adds the Student passed as a parameter to the ArrayList of names on the Server 
    * @param s the Student which has to be added to the server
    * @return the String "Done"
    */
    @WebMethod(operationName = "addStudentToServer")
    public String addStudentToServer(Student s) 
    {
        studentList.add(s);
        return "Student added";
    }

    /**
    Returns the Student present in the server that has the highest grade
    * @return the Student present in the server that has the highest grade
    */
    @WebMethod(operationName = "findStudentWithHighestGrade")
    public Student findStudentWithHighestGrade() 
    {
        Student withHighestGrade = new Student();
        withHighestGrade = studentList.get(0);
        
        for(int i = 1; i<studentList.size(); i++){
            if(studentList.get(i).getGrade()>withHighestGrade.getGrade()){
                withHighestGrade = studentList.get(i);
            }
        }
        return withHighestGrade;
    }
  
}
