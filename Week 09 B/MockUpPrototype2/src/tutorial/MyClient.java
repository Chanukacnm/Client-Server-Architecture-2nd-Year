/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author pierang
 */
public class MyClient {

    DummyServer server = new DummyServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Starting Test...");
        /*
         Checking if server is connected
         */
        if (server.isConnected().equals("OK")) {
            System.out.println("[CLIENT] - Server is connected, test can continue...");

            /*
             Add two numbers
             */
            if (server.addTwoNumbers(1.0, 2.0) == 3.0) {
                System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
            } else {
                System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
            }

            /*
             Add a series of Doubles to an ArrayList<Double> in the server
             */
            server.addNumber(1.0);
            server.addNumber(-0.5);
            server.addNumber(12.3);
            server.addNumber(14.2);
            server.addNumber(99.9);
            /*
             Calculate the average among the list of Doubles on the server
             */
            if (server.averageOfAllNumbers().equals(25.38)) {
                System.out.println("[CLIENT] - averageOfAllNumbers gave a correct result");
            } else {
                System.out.println("[CLIENT] - averageOfAllNumbers gave a WRONG result");
            }


            /*
             Add two numbers with Exception
             */
            try {
                if (server.addTwoNumbersWithException(1.0, 2.0) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception ex) {
                System.out.println("[CLIENT] - [ERROR] - YOU SHOULD NOT SEE THIS EXCEPTION ! ");
            }

            try {
                if (server.addTwoNumbersWithException(null, 2.0) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if (server.addTwoNumbers(1.0, null) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if (server.addTwoNumbers(null, null) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }


            /*
             Instantiate a series of MyPoint3D and add them to an ArrayList<MyPoint3D> in the server
             */
            MyPoint3D   p1  =   new MyPoint3D();
            p1.setX(1.0);
            p1.setY(2.1);
            p1.setZ(3.2);
            server.addMyPoint3D(p1);
            MyPoint3D   p2  =   new MyPoint3D();
            p2.setX(3.0);
            p2.setY(9.1);
            p2.setZ(12.2);
            server.addMyPoint3D(p2);
            MyPoint3D   p3  =   new MyPoint3D();
            p3.setX(14.0);
            p3.setY(21.2);
            p3.setZ(32.1);            
            server.addMyPoint3D(p3);

            /*
            Find the point with the highest z-coordinate
             */
            if (server.findPointWithHighestZ().getZ() == 32.1) {
                System.out.println("[CLIENT] - findPointWithHighestZ gave a correct result");
            } else {
                System.out.println("[CLIENT] - findPointWithHighestZ gave a WRONG result");
            }
        } else {
            System.out.println("[CLIENT] - Server is connected, test CANNOT continue...");
        }
    }
}
