import java.util.Scanner;
class FactorialNo_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a factorial number:");
        int fact=sc.nextInt();
        int result=Factorial(fact);
        System.out.println("Factorial:"+result);
        sc.close();
    }
    public static int Factorial(int fact) {
        int n=1;
        for(int i=fact;i>=1;i--)
        n=n*i;

        return n;
    }
}