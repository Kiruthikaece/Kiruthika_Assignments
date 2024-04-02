import java.util.Scanner;

class ArithemeticException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        try {
            int a=n/0;
            System.out.println(a);
        }
        catch(Exception e) {
            System.out.println("Exception"+e);
        }
        sc.close();
    }
}