import java.util.*;
class Palindrome
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0)
        {
         int rem=temp%10;
         rev=rem+(rev*10);
         temp=temp/10;
        }
        if(rev==num)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}