public class Mahasiswa {
    int Nim; 
    String Nama;
    String ProgramStudi;

    public Mahasiswa() {
        this.Nim = -999;
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(int Nim, String Nama, String ProgramStudi) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    public Mahasiswa(Mahasiswa mhsLain) {
        this.Nim = mhsLain.Nim;
        this.Nama = mhsLain.Nama;
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

    
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String ProgramStudi) {
        this.ProgramStudi = ProgramStudi;
    }

    public void setProgramStudi(Mahasiswa mhsLain) {
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa(); 
        System.out.println("M1 (Default): NIM=" + m1.Nim + ", Nama=" + m1.Nama + ", Prodi=" + m1.ProgramStudi);

        Mahasiswa m2 = new Mahasiswa(12345, "Nawaal Hanif", "Teknik Informatika");
        System.out.println("M2 (3 Parameter): NIM=" + m2.Nim + ", Nama=" + m2.Nama + ", Prodi=" + m2.ProgramStudi);

        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("M3 (Kloning M2): NIM=" + m3.Nim + ", Nama=" + m3.Nama + ", Prodi=" + m3.ProgramStudi);

        System.out.println("\n=== TEST OVERLOADING setProgramStudi ===");
        
        m1.setProgramStudi();
        System.out.println("M1 setelah setProgramStudi(): Prodi=" + m1.ProgramStudi);

        m1.setProgramStudi("Sistem Informasi");
        System.out.println("M1 setelah setProgramStudi(String): Prodi=" + m1.ProgramStudi);

        Mahasiswa m4 = new Mahasiswa(99999, "Galvin", "Matematika");
        m4.setProgramStudi(m1);
        System.out.println("M4 setelah setProgramStudi(m1): Prodi=" + m4.ProgramStudi);
    }
}