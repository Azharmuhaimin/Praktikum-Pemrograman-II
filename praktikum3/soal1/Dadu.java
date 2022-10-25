package praktikum3.soal1;

import java.util.LinkedList;

public class Dadu {
    int nilaiDadu;
    int total;
    
public void setNilaiDadu(int nilaiDadu){
        this.nilaiDadu = nilaiDadu;
    }
    
        LinkedList<Integer> NilaiSemuaDadu = new LinkedList<Integer>();
public void acakNilai(){
            for (int i = 1; i <= this.nilaiDadu; i++){
            int NilaiAcak = (int)(Math.random()*(6-1+1)+1);
            NilaiSemuaDadu.add(NilaiAcak);
            total = total + NilaiAcak;
            }
    }
    
public void outputDadu(){
        for(int i = 1; i <= this.nilaiDadu; i++){
            System.out.println("Dadu ke-" + i + " bernilai "+ NilaiSemuaDadu.get(i-1));
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
 }
}