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

    
    private int id = 289;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodingExerciseTwoClient client = new CodingExerciseTwoClient();
        client.executeTest();
    }

    private void executeTest() {
        
        System.out.println("[CLIENT] - Test starting...");
        if(isConnected(String.valueOf(id))!=null){
            System.out.println(isConnected(String.valueOf(id)));
            try{
                System.out.println("Connection to the server succeeded. Server replied: "+sendMessage(null));
            }
            catch(NullPointerException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("[CLIENT] - Can't reach the server");
        }
        System.out.println("[CLIENT] - Test completed");
    }

    private static String isConnected(java.lang.String arg0) {
        codingexercisetwoclient.TestWebService_Service service = new codingexercisetwoclient.TestWebService_Service();
        codingexercisetwoclient.TestWebService port = service.getTestWebServicePort();
        return port.isConnected(arg0);
    }

    private static String sendMessage(java.lang.String message) {
        codingexercisetwoclient.TestWebService_Service service = new codingexercisetwoclient.TestWebService_Service();
        codingexercisetwoclient.TestWebService port = service.getTestWebServicePort();
        return port.sendMessage(message);
    }

}
