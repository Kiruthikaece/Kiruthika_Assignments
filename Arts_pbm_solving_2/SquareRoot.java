import java.util.Scanner;
class SqureRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

        int result=FindSquare(n);
        System.out.println("Square root:"+result);
        sc.close();
    }
    public static int FindSquare(int n) {
      int left=1,right=n,result=0;
      while(left<=right)
      {
        int mid=left+(right-left)/2;
        if(mid<=n/mid) {
            result=mid;
            left=left+1;
        }
        else
        right=right-1;
      }
      if(n-result*result > (result+1)*(result+1)-n)
      return (result+1);
      else
      return result;
    }
}