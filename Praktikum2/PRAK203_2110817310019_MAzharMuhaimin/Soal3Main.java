package PRAK203_2110817310019_MAzharMuhaimin;

public class Soal3Main {
 public static void main(String[] args) {
 Pegawai p1 = new Pegawai();
 //baris ini error karena diakhir tidak ada titik koma (;)
 //p1.nama = "Roi"  
 p1.nama = "Roi";
 p1.asal = "Kingdom of Orvel";
 p1.setJabatan("Assasin");
 //umurnya = 0 dikarenakan sebelumnya tidak ada perintah untuk mengisi nilai umur
 p1.umur = 17;
 System.out.println("Nama Pegawai: " + p1.getNama());
 System.out.println("Asal: " + p1.getAsal());
 System.out.println("Jabatan: " + p1.jabatan);
 //Baris ini kurang string tahun setelah angka
 //System.out.println("Umur: " + p1.umur);
 System.out.println("Umur: " + p1.umur + " tahun");
 }
 }

