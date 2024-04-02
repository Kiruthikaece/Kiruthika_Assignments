import java.util.Scanner;

class CreateNumberFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone number:");
    
        try {
            int n=sc.nextInt();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}