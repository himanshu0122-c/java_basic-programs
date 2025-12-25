import java.util.Scanner;

class perimeterOfRec {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        double a = himanshu.nextDouble();
        System.out.print("Enter the value of B : ");
        double b = himanshu.nextDouble();
        System.out.print("Enter the value of C : ");
        double c = himanshu.nextDouble();
        System.out.print("Enter the value of D : ");
        double d = himanshu.nextDouble();

        double perimeterOfRectangle = a + b + c + d;
        System.out.print("Perimeter of Rectangle is : " + perimeterOfRectangle + "cm");
    }
}
