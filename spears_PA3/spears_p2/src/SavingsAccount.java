public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        this.savingsBalance += this.savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }
}

