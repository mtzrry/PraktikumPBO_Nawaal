/* Nama File : Titik.java
   Deskripsi : Berisi atribut dan method dalam class Titik
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 25 Februari 2026 */

public class Titik {
    /* ATRIBUT */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* KONSTRUKTOR */

    public Titik() {
        this(0, 0);
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0;
    }

    
    public double getJarak(Titik T) {
        double dx = T.getAbsis() - this.absis;
        double dy = T.getOrdinat() - this.ordinat;
        
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}