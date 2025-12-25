import java.util.Scanner;

class OrderofOperation {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        float a = himanshu.nextFloat();
        System.out.print("enter the value of B : ");
        float b = himanshu.nextFloat();
        System.out.println(a - b * b / a);
    }
}
