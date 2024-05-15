import java.util.Scanner;
import java.util.Stack;

class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter expression:");
        String exp=sc.next();
        String result=ConvertInfix(exp);
        System.out.println("Postfix Expression:" +result);
    }

    private static String ConvertInfix(String exp) {
       Stack<Character> stack=new Stack<>();
       String str="";
       for(int i=0;i<exp.length();i++) {
        char ch=exp.charAt(i);
        if(ch=='+' || ch=='-'|| ch=='*' || ch=='/' || ch=='(') 
            stack.push(ch);
        else if(ch==')') {
           while(!stack.isEmpty() && stack.peek()!='(')
           str=str+stack.pop();

           stack.pop();
        }
        else
        str=str+ch;
       }

       while(!stack.isEmpty()) {
        str=str+stack.pop();
       }

       return str;
    }
}

