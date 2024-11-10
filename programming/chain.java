class chain
{
    public static int add(int a,int b)
    {
        System.out.println(sub(10,5));
         return a+b;//30
    }
   
    public static int sub(int a,int b)
    {
       System.out.println(div(10,10));
        return a-b; //5
    }
   
    public static int div(int a,int b)
    {
        return a/b;//1
    }
    public static void main(String[]args)
    {
        System.out.println(add(10,20));
    }
}

