class GreatestOf3
{
 public static void main(String[]args)
 {
    int a=100,b=15,c=130;
    String res=(a>b)&&(a>c)?"a is greater":(b>a)&&(b>c)?"b is greater":(c>a)&&(c>b)?"c is greater":"all equal";
    System.out.println(res);
 }
}