import java.util.Scanner;
class Greatest3Nos_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        System.out.println("Enter a third number");
        int c=sc.nextInt();

        int biggest_no=greatestNumber(a,b,c);
        System.out.println("Biggest number:"+biggest_no);
    }
    public static int greatestNumber(int a,int b,int c) {

        return (a>b && a>c)?a:(b>c)?b:c;
    }
}