import java.util.Scanner;

class whileLoop {
    public static void main(String[] args) {
        /* int i = 1; // Initialization
        while (i <= 10) // Condition
        {
            System.out.println("*");
            i++; // Update the Condition
        }*/

        /*int num = 500;
        while (num >= 1){
            System.out.println(num);
            num--;
        }*/

        Scanner himanshu = new Scanner(System.in);
        int count = 0;
        while (count <= 5){
            int j = himanshu.nextInt();
            System.out.println("Result is : " + j);
            j++;
        }
    }
}
