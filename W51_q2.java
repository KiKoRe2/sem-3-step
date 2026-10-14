// Solution for: Duplicate Team Name Finder
import java.util.*; public class W51_q2 {static String findDuplicateTeam(String[] a){for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i].equals(a[j]))return "Duplicate Found: "+a[i];return "No duplicates found";}public static void main(String[]z){System.out.println(findDuplicateTeam(new String[]{"ByteForce","CodeCrafters","ByteForce"}));}}
