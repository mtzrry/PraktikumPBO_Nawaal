/* Nama File : MGaris.java
   Deskripsi : Main class untuk pengujian class Garis
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 25 Februari 2026 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G1 = new Garis(T1, T2);

        System.out.println("--- Data Garis G1 ---");
        System.out.println("Titik Awal: (" + G1.getTitikAwal().getAbsis() + ", " + G1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + G1.getTitikAkhir().getAbsis() + ", " + G1.getTitikAkhir().getOrdinat() + ")");
        
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());

        G1.printPersamaanGaris();

        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());

        Garis G2 = new Garis();
        System.out.println("\n--- Data Garis G2 (Default) ---");
        G2.printPersamaanGaris();
        System.out.println("Jumlah Objek Garis Sekarang = " + Garis.getCounterGaris());
    }
}