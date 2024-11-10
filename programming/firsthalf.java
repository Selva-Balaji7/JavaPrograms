class firsthalf
{
    public static void main(String[]args)
    {
        String s1="HelloThere";
        for(int i=0;i<s1.length()/2;i++)
        {
        System.out.print(s1.charAt(i));
        }
        System.out.println();
        for(int i=s1.length()/2;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i));
        }
        
    }
}
