package praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        LinkedList<Negara> listNegara = new LinkedList<>();               
        Scanner in = new Scanner(System.in);
        int jumlahNegara = in.nextInt();
        in.nextLine();
        for (int i=0;i < jumlahNegara;i++){  
            String namaNegara = in.nextLine();
            String kepemimpinan = in.nextLine();
            String namaPemimpin = in.nextLine();
            if (kepemimpinan.equalsIgnoreCase("monarki")){
                listNegara.add(new Negara(namaNegara, kepemimpinan, namaPemimpin, 0 , 0, 0));
            } 
            else {
                int tanggalKemerdekaan = in.nextInt();
                int bulanKemerdekaan = in.nextInt();
                int tahunKemerdekaan = in.nextInt();
                in.nextLine();
                listNegara.add(new Negara(namaNegara, kepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));                  
            }         
        }               
        for (int i=0;i < jumlahNegara;i++){
            listNegara.get(i).Datanegara();            
        }        
    }    
}