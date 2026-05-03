public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, String tglLahir, String tmt, long gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}