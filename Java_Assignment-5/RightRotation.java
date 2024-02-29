import java.util.*;
class RightRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        System.out.println("Enter rotation count:");
        int count=sc.nextInt();

        int[] res=FindRightRotation(arr,count);
        System.out.println(Arrays.toString(res));
    }
public static int[] FindRightRotation(int[] a,int count) {
    
    int i=0;
    while(i<count) {
       int temp=a[a.length-1];
       for(int j=a.length-1;j>0;j--)
       a[j]=a[j-1];
       a[0]=temp;
       i++;
    }

    return a;
}
}