package Praktikum1;

import java.util.Scanner;

public class PRAK105_2110817310019_MAzharMuhaimin {
    public static void main(String args[]){
        float phi = (float) 3.14;
        float r, t, volume;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("Masukkan jari-jarinya: ");
        r = keyboard.nextFloat();
        System.out.print("Masukkan Tinggi: ");
        t = keyboard.nextFloat();
        
        volume = phi*r*r*t;
        System.out.printf("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + "%.3f m3 ", volume);
    }
}
