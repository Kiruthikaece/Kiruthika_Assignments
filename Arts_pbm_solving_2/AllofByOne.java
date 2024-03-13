import java.util.Scanner;
class AllofByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter array1:");
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter n:");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter array2:");
        for(int i=0;i<m;i++)
        arr2[i]=sc.nextInt();

        boolean result=FindByOne(arr1,arr2);
        System.out.println(result);
        sc.close();
    }

    public static boolean FindByOne(int[] a1,int[] a2) {
       return AllOne(a1,a2,0);
    }

    public static boolean AllOne(int[] a1,int[] a2,int index) {
        if(a1.length!=a2.length)
        return false;

        if(index >a1.length-1)
        return true;
        if(a1[index]+1 != a2[index])
        return false;

        return AllOne(a1,a2,index+1);

    }
}