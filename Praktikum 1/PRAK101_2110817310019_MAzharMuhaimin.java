
package Praktikum1;

import java.util.Scanner;

public class PRAK101_2110817310019_MAzharMuhaimin {
   public static void main(String args[])
   { 
    String namaLengkap, tempatLahir;
    int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
    float beratBadan;
    String namaBulan = "Nama Bulan";
    
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Masukkan Nama Lengkap: ");
    namaLengkap = keyboard.nextLine();
    
    System.out.println("Masukkan Tempat Lahir: ");
    tempatLahir = keyboard.nextLine();
    
    System.out.println("Masukkan Tanggal Lahir: ");
    tanggalLahir = keyboard.nextInt();
    
    System.out.println("Masukkan Bulan Lahir: ");
    bulanLahir = keyboard.nextInt();
    
    System.out.println("Masukkan Tahun Lahir: ");
    tahunLahir = keyboard.nextInt();
    
    System.out.println("Masukkan Tinggi Badan: ");
    tinggiBadan = keyboard.nextInt();
    
    System.out.println("Masukkan Berat Badan: ");
    beratBadan = keyboard.nextFloat();
    
    if (bulanLahir == 1)
        namaBulan = "Januari";
    else if (bulanLahir == 2)
        namaBulan = "Februari";
    else if (bulanLahir == 3)
        namaBulan = "Maret";
    else if (bulanLahir == 4)
        namaBulan = "April";
    else if (bulanLahir == 5)
        namaBulan = "Mei";
    else if (bulanLahir == 6)
        namaBulan = "Juni";
    else if (bulanLahir == 7)
        namaBulan = "Juli";
    else if (bulanLahir == 8)
        namaBulan = "Agustus";
    else if (bulanLahir == 9)
        namaBulan = "September";
    else if (bulanLahir == 10)
        namaBulan = "Oktober";
    else if (bulanLahir == 11)
        namaBulan = "November";
    else if (bulanLahir == 12)
        namaBulan = "Desember";
    
    System.out.println("Data telah ditambahkan.");
    System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
    System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
   }
 } 
