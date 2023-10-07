// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("We are going to get loop y");

        // testing a while loop
        // create an int variable to hold our loop counts
        int customerNumber = 1;

        while (customerNumber <= 25){
            System.out.println("Here is our customer number: " + customerNumber);
            customerNumber = customerNumber + 1;

            if (customerNumber == 18){
                System.out.println("Congrats! You are customer number 18. You get a 50% discount.");
            }// ends if statement
        }// ends while loop


    }// ends main method
}// ends main class