package lab_ex7;
import java.util.Scanner;

class TrafficSignal {
    String signalId;
    private String status;

    public TrafficSignal(String signalId) {
        this.signalId = signalId;
        this.status = "Red"; 
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void showSignal() {
        System.out.println("Traffic Signal " + signalId + " is " + status);
    }
}

class Junction {
    private String junctionName;
    private TrafficSignal[] signals;

    public Junction(String junctionName, TrafficSignal[] signals) {
        this.junctionName = junctionName;
        this.signals = signals;
    }

    public void showJunctionSignals() {
        System.out.println("\nJunction: " + junctionName);
        for (TrafficSignal signal : signals) {
            signal.showSignal();
        }
    }

    public void setSignalStatus(Scanner sc) {
        for (TrafficSignal signal : signals) {
            System.out.print("Enter status for " + signal.signalId + ": ");
            String status = sc.next();
            signal.setStatus(status);
        }
    }
}

public class TrafficManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TrafficSignal s1 = new TrafficSignal("S1");
        TrafficSignal s2 = new TrafficSignal("S2");

        Junction j1 = new Junction("Anna Nagar", new TrafficSignal[]{s1, s2});

        j1.showJunctionSignals();
        j1.setSignalStatus(sc);
        j1.showJunctionSignals();

        sc.close();
    }
}
