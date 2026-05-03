public class Kendaraan {
    private String noPlat, jenis;

    public Kendaraan() { }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() { return noPlat; }
    public String getJenis() { return jenis; }

    public void setNoPlat(String noPlat) { this.noPlat = noPlat; }
    public void setJenis(String jenis) { this.jenis = jenis; }
}