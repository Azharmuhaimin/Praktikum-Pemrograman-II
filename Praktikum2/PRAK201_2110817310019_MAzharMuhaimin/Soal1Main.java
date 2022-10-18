package PRAK201_2110817310019_MAzharMuhaimin;

public class Soal1Main {
    public static void main(String[] args) {
        BuahMangga arumanis = new BuahMangga();
        arumanis.Buah("Arumanis", 0.3f, 13, 5000);
        arumanis.data();
        
        BuahMangga manalagi = new BuahMangga();
        manalagi.Buah("Manalagi", 0.5f, 17, 7500);
        manalagi.data();
        
        BuahMangga manggaMadu = new BuahMangga();
        manggaMadu.Buah("Mangga Madu", 0.375f, 12, 6500);
        manggaMadu.data();        
    }
    
}
