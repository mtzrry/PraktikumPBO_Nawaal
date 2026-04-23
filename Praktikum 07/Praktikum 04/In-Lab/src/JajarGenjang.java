public class JajarGenjang extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public JajarGenjang() {
        super();
        setJmlSisi(4);
    }

    public JajarGenjang(double alas, double tinggi, double sisiMiring, String warna, String border) {
        super(4, warna, border);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double getLuas() {
        return alas * tinggi;
    }

    public double getKeliling() {
        return 2 * (alas + sisiMiring);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi Miring: " + sisiMiring);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}