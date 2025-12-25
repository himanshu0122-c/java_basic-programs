import java.util.Scanner;

class bitwiseXor {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Bitwise XOR");
        System.out.print("Enter First Number : ");
        int num1 = himanshu.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = himanshu.nextInt();

        int result = num1 ^ num2;
        System.out.println("Result is : " + result);
    }
}