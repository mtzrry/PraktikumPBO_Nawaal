/* Nama File : Piaraan.java
   Deskripsi : Kelas Piaraan menggunakan Queue (Koleksi Kelas Bentukan)
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 6 Mei 2026 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() { return nbelm; }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        System.out.println("--- Daftar Panggilan Antrean Anabul ---");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public int countAnjing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Anjing) {
                count++;
            }
        }
        return count;
    }


    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("--- Daftar Antrean Beserta Jenisnya ---");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (" + a.getClass().getName() + ")");
        }
    }

    // Aplikasi Kelas Piaraan
    public static void main(String[] args) {
        Piaraan egiluyy = new Piaraan();
        
        Kucing mpus = new Kucing("Mpus", 3.2);
        Anggora snowy = new Anggora("Snowy", 4.5);
        Anjing gukguk = new Anjing("gukguk");

        egiluyy.enqueueAnabul(mpus);
        egiluyy.enqueueAnabul(snowy);
        egiluyy.enqueueAnabul(gukguk);

        egiluyy.showAnabul();
        egiluyy.showJenisAnabul();
        System.out.println("Banyak Anjing :" + egiluyy.countAnjing());

        System.out.println("\nJumlah hewan di antrean: " + egiluyy.getNbelm());
        System.out.println("Banyak keluarga kucing: " + egiluyy.countKucing() + " ekor");
        System.out.println("Total bobot keluarga kucing: " + egiluyy.bobotKucing() + " kg");

        System.out.println("\nMemanggil hewan pertama...");
        Anabul dipanggil = egiluyy.dequeueAnabul();
        System.out.println(dipanggil.getNama() + " telah dikeluarkan dari antrean.");
        System.out.println("Sisa hewan di antrean: " + egiluyy.getNbelm());
    }
}