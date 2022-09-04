package bridgelabz.day05.com;
import java.util.Scanner;

public class LargestNumber 
{
    public static void main(String args[]) 
{


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int i1 = Integer.parseInt(sc.nextLine());

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Second Number:");
        int i2 = Integer.parseInt(sc1.nextLine());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Third Number:");
        int i3 = Integer.parseInt(sc2.nextLine());

        if(i1 >=i2 && i1 >= i3)
            System.out.println("Entered First Number is Largest Number:" + i1);

        else if(i2 >= i3 && i2 >= i1)
            System.out.println("Entered Second Number is Largest Number:" + i2);

        else
            System.out.println("Entered Third Number is Largest Number:" + i3);


    }


    }