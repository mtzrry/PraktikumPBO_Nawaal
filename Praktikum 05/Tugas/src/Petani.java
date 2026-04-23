import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl, String alamat, double pendapatan, String asal) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal;
        counterPetani++;
    }

    @Override
    public int hitungMasaKerja() {
        int digitC = 3;
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + digitC;
    }

    public static int getCounterPetani() { return counterPetani; }
}
