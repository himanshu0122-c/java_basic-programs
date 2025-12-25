import java.util.Scanner;

class compoundInterest {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter the value of Principle Amount : ");
        int principle = himanshu.nextInt();
        System.out.print("Enter the Rate of Interest : ");
        float rate = himanshu.nextFloat();
        System.out.print("Enter the Time for borrowing the money : ");
        float time = himanshu.nextFloat();

        double compoundInt = principle * Math.pow((1 + rate / 100), time);
        System.out.println("Result is : " + compoundInt);
    }
}
