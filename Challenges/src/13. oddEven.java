import java.util.Scanner;

class ifElseEx2 {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = himanshu.nextInt();

        if (num % 2 == 0) System.out.println("The Number is even");
        else {
            System.out.println("The Number is odd");
        }
    }
}
