// Solution for: Palindrome Checker
import java.util.*;
public class W11_q2 {
 static boolean iterative(String x){int i=0,j=x.length()-1;while(i<j)if(x.charAt(i++)!=x.charAt(j--))return false;return true;}
 static boolean recursive(String x){if(x.length()<2)return true;if(x.charAt(0)!=x.charAt(x.length()-1))return false;return recursive(x.substring(1,x.length()-1));}
 static boolean reversal(String x){char[] c=x.toCharArray();for(int i=0,j=c.length-1;i<j;i++,j--){char t=c[i];c[i]=c[j];c[j]=t;}return x.equals(new String(c));}
 public static void main(String[] a){Scanner s=new Scanner(System.in);String x=s.nextLine();System.out.println("Iterative: "+(iterative(x)?"Palindrome":"Not Palindrome")+" | Recursive: "+(recursive(x)?"Palindrome":"Not Palindrome")+" | Array Reversal: "+(reversal(x)?"Palindrome":"Not Palindrome"));}
}
