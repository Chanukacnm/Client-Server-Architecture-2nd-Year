/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Hasal
 */
public class MyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.executeTest();
    }

    private void executeTest() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        
        System.out.println("[CLIENT] - Test starting..."+ timestamp);
        if(testConnection()==0){
            System.out.println("[CLIENT] - Connection to the server successful");
            System.out.println("[CLIENT] - Checking findShortestBetween()");
            if(findShortestBetween("Short", "Long").equals("Long")){
                System.out.println("[CLIENT] - findShortestBetween(), Correct Result");
            }
            else{
                System.out.println("[CLIENT] - findShortestBetween(), Wrong Result");
            }
            System.out.println("[CLIENT] - Finished checking findShortestBetween()");
            System.out.println("[CLIENT] - Adding strings using addString()");
            addString("One");
            addString("Three");
            addString("Four");
            addString("FIve");
            System.out.println("[CLIENT] - Finished adding strings using addString()");
            if(findShortestAmongStrings().equals("One")){
                System.out.println("[CLIENT] - findShortestAmongStrings(), Correct Result");
            }
            else{
                System.out.println("[CLIENT] - findShortestAmongStrings(), Wrong Result");
            }
            
            try {
                if(findShortestBetweenWithException("Short", "Long").equals("Long")){
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Correct Result");
                }
                else{
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Wrong Result");
                }
            } catch (Exception_Exception e) {
                System.out.println("[CLIENT] - [WRONG] - [EXCEPTION] - You shouldn't be seeing this exception");
            }
            try {
                if(findShortestBetweenWithException("Short", null).equals("Long")){
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Correct Result");
                }
                else{
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Wrong Result");
                }
            } catch (Exception_Exception e) {
                System.out.println("[CLIENT] - [CORRECT] - [EXCEPTION] - You should be seeing this exception");
            }

            try {
                if(findShortestBetweenWithException(null, "Long").equals("Long")){
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Correct Result");
                }
                else{
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Wrong Result");
                }
            } catch (Exception_Exception e) {
                System.out.println("[CLIENT] - [CORRECT] - [EXCEPTION] - You should be seeing this exception");
            }

            try {
                if(findShortestBetweenWithException(null, null).equals("Long")){
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Correct Result");
                }
                else{
                    System.out.println("[CLIENT] - findShortestBetweenWithException(), Wrong Result");
                }
            } catch (Exception_Exception e) {
                System.out.println("[CLIENT] - [CORRECT] - [EXCEPTION] - You should be seeing this exception");
            }
            
            Person john = new Person();
            john.name = "John";
            john.surname = "Connor";
            addPerson(john);
            Person ali = new Person();
            ali.name = "Ali";
            ali.surname = "Rehman";
            addPerson(ali);
            Person jasmine = new Person();
            jasmine.name = "John";
            jasmine.surname = "Connor";
            addPerson(jasmine);
            if(findPersonWithLongestName().equals("Jasmine")){
                System.out.println("[CLIENT] - findPersonWithLongestName(), Correct Result");                
            }
            else{
                System.out.println("[CLIENT] - findPersonWithLongestName(), Wrong Result");                
            }
        }
        else{
            System.out.println("[CLIENT] - Can't reach the server. Connection unsuccessful");
        }
        System.out.println("[CLIENT] - Test ended");
    }

    private static Integer testConnection() {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

    private static String findShortestBetween(java.lang.String a, java.lang.String b) {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findShortestBetween(a, b);
    }

    private static Integer addString(java.lang.String str) {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.addString(str);
    }

    private static String findShortestAmongStrings() {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findShortestAmongStrings();
    }

    private static String findShortestBetweenWithException(java.lang.String a, java.lang.String b) throws Exception_Exception {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findShortestBetweenWithException(a, b);
    }

    private static Integer addPerson(tutorial.Person person) {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.addPerson(person);
    }

    private static Person findPersonWithLongestName() {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findPersonWithLongestName();
    }
    
}
