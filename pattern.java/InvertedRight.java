class InvertedRight
{
    public static void main(String[] args)
    {
     int n=5;
     for(int i=0;i<n;i++)
     {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print("* ");//giving space makes good alignment
        }
        System.out.println();
     }
    }
}