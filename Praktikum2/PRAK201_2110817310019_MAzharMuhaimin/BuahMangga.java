package PRAK201_2110817310019_MAzharMuhaimin;

public class BuahMangga {
    String jenisMangga;
    float berat;
    int jumlahBeli, harga;
 
    public void Buah(String jenisMangga, float berat, int jumlahBeli, int harga){
        this.jenisMangga = jenisMangga;
        this.berat = berat;
        this.jumlahBeli = jumlahBeli;
        this.harga = harga;
}
    
    public void data() {
        System.out.println("Nama Mangga: " + jenisMangga);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total berat: " + berat * jumlahBeli + " kg");
        System.out.println("Total harga: Rp. " + harga * jumlahBeli);
        System.out.println("");
    }
}
