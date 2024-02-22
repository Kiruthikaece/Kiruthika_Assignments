import java.util.Scanner;
class CalculateTime_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int time=sc.nextInt();
        calcualteTime(time);
    }
    public static void calcualteTime(int time) {
        int hours=time/3600;
        int rem=time%3600;
        int minutes=rem/60;
        int seconds=rem%60;

        System.out.println(hours+":"+minutes+":"+seconds);
    }
}