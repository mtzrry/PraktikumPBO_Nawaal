package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("=== INSERT ===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        displayAll();

        System.out.println("\n=== UPDATE ===");
        Mahasiswa mhsUpdate = service.getById(5);
        if (mhsUpdate != null) {
            mhsUpdate.setNama("Dinaya");
            service.update(mhsUpdate);
        }
        displayAll();

        System.out.println("\n=== DELETE ===");
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}