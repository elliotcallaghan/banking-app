public class SavingsAccount extends BankAccount {
    private final double monthlyDeposit;
    
    //constructor - assumes monthlyDeposit is 0 and passes arguments to constructor
    public SavingsAccount(double accountBalance) {
        this(accountBalance, 0);
    }
    
    //constructor - passes arguments to parent constructor and sets monthlyDeposit variable
    public SavingsAccount(double accountBalance, double monthlyDeposit) {
        super(accountBalance, monthlyDeposit);
        this.monthlyDeposit = monthlyDeposit;
    }
    
    //overrides parent method and returns interest after checking monthlyDeposit and changing annualInterestRate
    public double calculateMonthlyInterest() {
        if (monthlyDeposit >= 500) {
            modifyInterestRate(0.03);
            return (getAccountBalance() * annualInterestRate) / 12;
        } else {
            modifyInterestRate(0);
            return 0;
        }
    }
}
