import java.util.*;
import java.io.*;

class DigitalCertificate {
    private String holderName;
    private String certificateID;
    private String expiryDate;

    public DigitalCertificate(String name, String id, String expiry) {
        this.holderName = name;
        this.certificateID = id;
        this.expiryDate = expiry;
    }
    private String encrypt(String data, int key) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray())
            sb.append((char)(c + key));
        return sb.toString();
    }

    private String decrypt(String data, int key) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray())
            sb.append((char)(c - key));
        return sb.toString();
    }
    public String toEncryptedCSV(int key) {
        return encrypt(holderName, key) + "," + encrypt(certificateID, key) + "," + encrypt(expiryDate, key);
    }

    public static DigitalCertificate fromEncryptedCSV(String line, int key) {
        String[] parts = line.split(",");
        String name = decryptStatic(parts[0], key);
        String id = decryptStatic(parts[1], key);
        String date = decryptStatic(parts[2], key);
        return new DigitalCertificate(name, id, date);
    }

    private static String decryptStatic(String data, int key) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray())
            sb.append((char)(c - key));
        return sb.toString();
    }

    public String toString() {
        return "Holder: " + holderName + ", Certificate ID: " + certificateID + ", Expiry: " + expiryDate;
    }
}


public class CertificateManager {
    static final String FILE = "Certificates.enc";
    static final int KEY = 4;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("1. Issue Certificate\n2. View Certificates\nEnter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) issueCertificate();
        else if (ch == 2) viewCertificates();
        else System.out.println("Invalid choice.");
    }

    public static void issueCertificate() throws IOException {
        System.out.print("Enter Holder Name: ");
        String name = sc.next();
        System.out.print("Enter Certificate ID: ");
        String id = sc.next();
        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String expiry = sc.next();

        DigitalCertificate cert = new DigitalCertificate(name, id, expiry);
        FileWriter fw = new FileWriter(FILE, true);
        fw.write(cert.toEncryptedCSV(KEY) + "\n");
        fw.close();

        System.out.println("Certificate Issued Successfully!");
    }

    public static void viewCertificates() throws IOException {
        File file = new File(FILE);
        if (!file.exists()) {
            System.out.println("No certificates found.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        System.out.println("\n--- Issued Certificates ---");
        while ((line = br.readLine()) != null) {
            DigitalCertificate cert = DigitalCertificate.fromEncryptedCSV(line, KEY);
            System.out.println(cert);
        }
        br.close();
    }
}
