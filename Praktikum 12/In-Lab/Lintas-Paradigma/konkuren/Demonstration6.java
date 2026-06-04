package praktikum14.konkuren;

class MyClass6A {
    void display() {
        System.out.print(Thread.currentThread().getName() + " is holding.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(Thread.currentThread().getName() + " exits.\n");
    }
}

class Thread6B extends Thread {
    MyClass6A myClass6AObject;

    public Thread6B(MyClass6A myObject, String name) {
        super(name);
        this.myClass6AObject = myObject;
    }

    @Override
    public void run() {
        synchronized (myClass6AObject) {
            myClass6AObject.display();
        }
    }
}

public class Demonstration6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("synchronized");
        MyClass6A myObject = new MyClass6A();
        
        Thread6B thread1 = new Thread6B(myObject, "Thread6B-1");
        Thread6B thread2 = new Thread6B(myObject, "Thread6B-2");
        
        thread1.start();
        thread2.start();
    }
}