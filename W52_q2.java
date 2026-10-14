// Solution for: Duplicate Player Pick Checker
import java.util.*; public class W52_q2 {static String findDuplicatePick(String[] a){for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i].equals(a[j]))return "Duplicate Found: "+a[i];return "No duplicate picks";}public static void main(String[]z){System.out.println(findDuplicatePick(new String[]{"A","B","A"}));}}
