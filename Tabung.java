package kubus;
import java.util.Scanner;

public class Tabung {
    //atribut
    public int radius;
    public int tinggi;
    public double volume;
    
    //kontruktor

    public Tabung(int radius, int tinggi){
        this.radius=radius;
        this.tinggi=tinggi;
    }
    
    public void SetRadius(int radius){
        this.radius=radius;
    }
          
    public void SetTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = Math.PI*this.radius*this.radius*this.tinggi;
        //set volume
        this.volume = calculate_vol;
    }
    public double getVolume(){
        return this.volume;
    }
}