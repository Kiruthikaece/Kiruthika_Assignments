import java.util.Scanner;

public class CustomException {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    CheckVoter(n);
  }

private static void CheckVoter(int n) {
   try {
    if(n<18)
    throw new Exception("You are not eligible for voting");
    else
    System.out.println("you are age is"+n+"elgible for voting");
   }
   catch(Exception e) {
    System.out.println(e.getMessage());
   }
}
}