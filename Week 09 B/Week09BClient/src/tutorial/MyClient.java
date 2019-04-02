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
        MyClient client = new MyClient();
        client.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Starting Test...");
        /*
         Checking if server is connected
         */
        if (isConnected().equals("OK")) {
            System.out.println("[CLIENT] - Server is connected, test can continue...");

            /*
             Add two numbers
             */
            if (addTwoNumbers(1.0, 2.0) == 3.0) {
                System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
            } else {
                System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
            }

            /*
             Add a series of Doubles to an ArrayList<Double> in the server
             */
            addNumber(1.0);
            addNumber(-0.5);
            addNumber(12.3);
            addNumber(14.2);
            addNumber(99.9);
            /*
             Calculate the average among the list of Doubles on the server
             */
            if (averageOfAllNumbers()==(25.38)) {
                System.out.println("[CLIENT] - averageOfAllNumbers gave a correct result");
            } else {
                System.out.println("[CLIENT] - averageOfAllNumbers gave a WRONG result");
            }


            /*
             Add two numbers with Exception
             */
            try {
                if (addTwoNumbersWithException(1.0, 2.0) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - [ERROR] - YOU SHOULD NOT SEE THIS EXCEPTION ! ");
            }

            try {
                if (addTwoNumbersWithException(null, 2.0) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if (addTwoNumbersWithException(1.0, null) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if (addTwoNumbersWithException(null, null) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (Exception_Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }


            /*
             Instantiate a series of MyPoint3D and add them to an ArrayList<MyPoint3D> in the server
             */
            MyPoint3D   p1  =   new MyPoint3D();
            p1.setX(1.0);
            p1.setY(2.1);
            p1.setZ(3.2);
            addMyPoint3D(p1);
            MyPoint3D   p2  =   new MyPoint3D();
            p2.setX(3.0);
            p2.setY(9.1);
            p2.setZ(12.2);
            addMyPoint3D(p2);
            MyPoint3D   p3  =   new MyPoint3D();
            p3.setX(14.0);
            p3.setY(21.2);
            p3.setZ(32.1);            
            addMyPoint3D(p3);

            /*
            Find the point with the highest z-coordinate
             */
            if (findPointWithHighestZ().getZ() == 32.1) {
                System.out.println("[CLIENT] - findPointWithHighestZ gave a correct result");
            } else {
                System.out.println("[CLIENT] - findPointWithHighestZ gave a WRONG result");
            }
        } else {
            System.out.println("[CLIENT] - Server is not connected, test CANNOT continue...");
        }
    }

    private static void addMyPoint3D(tutorial.MyPoint3D arg0) {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        port.addMyPoint3D(arg0);
    }

    private static void addNumber(double arg0) {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        port.addNumber(arg0);
    }

    private static double addTwoNumbers(java.lang.Double arg0, java.lang.Double arg1) {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        return port.addTwoNumbers(arg0, arg1);
    }

    private static double addTwoNumbersWithException(java.lang.Double arg0, java.lang.Double arg1) throws Exception_Exception {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        return port.addTwoNumbersWithException(arg0, arg1);
    }

    private static double averageOfAllNumbers() {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        return port.averageOfAllNumbers();
    }

    private static MyPoint3D findPointWithHighestZ() {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        return port.findPointWithHighestZ();
    }

    private static String isConnected() {
        tutorial.Server_Service service = new tutorial.Server_Service();
        tutorial.Server port = service.getServerPort();
        return port.isConnected();
    }
    
    


}
