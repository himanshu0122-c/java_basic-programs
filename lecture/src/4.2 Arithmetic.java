import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operation\n");

        System.out.print("Enter the value of A : ");
        float a = input.nextFloat();
        System.out.print("Enter the value of B : ");
        float b = input.nextFloat();

        System.out.println("Your result is : ");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.print("Enter the value of X : ");
        int x = input.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = input.nextInt();
        System.out.println(x % y);
    }
}
