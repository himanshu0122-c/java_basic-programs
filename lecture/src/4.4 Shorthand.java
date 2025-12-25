import java.util.Scanner;

class Shorthand {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        int a = 2;
        int b = himanshu.nextInt();
        a += b; // a = a + b;
        System.out.println(a);
        int c = himanshu.nextInt();
        a -= c; // a = a - c;
        System.out.println(a);
        int d = himanshu.nextInt();
        a *= d; // a = a * d;
        System.out.println(a);
        int e = himanshu.nextInt();
        a /= e; // a = a / e;
        System.out.println(a);
    }
}
