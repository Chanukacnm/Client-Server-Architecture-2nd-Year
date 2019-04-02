/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08aclient;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hasal
 */
public class Week08AClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Week08AClient client = new Week08AClient();
        client.executeTest();
        System.out.println("[CLIENT] - Finding minimum between 3.0 and 5.0...");
        if(client.findMinimumBetween(3.0, 5.0)==3.0){
            System.out.println("[CLIENT] - findMinimumBetween(), correct answer");
        }
        else{
            System.out.println("[CLIENT] - findMinimumBetween(), wrong answer");
        }
        System.out.println("[CLIENT] - Adding samples...");
        client.addSample(1.0);
        client.addSample(3.4);
        client.addSample(5.0);
        client.addSample(7.12);
        System.out.println("[CLIENT] - Finding minimum among samples...");
        
        if(client.findMinimumAmongSamples()==1.0){
            System.out.println("[CLIENT] - findMinimumAmongSamples(), correct answer");            
        }
        else{
            System.out.println("[CLIENT] - findMinimumAmongSamples(), wrong answer");                        
        }
        
        System.out.println("[CLIENT] - Finding minimum between with exception..");
        try {
            if(client.findMinimumBetweenWithException(3.0, 1.0)==1.0){
                System.out.println("[CLIENT] - findMinimumBetweenWithException(), correct answer");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[CLIENT] - findMinimumBetweenWithException(), ERROR!!! You should not be seeing this exception");;
        }
        try {
            if(client.findMinimumBetweenWithException(null, 1.0)==1.0){
                System.out.println("[CLIENT] - findMinimumBetweenWithException(), correct answer");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[CLIENT] - findMinimumBetweenWithException(), ERROR!!! You should see this exception");;
        }
        try {
            if(client.findMinimumBetweenWithException(3.0, null)==1.0){
                System.out.println("[CLIENT] - findMinimumBetweenWithException(), correct answer");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[CLIENT] - findMinimumBetweenWithException(), ERROR!!! You should see this exception");;
        }
        try {
            if(client.findMinimumBetweenWithException(null, null)==1.0){
                System.out.println("[CLIENT] - findMinimumBetweenWithException(), correct answer");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[CLIENT] - findMinimumBetweenWithException(), ERROR!!! You should see this exception");;
        }
        
        Point2D p = new Point2D();
        p.x = 5.4;
        p.y = 4.5;
        if(findMinimumCoordinate(p) == 4.5){
            System.out.println("[CLIENT] - findMinimumCoordinate, correct result");
        }
        else{
            System.out.println("[CLIENT] - findMinimumCoordinate, wrong result");
        }
    }
    
    public void executeTest(){
        System.out.println("[CLIENT] - Test started");
        if(testConnection().equals("OK")){
            System.out.println("[CLIENT] - Connection to the server successful");
        }
        else{
            System.out.println("[CLIENT] - Can't reach the server.. Connection failed.");
        }
        System.out.println("[CLIENT] - Test finished.");
    }

    private static String testConnection() {
        week08aclient.TestWebService_Service service = new week08aclient.TestWebService_Service();
        week08aclient.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

    private static Double findMinimumBetween(java.lang.Double a, java.lang.Double b) {
        week08aclient.TestWebService_Service service = new week08aclient.TestWebService_Service();
        week08aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetween(a, b);
    }

    private static String addSample(java.lang.Double sample) {
        week08aclient.TestWebService_Service service = new week08aclient.TestWebService_Service();
        week08aclient.TestWebService port = service.getTestWebServicePort();
        return port.addSample(sample);
    }

    private static Double findMinimumAmongSamples() {
        week08aclient.TestWebService_Service service = new week08aclient.TestWebService_Service();
        week08aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumAmongSamples();
    }

    private static Double findMinimumBetweenWithException(java.lang.Double a, java.lang.Double parameter1) throws Exception_Exception {
        week08aclient.TestWebService_Service service = new week08aclient.TestWebService_Service();
        week08aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetweenWithException(a, parameter1);
    }

    private static Double findMinimumCoordinate(week08aclient.Point2D point) {
        week08aclient.TestWebService_Service service = new week08aclient.TestWebService_Service();
        week08aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumCoordinate(point);
    }
    
}
