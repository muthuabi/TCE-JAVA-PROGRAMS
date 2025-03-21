package lab_ex7;
import java.util.Scanner;

class SmartDevice {
    String deviceName;
    private boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false; 
    }

    public void toggleDevice() {
        isOn = !isOn;
    }

    public void showDeviceStatus() {
        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF"));
    }
}

class Room {
    private String roomName;
    private SmartDevice[] devices;

    public Room(String roomName, SmartDevice[] devices) {
        this.roomName = roomName;
        this.devices = devices;
    }

    public void showRoomDevices() {
        System.out.println("\nRoom: " + roomName);
        for (SmartDevice device : devices) {
            device.showDeviceStatus();
        }
    }

    public void toggleDevices(Scanner sc) {
        for (SmartDevice device : devices) {
            System.out.print("Toggle " + device.deviceName + "? (yes/no): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("yes")) {
                device.toggleDevice();
            }
        }
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmartDevice d1 = new SmartDevice("Smart Light");
        SmartDevice d2 = new SmartDevice("Smart AC");

        Room r1 = new Room("Living Room", new SmartDevice[]{d1, d2});

        r1.showRoomDevices();
        r1.toggleDevices(sc);
        r1.showRoomDevices();

        sc.close();
    }
}
