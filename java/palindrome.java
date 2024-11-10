class palindrome
{
    public static void main(String[]args)
    {
      int a=232;
      int num=a;
      int rev=0;
      int rem=0;
      while(num!=0)
      {
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
      }
      if(rev==a)
      {
        System.out.println("palindrome");
      }
      else
      {
        System.out.println("Not palindrome");
      }

    }
}