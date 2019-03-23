/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1697758week03;

import java.util.ArrayList;

/**
 *
 * @author Hasal
 */
public class SimpleTemperatureRecorderServer {
    
    ArrayList<Double> temperatures = new ArrayList<Double>();
    
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Testing if the server is connected....");
        return true;
    }
    
    public void addTemperature(double sample){
        temperatures.add(sample);
        System.out.println("[SERVER] - " + temperatures);
    }
    
    public double getColdestTemperature(){
        System.out.println("[SERVER] - Checking the coldest temperature....");
        try{
            double min = (double)temperatures.get(0);

            for(int index=0; index<temperatures.size(); index++){
                if(min>(double)temperatures.get(index)){
                    min = (double)temperatures.get(index);
                }
            }
            return min;
        }
        catch(IndexOutOfBoundsException e){
            return 10000;
        }
    }

    public double getHottestTemperature(){
        System.out.println("[SERVER] - Checking the hottest temperature....");
        try{
            double max = (double)temperatures.get(0);

            for(int index=0; index<temperatures.size(); index++){
                if(max<(double)temperatures.get(index)){
                    max = (double)temperatures.get(index);
                }
            }
            return max;
        }
        catch(IndexOutOfBoundsException e){
            return 10000;
        }
    }
    
    public double getAverageTemperature(){
        System.out.println("[SERVER] - Checking the average temperature....");
        try{
            double average = (double)temperatures.get(0);
            int counter = 0;
            double total = 0;

            for(int index=0; index<temperatures.size(); index++){
                total = total + (double)temperatures.get(index);
                counter++;
            }

            average = total/counter;
            return average;
        }
        catch(IndexOutOfBoundsException e){
            return 10000;
        }
       
    }
    
    public int getNumberOfSamples(){
        return temperatures.size();
    }
}
