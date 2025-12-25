import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to LCM...");
        System.out.print("Enter First Number for doing LCM : ");
        int num1 = himanshu.nextInt();
        System.out.print("Enter Second Number for doing LCM : ");
        int num2 = himanshu.nextInt();
        int i = lcm(num1,num2);
        System.out.println("The Result is : " + i);
    }

    public static int lcm(int num1,int num2){
        int i = 1;
        while (i / num1 == 0){
            while (i / num2 == 0){
                i++;
            }
            i++;
        }
        return i;
    }
}
