/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[]args){
     Kubus kotak = new Kubus(5);
     kotak.ComputeAndSetVolume();
        System.out.println("Volume kubus dengan sisi "+kotak.sisi+" adalah "+kotak.getVolume());
    
     Balok persegipanjang = new Balok(5,7,8);
     persegipanjang.ComputeAndSetVolume();
        System.out.println("Volume Balok dengan panjang "+persegipanjang.panjang+ " lebar "+persegipanjang.lebar+ " tinggi "+persegipanjang.tinggi + " adalah "+persegipanjang.getVolume());
        
     Tabung lingkaran = new Tabung(8, 10);
     lingkaran.ComputeAndSetVolume();
        System.out.println("Volume tabung dengan radius "+lingkaran.radius+ " tinggi "+lingkaran.tinggi+" adalah "+lingkaran.getVolume());
       
    LimasSegiEmpat segiempat = new LimasSegiEmpat(10,14);
    segiempat.ComputeAndSetVolume();
        System.out.println("Volume Limas Segi Empat dengan sisi "+segiempat.sisi+ " tinggi "+segiempat.tinggi+" adalah "+segiempat.getVolume());
    
    Bola bulat = new Bola(10);
    bulat.ComputeAndSetVolume();
        System.out.println("Volume Bola dengan radius "+bulat.radius+" adalah "+bulat.getVolume());
    
    }
   
}
