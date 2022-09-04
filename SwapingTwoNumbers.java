package bridgelabz.day05.com;
import java.util.Scanner;

public class SwapingTwoNumbers 
{
    public static void main(String args[])
{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber = Integer.parseInt(sc.nextLine());

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Second NUmber:");
        int secondNumber = Integer.parseInt(sc1.nextLine());

        System.out.println("---Before Swaping NUmbers---");
        System.out.println("Entered First Number:" + firstNumber);
        System.out.println("Entered Second Number:" + secondNumber);

        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;

        System.out.println("---After Swaping NUmbers---");
        System.out.println("Entered First Number:" + firstNumber);
        System.out.println("Entered Second Number:" + secondNumber);

    }
}