package kubus;
import java.util.Scanner;

public class LimasSegiEmpat{
    //atribut
    public int sisi;
    public int tinggi;
    public double volume;
    
    //kontruktor

    public LimasSegiEmpat(int sisi, int tinggi){
        this.sisi=sisi;
        this.tinggi=tinggi;
    }
    
    public void SetSisi(int sisi){
        this.sisi=sisi;
    }
  
    public void SetTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = 0.33*this.sisi*this.sisi*this.tinggi;
        //set volume
        this.volume = calculate_vol;
    }
    public double getVolume(){
        return this.volume;
    }
}