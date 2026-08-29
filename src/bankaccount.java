class BankAccount {

    private int accountNumber;
    private String bankName;
    private double balance;

    BankAccount(int accountNumber, String bankName, double balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount(101, "SBI", 5000);

        b.deposit(1000);
        b.withdraw(2000);

        System.out.println("Account: " + b.getAccountNumber());
        System.out.println("Bank: " + b.getBankName());
        System.out.println("Balance: " + b.getBalance());
    }
}