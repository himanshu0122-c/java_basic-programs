import java.util.Scanner;

class oddEven {
    public static void main(String[] args) {
        Scanner himanshu = new Scanner(System.in);
        System.out.println("Check the Number if is it Odd or Even Using Bitwise Operator");
        System.out.print("Enter your Number : ");
        int num = himanshu.nextInt();

        if((num & 1) == 1){
            System.out.println("The Number is Odd");
        }else {
            System.out.println("The Number is Even");
        }
    }
}
