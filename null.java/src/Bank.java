class Bank {
    double balance = 20000;

    void withdraw(double amount) {
        try {
            if (amount > 10000)
                throw new Exception("Withdrawal limit is 10000");

            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Balance: " + balance);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        b.withdraw(15000);
    }
}