import java.util.Scanner;
public class DoWhileDemo
{
    public static void main(String[] args)
    {
        String msg = "   The best burgers in town!";
        int count = 1;
        int response;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Here is our advertising slogan:");
        do
        {
            System.out.println("\n*****  " + count + msg);
            count++;
            System.out.println("\n   Do you want to see it again?");
            System.out.println("      Enter 45 for yes");
            System.out.print("         or any other number for no >> ");
            response = keyboard.nextInt();
        } while(response == 45);
    }
}