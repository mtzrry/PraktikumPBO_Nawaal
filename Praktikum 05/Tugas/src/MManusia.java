public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "2006-04-01", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "2000-01-01", "Jl. Air", 55000000, "2000-556-773-212");
        Petani pt1 = new Petani("Nugraha", "1977-01-09", "Jl. Bunga", 5000000, "Wonogiri");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        
        p1.cetakInfo();
    }
}