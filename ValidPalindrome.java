import java.util.Scanner;
class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        boolean result=CheckValidPalindrome(str);
        System.out.println(result);
    }
    public static boolean CheckValidPalindrome(String str) {
            String rev="";
            String front="";
            int i=str.length()-1;
            while(i>=0) {
                if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='0' && str.charAt(i)<='9')
                rev=rev+str.charAt(i);
                else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                rev=rev+str.charAt(i);
                i--;
            }
            int j=0;
            while(j<str.length()) {
                if(str.charAt(j)>='a' && str.charAt(j)<='z' || str.charAt(j)>='0' && str.charAt(j)<='9')
                front=front+str.charAt(j);
                else if(str.charAt(j)>='A' && str.charAt(j)<='Z')
                front=front+str.charAt(j);
                j++;
            }
            return (front.toLowerCase()).equals(rev.toLowerCase());
    }
}
