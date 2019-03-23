/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tut5client;

import java.net.InetAddress;

/**
 *
 * @author Hasal
 */
public class Tut5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Tut5Client client = new Tut5Client();
        System.out.println(client.hello("Hasal"));
        client.executeTest();
    }

    private void executeTest()throws Exception{
        System.out.println("[CLIENT] - Executing Connection Test ----"+InetAddress.getLocalHost());
        
        if(isConnected()){
            System.out.println("[CLIENT] - Server is connected, test can continue...");
        }
        else{
            System.out.println("[CLIENT] - Server is NOT connecte, test has failed !");
        }
    }
    private static Boolean isConnected() {
        tut5client.SimpleWebService_Service service = new tut5client.SimpleWebService_Service();
        tut5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }

    private static String hello(java.lang.String name) {
        tut5client.SimpleWebService_Service service = new tut5client.SimpleWebService_Service();
        tut5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.hello(name);
    }
    
}
