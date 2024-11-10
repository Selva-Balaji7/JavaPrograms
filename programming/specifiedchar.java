class specifiedchar
{
    public static boolean m1()
    {    
        String str="selva Balaji";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.println(i);
            }
        }
        return false;
    }
    public static void main(String[]args)             
    {
       boolean b= m1();
       System.out.println(b);
    }
    
    
}