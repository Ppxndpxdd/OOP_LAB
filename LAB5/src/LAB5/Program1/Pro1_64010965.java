package LAB5.Program1;

public class Pro1_64010965 {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("");
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("");
        System.out.println("Date when this account was created: " + account.getDateCreated());
        System.out.println("");


    }
}
