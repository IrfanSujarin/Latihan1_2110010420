
package hitung;

import java.time.Clock;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika irfan = new Matematika(2,0);
        
        System.out.println("Hasil Penjumlahan : "+irfan.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+irfan.setPengurangan());
        System.out.println("Hasil Perkalian : "+irfan.setPerkalian());
        System.out.println("Hasil Pembagian : "+irfan.setPembagian());
    }
}
