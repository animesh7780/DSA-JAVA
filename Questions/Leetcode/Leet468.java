public class Leet468 {
    public static void main(String[] args) {
        String ip = "172.16.254.1";
        Leet468 obj = new Leet468();
        System.out.println(obj.validIPAddress(ip));
    }

    public String validIPAddress(String queryIP) {
        if (queryIP.matches(
                "^([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\.([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\.([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\.([01]?\\d?\\d|2[0-4]\\d|25[0-5])$"))
            return "IPv4";
        if (queryIP.matches("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$"))
            return "IPv6";
        return "Neither";
    }
}
