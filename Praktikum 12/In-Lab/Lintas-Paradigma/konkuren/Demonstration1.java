package praktikum14.konkuren;

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadOne prints -> " + i);
        }
        System.out.println("Exit-ThreadOne");
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadTwo prints -> " + i);
        }
        System.out.println("Exit-ThreadTwo");
    }
}

public class Demonstration1 {
    public static void main(String[] args) {
        System.out.println("extend Thread");
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        
        threadOne.start();
        threadTwo.start();
    }
}