/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummytest;

/**
 *
 * @author pierang
 */
public class DummyServer 
{    
    /**
    Returns the Integer value 0 if the server is correctly running.
    * @return the Integer value 0 if the server is correctly running.
    */
    public Integer isConnected()
    {
        return null;
    }
    /**
    Returns the length of the String passed as a parameter
    * @param test the string which length is being analysed
    * @return the length of the String passed as a parameter
    */
    public Integer getStringLength(String test) 
    {
        return null;
    }

    /**
    Returns the length of the String passed as a parameter
    * @param test the string which length is being analysed
    * @return the length of the String passed as a parameter
    * @throws Exception is the passed string is null
    */
    public Integer getStringLengthWithException(String test) throws Exception 
    {
        return null;
    }
    
    /**
    Adds the String passed as a parameter to the ArrayList of names on the Server 
    * @param name the name which has to be added to the server
    * @return the String "Done"
    */
    public String addNameToServer(String name)
    {
        return null;
    }

    /**
    Returns the longest name present in the Server
    * @return the Longest name present in the server
    */
    public String findLongestNameInServer()
    {
        return null;
    }

    /**
    Adds the Student passed as a parameter to the ArrayList of names on the Server 
    * @param s the Student which has to be added to the server
    * @return the String "Done"
    */
    public String addStudentToServer(Student s) 
    {
        return null;
    }

    /**
    Returns the Student present in the server that has the highest grade
    * @return the Student present in the server that has the highest grade
    */
    public Student findStudentWithHighestGrade() 
    {
        return null;
    }
}
