/* Nama File : Data.java
   Deskripsi : Kelas generik Data yang menampung 100 elemen
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 3 Mei 2026 */

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];
        }
        throw new IndexOutOfBoundsException("Posisi di luar jangkauan (1-100)");
    }

    public void setIsi(int posisi, T objekBaru) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = objekBaru;
            if (posisi > banyak) {
                banyak = posisi;
            }
        } else {
            throw new IndexOutOfBoundsException("Posisi di luar jangkauan (1-100)");
        }
    }

    public int getSize() {
        return banyak;
    }

    public static void main(String[] args) {
        System.out.println("=== UJI COBA KELAS DATA (LARIK GENERIK) ===");
        Data<Anabul> dataAnabul = new Data<>();

        Anabul kucing1 = new Kucing("Mpus", 3.0);
        Anabul anggora1 = new Anggora("Snowy", 2.5);

        dataAnabul.setIsi(1, kucing1);
        dataAnabul.setIsi(2, anggora1);

        System.out.println("Isi pada posisi 1: ");
        dataAnabul.getIsi(1).bersuara();

        System.out.println("Isi pada posisi 2: ");
        dataAnabul.getIsi(2).bersuara();

        System.out.println("Banyak elemen efektif saat ini: " + dataAnabul.getSize());
    }
}