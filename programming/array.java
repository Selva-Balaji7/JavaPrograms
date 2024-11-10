import java.util.Scanner;
class array
{
    static void main(String[] a)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array size:");
     int size=sc.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++)
     {
        arr[i]=sc.nextInt();
     }
      Evensum(arr);
    }
    public static void Evensum(int arr[])
    {
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]%2==0)
        {
           sum=sum+arr[i]; 
        }
      }
      System.out.println(sum);
    }
}