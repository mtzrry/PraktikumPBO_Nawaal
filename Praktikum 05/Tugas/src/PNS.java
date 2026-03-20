import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl, String alamat, double pendapatan, String nip) {
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    @Override
    public int hitungMasaKerja() {
        int digitA = 1;
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + digitA;
    }

    @Override
    public double hitungPajak() { return 0.10 * pendapatan; }

    public static int getCounterPNS() { return counterPNS; }
}