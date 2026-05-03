public class Dosen {
    private String nip, nama, prodi;

    public Dosen() { }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }


    public String getNama() { return nama; }
    public String getNip() { return nip; }
    public String getProdi() { return prodi; }

    public void setNama(String nama) { this.nama = nama; }
    public void setNip(String nip) { this.nip = nip; }
    public void setProdi(String prodi) { this.prodi = prodi; }
}