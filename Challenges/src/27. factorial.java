import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Factorial...");
        System.out.print("Enter your Number : ");
        int num = himanshu.nextInt();
        long fact = facto(num);
        System.out.println("Factorial is " + fact);
    }

    public static long facto(int num){
        long fact = 1;
        int i = 1;
        if (num < 2){
            return 1;
        }
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
