import java.util.Scanner;
class SumofFirstN1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println(n*(n+1)/2);
  } 
 
}