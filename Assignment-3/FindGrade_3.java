import java.util.Scanner;
class FindGrade_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Score:");
        int score=sc.nextInt();
        String result=FindGrade(score);  
        System.out.println("Grade Point:"+result);  
        sc.close();   
    }
    public static String FindGrade(int score) {
        if(score<=100)
            return "E";
        else if(score<=200)
            return "D";
        else if(score<=300)
            return "C";
        else if(score<=400)
            return "B";
        else if(score<=500)
            return "A";
        else
        return "Invalid";
    }
}