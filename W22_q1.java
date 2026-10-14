// Solution for: ATM PIN Length Validator
import java.util.*; public class W22_q1 {public static void main(String[]z){Scanner s=new Scanner(System.in);String p=s.nextLine().trim();System.out.println(p.matches("\\d{4}")?"PIN length OK.":"Invalid PIN — must be exactly 4 digits.");}}
