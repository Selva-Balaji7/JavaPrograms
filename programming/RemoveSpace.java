class RemoveSpace
{
    public static void main(String[]args)
    {
     String str="abc--x12y avl es";
     char str2;
     char ch[]=str.toCharArray();
     for(int i=0;i<str.length();i++)
     {
        if(ch[i]!=' ')
        {
            str2=ch[i];
         System.out.print(str2);
        }
     }
    }
}