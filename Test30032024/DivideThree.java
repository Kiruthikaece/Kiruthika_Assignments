import java.util.Scanner;

public class DivideThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        String n=sc.next();
        boolean result=isDividebyThree(n);
        System.out.println(result?"yes":"No");
        sc.close();

    }
    public static boolean isDividebyThree(String n) {

        int remainder=0;
        for(int i=0;i<n.length();i++)
        {
            remainder=(int)remainder+n.charAt(i);
            remainder=remainder%3;
        }
        

        return remainder==0;
    }
}