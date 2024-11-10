class StrPalindrome
{
    public static void main(String[] agrs)
    {
        String s1="Wow";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
         s2+=s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(s2))
        {
         System.out.println("string palindrome");
        }
        else
        {
        System.out.println("not string palindrome");    
        }
    }
}