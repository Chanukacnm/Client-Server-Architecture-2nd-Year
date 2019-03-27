/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingexerciseoneclient;

/**
 *
 * @author Hasal
 */
public class CodingExerciseOneClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CodingExerciseOneClient codingExerciseOneClient = new CodingExerciseOneClient();
        codingExerciseOneClient.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Test Starting...");
        if(testConnection("1406")!=null){
            System.out.println("[CLIENT] - Server has returned: "+sendMessage("Hello !"));
        }
        else{
            System.out.println("[CLIENT] - Server is not reachable");
        }
        System.out.println("[CLIENT] - Test completed");
    }

    private static String testConnection(java.lang.String arg0) {
        codingexerciseoneclient.TestWebService_Service service = new codingexerciseoneclient.TestWebService_Service();
        codingexerciseoneclient.TestWebService port = service.getTestWebServicePort();
        return port.testConnection(arg0);
    }

    private static String sendMessage(java.lang.String message) {
        codingexerciseoneclient.TestWebService_Service service = new codingexerciseoneclient.TestWebService_Service();
        codingexerciseoneclient.TestWebService port = service.getTestWebServicePort();
        return port.sendMessage(message);
    }

    
}
