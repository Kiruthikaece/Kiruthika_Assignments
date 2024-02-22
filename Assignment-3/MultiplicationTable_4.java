import java.util.Scanner;

class MultiplicationTable_4 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Multiplier:");
         int n=sc.nextInt();
         Multiplicationtable(n);
         sc.close();
    }
    public static void Multiplicationtable(int n) {
        for(int i=1;i<=10;i++)
        System.out.println(i+" "+"x"+" "+n+" "+"="+" "+i*n);
    }
}