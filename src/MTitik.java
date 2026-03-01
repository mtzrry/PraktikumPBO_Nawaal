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
        System.out.println("Jumlah Titik = " + Titik.getCounterTitik());
        T3.geser(2,2);
        System.out.println("pergeseran titik"); T3.printTitik();
        Titik T4 = new Titik(3, 4);
        Titik T5 = new Titik(0, 0);

        
        System.out.println("jarak antar t4 ke T5 adalah " + T4.getJarak(T5));

    }
}