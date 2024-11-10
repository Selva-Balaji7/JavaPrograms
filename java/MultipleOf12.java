class MultipleOf12
{
    public static void main(String[]args)
    {
        int num=1;
        
        while(num<=500)
        {
            
            while(num%12==0)
            {
             System.out.println(num); 
             num++; 
            }
            
        num++;
        }


    }
}