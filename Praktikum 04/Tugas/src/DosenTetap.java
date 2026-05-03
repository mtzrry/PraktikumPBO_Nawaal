import java.time.*;

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nama, String tglLahir, String tmt, long gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        Period mk = getMasaKerja();
        long tunjangan = (long) (0.02 * mk.getYears() * gajiPokok);
        
        System.out.println("NIDN            : " + nidn);
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + hitungTglPensiun(65).format(fmt));
        System.out.println("Tunjangan       : Rp " + String.format("%,d", tunjangan));
    }
}