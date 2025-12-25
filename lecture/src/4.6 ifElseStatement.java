class ifElseStatement {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Bob";

        if (isMale) {
            System.out.println("Mr." + name );
        }
        else {
            System.out.println("Ms." + name );
        }

        // IfElse Ladder;
        boolean seniorCitizen = false;
        boolean adult = true;
        if (seniorCitizen){
            System.out.println("Hello SeniorCitizen!");
        }
        else {
            if (adult){
                System.out.println("Hello Adult!");
            }
            else {
                System.out.println("Hello Child!");
            }
        }
    }
}
