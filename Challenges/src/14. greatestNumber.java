import java.util.Scanner;

class greatestNumber {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = himanshu.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = himanshu.nextInt();
        System.out.print("Enter Num3 : ");
        int num3 = himanshu.nextInt();

        if (num1 >= num2){
            System.out.println(num1 + " is the Greatest Number");
        }else if (num2 >= num3){
            System.out.println(num2 + " is the Greatest Number");
        }else {
            System.out.println(num3 + " is the Grestest Number");
        }
    }
}
