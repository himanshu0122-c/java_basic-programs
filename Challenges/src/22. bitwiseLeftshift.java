import java.util.Scanner;

class bitwiseLeftshift {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Left Shift");
        System.out.print("Enter your Number : ");
        int num1 = himanshu.nextInt();

        int result = num1 << 1;
        System.out.println("Result is : " + result);
    }
}
