package javaapplication2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleClient {

    SimpleCalculatorServer server = new SimpleCalculatorServer();

    public static void main(String[] args) {
        SimpleClient simpleClientObj = new SimpleClient();
        simpleClientObj.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Testing if the server is connected...");
        if (server.isServerConnected()) {
            System.out.println("[CLIENT] - The Client is connected the test can preoceed");
            int a = 4;
            int b = 3;
            System.out.println("[CLIENT] - Asking server what is the sum of " + a + " and " + b + "...");
            int sum =0;
            try {
                sum = server.addIntegerNumbers(a, b);
            }
            catch (Exception e) {
                    e.printStackTrace();
            }
            System.out.println("[CLIENT] - The server has replied that the sum of " + a + " and " + b + " is " + sum);
            try{
                if (sum == a + b) {
                    System.out.println("[CLIENT] - The result from the server is correct");
                } 
                else {
                    System.out.println("[CLIENT] - The result from the server is not correct");
                }
            }
            catch(Exception e){
               System .out.println(e);
            }
            
            System.out.println("[CLIENT] - Asking server what is the div of " + a + " and " + b + "...");
            double div =0;
            try {
                div = server.divideIntegerNumbers(a, b);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("[CLIENT] - The server has replied that the div of " + a + " and " + b + " is " + div);
            try{
                if (div == a / b) {
                    System.out.println("[CLIENT] - The result from the server is correct");
                } 
                else {
                    System.out.println("[CLIENT] - The result from the server is not correct");
                }
            }
            catch(Exception e){
               e.printStackTrace();
            }
            System.out.println("[CLIENT] - Asking server what is the subtraction of " + a + " and " + b + "...");
            int sub =0;
            try {
                sub = server.subtractIntegerNumbers(a, b);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("[CLIENT] - The server has replied that the sub of " + a + " and " + b + " is " + div);
            try{
                if (sub == a - b) {
                    System.out.println("[CLIENT] - The result from the server is correct");
                } 
                else {
                    System.out.println("[CLIENT] - The result from the server is not correct");
                }
            }
            catch(Exception e){
               e.printStackTrace();
            }
            System.out.println("[CLIENT] - Asking server what is the multiplication of " + a + " and " + b + "...");
            int multi =0;
            try {
                multi = server.multiplyIntegerNumbers(a, b);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("[CLIENT] - The server has replied that the multiplication of " + a + " and " + b + " is " + div);
            try{
                if (div == a*b) {
                    System.out.println("[CLIENT] - The result from the server is correct");
                } 
                else {
                    System.out.println("[CLIENT] - The result from the server is not correct");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else {
            System.out.println("[CLIENT] - The client is not connected, the test has failed");
        }
    }
}
