/**
 * File : DAOManager.java
 * Deskripsi : Kelas pengelola (manager) untuk kelas-kelas DAO
 * Pembuat   : Nawaal Hanif Mumtaz Arriye
 */
public class DAOManager {
    private PersonDAO personDAO;

    // Setter untuk memasukkan DAO yang dipakai (misal MySQLPersonDAO)
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    // Getter untuk mengambil DAO-nya
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}