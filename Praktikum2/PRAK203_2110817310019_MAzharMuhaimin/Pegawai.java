package PRAK203_2110817310019_MAzharMuhaimin;

//baris ini error karena classnya tidak sesuai dengan judul yang mana menggunakan Employee bukan Pegawai
//public class Employee {
public class Pegawai {
 public String nama;
 //asal tidak cocok menggunakan char karena asal bukan 1 huruf saja
 //public char asal;
 public String asal;
 public String jabatan;
 public int umur;
 public String getNama() {
 return nama;
 }
 public String getAsal() {
 return asal;
 }
 //baris ini error karena kurang string j di dalam kurung
 //public void setJabatan() {
 public void setJabatan(String j) {
 this.jabatan = j;
 }
 }
