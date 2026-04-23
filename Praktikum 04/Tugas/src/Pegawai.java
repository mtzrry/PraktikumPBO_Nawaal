import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    protected String nip, nama;
    protected LocalDate tglLahir, tmt;
    protected long gajiPokok;
    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    public Pegawai(String nip, String nama, String tglLahir, String tmt, long gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir, fmt);
        this.tmt = LocalDate.parse(tmt, fmt);
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        LocalDate tglSekarang = LocalDate.of(2025, 3, 10); 
        return Period.between(tmt, tglSekarang);
    }

    public LocalDate hitungTglPensiun(int bup) {
        return tglLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,d", gajiPokok));
    }
}