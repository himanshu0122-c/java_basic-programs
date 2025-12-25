import java.util.Scanner;

class logicalOperator {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount for Travelling...\n");

        System.out.print("Enter your age : ");
        int age = himanshu.nextInt();

        if (age<=5 ){
            System.out.println("You have 75% Discount on your Ticket purchase\n");
        }
        else{
            System.out.println("You don't have any discount on your Ticket purchase\n");
        }

        System.out.print("Are you a female? (true/false)");
        boolean female = himanshu.nextBoolean();
        if (female){
            System.out.println("You have 25% Discount on your Ticket purchase\n");
        }
        else{
            System.out.println("You don't have any Discount on your Ticket purchase\n");
        }

        System.out.print("Enter your age : ");
        int Age = himanshu.nextInt();
        if (Age >=60 && !female){
            System.out.println("You have 50% Discount on your Ticket purchase");
        }
        else{
            System.out.println("You don't have any discount on your Ticket purchase");
        }
    }
}
