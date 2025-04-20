// package lab_ex10;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class CryptoTransaction {
    private String walletID;
    private double transactionAmount;
    private String timestamp; 

    public CryptoTransaction(String walletID, double amount) {
        this.walletID = walletID;
        this.transactionAmount = amount;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    // Convert to CSV line
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
