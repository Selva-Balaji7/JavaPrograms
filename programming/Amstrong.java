import java.util.Scanner;
class Amstrong
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.of digits:");
        int a=sc.nextInt();
        System.out.println("Enter the No:");
        int b=sc.nextInt();
        int original_value=b;
        int sum=0;
        while (b!=0)
        {
          int total=0;
          int rem=b%10;
          for(int i=1;i<=a;i++)
          {
          total=(
          }
          sum+=total;
           b=b/10;
        }
          if(original_value==sum)
          {
          System.out.println("Amstrong number");
          }
          else
          {
           System.out.println("Not Amstrong number");
          }

    }

}