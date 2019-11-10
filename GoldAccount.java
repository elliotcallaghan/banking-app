public class GoldAccount extends BankAccount {
    
    //constructor - assumes monthlyDeposit is 0 and passes arguments to constructor
    public GoldAccount(double accountBalance) {
        this(accountBalance, 0);
    }
    
    //constructor - passes arguments to parent constructor
    public GoldAccount(double accountBalance, double monthlyDeposit) {
        super(accountBalance, monthlyDeposit);
    }
    
    //overrides parent method and returns interest after changing annualInterestRate and checking if penalty is necessary
    public double calculateMonthlyInterest() {
        if (getAccountBalance() < 2000) {
            setAccountBalance(getAccountBalance() - 50);
        }
        modifyInterestRate(0.042);
        return (getAccountBalance() * annualInterestRate) / 12;
    }
}
