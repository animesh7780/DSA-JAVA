import java.util.Scanner;

public class devicecount {
    public static void calculateDeviceCount(int timeAvailable, int totalDevices) {
        // Each device takes 4 hours to test
        int timePerDevice = 4;

        // If the available time is less than 4 hours, print "Invalid Input"
        if (timeAvailable < timePerDevice) {
            System.out.println("Invalid Input");
            return;
        }

        // Calculate the number of devices that can be tested
        int devicesTested = timeAvailable / timePerDevice;

        // Calculate the remaining devices
        int remainingDevices = totalDevices - devicesTested;

        // Ensure remaining devices cannot be negative
        if (remainingDevices < 0) {
            remainingDevices = 0;
        }

        // Output the result
        System.out.println(devicesTested);
        System.out.println(remainingDevices);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the available time
        System.out.print("Enter the available time (in hours): ");
        int timeAvailable = scanner.nextInt();

        // Input the total number of devices to be tested
        System.out.print("Enter the total number of devices: ");
        int totalDevices = scanner.nextInt();

        // Call the function to calculate the number of devices and remaining devices
        calculateDeviceCount(timeAvailable, totalDevices);

        scanner.close();
    }
}
