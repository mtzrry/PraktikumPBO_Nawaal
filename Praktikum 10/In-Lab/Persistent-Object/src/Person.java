import java.io.Serializable;

/**
 * File: Person.java
 * Deskripsi: Kelas model Person yang bisa diserialisasi
 */
public class Person implements Serializable {
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}