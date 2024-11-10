class Strong
{
    public static void main(String[] args)
    {
        int n=145;
        int sum=0;
        temp=n;
        int tot=0;
        while(n>0)
        {
          int rem=n%10;
           int fact(rem)
           {
             if(rem!=0)
             { 
             tot=rem*fact(rem-1);
             }
            else
            {
               return tot; 
            }
          }
          sum+=tot;
          n=quo;
        }
        if(temp==sum)
        {
        System.out.println("Strong number");
        }
        else
        {
         System.out.println("not Strong number");
        }


    }
}