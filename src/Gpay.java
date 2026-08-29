class GPay {
    private double balance = 5000;

    public void withdraw(double a) {
        if (a <= balance)
            balance -= a;
    }

    public void transfer(double a) {
        if (a <= balance)
            balance -= a;
    }

    public void show() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        GPay g = new GPay();

        g.withdraw(500);
        g.transfer(1000);
        g.show();
    }
}