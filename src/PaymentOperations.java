class PaymentOperations {

    private double walletBalance;
    private BankAccount bank;

    PaymentOperations(double walletBalance, BankAccount bank) {
        this.walletBalance = walletBalance;
        this.bank = bank;
    }

    void addMoneyToWallet(double amount) {
        if (bank.balance >= amount) {
            bank.balance -= amount;
            walletBalance += amount;
        } else {
            System.out.println("Insufficient bank balance");
        }
    }

    void sendMoney(PaymentOperations receiver, double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            receiver.walletBalance += amount;
            System.out.println("Money sent successfully");
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }

    void checkBalance() {
        System.out.println("Wallet: " + walletBalance);
        System.out.println("Bank: " + bank.balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(5000);
        BankAccount b2 = new BankAccount(3000);

        PaymentOperations p1 = new PaymentOperations(1000, b1);
        PaymentOperations p2 = new PaymentOperations(500, b2);

        p1.addMoneyToWallet(1000);
        p1.sendMoney(p2, 500);

        p1.checkBalance();
        p2.checkBalance();
    }
}

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
}