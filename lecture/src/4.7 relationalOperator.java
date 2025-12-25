import java.util.Scanner;

class relationalOperator {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal...");
        System.out.print("Enter your age : ");
        int age = himanshu.nextInt();

        if (age >= 18){
            System.out.println("You are eligible for driving license");
        }
        else{
            System.out.println("Beta tum Cycle chalao");
        }
    }
}
