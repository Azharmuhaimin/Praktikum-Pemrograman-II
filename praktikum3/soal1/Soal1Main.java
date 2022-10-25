package praktikum3.soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Dadu dadu = new Dadu();
        Scanner jumlah = new Scanner(System.in);
        
        int jumlahDadu = jumlah.nextInt();
        
        dadu.setNilaiDadu(jumlahDadu);
        dadu.acakNilai();
        dadu.outputDadu();
    }    
}
