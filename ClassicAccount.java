public class ClassicAccount extends BankAccount {
    
    //constructor - assumes monthlyDeposit is 0 and passes arguments to constructor
    public ClassicAccount(double accountBalance) {
        this(accountBalance, 0);
    }
    
    //constructor - passes arguments to parent constructor
    public ClassicAccount(double accountBalance, double monthlyDeposit) {
        super(accountBalance, monthlyDeposit);
    }

    //overrides parent method and returns interest after changing annualInterestRate
    public double calculateMonthlyInterest() {
        modifyInterestRate(0.01725);
        return (getAccountBalance() * annualInterestRate) / 12;
    }
}
