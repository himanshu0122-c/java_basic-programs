import java.util.Scanner;

class floatingPoint{
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        float a = himanshu.nextFloat();
        System.out.print("Enter the value of B : ");
        float b = himanshu.nextFloat();

        float add = a + b;
        System.out.println(add);

        float sub = a - b;
        System.out.println(sub);

        float mul = a * b;
        System.out.println(mul);

        float div = a / b;
        System.out.println(div);

        float mod = a % b;
        System.out.println(mod);
    }
}
