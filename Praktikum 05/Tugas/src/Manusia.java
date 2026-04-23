import java.time.LocalDate;

public abstract class Manusia {
    protected String nama, alamat;
    protected LocalDate tgl_mulai_kerja;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() { return counterMns; }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}