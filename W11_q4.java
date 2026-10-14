// Solution for: First Non-Repeating Character
import java.util.*;
public class W11_q4 { public static void main(String[] a){Scanner s=new Scanner(System.in);String x=s.nextLine();for(int i=0;i<x.length();i++){char c=x.charAt(i);if(x.indexOf(c)==x.lastIndexOf(c)){System.out.println(c);return;}}System.out.println("No Non-Repeating Character Found");}}
