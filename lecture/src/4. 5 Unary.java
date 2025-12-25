import java.util.Scanner;

class Unary {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = himanshu.nextInt();
        int b = -a; // Converts positive value to negative;
        int c = -b; // Converts negative value to positive;
        System.out.println(c);

        System.out.print("Enter the value of X : ");
        int x = himanshu.nextInt();
        System.out.println(x++); // Print current value then then inceament it by 1;
        System.out.println(x); // Print incement value;

        System.out.print("Enter the value of Y : ");
        int y = himanshu.nextInt();
        ++y; // y = input value + 1; ( increase the exciting value by 1 )
        System.out.println(y);
        // Same method apply to decrease the value e.g. Decreament ( x-- or --y )
    }
}
