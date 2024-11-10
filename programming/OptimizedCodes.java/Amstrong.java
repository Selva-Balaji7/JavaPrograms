import java.util.*;
class Amstrong
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=String.valueOf(num);
        int len=str.length();
        System.out.println(len);
        int temp=num;
        int sum=0;
        while(temp>0)
        {
         int rem=temp%10;
         sum+=Math.pow(rem,len);
         temp=temp/10;
        }
        System.out.println(sum);
        if(sum==num)
        System.out.println("Amstrong");
        else
        System.out.println("Not Amstrong");
        

    }
}