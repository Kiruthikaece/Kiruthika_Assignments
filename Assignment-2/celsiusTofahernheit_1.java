import java.util.Scanner;
class celsiusTofahernheit_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter celsius:");
        double celsius=sc.nextFloat();
        double result=FindFaherenheit(celsius);
        System.out.printf("Celsius to Fahrenheit: %2.2f",result);
    }
    public static double FindFaherenheit(double celsius) {
        double faherenheit= (celsius*1.8f)+32;
        return faherenheit;
    }
}