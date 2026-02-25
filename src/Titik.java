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

    // Selektor (Getter) [cite: 957]
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mutator (Setter) [cite: 957]
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

    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}