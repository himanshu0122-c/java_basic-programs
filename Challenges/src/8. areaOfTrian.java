import java.util.Scanner;

class areaOfTrian {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of Base : ");
        double base = himanshu.nextDouble();
        System.out.print("Enter the value of Height : ");
        double height = himanshu.nextDouble();

        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle is : " + areaOfTriangle + "cm");
    }
}
