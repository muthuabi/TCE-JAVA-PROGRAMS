package lab_ex8;
import java.util.*;
class UserAuthentication implements Runnable {
    static String username = "krish";
    static String hashedPassword = String.valueOf("pass123".hashCode());
    static String generatedOtp = null;
    static boolean otpVerified = false;
    static Thread otpThread = null;

    public static boolean verifyPassword(String uname, String pwd) {
        return uname.equals(username) && String.valueOf(pwd.hashCode()).equals(hashedPassword);
    }

    public static void generateOtp() {
        generatedOtp = String.valueOf(new Random().nextInt(9000) + 1000);
        System.out.println("Generated OTP: " + generatedOtp);

        // Stop previous thread if running
        if (otpThread != null && otpThread.isAlive()) {
            otpThread.interrupt();
        }

        UserAuthentication authRunnable = new UserAuthentication();
        otpThread = new Thread(authRunnable);
        otpThread.start();
    }

    @Override
    public void run() {
        int counter = 60;
        while (counter > 0 && generatedOtp != null && !otpVerified) {
            try {
                Thread.sleep(1000);
                counter--;
            } catch (InterruptedException e) {
                return;
            }
        }
        if (!otpVerified) {
            generatedOtp = null;
            System.out.println("OTP expired");
        }
    }
}

class PasswordLogin extends UserAuthentication {
    public boolean authenticate(String uname, String pwd) {
        return verifyPassword(uname, pwd);
    }
}

class OTPLogin extends UserAuthentication {
    public boolean authenticate(String otp) {
        if (generatedOtp != null && otp.equals(generatedOtp)) {
            otpVerified = true;
            return true;
        }
        return false;
    }
}

class BiometricLogin {
    private int[][] storedPattern;

    public BiometricLogin() {
        storedPattern = new int[][]{{1, 2}, {3, 4}};
    }

    public boolean authenticate(int[][] inputPattern) {
        if (inputPattern.length != storedPattern.length) return false;
        for (int i = 0; i < storedPattern.length; i++) {
            if (inputPattern[i][0] != storedPattern[i][0] || inputPattern[i][1] != storedPattern[i][1])
                return false;
        }
        return true;
    }
}

public class MFASystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Password
        System.out.print("Enter username: ");
        String uname = sc.next();
        System.out.print("Enter password: ");
        String pwd = sc.next();

        PasswordLogin pLogin = new PasswordLogin();
        if (pLogin.authenticate(uname, pwd)) {
            System.out.println("Password verified");

            // Step 2: OTP
            UserAuthentication.generateOtp();
            System.out.print("Enter OTP: ");
            String otp = sc.next();

            OTPLogin otpLogin = new OTPLogin();
            if (otpLogin.authenticate(otp)) {
                System.out.println("OTP verified");

                // Step 3: Biometric
                System.out.println("Enter 2x2 biometric pattern:");
                int[][] inputPattern = new int[2][2];
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        inputPattern[i][j] = sc.nextInt();

                BiometricLogin bLogin = new BiometricLogin();
                if (bLogin.authenticate(inputPattern)) {
                    System.out.println("Biometric verified — Access Granted");
                } else {
                    System.out.println("Biometric verification failed");
                }
            } else {
                System.out.println("OTP invalid or expired");
            }
        } else {
            System.out.println("Username/Password incorrect");
        }

        sc.close();
    }
}
