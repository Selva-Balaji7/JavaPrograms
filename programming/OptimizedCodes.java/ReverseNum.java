import java.util.*;
class ReverseNum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0)
        {
         int rem=temp%10;
         rev=rem+(rev*10);
         temp=temp/10;
        }
        System.out.println("reverse no:"+rev);
    }
}