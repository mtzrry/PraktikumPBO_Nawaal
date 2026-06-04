package praktikum14.konkuren;

class Thread2A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread2A prints -> " + i);
        }
        System.out.println("Exit-Thread2A");
    }
}

public class Demonstration2 {
    public static void main(String[] args) {
        System.out.println("Runnable");
        
        // Memakai Runnable interface
        Thread t = new Thread(new Thread2A());
        t.start();
        
        System.out.println("another object");
        Thread2A ot = new Thread2A();
        ot.run();
        
        System.out.println("Exit thread");
    }
}