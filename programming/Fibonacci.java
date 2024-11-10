public class Fibonacci
{
public static void main (String []args)
{
    int a=0;
    int b=1;
    System.out.print(a);
    for(int i=0;i<=10;i++)
    {
        int sum=a+b;
        System.out.print(sum);
        if(a==0)
        {
         sum=sum+a;
         System.out.print(sum);
         b=sum;
         a+=1;
        }
        else
        {
         b=a;   
         a=sum;
        }
        
       
    }
    

   }
}
