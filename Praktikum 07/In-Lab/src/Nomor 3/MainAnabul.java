public class MainAnabul {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI POLIMORFISME ANABUL ===");

        Anabul peliharaan1 = new Kucing("Mpus");
        Anabul peliharaan2 = new Anjing("Spike");
        Anabul peliharaan3 = new Burung("Tweety");

        peliharaan1.gerak();
        peliharaan1.bersuara();
        System.out.println("--------------------");

        peliharaan2.gerak();
        peliharaan2.bersuara();
        System.out.println("--------------------");

        peliharaan3.gerak();
        peliharaan3.bersuara();
    }
}