import java.util.Scanner;

class leapYear {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.print("Enter Year to check is it leap year or not : ");
        int year = himanshu.nextInt();

        if (year % 400 == 0){
            System.out.println("This year is leap Year");
        }else if(year % 100 == 0) {
            System.out.println("This year is not leap Year");
        }
        else if(year % 4 == 0){
            System.out.println("This year is leap Year");
        }else {
            System.out.println("This year is not leap Year");
        }
    }
}
