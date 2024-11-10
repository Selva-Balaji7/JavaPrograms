class neon
{
    public static void main(String[] args)
    {
        int a=10;
        int num=a*a;
        int sum=0;
        while(num!=0)
        {
         int rem=num%10;
         sum+=rem;
         num=num/10;
        }
        if(sum==a)
        {
        System.out.println("neon");
        }
        else
        {
         System.out.println("not-neon");
        }
    }
}