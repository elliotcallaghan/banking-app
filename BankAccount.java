public class BankAccount {
    static double annualInterestRate;
    private double accountBalance;
    private final double monthlyDeposit;
    
    //constructor - assumes monthlyDeposit is 0 and passes arguments to constructor
    public BankAccount(double accountBalance) {
        this(accountBalance, 0);
    }
    
    //constructor - assigns arguments to variables
    public BankAccount(double accountBalance, double monthlyDeposit) {
        annualInterestRate = 0.015;
        this.accountBalance = accountBalance;
        this.monthlyDeposit = monthlyDeposit;
    }
    
    //getter - allows other classes to access accountBalance
    public double getAccountBalance() {
        return accountBalance;
    }
    
    //setter - allows other classes to update accountBalance
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    //default way to calculate interest if user doesn't have a specific account type
    public double calculateMonthlyInterest() {
        return (accountBalance * annualInterestRate) / 12;
    }
    
    //adds monthlyDeposit and interest to accountBalance
    public void addMonthlyInterest() {
        accountBalance += monthlyDeposit;
        double monthlyInterest = calculateMonthlyInterest();
        accountBalance += monthlyInterest;
    }
    
    //allows other account types to change annualInterestRate
    public void modifyInterestRate(double annualInterestRate) {
        BankAccount.annualInterestRate = annualInterestRate;
    }
}
