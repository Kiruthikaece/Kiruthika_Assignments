import java.util.Scanner;

class ValidateEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Email:");
        String email=sc.nextLine();
        boolean result=ValidationEmail(email);
        System.out.println(result?"valid":"Invalid");
    }
    public static boolean ValidationEmail(String email) {
        
        
        if(email.charAt(0)=='.' || email.charAt(email.length()-1)=='.')
        return false;
        
        if(!email.contains("@")) 
        return false;
        
        String[] arr=email.split("@");

        if(arr.length<2)
        return false;
        
        for(int i=0;i<arr[0].length();i++) {
            if(!Character.isLowerCase(arr[0].charAt(i)) && arr[0].charAt(i)!='.' && !Character.isDigit(arr[0].charAt(i)))
            return false;
        }
       
        if(arr[0].charAt(arr[0].length()-1)=='.')
        return false;
        
        if(arr[1].charAt(0)=='.')
        return false;
        
        int isdotcount=0;
        for(int i=0;i<arr[1].length();i++) {
            if(arr[1].charAt(i)=='.')
            isdotcount++;
        }
       
        if(isdotcount>3)
        return false;
        
        for(int i=0;i<arr[1].length();i++) {
            if(!Character.isLowerCase(arr[1].charAt(i))&&arr[1].charAt(i)!='.')
            return false;
        }
      return true;
    }
}