import java.util.Scanner;
class quadraticEqn_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b and c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double d=b*b-4*a*c;
        if(d>0)
        {
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.printf("%2.2f",x1);
            System.out.printf("%2.2f",x2);
        }
        else if(d<0) {
            double real_part=-b/(2*a);
            double imaginary_part= Math.sqrt(-d)/(2*a);
            System.out.printf("%2.2f",real_part);
            System.out.printf("+i%2.2f",imaginary_part);
        }
        else
        {
            double x=-b/(2*a);
            System.out.println(x);
        }
    }
}