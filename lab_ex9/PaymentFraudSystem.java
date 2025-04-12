package lab_ex9;
import java.util.*;
class FraudAnalyzer {
    public static void analyze(String accountId) {
        Transaction t = BankDB.getUserTransaction(accountId);
        if (t == null) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\n--- Fraud Report for " + accountId + " ---");
        for (String method : t.attempts.keySet()) {
            int fail = t.attempts.get(method);
            double amount = t.totalAmount.getOrDefault(method, 0.0);
            int score = 0;

            if (fail > 2) score += 30;
            if (amount > 10000) score += 40;
            score += new Random().nextInt(20);

            System.out.println("Method: " + method + " | Failed Attempts: " + fail + " | Total Amount: ₹" + amount);
            System.out.println("Fraud Probability Score: " + score + "%");
            if (score > 70) System.out.println("** ALERT: Potential Fraud Detected **");
        }
    }
}

public class PaymentFraudSystem {
    public static void main(String[] args)throws InterruptedException {
        int sessionCounts=3;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Intializing...");
        Thread.sleep(1000);
        System.out.print("Enter your Account ID: ");
        String id = sc.nextLine();

        System.out.println("Choose Payment Method:\n1. UPI\n2. Credit Card\n3. NetBanking");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Amount to Pay: ");
        double amt = sc.nextDouble();
        sc.nextLine();

        PaymentGateway pg = null;
        switch (choice) {
            case 1: pg = new UPIPayment(id, amt); break;
            case 2: pg = new CreditCardPayment(id, amt); break;
            case 3: pg = new NetBankingPayment(id, amt); break;
        }

        if (pg != null) {
            pg.processPayment();
        }

        System.out.println("\nDo you want to analyze fraud risk? (yes/no)");
        if (sc.nextLine().equalsIgnoreCase("yes")) {
            FraudAnalyzer.analyze(id);
        }
        System.out.println("Press to Continue...");
        sc.nextLine();
        System.out.println("Exiting...");
        }while(--sessionCounts!=0);
        System.out.println("Session Closed!");
        sc.close();
    }
}
