import java.util.Scanner;

class bitwiseNot {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Bitwise NOT");
        System.out.print("Enter your Number : ");
        int num = himanshu.nextInt();

        int result = ~num;
        System.out.println("Result is : " + result);
    }
}
