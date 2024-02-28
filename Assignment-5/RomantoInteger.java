import java.util.Scanner;
class RomantoInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roman:");
        String roman=sc.next();
        int result=FindIntegerToRoman(roman);
        System.out.println(result);
    }
    public static int FindIntegerToRoman(String roman) {
        int ans=0,num=0;
        for(int i=roman.length()-1;i>=0;i--) {
            switch(roman.charAt(i)) {
                case 'I': num=1;
                            break;
                case 'V': num=5;
                        break;
                        case 'X': num=10;
                        break;
                        case 'L': num=50;
                        break;
                        case 'C': num=100;
                        break;
                        case 'D': num=500;
                        break;
                        case 'M': num=1000;
                        break;
            }
            if(4*num<ans) 
            ans=ans-num;
            else
            ans=ans+num;
        }
        return ans;
    }
}

