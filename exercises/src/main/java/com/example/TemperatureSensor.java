package com.example;
import java.util.*;

public class TemperatureSensor {
    private ArrayList<Double> readings;
    private String unit;
    

    public TemperatureSensor(String unit, ArrayList<Double> readings){
        this.unit = unit;
        this.readings= readings;
    }



 
    public void addReading(double temp){
        readings.add(temp);
    }

    public double getAverage(){
        double sum = 0;
        if (readings.size() > 0){
            for (double reading:readings){  
                sum  = sum + reading;
            }
        }else{
            throw new IllegalArgumentException();
        }
        return sum/readings.size();
    }
    
    


    public List<Double> getReadings(){
        return Collections.unmodifiableList(List.copyOf(readings));
    }

    public String getUnit(){
        if(!(unit.equals("C") || unit.equals("F"))){
            throw new IllegalArgumentException();
        }

        return unit;
    }


    // we are returning a copy of list so that they can cannot
    //  be changed, we are encapusalting the inner details
    // of the readings


    
}
