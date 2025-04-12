package lab_ex9;
import java.util.*;
class BankDB {
    static Map<String, Transaction> transactionDB = new HashMap<>();

    public static void recordTransaction(String accountId, String method, double amount, boolean success) {
        Transaction t = transactionDB.getOrDefault(accountId, new Transaction());
        t.record(method, amount, success);
        transactionDB.put(accountId, t);
    }

    public static Transaction getUserTransaction(String accountId) {
        return transactionDB.get(accountId);
    }
}
class Transaction {
    public Map<String, Integer> attempts = new HashMap<>();
    public Map<String, Double> totalAmount = new HashMap<>();

    public void record(String method, double amt, boolean success) {
        if (success) {
            totalAmount.put(method, totalAmount.getOrDefault(method, 0.0) + amt);
        } else {
            attempts.put(method, attempts.getOrDefault(method, 0) + 1);
        }
    }
}
abstract class PaymentGateway {
    protected String accountId;
    protected double amount;
    protected Scanner sc = new Scanner(System.in);

    public PaymentGateway(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public abstract void processPayment();
}

class UPIPayment extends PaymentGateway {
    public UPIPayment(String accountId, double amount) {
        super(accountId, amount);
    }

    public void processPayment() {
        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();
        System.out.print("Enter UPI PIN: ");
        String pin = sc.nextLine();
        if (pin.equals("1234")) {
            System.out.println("UPI Payment Successful!");
            BankDB.recordTransaction(accountId, "UPI", amount, true);
        } else {
            System.out.println("Incorrect PIN!");
            BankDB.recordTransaction(accountId, "UPI", amount, false);
        }
    }
}

class CreditCardPayment extends PaymentGateway {
    public CreditCardPayment(String accountId, double amount) {
        super(accountId, amount);
    }
    public void processPayment() {
        System.out.print("Enter Card Number: ");
        String card = sc.nextLine();
        System.out.print("Enter CVV: ");
        String cvv = sc.nextLine();
        System.out.print("Enter Card PIN: ");
        String pin = sc.nextLine();
        if (pin.equals("9999")) {
            System.out.println("Credit Card Payment Successful!");
            BankDB.recordTransaction(accountId, "CreditCard", amount, true);
        } else {
            System.out.println("Incorrect PIN!");
            BankDB.recordTransaction(accountId, "CreditCard", amount, false);
        }
    }
}

class NetBankingPayment extends PaymentGateway {
    public NetBankingPayment(String accountId, double amount) {
        super(accountId, amount);
    }

    public void processPayment() {
        System.out.print("Enter NetBanking User ID: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        if (pass.equals("admin")) {
            System.out.println("NetBanking Payment Successful!");
            BankDB.recordTransaction(accountId, "NetBanking", amount, true);
        } else {
            System.out.println("Incorrect Password!");
            BankDB.recordTransaction(accountId, "NetBanking", amount, false);
        }
    }
}
