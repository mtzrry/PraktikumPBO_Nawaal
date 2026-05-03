public class Civitasakademika {
    private String Nama;
    private String Nomor;

    public Civitasakademika(String Nama, String Nomor) {
        this.Nama = Nama;
        this.Nomor = Nomor;
    }

    public String getNama() {
        return Nama;
    }

    public String getNomor() {
        return Nomor;
    }
}

class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama, NIP);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}

class Mahasiswa extends Civitasakademika {
    private String NIM;
    private String Dosenwali;

    public Mahasiswa(String Nama, String NIM, String Dosenwali) {
        super(Nama, NIM);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen.getNama();
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + this.NIM + " | Nama: " + this.getNama() + " | Dosen Wali: " + this.Dosenwali);
    }
}