import java.io.*;
import java.util.*;

class SensorFailureException extends Exception {
    public SensorFailureException(String message) {
        super(message);
    }
}

class AutonomousCar {
    private static final String LOG_FILE = "car_logs.csv";
    
    public void navigate() throws SensorFailureException, IOException {
        System.out.println("Car is navigating...");
        log("INFO", "Navigation started");
        if (isSensorFault("Obstacle Sensor")) {
            throw new SensorFailureException("Obstacle Sensor malfunction detected!");
        }
        if (isSensorFault("Camera Sensor")) {
            throw new SensorFailureException("Camera Sensor malfunction detected!");
        }
        if (isSensorFault("Proximity Sensor")) {
            throw new SensorFailureException("Proximity Sensor malfunction detected!");
        }

        System.out.println("Navigation successful. No errors found.");
        log("INFO", "Navigation completed successfully.");
    }

    private boolean isSensorFault(String sensorName) throws IOException {
        Random rand = new Random();
        boolean fault = rand.nextInt(100) < 25;

        if (fault) {
            log("ERROR", sensorName + " failed during operation.");
        } else {
            log("INFO", sensorName + " is functioning normally.");
        }

        return fault;
    }

    private void log(String level, String message) throws IOException {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {

            fw.write("\"" + new Date() + "\",\"" + level + "\",\"" + message + "\"\n");
        }
    }

    // Method for Admin to view reports from the log file
    public void showReports() throws IOException {
        System.out.println("Showing breach reports...");
        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

public class AutonomousCarSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar car = new AutonomousCar();

        try {
            car.navigate();
        } catch (SensorFailureException e) {
            System.out.println("ALERT: " + e.getMessage());
            try {
                logCritical(e.getMessage());
            } catch (IOException ioException) {
                System.out.println("Failed to log error.");
            }
        } 
        catch(IOException ie) {
            try {
                logCritical(ie.getMessage());
            } catch (IOException ex) {
                System.out.println("Failed to log IO error.");
            }
            System.out.println("ALERT: IO ERROR");
        }
        finally {
            System.out.println("Final system check completed.");
        }

        System.out.println("\n==========================");
        System.out.print("Admin, would you like to view breach reports? (yes/no): ");
        String choice = sc.nextLine();
        if ("yes".equalsIgnoreCase(choice)) {
            try {
                car.showReports();
            } catch (IOException e) {
                System.out.println("Error displaying reports: " + e.getMessage());
            }
        }

        sc.close();
    }

    private static void logCritical(String message) throws IOException {
        try (FileWriter fw = new FileWriter("car_logs.csv", true)) {
            fw.write("\"" + new Date() + "\",\"CRITICAL\",\"" + message + "\"\n");
        }
    }
}
