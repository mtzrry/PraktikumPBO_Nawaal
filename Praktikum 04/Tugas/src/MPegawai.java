public class MPegawai {
    public static void main(String[] args) {
        System.out.println("=== DETAIL DOSEN TETAP ===");
        DosenTetap dosen1 = new DosenTetap("9545647548", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000, "Fakultas Sains dan Matematika", "78647324");
        dosen1.printInfo();

        System.out.println("\n=== DETAIL TENDIK ===");
        Tendik tendik1 = new Tendik("1234567890", "Siti", "15 Juli 1992", "1 Februari 2018", 4000000, "Akademik");
        tendik1.printInfo();

        System.out.println("\n=== DETAIL DOSEN TAMU ===");
        DosenTamu dosen3 = new DosenTamu("9988776655", "Dr. Budi", "12 September 1985", "1 Maret 2023", 6000000, 
                                        "Fakultas Teknik", "999111222", "31 Desember 2026");
        dosen3.printInfo();
    }
}