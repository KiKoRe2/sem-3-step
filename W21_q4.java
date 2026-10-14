// Solution for: Masked Phone Number Formatter
import java.util.*; public class W21_q4 {public static void main(String[]z){Scanner s=new Scanner(System.in);String p=s.nextLine().trim();if(!p.matches("\\d{10}")){System.out.println("Invalid phone number");return;}System.out.println("XXXXXX-"+p.substring(6));}}
