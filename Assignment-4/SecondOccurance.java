import java.util.Scanner;
class SecondOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter search number:");
        int search=sc.nextInt();

        int result=FindSecondOccurance(arr,search);
        System.out.println(search+" is present second occurance at"+result+" position");
    }
    public static int FindSecondOccurance(int arr[],int search) {
        int firstindex=-1,secondindex=-1;
        for(int i=0;i<arr.length;i++)
        if(arr[i]==search)
           if(firstindex==-1)
           firstindex=i;
           else {
            secondindex=i;
            break;
           }
           
        

        return secondindex;
    }
}