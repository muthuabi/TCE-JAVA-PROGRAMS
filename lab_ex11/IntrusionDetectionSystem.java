import java.io.*;
import java.util.*;

class UnauthorizedAccessException extends Exception {
    public UnauthorizedAccessException(String message) {
        super(message);
    }
}

class IntrusionDetection {
    private static final Map<String, String> users = new HashMap<>();
    private static final int MAX_ATTEMPTS = 3;
    private static final String LOG_FILE = "security_log.csv";
    public IntrusionDetection()
    {
        users.put("muthu", "muthu123");
        users.put("krish", "krish123");
        users.put("admin", "admin123");
    }
    public void showBreachers() throws IOException {
        System.out.println("\nSecurity Log (Breach Attempts):");
        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    System.out.println("User: " + parts[0] + " | Reason: " + parts[1] + " | Time: " + parts[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No security logs found.");
        }
    }

    public void validateLogin() throws IOException {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        boolean success = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            if (users.containsKey(username) && users.get(username).equals(password)) {
                System.out.println(" Login Successful!");
                if (username.equals("admin")) {
                    showBreachers();
                }
                success = true;
                break;
            } else {
                attempts++;
                System.out.println("Invalid Credentials. Attempt " + attempts);
                logUnauthorizedAttempt(username, "Wrong password attempt " + attempts);
            }
        }
        if(attempts>=MAX_ATTEMPTS)
        {
            try {
                    throw new UnauthorizedAccessException("Maximum login attempts exceeded!");
                } catch (UnauthorizedAccessException e) {
                    System.out.println(e.getMessage());
                    logUnauthorizedAttempt("SYSTEM", e.getMessage());
                }
            finally {
                System.out.println("Login process completed.\n");
            }
        }
    }

    private void logUnauthorizedAttempt(String user, String reason) throws IOException {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            String log = user + "," + reason + "," + new Date().toString() + "\n";
            fw.write(log);
        }
    }
}
public class IntrusionDetectionSystem{
    public static void main(String[] args) throws Exception {
        IntrusionDetection id = new IntrusionDetection();
        id.validateLogin();
    }
}

