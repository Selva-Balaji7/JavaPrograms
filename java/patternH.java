class pattern1
{
    public static void main(String[]args)
    {
        int i=1,j=1;
        for(i=1;i<=3;i++)
        {
           for(j=1;j<=3;j++)
           {
             if(i==1 && j==2)
              {
              System.out.print(" ");
              }
             else if(i==3 && j==2)
              {
                System.out.print(" ");
              } 
             else
             {
                System.out.print("*"); 
             }
              
            } 
          System.out.println(); 
        }

    }
}