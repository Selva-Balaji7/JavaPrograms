import java.util.Scanner;
class LeapYear
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int num=sc.nextInt();
        if(num%4==0)
        {
         if(num%100==0)
         {
           if(num%400==0)
           {
            System.out.println("Leap year");
           }
           else
           {
            System.out.println("Not Leap year");
           }
         }
         else
         {
            System.out.println("leap year");
         }
        }
        else
        {
         System.out.println("Not leap year");
        }
    }
}