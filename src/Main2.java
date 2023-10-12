public class Main2 {

    public static void main(String[] args) {
        System.out.println("Creating a for loop");

//        // create a for loop that will initialize, check, and change LCV
//        for(int customerNumber = 1; customerNumber <= 25; customerNumber ++){
//            System.out.println("Here is our Customer Number: " + customerNumber);
//            if (customerNumber == 18){
//                System.out.println("Congrats! You are customer number 18. You get a 50% discount.");
//            }// ends if condition
//
//        }// ends customerNumber for loop

//        for(int groceryCount = 1; groceryCount < 22; groceryCount ++){
////            System.out.println("Here is your number of groceries : " + groceryCount);
//            if (groceryCount > 20){
//                System.out.println("You have too many groceries for the express lane");
//            }// ends if condition

//        } // ends groceryCount for loop


        // demo testing nested for loops
        int outer;
        int inner;
        final int OUTER_LIMIT = 5;
        final int INNER_LIMIT = 10;
        for(outer = 0; outer < OUTER_LIMIT; ++outer) {
            System.out.print("Outer " + outer + "     ");
            for (inner = 0; inner < INNER_LIMIT; ++inner) {
                System.out.print(inner + "  ");
            } // ends inner for loop
            System.out.println();
        } // ends outer for loop


    } // ends driver


} // ends Main2 class

