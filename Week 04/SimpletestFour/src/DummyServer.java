
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DummyServer {

    ArrayList<TemperatureSample> samples = new ArrayList<TemperatureSample>();
    String fileName = "Sample.ser";

    public DummyServer() {
       try{
           loadFromFile();
       }catch(IOException ex){
           Logger.getLogger(DummyServer.class.getName()).log(Level.SEVERE,null,ex);
       }catch( ClassNotFoundException ex){
           Logger.getLogger(DummyServer.class.getName()).log(Level.SEVERE,null,ex);
       } 

    }

    private void saveToFile() throws FileNotFoundException, IOException {
        System.out.println("[SERVER] - Saving " + samples + " to file " + fileName);
        //Saving of objects in a file
        FileOutputStream file = new FileOutputStream(fileName, true);
        ObjectOutputStream out = new ObjectOutputStream(file);

        //method for serialization of object
        out.writeObject(samples);

        out.close();
        file.close();

        System.out.println("Object has been serialized");
    }

    private void loadFromFile() throws FileNotFoundException, ClassNotFoundException, IOException {
        System.out.println("[SERVER] - Loading sample from this " + fileName);
        //reading the object from a file
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        //Method for deserialization of objects
        samples = (ArrayList<TemperatureSample>)in.readObject();

        in.close();
        file.close();
       
    }

    public boolean isConnected() {
        System.out.println("[SERVER] - Testing if server is connected...");
        return true;
    }

    public void addSample(TemperatureSample s) throws IOException {
        System.out.println("[SERVER] - Adding " + s + " to " + samples);
        samples.add(s);
        System.out.println("[SERVER] - Samples are " + samples);
        saveToFile();
    }
    
    public double getColdestTemperatureIn(String city) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("[SERVER] - Loading sample from this " + fileName);
        //reading the object from a file
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        //Method for deserialization of objects
        ArrayList<TemperatureSample> sampleTemp = (ArrayList<TemperatureSample>)in.readObject();
       // List<Double> value = new Arraylist<>();
       double min = sampleTemp.get(0).value; 
       for(int i=0; i<sampleTemp.size(); i++){
           if(sampleTemp.get(i).value<min){
               min = sampleTemp.get(i).value;
           }
       }

       System.out.println("[SERVER] - Minimum temperature recorded is " + min);
       
       return min;
       
    }

        public double getHottestTemperatureIn(String city) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("[SERVER] - Loading sample from this " + fileName);
        //reading the object from a file
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        //Method for deserialization of objects
        ArrayList<TemperatureSample> sampleTemp = (ArrayList<TemperatureSample>)in.readObject();
       // List<Double> value = new Arraylist<>();
       double max = sampleTemp.get(0).value; 
       for(int i=0; i<sampleTemp.size(); i++){
           if(sampleTemp.get(i).value>max){
               max = sampleTemp.get(i).value;
           }
       }
       
       System.out.println("[SERVER] - Hottest temperature recorded is " + max);

       return max;
       
    }
}
