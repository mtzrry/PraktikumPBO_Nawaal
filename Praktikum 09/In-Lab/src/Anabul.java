/* Nama File : Anabul.java
   Deskripsi : Kelas Anabul dan turunannya dengan atribut panggilan
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 6 Mei 2026 */

class Anabul {
    protected String panggilan;

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    public void gerak() { System.out.println("Anabul bergerak"); }
    public void bersuara() { System.out.println("Anabul bersuara"); }
}

class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() { return bobot; }

    @Override public void gerak() { System.out.println("Kucing melata."); }
    @Override public void bersuara() { System.out.println("Meong"); }
}

class Anggora extends Kucing {
    public Anggora(String panggilan, double bobot) { super(panggilan, bobot); }
}

class Kembangtelon extends Kucing {
    public Kembangtelon(String panggilan, double bobot) { super(panggilan, bobot); }
}

class Anjing extends Anabul {
    public Anjing(String panggilan) { super(panggilan); }
    @Override public void bersuara() { System.out.println("Guk-guk"); }
}

class Burung extends Anabul {
    public Burung(String panggilan) { super(panggilan); }
    @Override public void bersuara() { System.out.println("Cuit"); }
}