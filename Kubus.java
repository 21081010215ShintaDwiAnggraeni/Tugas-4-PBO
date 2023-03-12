package kubus;
import java.util.Scanner;

public class Kubus {
    //atribut
    public int sisi;
    public int volume;
    
    //kontruktor
    public Kubus(int sisi){
        this.sisi=sisi;
    }
    
    public void SetSisi(int sisi){
        this.sisi=sisi;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        int calculate_vol = this.sisi*this.sisi*this.sisi;
        //set volume
        this.volume = calculate_vol;
    }
    public int getVolume(){
        return this.volume;
    }
}
    
