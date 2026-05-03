/* Nama File : Datum.java
   Deskripsi : Kelas generik Datum dan aplikasinya
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 3 Mei 2026 */

public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public static void main(String[] args) {
        Anabul kucingPj = new Kucing("Mpus", 3.5);
        Anabul anjingPj = new Anjing("Spike");

        Datum<Anabul> d1 = new Datum<>(kucingPj);

        System.out.println("=== UJI COBA KELAS GENERIK DATUM ===");
        System.out.print("Isi datum saat ini: ");
        d1.getIsi().bersuara();

        d1.setIsi(anjingPj);
        System.out.print("Isi datum setelah diubah: ");
        d1.getIsi().bersuara();
    }
}