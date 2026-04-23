/* * File      : Persegi.java
 * Deskripsi : Implementasi kelas Persegi sebagai turunan BangunDatar dan IResize
 * Pembuat   : Nawaal Hanif Mumtaz Arriye
 * Tanggal   : 20 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
        this.warna = "Putih";
        this.border = "Solid";
    }

    
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }


    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1; 
    }

    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.sisi = this.sisi * ((double) percent / 100);
    }

    public void printInfo() {
        System.out.println("Bangun: Persegi");
        System.out.println("Sisi  : " + sisi);
        System.out.println("Luas  : " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}