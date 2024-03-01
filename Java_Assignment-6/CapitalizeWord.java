import java.util.Scanner;

class CapitalizeWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String s=CaptializeFirstLetter(str);
        System.out.println(s);
    }
    public static String CaptializeFirstLetter(String s) {
        char[] ch=s.toCharArray();
        for(int i=1;i<s.length()-1;i++) {
            if(ch[i]==' ' && ch[i+1]>='a' && ch[i+1]<='z')
            ch[i+1]=(char) (ch[i+1]-32);
        }
        if(ch[0]>='a' && ch[0]<='z')
        ch[0]=(char) (ch[0]-32);
        return String.valueOf(ch);
    }
}