import java.util.Scanner;

class ifElseEx1 {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = himanshu.nextInt();

        if (num > 0){
            System.out.println("The Number is Positive");
        }else if (num < 0){
            System.out.println("The Number is Negative");
        }else {
            System.out.println("The Number is Zero");
        }
    }
}
