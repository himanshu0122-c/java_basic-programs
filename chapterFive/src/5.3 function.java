class function {
    public static void main(String[] args) {
        greetUser(); // method declaration
        printFirstPattern();
        printSecondPattern();
    }

    public static void printFirstPattern(){
        int i = 5;
        int rows = 0;
        while (rows < i){
            System.out.print(" *");
            int columns = 0;
            while (columns < rows){
                System.out.print(" *");
                columns++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void printSecondPattern(){
        System.out.println();
        int x = 5;
        while (x > 0){
            System.out.print(" *");
            int y = 1;
            while (y < x){
                System.out.print(" *");
                y++;
            }
            System.out.println();
            x--;
        }
    }

    public static void greetUser() { // greetUser is a method
        System.out.println("Good Morning");
    }
}
