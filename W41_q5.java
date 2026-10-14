// Solution for: Array Problem 5
import java.util.*; public class W41_q5 {public static void main(String[]z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int max=a[0],min=a[0];for(int x:a){max=Math.max(max,x);min=Math.min(min,x);}System.out.println("Min: "+min+" Max: "+max);}}
