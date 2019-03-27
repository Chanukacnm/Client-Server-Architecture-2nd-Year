/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingexercisetwoclient;

/**
 *
 * @author Hasal
 */
public class CodingExerciseTwoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodingExerciseTwoClient client = new CodingExerciseTwoClient();
        client.executeTest();
    }

    private void executeTest() {
        
        System.out.println("[CLIENT] - Test starting...");
        if(isConnected()){
            System.out.println("Connection to the server succeeded. Server replied: "+sendMessage("Hello !"));
        }
        else{
            System.out.println("[CLIENT] - Can't reach the server");
        }
        System.out.println("[CLIENT] - Test completed");
    }

    private static Boolean isConnected() {
        codingexercisetwoclient.TestWebService_Service service = new codingexercisetwoclient.TestWebService_Service();
        codingexercisetwoclient.TestWebService port = service.getTestWebServicePort();
        return port.isConnected();
    }

    private static String sendMessage(java.lang.String message) {
        codingexercisetwoclient.TestWebService_Service service = new codingexercisetwoclient.TestWebService_Service();
        codingexercisetwoclient.TestWebService port = service.getTestWebServicePort();
        return port.sendMessage(message);
    }
    
}
