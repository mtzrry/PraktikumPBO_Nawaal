import java.time.*;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tglBerakhirKontrak;

    public DosenTamu(String nip, String nama, String tglLahir, String tmt, long gajiPokok, String fakultas, String nidk, String tglKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = LocalDate.parse(tglKontrak, fmt);
    }

    public long getSisaKontrak() {
        LocalDate tglSekarang = LocalDate.of(2025, 3, 10);
        return ChronoUnit.MONTHS.between(tglSekarang, tglBerakhirKontrak);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        long tunjangan = (long) (0.025 * gajiPokok);
        
        System.out.println("NIDK            : " + nidk);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Sisa Kontrak    : " + getSisaKontrak() + " bulan");
        System.out.println("Berakhir Kontrak: " + tglBerakhirKontrak.format(fmt));
        System.out.println("Tunjangan       : Rp " + String.format("%,d", tunjangan));
    }
}