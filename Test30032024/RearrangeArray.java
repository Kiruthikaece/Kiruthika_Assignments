import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        System.err.println("Enter array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        pushZeros(arr,n);
    }

    private static void pushZeros(int[] arr, int n) {
       int k=0;
       for(int i=0;i<n;i++) 
        if(arr[i]!=0)
        arr[k++]=arr[i];
       
       while(k<n) 
       arr[k++]=0;
       

       for(int i=0;i<n;i++)
       System.out.print(arr[i]+" ");
    }
}