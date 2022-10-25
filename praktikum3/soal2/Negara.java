package praktikum3.soal2;

import java.util.HashMap;

public class Negara {
    private String namaNegara, kepemimpinan, namaPemimpin;
    private int tanggalKemerdekaan, monthKemerdekaan, tahunKemerdekaan;
    
    public Negara(String namaNegara, String kepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int monthKemerdekaan, int tahunKemerdekaan){
        this.namaNegara = namaNegara;
        this.kepemimpinan = kepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.monthKemerdekaan = monthKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public String getNama() {
        return namaNegara;
    }

    public void setNama(String namaNegara) {
        this.namaNegara = namaNegara;
    }

    public String getKepemimpinan() {
        return kepemimpinan;
    }

    public void setKepemimpinan(String kepemimpinan) {
        this.kepemimpinan = kepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public void setTanggalKemerdekaan(int tanggalKemerdekaan) {
        this.tanggalKemerdekaan = tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return monthKemerdekaan;
    }

    public void setBulanKemerdekaan(int monthKemerdekaan) {
        this.monthKemerdekaan = monthKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }

    public void setTahunKemerdekaan(int tahunKemerdekaan) {
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    
    public void Datanegara(){
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        System.out.println();
        System.out.print("Negara " + getNama());
        String[] namaNegaraKepemimpinanSplit  = getKepemimpinan().split(" ");
        String namaNegaraKepemimpinanKapitalHurufPertama = "";
        for (String temp: namaNegaraKepemimpinanSplit){
            namaNegaraKepemimpinanKapitalHurufPertama = namaNegaraKepemimpinanKapitalHurufPertama + temp.substring(0,1).toUpperCase() + temp.substring(1).toLowerCase() + " ";
        }
        if (getTanggalKemerdekaan() != 0){
            System.out.print(" mempunyai " + namaNegaraKepemimpinanKapitalHurufPertama);
            System.out.println("bernama " + getNamaPemimpin());            
            System.out.print("Deklarasi Kemerdekaan pada Tanggal " + getTanggalKemerdekaan()); 
            System.out.print(" " + month.get(getBulanKemerdekaan()));
            System.out.println(" " + getTahunKemerdekaan());
        }
        else {
            System.out.print(" mempunyai Raja");
            System.out.println(" bernamaNegara " + getNamaPemimpin());               
        }
    }
}