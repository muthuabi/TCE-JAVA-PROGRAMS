package lab_ex7;
import java.util.Scanner;

class TrafficSignal implements Runnable{
    String signalId;
    private String status;
    int index=0;
    String signals[]=new String[] {"Red","Green","Yellow"};
    Thread t=new Thread(this,"Traffic");
    public TrafficSignal(String signalId) {
        this.signalId = signalId;
        this.status = "Red"; 
    }
    public void run()
    {
    	while(true)
    	{
    		try {
    	
    	System.out.println("Signal:"+signalId+" Status:"+signals[index]);
    	System.out.println();
    	index=(index+1)%3;
    	Thread.sleep(3000);
    		}
    		catch(InterruptedException  ie)
    		{
    			
    		}
    	}
    	
    }
    public void setStatus(String status) {
        this.status = status;
        this.index=(signals[0].equalsIgnoreCase(status)?0:(signals[1].equalsIgnoreCase(status)?1:2));
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
        s1.t.start();
        s2.t.start();
        sc.close();
    }
}
