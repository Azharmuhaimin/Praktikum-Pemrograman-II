package praktikum4.soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        String j,p;
        Integer t;
        Scanner data = new Scanner(System.in);
        
        System.out.print("Judul: ");
        j = data.nextLine();
        
        System.out.print("Penulis: ");
        p = data.nextLine();
        
        System.out.print("Tahun Terbit: ");
        t = data.nextInt();
        
        Buku buku = new Buku(j, p, t);
        
        buku.display();
    }
    
}