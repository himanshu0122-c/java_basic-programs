import java.util.Scanner;

class tables{
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = himanshu.nextInt();
        createTable(num);
    }

    public static void createTable(int num){
        int i = 1;
        while (i <= 10) {
            int result = num * i;
            System.out.print(num + " x " + i + " = " + result);
            i++;
        }
    }
}
