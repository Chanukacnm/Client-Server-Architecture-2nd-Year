/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author Hasal
 */
public class MyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClient client = new MyClient();
        client.executeTest();
        System.out.println("[CLIENT] - Checking shortest between Short and Long strings");
        if(client.findShortestBetween("Short", "Long").equals("Long")){
            System.out.println("[CLIENT] - findShortestBetween(), correct answer");
        }
        else{
            System.out.println("[CLIENT] - findShortestBetween(), wrong answer");
        }
        System.out.println("[CLIENT] - Adding Strings starting...");
        client.addString("One");
        client.addString("Three");
        client.addString("Four");
        client.addString("Five");
        System.out.println("[CLIENT] - Adding Strings finished");
        System.out.println("[CLIENT] - Checking shortest among added strings");
        if(client.findShortestAmongStrings().equals("One")){
            System.out.println("[CLIENT] - findShortestAmongStrings, correct answer"); 
        }
        else{
            System.out.println("[CLIENT] - findShortestAmongStrings, wrong answer"); 
        }

        try{
            if(client.findShortestBetweenWithException("Short", "Long").equals("Long")){
                System.out.println("[CLIENT] - findShortestBetweenWithException(), correct answer");
            }
            else{
                System.out.println("[CLIENT] - findShortestBetweenWithException(), wrong answer");
            }

        }
        catch(Exception_Exception e){
            System.out.println("[CLIENT] - findShortestBetweenWithException(), ERROR!!! You should not see this exception");            
        }

        try{
            if(client.findShortestBetweenWithException(null, "Long").equals("Long")){
                System.out.println("[CLIENT] - findShortestBetweenWithException(), correct answer");
            }
            else{
                System.out.println("[CLIENT] - findShortestBetweenWithException(), wrong answer");
            }

        }
        catch(Exception_Exception e){
            System.out.println("[CLIENT] - findShortestBetweenWithException(), EXCEPTION !!! You should be seeing this exception");            
        }

        try{
            if(client.findShortestBetweenWithException("Short", null).equals("Long")){
                System.out.println("[CLIENT] - findShortestBetweenWithException(), correct answer");
            }
            else{
                System.out.println("[CLIENT] - findShortestBetweenWithException(), wrong answer");
            }

        }
        catch(Exception_Exception e){
            System.out.println("[CLIENT] - findShortestBetweenWithException(), EXCEPTION !!! You should be seeing this exception");            
        }

        try{
            if(client.findShortestBetweenWithException(null, null).equals("Long")){
                System.out.println("[CLIENT] - findShortestBetweenWithException(), correct answer");
            }
            else{
                System.out.println("[CLIENT] - findShortestBetweenWithException(), wrong answer");
            }

        }
        catch(Exception_Exception e){
            System.out.println("[CLIENT] - findShortestBetweenWithException(), EXCEPTION !!! You should be seeing this exception");            
        }
        
        Person john = new Person();
        john.setName("John");
        john.setSurname("Connor");
        Person ali = new Person();
        ali.setName("Ali");
        ali.setSurname("Rehman");
        Person jasmine = new Person();
        jasmine.setName("Jasmine");
        jasmine.setSurname("Afjani");
        
        System.out.println(findPersonWithLongestName().getName());
/*        if(findPersonWithLongestName().getName().equals("Jasmine")){
            System.out.println("[CLIENT] - findPersonWithLongestName(), correct answer");
        }
        else{
            System.out.println("[CLIENT] - findPersonWithLongestName(), wrong answer");
        }*/
    }
    
    public void executeTest(){
        System.out.println("[CLIENT] - Connection test starting...");
        
        if(testConnection()==0){
            System.out.println("[CLIENT] - Connection to the server succesful");
        }
        else{
            System.out.println("[CLIENT] - Can't reach the server. Connection unsuccessfull");
        }
        System.out.println("[CLIENT] - Connection test finished");
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

    private static Person findPersonWithLongestName() {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findPersonWithLongestName();
    }
    
}
