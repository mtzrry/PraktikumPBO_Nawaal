public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA PERSEGI ===");
        Persegi p1 = new Persegi(5.0, "Merah", "Solid");
        p1.printInfo(); 
        System.out.println();

        System.out.println("=== UJI COBA LINGKARAN ===");
        Lingkaran l1 = new Lingkaran(10.0, "Biru", "Dotted");
        l1.printInfo();
        System.out.println();

        System.out.println("=== UJI COBA JAJAR GENJANG ===");
        JajarGenjang j1 = new JajarGenjang(8.0, 5.0, 6.0, "Kuning", "Dashed");
        j1.printInfo();
        System.out.println();

        System.out.println("=== TOTAL OBJEK BANGUN DATAR ===");
        BangunDatar.printCounterBangunDatar();
    }
}