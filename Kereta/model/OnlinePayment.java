package Kereta.model;

public class OnlinePayment implements Payment {
    private String transactionID;
    private String paymentGateway;

    public OnlinePayment() {
    }

    public OnlinePayment(String transactionID, String paymentGateway) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public int makePayment(double ammount, double saldo) {
        if (paymentGateway.equalsIgnoreCase("PayPal") || paymentGateway.equalsIgnoreCase("DOKU")
                || paymentGateway.equalsIgnoreCase("Xendit")) {
            if (saldo > ammount) {
                return 1;
            } else {
                return 2;
            }
        } else {
            return 0;
        }
    }

    public String getPaymentInfo() {
        return "\nTransaction ID : " + getTransactionID() + "\nPayment Gateway : " + getPaymentGateway();
    }
}
