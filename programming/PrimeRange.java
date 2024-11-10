import java.util.Scanner;
class PrimeRange
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int start=sc.nextInt();
        System.out.println("Enter the ending range:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
          int count=0;
          for(int j=1;j<=i;j++)
          {
           if(i%j==0)
           {
           count++;
           }
          }
          if(count==2)
          {
          System.out.println("Prime number:"+i);
          }
          
        }
    }
        
}

