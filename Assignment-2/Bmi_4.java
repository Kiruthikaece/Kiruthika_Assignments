import java.util.Scanner;
class Bmi_4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a weight:");
    double weight=sc.nextDouble();
    System.out.println("Enter a height:");
    double height=sc.nextDouble();
    
    double result=CalculateBmi(weight,height);
    System.out.println("BMI:"+result);
    }
    public static double CalculateBmi(double weight,double height) {
        if(height<2)
        return weight/(height*height);
        else
        return weight/((height/100)*(height/100));
    }
}