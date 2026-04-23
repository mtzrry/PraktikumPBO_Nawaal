public class Nomor1 {
    public static void main(String[] args) {
        Polymorphisme p = new Polymorphisme();
        int a = 65;
        System.out.println("a: " + a);
        System.out.println("a: " + (char) a);
        double b = a;
        System.out.println("b: " + b);
        System.out.println("b: " + (char) b);

        int kembaliKeInt = (int) b;
        System.out.println("kembaliKeInt: " + kembaliKeInt);
        
        String c = "65";
        System.out.println("c: " + c);
        int d = Integer.parseInt(c);
        System.out.println("d: " + d);
        String C = Integer.toString(d);
        String e = String.valueOf(d);
        System.out.println("C: " + C);
        System.out.println("e: " + e);

    
        String X = "1234";
        System.out.println("X: " + X);
        String Y = "5678";
        System.out.println("Y: " + Y);
        String S = X + Y;
        System.out.println("S: " + S);
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Z: " + Z);

        String P = "12.34";
        String Q = "56.78";
        System.out.println("P: " + P);
        System.out.println("Q: " + Q);
        String R = P + Q;
        System.out.println("R: " + R);

        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("D: " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);
        String T = Integer.toString(A);
        System.out.println("T: " + T);

    }
}