public class ExcelSheet {
    public static void main(String[] args) {
        String columnTitle = "AA";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char currentChar = columnTitle.charAt(i);
            int value = currentChar - 'A' + 1;

            result = result * 26 + value;
        }

        return result;

    }
}
