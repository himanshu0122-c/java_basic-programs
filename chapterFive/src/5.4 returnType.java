import java.util.Scanner;

class returnType {
    public static void main(String[] args) {

        greet();
        int num1 = returnNum();
        int num2 = returnNum();

        int sum = num1 + num2;
        System.out.println("Sum of Numbers is " + sum);
    }

    public static int returnNum(){
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = himanshu.nextInt();
        return num;
    }

    public static void greet(){
        System.out.println("Welcome to Calculation...");
    }
}
