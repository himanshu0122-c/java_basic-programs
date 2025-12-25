import java.util.Scanner;

class calculateGrades {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Welcome to the Grade determine system\n");
        System.out.print("Enter your percentage to calculate grades : ");
        float num = himanshu.nextFloat();

        if (num >= 90){
            System.out.println("Congratulations, you got A grade...");
        }else if (num >= 75){
            System.out.println("Congratulations, you got B grade...");
        }else if (num >= 60){
            System.out.println("Congratulations, you got C grade...");
        }else if (num >= 30){
            System.out.println("Sorry, you got D grade...");
        }else {
            System.out.println("Sorry, you got F grade");
        }
    }
}
