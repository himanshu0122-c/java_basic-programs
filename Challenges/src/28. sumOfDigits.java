import java.util.Scanner;

class sumOfDigits {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits...");
        System.out.print("Enter the Digit : ");
        int num = himanshu.nextInt();
        int sum = sum(num);
        System.out.println("The Sum of All Digits is : " + sum);
    }

    public static int sum(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
