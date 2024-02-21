import java.util.Scanner;
class SwapTwoNumbers_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before a swap");
        System.out.println("a="+a+" "+"b="+b);
        swap(a,b);
    }
    public static void swap(int a,int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After a swap");
        System.out.println("a="+a+" "+"b="+b);
    }
}