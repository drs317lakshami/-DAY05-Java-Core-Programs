package bridgelabz.day05.com;

import java.util.*;

public class PrimeFactor 
{
    public static void main(String[] args) 
{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();


          for(int i = 2; i< number; i++)  {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
          if(number >2) {

            System.out.println(number);

        }
    }
}