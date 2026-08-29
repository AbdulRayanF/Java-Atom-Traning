class LowBalanceException extends Exception {
    LowBalanceException(String s) { super(s); }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String s) { super(s); }
}

class MaxAmountException extends Exception {
    MaxAmountException(String s) { super(s); }
}

class Bank {
    double balance = 5000;

    void withdraw(int a) throws Exception {
        if (a <= 0) throw new InvalidAmountException("Invalid");
        if (a > 10000) throw new MaxAmountException("Max 10000");
        if (a > balance) throw new LowBalanceException("Low balance");
        balance -= a;
    }

    public static void main(String[] args) {
        try {
            new Bank().withdraw(11000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}