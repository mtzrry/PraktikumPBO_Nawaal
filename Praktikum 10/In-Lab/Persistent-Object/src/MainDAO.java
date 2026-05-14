/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk melakukan uji coba DAO
 * Pembuat   : Nawaal Hanif Mumtaz Arriye
 */
public class MainDAO {
    public static void main(String[] args) {
        // 1. Buat objek Person baru (ganti namanya sesukamu)
        Person person = new Person("Nawaal Hanif");
        
        // 2. Buat manajer DAO
        DAOManager m = new DAOManager();
        
        // 3. Set DAO menggunakan implementasi MySQL yang sudah kamu buat
        m.setPersonDAO(new MySQLPersonDAO());
        
        // 4. Lakukan penyimpanan ke database
        try {
            System.out.println("Mencoba menyimpan data...");
            m.getPersonDAO().savePerson(person);
            System.out.println("Data berhasil disimpan ke database!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Gagal menyimpan data. Pastikan database dan konektor aman!");
        }
    }
}