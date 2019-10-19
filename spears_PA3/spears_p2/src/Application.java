public class Application {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(2000);
        SavingsAccount acc2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);
        for (int i = 0; i < 12; i++) {
            acc1.calculateMonthlyInterest();
            acc2.calculateMonthlyInterest();
            System.out.printf("Month %d\n", i + 1);
            System.out.printf("Account 1: $%.2f\nAccount 2: $%.2f\n", acc1.getSavingsBalance(), acc2.getSavingsBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);
        acc1.calculateMonthlyInterest();
        acc2.calculateMonthlyInterest();
        System.out.printf("Month %d\n", 13);
        System.out.printf("Account 1: $%.2f\nAccount 2: $%.2f\n", acc1.getSavingsBalance(), acc2.getSavingsBalance());
    }
}
