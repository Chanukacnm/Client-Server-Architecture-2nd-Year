/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg08.b.client;

/**
 *
 * @author Hasal
 */
public class Week08BClient {

    public static void main(String[] args) 
    {
        Week08BClient client  =   new Week08BClient();
        client.executeTest();
    }

    private void executeTest() 
    {
        System.out.println("[CLIENT] - Starting Test...");
        /*
        Checking if server is connected
        */
        if(isConnected())
        {
            System.out.println("[CLIENT] - Server is connected, test can continue...");

            /*
            Find the shortest string between the two arguments
            */
            if(findShortestBetween("Short", "Very very long") == "Short")
                System.out.println("[CLIENT] - findShortestBetween gave a correct result");
            else
                System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
                
            /*
                Add a series of strings to an ArrayList<String> in the server
            */
            addString("String");
            addString("Another String");
            addString("Yet Another String");
            addString("One more String");
            addString("Last String");
            /*
            Find the shortest string among the list of strings on the server
            */
            if(findShortestAmongAllStrings().equals("String"))
                System.out.println("[CLIENT] - findShortestAmongAllStrings gave a correct result");
            else    
                System.out.println("[CLIENT] - findShortestAmongAllStrings gave a WRONG result");


            /*
            Find the shortest string between the two arguments with Exception
            */            
            try {
                if(findShortestBetweenWithException("Short", "Very very long") == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception_Exception ex) {
                    System.out.println("[CLIENT] - [ERROR] - YOU SHOULD NOT SEE THIS EXCEPTION ! ");
            }

            try {
                if(findShortestBetweenWithException(null, "Very very long") == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception_Exception ex) {
                    System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if(findShortestBetweenWithException("Short", null) == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception_Exception ex) {
                    System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if(findShortestBetweenWithException(null, null) == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception_Exception ex) {
                    System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }


            /*
            Find the shortest between name and surname
                   */
            Person p = new Person();
            p.name      =   "Bob";
            p.surname   =   "VeryLongSurname";
            if(findShortestBetweenNameAndSurname(p) == "Bob")
                    System.out.println("[CLIENT] - findShortestBetweenNameAndSurname gave a correct result");
            else
                    System.out.println("[CLIENT] - findShortestBetweenNameAndSurname gave a correct result");

        }
        else
        {
            System.out.println("[CLIENT] - Server is connected, test CANNOT continue...");
        }
    }

    private static void addString(java.lang.String arg0) {
        week.pkg08.b.client.ServerWebService_Service service = new week.pkg08.b.client.ServerWebService_Service();
        week.pkg08.b.client.ServerWebService port = service.getServerWebServicePort();
        port.addString(arg0);
    }

    private static String findShortestAmongAllStrings() {
        week.pkg08.b.client.ServerWebService_Service service = new week.pkg08.b.client.ServerWebService_Service();
        week.pkg08.b.client.ServerWebService port = service.getServerWebServicePort();
        return port.findShortestAmongAllStrings();
    }

    private static String findShortestBetween(java.lang.String arg0, java.lang.String arg1) {
        week.pkg08.b.client.ServerWebService_Service service = new week.pkg08.b.client.ServerWebService_Service();
        week.pkg08.b.client.ServerWebService port = service.getServerWebServicePort();
        return port.findShortestBetween(arg0, arg1);
    }

    private static String findShortestBetweenWithException(java.lang.String arg0, java.lang.String arg1) throws Exception_Exception {
        week.pkg08.b.client.ServerWebService_Service service = new week.pkg08.b.client.ServerWebService_Service();
        week.pkg08.b.client.ServerWebService port = service.getServerWebServicePort();
        return port.findShortestBetweenWithException(arg0, arg1);
    }

    private static Boolean isConnected() {
        week.pkg08.b.client.ServerWebService_Service service = new week.pkg08.b.client.ServerWebService_Service();
        week.pkg08.b.client.ServerWebService port = service.getServerWebServicePort();
        return port.isConnected();
    }

    private static String findShortestBetweenNameAndSurname(week.pkg08.b.client.Person arg0) {
        week.pkg08.b.client.ServerWebService_Service service = new week.pkg08.b.client.ServerWebService_Service();
        week.pkg08.b.client.ServerWebService port = service.getServerWebServicePort();
        return port.findShortestBetweenNameAndSurname(arg0);
    }
    
}
