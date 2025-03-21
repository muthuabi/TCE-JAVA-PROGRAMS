package lab_ex5;

import java.util.*;

class Mk_AuthSystem {
    private static final String MK_USERNAME = "muthukrishnan";
    private static final String MK_PASSWORD = "S3Jpc2g="; /* Krish */
    private static final int MAX_ATTEMPTS = 3;
    private int mk_failedAttempts = 0;

    private String mk_Encode(String password) {
        try {
            String pass64 = Base64.getEncoder().encodeToString(password.getBytes());
            return pass64;
        } catch (Exception e) {
            return null;
        }
    }

    boolean mk_authenticate(String mk_username, String mk_password) {
        if (mk_failedAttempts >= MAX_ATTEMPTS) {
            System.out.println("Account locked due to multiple failed attempts!");
            return false;
        }
        boolean isAuthenticated = mk_username.equals(MK_USERNAME) && mk_Encode(mk_password).equals(MK_PASSWORD);
        if (!isAuthenticated) {
            mk_failedAttempts++;
            System.out.println("Invalid Credentials! Attempts left: " + (MAX_ATTEMPTS - mk_failedAttempts));
        } else {
            mk_failedAttempts = 0;
        }
        return isAuthenticated;
    }

    boolean mk_authenticate(String mk_username, String mk_password, int mk_otp, int mk_generatedOtp) {
        return mk_authenticate(mk_username, mk_password) && mk_otp == mk_generatedOtp;
    }

    int mk_generateOtp() {
        Random mk_random = new Random();
        return 1000 + mk_random.nextInt(9000);
    }
}

public class Mk_UserAuth {
    public static void main(String[] args) {
        Scanner mk_scanner = new Scanner(System.in);
        Mk_AuthSystem mk_auth = new Mk_AuthSystem();
        int mk_choice;

        do {
            System.out.println("\n1. Login with Password");
            System.out.println("2. Login with Password & OTP");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            mk_choice = mk_scanner.nextInt();
            mk_scanner.nextLine();

            if (mk_choice == 1 || mk_choice == 2) {
                System.out.print("Enter Username: ");
                String mk_username = mk_scanner.nextLine();
                System.out.print("Enter Password: ");
                String mk_password = mk_scanner.nextLine();

                if (mk_choice == 1) {
                    if (mk_auth.mk_authenticate(mk_username, mk_password)) 
                        System.out.println("Login Successful!");
                } else {
                    int mk_generatedOtp = mk_auth.mk_generateOtp();
                    System.out.println("Generated OTP (for testing): " + mk_generatedOtp);
                    System.out.print("Enter OTP: ");
                    int mk_otp = mk_scanner.nextInt();

                    if (mk_auth.mk_authenticate(mk_username, mk_password, mk_otp, mk_generatedOtp)) 
                        System.out.println("Login Successful!");
                    else 
                        System.out.println("Invalid Credentials or OTP!");
                }
            }
        } while (mk_choice != 3);

        System.out.println("Exiting Authentication System...");
        mk_scanner.close();
    }
}

