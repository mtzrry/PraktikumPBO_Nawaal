package praktikum14.lambda;

import java.util.ArrayList;

public class DemoXLambda {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        
        // Menampilkan isi myList pakai Lambda:
        myList.forEach((myInt) -> System.out.println(myInt));
    }
}