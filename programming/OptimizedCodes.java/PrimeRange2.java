import java.util.Scanner;
class PrimeRange2
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the lower limit:");
      int lower=sc.nextInt();
      System.out.println("Enter the upper limit:");
      int upper=sc.nextInt();
      for(int i=lower;i<=upper;i++)
      {
        if(isPrime(i))
        {
         System.out.println("Prime number:"+i);
        }
      }
    }
    static boolean isPrime(int n)
    {
        if(n<2)
        {
         return false;
        }
        for(int j=2;j*j<=n;j++)
        {
          if(n%j==0)
          {
          return false;
          }
        }
      return true;
    }
}