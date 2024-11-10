import java.util.Scanner;
class PosNeg
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int a=sc.nextInt();
    String res=(a==0)?"The number is zero":((a>0)?a+" "+"positive number":a+" "+"is"+" "+"Negative number");
    System.out.println(res);
    sc.close();
    }
}