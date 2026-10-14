import java.util.Scanner;

public class W22_q4 {
    static String normalizeCode(String raw) {
        String value = raw.trim();
        if (value.length() < 3) return value.toUpperCase();
        return value.substring(0, 3).toUpperCase() + value.substring(3);
    }

    static String validateAndFormat(String code) {
        if (code.length() != 13) return "Invalid: wrong length";
        String publisher = code.substring(0, 3);
        String body = code.substring(3);
        for (int i = 0; i < publisher.length(); i++)
            if (!Character.isLetter(publisher.charAt(i))) return "Invalid: publisher code must be 3 letters";
        for (int i = 0; i < body.length(); i++)
            if (!Character.isDigit(body.charAt(i))) return "Invalid: body must contain digits";
        return "[" + publisher + "] YEAR: 20" + body.substring(0, 2)
                + " | CATALOG: " + body.substring(2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(validateAndFormat(normalizeCode(sc.nextLine())));
    }
}
