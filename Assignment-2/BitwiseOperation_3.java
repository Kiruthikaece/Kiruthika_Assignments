import java.util.Scanner;
class BitwiseOperation_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        int no1=sc.nextInt();
        int no2=sc.nextInt();

        int bitwiseAnd=BitwiseAnd(no1,no2);
        System.out.println(bitwiseAnd);

        int bitwiseOr=BitwiseOr(no1,no2);
        System.out.println(bitwiseOr);

        int bitwiseXor=BitwiseXor(no1,no2);
        System.out.println(bitwiseXor);

        int bitwiseLshift=BitwiseLshift(no1);
        System.out.println(bitwiseLshift);
        
        int bitwiseRshift=BitwiseRshift(no1);
        System.out.println(bitwiseRshift);
    }
    public static int BitwiseAnd(int no1,int no2) {
        int bitwiseAnd=no1 & no2;
        return bitwiseAnd;
    }
    public static int BitwiseOr(int no1,int no2) {
        int bitwiseor=no1 | no2;
        return bitwiseor;
    }
    public static int BitwiseXor(int no1,int no2) {
        int bitwiseExor=no1 ^ no2;
        return bitwiseExor;
    }
    public static int BitwiseLshift(int no1) {
        int bitwiseLshift=no1 << 1;
        return bitwiseLshift;
    }
    public static int BitwiseRshift(int no1) {
        int bitwiseRshift=no1 >> 1;
        return  bitwiseRshift;
    }
} 