// Solution for: Reverse Customer Name
import java.util.*;
public class W11_q5 { static String reverseCustomerName(String x){return new StringBuilder(x).reverse().toString();} public static void main(String[] a){Scanner s=new Scanner(System.in);String n=s.nextLine();System.out.println("Original Name: "+n);System.out.println("Reversed Name: "+reverseCustomerName(n));}}
