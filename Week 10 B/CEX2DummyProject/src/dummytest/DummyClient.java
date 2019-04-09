/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummytest;

/**
 *
 * @author pierang
 */
public class DummyClient {

    DummyServer server = new DummyServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DummyClient client = new DummyClient();
        client.executeTest();
    }

    /**
     * Executes the client test
     */
    private void executeTest() {
        System.out.println("[DummyClient] Testing Server Connection...");
        if (server.isConnected().equals(0)) {
            System.out.println("[DummyClient] The server is connected, the test can proceed...");

            System.out.println("[DummyClient] Testing the server method getStringLength...");
            if (server.getStringLength("Test").equals(4)) {
                System.out.println("[DummyClient] The server method getStringLength has returned the correct value");
            } else {
                System.out.println("[DummyClient] The server method getStringLength has returned the wrong value");
            }

            System.out.println("[DummyClient] Testing the server method getStringLengthWithException...");
            try {
                if (server.getStringLengthWithException("Test").equals(4)) {
                    System.out.println("[DummyClient] The server method getStringLengthWithException has returned the correct value");
                } else {
                    System.out.println("[DummyClient] The server method getStringLengthWithException has returned the wrong value");
                }
            } catch (Exception ex) {
                System.out.println("[DummyClient] The server method getStringLengthWithException has thrownn an Exception in the WRONG case");
            }
            try {
                if (server.getStringLengthWithException(null).equals(4)) {
                    System.out.println("[DummyClient] The server method getStringLengthWithException has NOT thrown an Exception when it was supposed to");
                } else {
                    System.out.println("[DummyClient] The server method getStringLengthWithException has NOT thrown an Exception when it was supposed to");
                }
            } catch (Exception ex) {
                System.out.println("[DummyClient] The server method getStringLengthWithException has thrown an Exception in the correct case");
            }

            System.out.println("[DummyClient] Testing the server method addNameToServer...");
            server.addNameToServer("John");
            server.addNameToServer("Laura");
            server.addNameToServer("Ahmed");
            server.addNameToServer("Ji");
            server.addNameToServer("VeryLongName");

            System.out.println("[DummyClient] Testing the server method getLongestName...");
            if(server.findLongestNameInServer().equals("VeryLongName"))
                System.out.println("[DummyClient] The server method getLongestName has returned the correct value");
            else
                System.out.println("[DummyClient] The server method getLongestName has returned the wrong value");


            System.out.println("[DummyClient] Testing the server method addStudentToServer...");
            Student s1 = new Student();
            s1.setName("John");
            s1.setSurname("Connor");
            s1.setId("id1");
            s1.setGrade(90);
            server.addStudentToServer(s1);

            Student s2 = new Student();
            s2.setName("Ahmed");
            s2.setSurname("Ali");
            s2.setId("id2");
            s2.setGrade(80);
            server.addStudentToServer(s2);

            Student s3 = new Student();
            s3.setName("Li");
            s3.setSurname("Huan");
            s3.setId("id3");
            s3.setGrade(70);
            server.addStudentToServer(s3);

            Student s4 = new Student();
            s4.setName("Gabriele");
            s4.setSurname("Pierantoni");
            s4.setId("id4");
            s4.setGrade(50);
            server.addStudentToServer(s4);

            System.out.println("[DummyClient] Testing the server method getStudentWithHighestGrade...");
            if(server.findStudentWithHighestGrade().getId().equals("id1"))
                System.out.println("[DummyClient] The server method getStudentWithHighestGrade has returned the correct value");
            else
                System.out.println("[DummyClient] The server method getStudentWithHighestGrade has returned the wrong value");

        } else {
            System.out.println("[DummyClient] The server is NOT connected, the test has failed !");
        }
    }

}
