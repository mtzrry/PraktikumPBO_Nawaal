/* Nama File : Teman.java
   Deskripsi : Kelas Teman menggunakan List (Koleksi Kelas Dasar)
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 6 Mei 2026 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teman {
    private List<String> Lnama;
    private int nbelm;
    

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() { return nbelm; }
    
    public String getNama(int indeks) { 
        return Lnama.get(indeks); 
    }
    
    public void setNama(int indeks, String nama) {   
        Lnama.set(indeks, nama); 
    }
    
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }
    
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }
    
    public boolean isMember(String nama) { 
        return Lnama.contains(nama); 
    }
    
    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }
    
    public int countNama(String nama) {
        return Collections.frequency(Lnama, nama);
    }
    
    public void showTeman() {
        System.out.println("--- Daftar Teman ---");
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }

    // Aplikasi Kelas Teman
    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Caca");
        t.addNama("Andi");

        t.showTeman();
        System.out.println("Jumlah teman: " + t.getNbelm());
        System.out.println("Apakah Budi ada? " + t.isMember("Budi"));
        System.out.println("Jumlah nama Andi: " + t.countNama("Andi"));
        
        t.gantiNama("Caca", "Chika");
        t.delNama("Budi");
        System.out.println("\nSetelah diubah:");
        t.showTeman();
    }
}