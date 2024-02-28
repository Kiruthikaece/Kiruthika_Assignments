import java.util.Scanner;

class AddBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number 1:");
        String n1=sc.next();
        System.out.println("Enter binary number 2:");
        String n2=sc.next();

        String s=FindSumBinary(n1,n2);
        System.out.println(s);
    }

    
      public static String FindSumBinary(String a, String b) {
          StringBuilder res = new StringBuilder();
          int i = a.length() - 1;
          int j = b.length() - 1;
          int carry = 0;
          while(i >= 0 || j >= 0){
              int sum = carry;
              if(i >= 0) sum += a.charAt(i--) - '0';
              if(j >= 0) sum += b.charAt(j--) - '0';
              carry = sum > 1 ? 1 : 0;
              res.append(sum % 2);
          }
          if(carry != 0) res.append(carry);
          return res.reverse().toString();
      
  }

}