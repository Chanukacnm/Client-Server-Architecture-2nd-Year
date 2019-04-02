/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hasal
 */
@WebService(serviceName = "Server")
public class Server {

    /**
     * This is a sample web service operation
     */
    private List<Double> numberList = new ArrayList<>();
    private List<MyPoint3D> pointList = new ArrayList<>();
    
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    public String isConnected() 
    {
        return "OK";
    }

    public String findShortestBetween(String a, String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String findShortestBetweenWithException(String a, String b) throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String addString(String first_String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String findShortestAmongAllStrings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double addTwoNumbers(Double d, Double d0) {
        return d+d0;
    }

    public double addTwoNumbersWithException(Double d, Double d0) throws Exception{
        if(d!=0 && d0!=0){
            return d+d0;
        }
        else{
            throw new Exception();
        }
    }

    public void addNumber(double d) {
        numberList.add(d);
    }

    public double averageOfAllNumbers() {
        int total = 0;
        
        for(int i = 0; i<numberList.size(); i++){
            total += numberList.get(i);
        }
        
        return total/numberList.size();
    }

    public void  addMyPoint3D(MyPoint3D p1) {
        pointList.add(p1);
    }

    public MyPoint3D findPointWithHighestZ() {
        MyPoint3D withHighestZ = new MyPoint3D();
        double highestZ = 0;
        
        for(int i = 0; i <pointList.size(); i++){
            if(pointList.get(i).z>highestZ){
                withHighestZ = pointList.get(i);
                highestZ = pointList.get(i).z;
            }
        }
        return withHighestZ;
    }
}
