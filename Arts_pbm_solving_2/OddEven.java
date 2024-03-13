import java.util.Scanner;
class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        FindSequence(n);
        sc.close();
    }
    public static void FindSequence(int n) {
        System.out.print(n+" ");
        while(n!=1 && n>0) {
            if(n%2==0) {
                n=n/2;
                System.out.print(n+" ");
            }
            else {
                n=3*n+1;
                System.out.print(n+" ");
            }
            
        }
    }
}