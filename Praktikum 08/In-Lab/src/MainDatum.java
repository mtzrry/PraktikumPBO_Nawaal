/* Nama File : MainDatum.java
   Deskripsi : Aplikasi kelas generik Datum menggunakan Anabul
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 1 Mei 2026 */


public class MainDatum {
    public static void main(String[] args) {

        Anabul kucingPj = new Kucing("Mpus", 3.5);
        Anabul anjingPj = new Anjing("Spike");

        Datum<Anabul> d1 = new Datum<>(kucingPj);
        
        System.out.println("=== UJI COBA KELAS GENERIK DATUM ===");
        System.out.print("Isi datum saat ini (Anabul pertama): ");
        d1.getIsi().bersuara();

        d1.setIsi(anjingPj);
        System.out.print("Isi datum setelah diubah: ");
        d1.getIsi().bersuara();
    }
}