import java.util.Scanner;
class FindDays_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month:");
        int month=sc.nextInt();
        System.out.println("Enter year:");
        int year=sc.nextInt();
        sc.close();
        if(month<0 || month>13)
        {
            System.out.println("Invalid month");
            return; 
        }
        else {
            int days=FindDays(month,year);
            System.out.println("Days:"+days);
        }
        
        
    }
    public static int FindDays(int month,int year) {

            if(isleap(year) && month==2)
            return 29;
            else if(month==2)
            return 28;
            else if(month==4 || month==6 || month==9 || month==11)
            return 30;
            else
            return 31;
        }

    public static boolean isleap(int year) {
        if(year%400==0 || (year%4==0 && year%100!=0))
         return true;
         else
         return false;
    }
}