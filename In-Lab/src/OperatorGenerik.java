/* Nama File : OperatorGenerik.java
   Deskripsi : Realisasi dan aplikasi kelas serta fungsi generik
   Pembuat   : Nawaal Hanif Mumtaz Arriye
   Tanggal   : 3 Mei 2026 */

public class OperatorGenerik {

    // Prosedur generik Tukar
    public static <T> void Tukar(DatumWrapper<T> x, DatumWrapper<T> y) {
        T temp = x.getNilai();
        x.setNilai(y.getNilai());
        y.setNilai(temp);
    }

    // Fungsi generik Bobot2
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }

    public static void main(String[] args) {
        System.out.println("=== 1. TUKAR SESAMA INTEGER ===");
        DatumWrapper<Integer> a = new DatumWrapper<>(3);
        DatumWrapper<Integer> b = new DatumWrapper<>(6);
        System.out.println("Sebelum: a = " + a.getNilai() + ", b = " + b.getNilai());
        Tukar(a, b);
        System.out.println("Sesudah: a = " + a.getNilai() + ", b = " + b.getNilai());

        System.out.println("\n=== 2. TUKAR SESAMA STRING ===");
        DatumWrapper<String> s1 = new DatumWrapper<>("Halo");
        DatumWrapper<String> s2 = new DatumWrapper<>("Dunia");
        System.out.println("Sebelum: s1 = " + s1.getNilai() + ", s2 = " + s2.getNilai());
        Tukar(s1, s2);
        System.out.println("Sesudah: s1 = " + s1.getNilai() + ", s2 = " + s2.getNilai());

        System.out.println("\n=== 3. APLIKASI FUNGSI BOBOT2 ===");
        Kucing k1 = new Kucing("Mpus", 3.5);
        Kucing k2 = new Kucing("Oyen", 4.2);
        System.out.println("Bobot Kucing 1: " + k1.getBobot() + " kg");
        System.out.println("Bobot Kucing 2: " + k2.getBobot() + " kg");
        System.out.println("Jumlah Bobot Keduanya = " + Bobot2(k1, k2) + " kg");
    }
}

class DatumWrapper<T> {
    private T nilai;

    public DatumWrapper(T nilai) {
        this.nilai = nilai;
    }

    public T getNilai() {
        return nilai;
    }

    public void setNilai(T nilai) {
        this.nilai = nilai;
    }
}