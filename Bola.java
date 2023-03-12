package kubus;
import java.util.Scanner;

public class Bola{
    //atribut
    public int radius;
    public double volume;
    
    //kontruktor
    public Bola(int radius){
        this.radius=radius;
    }
    
    public void SetSisi(int radius){
        this.radius=radius;
    }
         
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = 1.33*Math.PI*this.radius*this.radius*this.radius;
        //set volume
        this.volume = calculate_vol;
    }
    public double getVolume(){
        return this.volume;
    }
}