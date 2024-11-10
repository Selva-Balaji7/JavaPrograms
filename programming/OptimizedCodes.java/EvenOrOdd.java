import java.util.Scanner;
class EvenOrOdd
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int a=sc.nextInt();
    String res=(a%2==0)?"even":"odd";
    System.out.println(res);
}
    
}