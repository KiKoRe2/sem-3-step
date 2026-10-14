// Solution for: Product Inventory CSV Parser
import java.util.*; public class W22_q3 {public static void main(String[]z){Scanner s=new Scanner(System.in);String[] p=s.nextLine().split(",",-1);if(p.length!=3){System.out.println("Invalid Record");return;}System.out.printf("Product: %s | SKU: %s | Qty: %s%n",p[0].trim(),p[1].trim(),p[2].trim());}}
