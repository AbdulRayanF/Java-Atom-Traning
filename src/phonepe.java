class PhonePe {
    private String name;
    private String phoneNumber;
    private String upiId;
    private double walletBalance;

    public PhonePe(String name, String phoneNumber, String upiId, double walletBalance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.upiId = upiId;
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public static void main(String[] args) {

        PhonePe p = new PhonePe(
                "Rayan",
                "9876543210",
                "rayan@upi",
                5000
        );

        System.out.println("Name: " + p.getName());
        System.out.println("Phone: " + p.getPhoneNumber());
        System.out.println("UPI ID: " + p.getUpiId());
        System.out.println("Wallet Balance: " + p.getWalletBalance());
    }
}