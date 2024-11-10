class BubbleSort
{
    public static void main(String[]args)
    {
        int arr[]={5,2,3,4,1};
        int temp;
        System.out.print("Before sorting:");
        for(int values:arr)
        {
           System.out.print(values+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                }
                
            }
            for(int values:arr)
            {
            System.out.print(values+" ");
            }
            System.out.println();
           
        }
        System.out.print("after sorting:");
        for(int values:arr)
        {
           System.out.print(values+" ");
        }

    }
}