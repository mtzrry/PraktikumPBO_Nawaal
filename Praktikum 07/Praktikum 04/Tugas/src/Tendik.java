import java.time.*;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, String tglLahir, String tmt, long gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        Period mk = getMasaKerja();
        long tunjangan = (long) (0.01 * mk.getYears() * gajiPokok);

        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + hitungTglPensiun(55).format(fmt));
        System.out.println("Tunjangan       : Rp " + String.format("%,d", tunjangan));
    }
} 
