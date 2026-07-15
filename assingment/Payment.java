import java.util.Date;
interface Payable {
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
}

// Interface 2: Tax Contract
interface Taxable {
    double calculateTax();
    void generateTaxInvoice();
}

// Interface 3: Logger Contract
interface Loggable {
    void logActivity(String action);
}

// Credit Card Payment
class CreditCardPayment implements Payable, Taxable, Loggable {

    private String cardNumber;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        status = "SUCCESS";
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: $" + amount);
        logActivity("Credit Card Payment Processed");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        status = "REFUNDED";
        System.out.println("Refunded $" + amount + " to Credit Card.");
        logActivity("Refund Completed");
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.18;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("----- Credit Card Invoice -----");
        System.out.println("Amount : $" + amount);
        System.out.println("GST (18%): $" + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action + " at " + new Date());
    }
}

// PayPal Payment
class PayPalPayment implements Payable, Taxable, Loggable {

    private String email;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        status = "SUCCESS";
        System.out.println("Processing PayPal Payment...");
        System.out.println("Email: " + email);
        System.out.println("Amount: $" + amount);
        logActivity("PayPal Payment Processed");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        status = "REFUNDED";
        System.out.println("Refunded $" + amount + " to PayPal.");
        logActivity("Refund Completed");
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.15;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("----- PayPal Invoice -----");
        System.out.println("Amount : $" + amount);
        System.out.println("GST (15%): $" + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action + " at " + new Date());
    }
}

// UPI Payment
class UPIPayment implements Payable, Taxable, Loggable {

    private String upiId;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        status = "SUCCESS";
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: $" + amount);
        logActivity("UPI Payment Processed");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        status = "REFUNDED";
        System.out.println("Refunded $" + amount + " via UPI.");
        logActivity("Refund Completed");
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.05;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("----- UPI Invoice -----");
        System.out.println("Amount : $" + amount);
        System.out.println("GST (5%): $" + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action + " at " + new Date());
    }
}

class Payment {

    public static void main(String[] args) {

        CreditCardPayment credit = new CreditCardPayment("1234-5678-9012");
        credit.processPayment(10000);
        System.out.println("Status: " + credit.getPaymentStatus());
        credit.calculateTax();
        credit.generateTaxInvoice();
        credit.refundPayment(1000);

        System.out.println();

        PayPalPayment paypal = new PayPalPayment("user@gmail.com");
        paypal.processPayment(5000);
        System.out.println("Status: " + paypal.getPaymentStatus());
        paypal.calculateTax();
        paypal.generateTaxInvoice();
        paypal.refundPayment(500);

        System.out.println();

        UPIPayment upi = new UPIPayment("john@oksbi");
        upi.processPayment(2000);
        System.out.println("Status: " + upi.getPaymentStatus());
        upi.calculateTax();
        upi.generateTaxInvoice();
        upi.refundPayment(200);
    }
}
