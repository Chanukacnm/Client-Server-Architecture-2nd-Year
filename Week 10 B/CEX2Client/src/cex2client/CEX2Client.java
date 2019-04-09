/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cex2client;

/**
 *
 * @author Hasal
 */
public class CEX2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CEX2Client client = new CEX2Client();
        client.executeTest();
    }

    private void executeTest() {
        System.out.println("[CLIENT] - Execute test starting...");
        if(isConnected()==0){
            System.out.println("[CLIENT] - The server is connected, the test can proceed...");
            
            System.out.println("[CLIENT] - Testing the server method getStringLength...");

            if (getStringLength("Test")==4) {
                System.out.println("[CLIENT] - The server method getStringLength has returned the correct value");
            } else {
                System.out.println("[CLIENT] - The server method getStringLength has returned the wrong value");
            }
            
            System.out.println("[CLIENT] - Testing the server method addNameToServer...");
            addNameToServer("John");
            addNameToServer("Laura");
            addNameToServer("Ahmed");
            addNameToServer("Ji");
            addNameToServer("VeryLongName");
            
            System.out.println("[CLIENT] - Testing the server method findLongestName...");
            if(findLongestNameInServer().equals("VeryLongName")){
                System.out.println("[CLIENT] - The server method findLongestName has returned the correct value");
            }
            else{
                System.out.println("[CLIENT] - The server method findLongestName has returned the wrong value");
            }
            
            System.out.println("[CLIENT] - Testing the server method getStringLengthWithException...");
            try {
                if (getStringLengthWithException("Test").equals(4)) {
                    System.out.println("[CLIENT] - The server method getStringLengthWithException has returned the correct value");
                } else {
                    System.out.println("[CLIENT] - The server method getStringLengthWithException has returned the wrong value");
                }
            } catch (java.lang.Exception ex) {
                System.out.println("[CLIENT] - The server method getStringLengthWithException has thrownn an Exception in the WRONG case");
            }
            try {
                if (getStringLengthWithException(null).equals(4)) {
                    System.out.println("[CLIENT] - The server method getStringLengthWithException has NOT thrown an Exception when it was supposed to");
                } else {
                    System.out.println("[CLIENT] - The server method getStringLengthWithException has NOT thrown an Exception when it was supposed to");
                }
            } catch (java.lang.Exception ex) {
                System.out.println("[CLIENT] - The server method getStringLengthWithException has thrown an Exception in the correct case");
            }
            
            System.out.println("[CLIENT] - Testing the server method addStudentToServer...");
            Student s1 = new Student();
            s1.setName("John");
            s1.setSurname("Connor");
            s1.setId("id1");
            s1.setGrade(90);
            addStudentToServer(s1);

            Student s2 = new Student();
            s2.setName("Ahmed");
            s2.setSurname("Ali");
            s2.setId("id2");
            s2.setGrade(80);
            addStudentToServer(s2);

            Student s3 = new Student();
            s3.setName("Li");
            s3.setSurname("Huan");
            s3.setId("id3");
            s3.setGrade(70);
            addStudentToServer(s3);

            Student s4 = new Student();
            s4.setName("Alessandra");
            s4.setSurname("Sfondrini");
            s4.setId("id4");
            s4.setGrade(100);
            addStudentToServer(s4);
            
            System.out.println("[CLIENT] - Testing the server method findStudentWithHighestGrade...");
            if(findStudentWithHighestGrade().getId().equals("id4")){
                System.out.println("[CLIENT] - The server method findStudentWithHighestGrade has returned the correct value");
            }
            else{
                System.out.println("[CLIENT] - The server method findStudentWithHighestGrade has returned the wrong value");
            }
            
        }
        else{
            System.out.println("[CLIENT] - The server is NOT connected, the test has failed !");
        }
        System.out.println("[CLIENT] - Test finished");
    }

    private static Integer isConnected() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.isConnected();
    }

    private static Integer getStringLength(java.lang.String arg0) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.getStringLength(arg0);
    }

    private static String addNameToServer(java.lang.String arg0) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.addNameToServer(arg0);
    }

    private static String findLongestNameInServer() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.findLongestNameInServer();
    }

    private static Integer getStringLengthWithException(java.lang.String arg0) throws Exception_Exception {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.getStringLengthWithException(arg0);
    }

    private static String addStudentToServer(cex2client.Student arg0) {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.addStudentToServer(arg0);
    }

    private static Student findStudentWithHighestGrade() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.findStudentWithHighestGrade();
    }
    
}
