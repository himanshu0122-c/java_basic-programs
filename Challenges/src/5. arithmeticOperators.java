import java.util.Scanner;

class arithmeticOperators {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = himanshu.nextInt();
        System.out.print("Enter the value of B : ");
        int b = himanshu.nextInt();

        int add = a + b;
        System.out.println(add);

        int sub = a - b;
        System.out.println(sub);

        int mul = a * b;
        System.out.println(mul);

        int div = a / b;
        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);
    }
}
