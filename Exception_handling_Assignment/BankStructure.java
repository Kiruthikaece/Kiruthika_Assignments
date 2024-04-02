import java.util.Scanner;

public class BankStructure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your withdraw amount");
        long withdrawAmount=sc.nextLong();

        Account account = new Account("02B10000789",5000);
        account.withDraw(withdrawAmount);
        account.printDetails();
    }
}

class Account {
    String accountNo;
    double amount;
    public Account(String accountNo,double amount) {
        this.accountNo=accountNo;
        this.amount=amount;
    }
    public void withDraw(long withdrawAmount) {
        if(amount<0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        try  {
            if(withdrawAmount>amount)
            throw new Exception("Insufficient balance to withdraw.");
            else
            amount=amount-withdrawAmount;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }   
    }

    public void printDetails() {
        System.out.println("----------------------------");
        System.out.println("Bank details");
        System.out.println("----------------------------");
        System.out.println("Account Number:"+accountNo);
        System.out.println("Balance Amount:"+amount);
        System.out.println("----------------------------");
    }
}