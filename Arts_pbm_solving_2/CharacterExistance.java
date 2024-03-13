import java.util.Scanner;
class CharacterExistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        System.out.println("Enter character:");
        char ch=sc.next().charAt(0);
        boolean result=cancontains(s,ch);
        System.out.println(result);
        sc.close();
    }
    public static boolean cancontains(String s,char ch) {
       if(s.length()==0)
       return false;
       if(s.charAt(0)==ch)
       return true;

       return cancontains(s.substring(1),ch);
    }
}