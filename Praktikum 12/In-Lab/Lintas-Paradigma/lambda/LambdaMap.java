package praktikum14.lambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan Key (NIM) dan Value (Nama)
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Memasukkan datamu
        mahasiswaMap.put("24060124120041", "Nawaal Hanif Mumtaz Arriye");
        mahasiswaMap.put("24060124120042", "Liling Dea Laura"); 
        mahasiswaMap.put("24060124120043", "Budi Santoso"); 

        // Lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}