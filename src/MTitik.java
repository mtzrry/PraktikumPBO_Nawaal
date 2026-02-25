public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); 
        T1.setAbsis(3);
        T1.setOrdinat(4);
        
        Titik T2 = T1;
        System.out.print("T2 sebelum T1 diubah: "); T2.printTitik();
        T1.setAbsis(10);
        System.out.print("T2 setelah T1 diubah: "); T2.printTitik(); 
        Titik T3 = new Titik(5, 6);
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}