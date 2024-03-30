import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subsequence {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter String");
         String str=sc.next();
         printSubsequences(str);
    }
        public static void printSubsequences(String s) {
            int n = s.length();
        Set<String> set=new HashSet<>();
        
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) { 
                    subsequence.append(s.charAt(j));
                }
            }
            set.add(subsequence.toString());
        }
        
        for(String str:set)
        if(str!=" ")
            System.out.print(str + " ");
        }
    }
