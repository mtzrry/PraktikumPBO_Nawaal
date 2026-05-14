/**
 * File : PersonDAO.java
 * Deskripsi : Interface untuk data access object dari objek Person
 * Pembuat   : Nawaal Hanif Mumtaz Arriye
 */
public interface PersonDAO {
    // Deklarasi method untuk menyimpan person
    public void savePerson(Person person) throws Exception;
}