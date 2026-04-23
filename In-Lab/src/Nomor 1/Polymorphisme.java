public class Polymorphisme {
    
    double a = 1.0;
    int b = (int) a;
    public static void main(String[] args) {
        Polymorphisme p = new Polymorphisme();
        System.out.println("b: " + p.b);
        System.out.println("a: " + p.a);
    }
}
