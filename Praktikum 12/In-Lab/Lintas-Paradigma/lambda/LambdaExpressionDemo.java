package praktikum14.lambda;

@FunctionalInterface
interface MyFInterface {
    int add(int a, int b);
}

class Implementor implements MyFInterface {
    @Override
    public int add(int a, int b) {
        System.out.print(a + "+" + b + "=");
        return a + b;
    }
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // Cara tradisional (tanpa Lambda)
        MyFInterface impl1 = new Implementor();
        System.out.println(impl1.add(1, 2));

        // Cara modern (pakai Lambda)
        MyFInterface impl3 = (int a, int b) -> { return (a + b); };
        System.out.print("jumlah 50 & 100 : ");
        System.out.println(impl3.add(50, 100));
    }
}