// Solution for: Word Reversal Encoder
import java.util.*; public class W22_q2 {public static void main(String[]z){Scanner s=new Scanner(System.in);String[] w=s.nextLine().split(" ");for(int i=0;i<w.length;i++)w[i]=new StringBuilder(w[i]).reverse().toString();System.out.println(String.join(" ",w));}}
