package praktikum4.soal2;

public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected Integer tahun;
    
    protected void display(){
        
    }
}

    class Novel extends Buku {
        private String genre;
        private String sinopsis;
    
        public Novel(String j, String p, String t, String g, String s) {
            super.judul = j;
            super.penulis = p;
            super.tahun = Integer.valueOf(t);
            genre = g;
            sinopsis = s;
        }

        public String getNovelDetail() {
            return "Data yang baru diinputkan adalah \n"
                + "Sebuah novel bergenre " + genre + " dengan judul \"" + judul + "\"." + " Novel tersebut ditulis oleh \n"
                + penulis + " dan diterbitkan pada tahun " + tahun + ".\n"
                + "Sinopsis : " + sinopsis.substring(0, 59) + "....";  
        }
    }

    class Komik extends Buku {
        private Integer volume;
        private String sinopsis;
        
        public Komik(String j, String p, String t, Integer v, String s) {
            super.judul = j;
            super.penulis = p;
            super.tahun = Integer.valueOf(t);
            volume = v;
            sinopsis = s;
        }
        
        public String getKomikDetail() {
            return "Data yang baru diinputkan adalah \n"
                + "Sebuah komik dengan judul \"" + judul + "\"." + " Komik tersebut dibuat oleh " + penulis 
                + "\ndan diterbitkan pada tahun " + tahun + "." + " Sampai saat ini komik tersebut memiliki jumlah \n"
                + "volume sebanyak " + volume + " buah.\n"
                + "Sinopsis : " + sinopsis.substring(0, 64) + "....";
        }
    }