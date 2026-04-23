public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradien() {
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return dy / dx;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }
    
    public boolean isTegakLurus(Garis G) {
        return (this.getGradien() * G.getGradien()) == -1;
    }

    public void printPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}