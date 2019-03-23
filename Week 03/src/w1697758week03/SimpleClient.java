/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1697758week03;

/**
 *
 * @author Hasal
 */
public class SimpleClient {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        SimpleClient client = new SimpleClient();
        client.executeTest();
        
    }
    
    public void executeTest(){
        
        SimpleTemperatureRecorderServer server = new SimpleTemperatureRecorderServer();
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The server is connected... The test can proceed...");
            if(!(server.getColdestTemperature()==10000)){
                System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());                
            }
            else{
                System.out.println("The list is empty. There are no temperatures recorded");
            }
            server.addTemperature(10);
            System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());
            System.out.println("[CLIENT] - The maximum recorded temperature is "+ server.getHottestTemperature());
            System.out.println("[CLIENT] - The average recorded temperature is "+ server.getAverageTemperature());
            System.out.println("[CLIENT] - The recorded number of samples is "+ server.getNumberOfSamples());

            server.addTemperature(1);
            System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());
            System.out.println("[CLIENT] - The maximum recorded temperature is "+ server.getHottestTemperature());
            System.out.println("[CLIENT] - The average recorded temperature is "+ server.getAverageTemperature());
            System.out.println("[CLIENT] - The recorded number of samples is "+ server.getNumberOfSamples());

            server.addTemperature(12);
            System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());
            System.out.println("[CLIENT] - The maximum recorded temperature is "+ server.getHottestTemperature());
            System.out.println("[CLIENT] - The average recorded temperature is "+ server.getAverageTemperature());
            System.out.println("[CLIENT] - The recorded number of samples is "+ server.getNumberOfSamples());

            server.addTemperature(-0.1);
            System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());
            System.out.println("[CLIENT] - The maximum recorded temperature is "+ server.getHottestTemperature());
            System.out.println("[CLIENT] - The average recorded temperature is "+ server.getAverageTemperature());
            System.out.println("[CLIENT] - The recorded number of samples is "+ server.getNumberOfSamples());

            server.addTemperature(-18);
            System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());
            System.out.println("[CLIENT] - The maximum recorded temperature is "+ server.getHottestTemperature());
            System.out.println("[CLIENT] - The average recorded temperature is "+ server.getAverageTemperature());
            System.out.println("[CLIENT] - The recorded number of samples is "+ server.getNumberOfSamples());

            server.addTemperature(18.0);
            System.out.println("[CLIENT] - The minimum recorded temperature is "+ server.getColdestTemperature());
            System.out.println("[CLIENT] - The maximum recorded temperature is "+ server.getHottestTemperature());
            System.out.println("[CLIENT] - The average recorded temperature is "+ server.getAverageTemperature());
            System.out.println("[CLIENT] - The recorded number of samples is "+ server.getNumberOfSamples());
        }
        else{
            System.out.println("[CLIENT] - The server is NOT connected... Terminating test...");
        }
    }
    
}
