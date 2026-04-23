public class Seminar {
    private Civitasakademika[] peserta;
    private int banyakpeserta;

    public Seminar() {
        peserta = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < 100) {
            this.peserta[banyakpeserta] = peserta;
            banyakpeserta++;
            System.out.println("Registrasi berhasil: " + peserta.getNama());
        } else {
            System.out.println("Maaf, kapasitas seminar sudah penuh.");
        }
    }

    public void tampilPeserta() {
        System.out.println("\n--- DAFTAR PESERTA SEMINAR ---");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". [" + peserta[i].getNomor() + "] " + peserta[i].getNama());
        }
    }

    public int countMahasiswa() {
        int jumlahMhs = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                jumlahMhs++;
            }
        }
        return jumlahMhs;
    }

    public int countDosen() {
        int jumlahDosen = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (peserta[i] instanceof Dosen) {
                jumlahDosen++;
            }
        }
        return jumlahDosen;
    }

    public static void main(String[] args) {
        Seminar sem = new Seminar();

        System.out.println("=== PROSES REGISTRASI SEMINAR ===");
        
        Dosen d1 = new Dosen("Pak Wimzy", "NIP001");
        Dosen d2 = new Dosen("Pak Benny", "NIP002");

        Mahasiswa m1 = new Mahasiswa("Nawaal Hanif", "NIM001", "Pak X");
        Mahasiswa m2 = new Mahasiswa("Galvin", "NIM002", "Pak X");
        Mahasiswa m3 = new Mahasiswa("Rizky", "NIM003", "Pak X");
        Mahasiswa m4 = new Mahasiswa("Moses", "NIM004", "Pak X");
        Mahasiswa m5 = new Mahasiswa("Liling", "NIM005", "Pak X");

        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        System.out.println("\nTotal Peserta Saat Ini: " + sem.countPeserta() + " orang.");

        System.out.println("Total Mahasiswa: " + sem.countMahasiswa() + " orang.");
        System.out.println("Total Dosen: " + sem.countDosen() + " orang.");

        sem.tampilPeserta();

        System.out.println("\n=== UJI COBA DOSEN WALI ===");
        m1.tampilDataMahasiswa();
        m1.setWali(d1);
        System.out.println("--> Setelah setWali dieksekusi:");
        m1.tampilDataMahasiswa();
    }
}