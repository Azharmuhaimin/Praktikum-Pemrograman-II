package praktikum4.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Integer pilihan;
        Scanner data = new Scanner(System.in);
        
        System.out.println("Pilih buku yang ingin diinputkan: ");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        
        System.out.print("Masukkan pilihan: ");
        pilihan = Integer.parseInt(data.nextLine());
        
        if (pilihan == 1){
            String j, p, t, g, s;
           
            System.out.print("Judul: ");
            j = data.nextLine();
            
            System.out.print("Penulis : ");
            p = data.nextLine();
            
            System.out.print("Tahun Terbit : ");
            t = data.nextLine();
            
            System.out.print("Genre : ");
            g = data.nextLine();
            
            System.out.print("Sinopsis : ");
            s = data.nextLine();
            
            Novel novel = new Novel(j, p, t, g, s);
            System.out.print(novel.getNovelDetail());
        }
        else if(pilihan == 2){
            String j, p, t, s;
            Integer v;
            
            System.out.print("Judul: ");
            j = data.nextLine();

            System.out.print("Penulis : ");
            p = data.nextLine();
 
            System.out.print("Tahun Terbit : ");
            t = data.nextLine();

            System.out.print("Volume : ");
            v = Integer.parseInt(data.nextLine());
            
            System.out.print("Sinopsis : ");
            s = data.nextLine();

            Komik komik = new Komik(j, p, t, v, s);
            System.out.println(komik.getKomikDetail());
        }
    }
    
}
