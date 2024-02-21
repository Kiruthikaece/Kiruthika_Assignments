import java.util.Scanner;
enum weekdays {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

class Enum_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int days_no=sc.nextInt();

        if (days_no < 1 || days_no > 7) {
            System.out.println("Enter a number between 1 to 7");
            return;
        }
        
        weekdays wd=weekdays.values()[days_no-1];
        System.out.println(wd);
    }
}