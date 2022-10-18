package PRAK202_2110817310019_MAzharMuhaimin;

import java.text.NumberFormat;
import java.util.Locale;

public class Mobil {
    String merek, pemilikMobil, tahun_keluaran;
    int harga, kapasitas;
    
    public void info() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + NumberFormat.getNumberInstance(Locale.US).format(harga));
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
    }
    
    public void setPemilik(String pemilikMobil) {
        this.pemilikMobil = pemilikMobil;
    }
            
    public String getPemilik() {
        return this.pemilikMobil;
    }
    
    public String getPajak() {
        return NumberFormat.getNumberInstance(Locale.US).format(this.harga*2/100);
    }
}
