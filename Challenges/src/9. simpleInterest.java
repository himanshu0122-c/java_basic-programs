import java.util.Scanner;

class simpleInterest {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the Principle Amount : ");
        int principle = himanshu.nextInt();
        System.out.print("Enter the Time for borrowing money : ");
        float time = himanshu.nextFloat();
        System.out.print("Enter the Rate of Interest : ");
        float rate = himanshu.nextFloat();

        float simpleInt = (principle * time * rate) / 100;
        System.out.println("Result is : " + simpleInt);
    }
}
