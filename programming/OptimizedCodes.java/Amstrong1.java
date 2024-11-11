
import java.util.Scanner;

class Amstrong1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num:");
        int a = sc.nextInt();
        if (isAmstrong(a))
        {
        System.out.println("Amstrong number");
        }
        else
        {
         System.out.println("Not Amstrong number");
        }

    }

    public static boolean isAmstrong(int a) {
        int original_value = a;
        int len = String.valueOf(a).length();
        int res=0;
        while (a != 0)
         {
            int rem = a % 10;
             res+= power(rem,len);
            a = a / 10;
         
         }
        return res==original_value; 
            
         }
      
      public static int power(int rem,int len)
       {
         int res = 1;
         for(int i=1;i<=len;i++)
         {
             res*=rem;
         }
        return res;
        }

    }

