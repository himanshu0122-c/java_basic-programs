import java.util.Scanner;

class fahrenheitToCel {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Enter Fahrenheit to convert it into Celsius : ");
        float fah = himanshu.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        System.out.println("Result is : " + cel);
    }
}
