// Device.java
public class Device {
    private int battery;

    // Constructor
    public Device(int battery) {
        this.battery = battery;
    }

    // Method to check the status of the device
    public void status() {
        if (battery > 20) {
            System.out.println("Device is running. Battery level: " + battery + "%");
        } else if (battery > 10) {
            System.out.println("Warning: Low battery! " + battery + "% remaining.");
        } else {
            System.out.println("Battery critical! " + battery + "% remaining. Please charge immediately.");
        }
    }

    // Getter for battery
    public int getBattery() {
        return battery;
    }

    // Setter for battery
    public void setBattery(int battery) {
        this.battery = battery;
    }
}
