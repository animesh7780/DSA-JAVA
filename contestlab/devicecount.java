import java.util.Scanner;

public class devicecount {
    public static void calculateDeviceCount(int timeAvailable, int totalDevices) {

        int timePerDevice = 4;

        if (timeAvailable < timePerDevice) {
            System.out.println("Invalid Input");
            return;
        }

        int devicesTested = timeAvailable / timePerDevice;

        int remainingDevices = totalDevices - devicesTested;

        if (remainingDevices < 0) {
            remainingDevices = 0;
        }

        System.out.println(devicesTested);
        System.out.println(remainingDevices);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the available time (in hours): ");
        int timeAvailable = scanner.nextInt();

        System.out.print("Enter the total number of devices: ");
        int totalDevices = scanner.nextInt();

        calculateDeviceCount(timeAvailable, totalDevices);

        scanner.close();
    }
}
