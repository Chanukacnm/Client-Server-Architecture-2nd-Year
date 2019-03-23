
package javaapplication2;
public class SimpleCalculatorServer {

   
    public boolean isServerConnected(){
        System.out.println("[Server] - Connection is being Tested");
        return true;
    }
    
    public int addIntegerNumbers(int a, int b){
        System.out.println("[SERVER] - adding the " + a + " and " + b + "...");
        return a+b;
    }
    
    public double divideIntegerNumbers(int a, int b) throws SimpleCalculatorServerException{
        if(b == 0){
            throw new SimpleCalculatorServerException("Cannot divide a number by zero");
        }
        if(a ==0 && b==0){
            throw new SimpleCalculatorServerException("Zero divided by zero is undetermined");
        }
        
        System.out.println("[SERVER] - dividing the " + a + " and " + b + "...");
        return Double.valueOf(a)/Double.valueOf(b);
    }
    
    public int subtractIntegerNumbers(int a, int b){
        System.out.println("[SERVER] - subtracting the " + a + " and " + b + "...");
        return a-b;
    }
    
    public int multiplyIntegerNumbers(int a, int b){
        System.out.println("[SERVER] - multiplying the " + a + " and " + b + "...");
        return a*b;
    }
    
    private void executeTest(){
        System.out.println("[Server] - the client is connected. the tests can proceed");
        
    }
    
    public static void main(String[] args) {
        SimpleCalculatorServer obj1 = new SimpleCalculatorServer();
        obj1.isServerConnected();
    }
    
}
