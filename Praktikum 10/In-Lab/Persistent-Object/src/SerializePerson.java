import java.io.*;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            s.close();
            System.out.println("Selesai menulis objek person");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}