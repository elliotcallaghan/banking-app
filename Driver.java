public class Driver {
    
    public static void main(String[] args) {
        BankAccount mark, will;
        
        System.out.println("Mark:");
        mark = new ClassicAccount(1200, 800);
        mark.addMonthlyInterest();
        mark.addMonthlyInterest();
        System.out.format("Classic Account: £%.2f%n", mark.getAccountBalance());
        
        mark = new GoldAccount(1200, 800);
        mark.addMonthlyInterest();
        mark.addMonthlyInterest();
        System.out.format("Gold Account: £%.2f%n", mark.getAccountBalance());
        
        mark = new SavingsAccount(1200, 800);
        mark.addMonthlyInterest();
        mark.addMonthlyInterest();
        System.out.format("Savings Account: £%.2f%n", mark.getAccountBalance());
        
        System.out.println("\nWill:");
        will = new ClassicAccount(1000, 950);
        will.addMonthlyInterest();
        will.addMonthlyInterest();
        System.out.format("Classic Account: £%.2f%n", will.getAccountBalance());
        
        will = new GoldAccount(1000, 950);
        will.addMonthlyInterest();
        will.addMonthlyInterest();
        System.out.format("Gold Account: £%.2f%n", will.getAccountBalance());
        
        will = new SavingsAccount(1000, 950);
        will.addMonthlyInterest();
        will.addMonthlyInterest();
        System.out.format("Savings Account: £%.2f%n", will.getAccountBalance());
    }
}
