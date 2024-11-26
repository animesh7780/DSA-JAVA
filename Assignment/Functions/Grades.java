import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        grade(marks);
        sc.close();
    }

    public static void grade(int marks) {
        if (marks > 90 && marks <= 100) {
            System.out.println("AA");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("AB");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("BB");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("BC");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("CD");
        } else if (marks > 40 && marks <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
