class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Anabul bergerak");
    }

    public void bersuara() {
        System.out.println("Anabul bersuara");
    }
}
class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + nama + " berbunyi meong.");
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing " + nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + nama + " bersuara guk-guk.");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Burung " + nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung " + nama + " berbunyi cuit.");
    }
}