// File: Titik.java
public class Titik {
    // ATRIBUT
    double absis;
    double ordinat;

    // KONSTRUKTOR
    // Inisialisasi titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // METHOD
    
    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis dengan nilai baru
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat dengan nilai baru
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}