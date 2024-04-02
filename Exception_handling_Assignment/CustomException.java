import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        try {
            checkVoter(age);
            System.out.println("You are eligible for voting.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkVoter(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("You are not eligible for voting");
        else
            System.out.println("Your age is " + age + ", you are eligible for voting.");
    }
}

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
