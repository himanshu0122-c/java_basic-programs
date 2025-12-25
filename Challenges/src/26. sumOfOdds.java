import java.util.Scanner;

class sumOfOdds {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to the Calculation of Odd Numbers...\n");
        System.out.print("Enter the Odd Number for Calculation : ");
        int num = himanshu.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd Sum till " + num + " is : " + sum);
    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i = i + 2;
        }
        return sum;
    }
}

