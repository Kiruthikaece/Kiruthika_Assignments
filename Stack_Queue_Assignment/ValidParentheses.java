import java.util.Scanner;
import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.next();
        String ans=IsValidParenthesis(str)?"Valid parentheses":"Not Valid parentheses";
        System.out.println(ans);
    }

    private static boolean IsValidParenthesis(String str) {
       Stack<Character> stack=new Stack<>();
         for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'|| ch=='[')
            stack.push(ch);
            else if(ch==')' || ch=='}' || ch==']') {
                if(stack.isEmpty())
                return false;
                char top=stack.pop();
                if(ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && ch=='{')
                return false;
            }
         }
         return stack.isEmpty();
       }
    }
