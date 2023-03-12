package kubus;
import java.util.Scanner;

public class Balok {
    //atribut
    public int panjang;
    public int lebar;
    public int tinggi;
    public int volume;
    
    //kontruktor

    public Balok(int panjang, int lebar, int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    
    public void SetPanjang(int panjang){
        this.panjang=panjang;
    }
    
    public void SetLebar(int lebar){
        this.lebar=lebar;
    }
      
    public void SetTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    public void ComputeAndSetVolume(){
        //compute volume
        int calculate_vol = this.panjang*this.lebar*this.tinggi;
        //set volume
        this.volume = calculate_vol;
    }
    public int getVolume(){
        return this.volume;
    }
}