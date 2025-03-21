public class Cond {
    public static void main(String[] args) {
        int salary = 90000;
        // if (salary > 10000) {
        // salary = salary + 2000;
        // } else {
        // salary = salary + 1000;
        // }
        // System.out.println(salary);

        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 50000) {
            salary += 10000;
        } else {
            salary += 1000;
        }
    }
}
