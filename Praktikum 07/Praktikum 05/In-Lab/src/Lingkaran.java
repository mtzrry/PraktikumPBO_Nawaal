/* * File      : Lingkaran.java
 * Deskripsi : Implementasi kelas Lingkaran sebagai turunan BangunDatar dan IResize
 * Pembuat   : Nawaal Hanif Mumtaz Arriye
 * Tanggal   : 20 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
        this.warna = "Biru";
        this.border = "Dotted";
    }
    
    @Override
    public double getLuas() {
        return Math.PI * jejari * jejari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jejari;
    }


    @Override
    public void zoomIn() {
        this.jejari = this.jejari * 1.1;
    }

    @Override
    public void zoomOut() {
        this.jejari = this.jejari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.jejari = this.jejari * ((double) percent / 100);
    }

    public void printInfo() {
        System.out.println("Bangun   : Lingkaran");
        System.out.println("Jejari   : " + jejari);
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}