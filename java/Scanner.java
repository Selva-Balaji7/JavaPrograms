import java.util.Scanner;
class DynamicRead{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        {
         System.out.println("Enter Byte:");
         byte a=sc.nextByte();
         System.out.println(a);
         System.out.println("Enter short:");
         short b=sc.nextShort();
         System.out.println(b);
         System.out.println("Enter integer:");
         int c=sc.nextInt();
         System.out.println(c);  
         System.out.println("Enter float:");
         float d=sc.nextFloat();
         System.out.println(d);
         System.out.println("Enter double:");
         double e=sc.nextDouble();
         System.out.println(e);
         System.out.println("Enter the character:");
         char f=sc.next().charAt(0);
         System.out.println(f);
         System.out.println("Enter string:");
         String g=sc.next();
         System.out.println(g);
         System.out.println("Enter string:");
         String h=sc.nextLine();
         System.out.println(h);
         System.out.println("Enter Boolean:");
         Boolean i=sc.nextBoolean();
         System.out.println(i);
        }
    }
}