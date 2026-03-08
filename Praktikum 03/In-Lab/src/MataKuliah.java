public class MataKuliah {
    private String idMatKul, nama;
    private int sks;

    public MataKuliah() { }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }


    public String getIdMatKul() { return idMatKul; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }


    public void setIdMatKul(String idMatKul) { this.idMatKul = idMatKul; }
    public void setNama(String nama) { this.nama = nama; }
    public void setSks(int sks) { this.sks = sks; }
}