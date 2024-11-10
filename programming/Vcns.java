class Vcns
{
    public static void main(String[]args)
    {
        String s1="abveu213#$9@m";
        int vowels=0;
        int cons=0;
        int num=0;
        int spec=0;
        for(int i=0;i<s1.length();i++)
        {
          if(s1.charAt(i)>=65 && s1.charAt(i)<=90 || s1.charAt(i)>=97 && s1.charAt(i)<=127)
          {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
            {
             vowels++;
            }
            else if(s1.charAt(i)!='a' || s1.charAt(i)!='e' || s1.charAt(i)!='i' || s1.charAt(i)!='o' || s1.charAt(i)!='u')
            {
             cons++;   
            }
          }
          else if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
          {
            num++;
          }
          else{
            spec++;
          }
        }
        System.out.println(vowels);
        System.out.println(cons);
        System.out.println(num);
        System.out.println(spec);
    }
}