import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    @Override
    public int hitungMasaKerja() {
        int digitB = 0;
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + digitB;
    }

    @Override
    public double hitungPajak() { return 0.15 * pendapatan; } // 15% 

    public static int getCounterPengusaha() { return counterPengusaha; }
}