import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul) {
        if (listMatKul.size() < 50) {
            listMatKul.add(newMatKul);
        }
    }

    public int getJumlahSKS() {
        int total = 0;
        for (MataKuliah mk : listMatKul) {
            total += mk.getSks();
        }
        return total;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }
        if (kendaraan != null) {
            System.out.println("No Plat Kendaraan: " + kendaraan.getNoPlat());
            System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
        }
        System.out.println("Daftar Mata Kuliah: ");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("- " + listMatKul.get(i).getNama());
        }
    }
}