import java.util.Scanner;
class SumofEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int result=FindSumofEven(arr,n);
        System.out.println("Sum of Even Numbers:"+result);
    }
    public static int FindSumofEven(int arr[],int n) {
        int s=0;
        for(int i=0;i<n;i++) {
        if(arr[i]%2!=0)
        continue;
        else
        s=s+arr[i];
        }
        

        return s;

    }
}