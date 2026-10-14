// Solution for: Contains Duplicate
import java.util.*; public class W41_q3 {public static void main(String[]z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];boolean dup=false;for(int i=0;i<n;i++){a[i]=s.nextInt();for(int j=0;j<i;j++)if(a[j]==a[i])dup=true;}System.out.println(dup);}}
