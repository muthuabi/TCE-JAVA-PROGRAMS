// package lab_ex10;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;
class CryptoTransaction {
    private String walletID;
    private double transactionAmount;
    private String timestamp;

    public CryptoTransaction(String walletID, double amount) {
        this.walletID = walletID;
        this.transactionAmount = amount;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public String toCSV() {
        return walletID + "," + transactionAmount + "," + timestamp;
    }

    // Create object from CSV line
    public static CryptoTransaction fromCSV(String line) {
        String[] parts = line.split(",");
        CryptoTransaction tx = new CryptoTransaction(parts[0], Double.parseDouble(parts[1]));
        tx.timestamp = parts[2];
        return tx;
    }

    public String toString() {
        return "WalletID: " + walletID + ", Amount: ₹" + transactionAmount + ", Time: " + timestamp;
    }
}

public class CryptoTransactionLedger {
    static final String FILE_NAME = "CryptLedger.csv";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("1. Add Transaction\n2. View Ledger\nEnter choice: ");
        int choice = sc.nextInt();

        if (choice == 1)
            addTransaction();
        else if (choice == 2)
            viewTransactions();
        else
            System.out.println("Invalid choice.");
    }

    public static void addTransaction() throws IOException {
        System.out.print("Enter Wallet ID: ");
        String wallet = sc.next();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        CryptoTransaction tx = new CryptoTransaction(wallet, amt);

        // Append to file
        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(tx.toCSV() + "\n");
        fw.close();

        System.out.println("Transaction saved!");
    }

    public static void viewTransactions() throws IOException {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No transactions found.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        System.out.println("\n--- Crypto Ledger ---");
        while ((line = br.readLine()) != null) {
            CryptoTransaction tx = CryptoTransaction.fromCSV(line);
            System.out.println(tx);
        }
        br.close();
    }
}
