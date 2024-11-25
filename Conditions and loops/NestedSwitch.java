import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();
        switch (empId) {
            case 1:
                switch (department) {
                    case "HR":
                        System.out.println("HR Manager");
                        break;
                    case "IT":
                        System.out.println("IT Manager");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 2:
                switch (department) {
                    case "HR":
                        System.out.println("HR Associate");
                        break;
                    case "IT":
                        System.out.println("IT Associate");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            default:
                System.out.println("Invalid employee ID");
                break;
        }
        sc.close();
    }
}
