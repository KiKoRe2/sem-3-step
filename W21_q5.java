import java.util.Scanner;

public class W21_q5 {
    static String normalizeReference(String raw) {
        String value = raw.trim();
        if (value.length() < 3) return value.toUpperCase();
        return value.substring(0, 3).toUpperCase() + value.substring(3);
    }

    static String validateAndFormat(String reference) {
        if (reference.length() != 14) return "Invalid: wrong length";
        String bank = reference.substring(0, 3);
        String body = reference.substring(3);
        for (int i = 0; i < bank.length(); i++)
            if (!Character.isLetter(bank.charAt(i))) return "Invalid: bank code must be 3 letters";
        for (int i = 0; i < body.length(); i++)
            if (!Character.isDigit(body.charAt(i))) return "Invalid: sequence must contain digits";
        String date = body.substring(0, 6);
        String sequence = body.substring(6);
        return "[" + bank + "] DATE: " + date.substring(0, 2) + "/" + date.substring(2, 4)
                + "/20" + date.substring(4, 6) + " | SEQ: " + sequence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String raw = sc.nextLine();
        System.out.println(validateAndFormat(normalizeReference(raw)));
    }
}
