import java.util.Scanner;

class ageGroup {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to age categorise group program...\n");
        System.out.print("Enter your age : ");
        int age = himanshu.nextInt();

        if (age <= 13){
            System.out.println("According to your you are Child");
        }else if (age <= 20){
            System.out.println("According to your age you are Teenager");
        }else if (age <= 60){
            System.out.println("According to your age you are Adult");
        }else{
            System.out.println("According to your age you are Senior Citizen");
        }
    }
}
