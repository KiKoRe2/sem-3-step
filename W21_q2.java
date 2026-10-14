// Solution for: CSV Student Record Parser
import java.util.*; public class W21_q2 {public static void main(String[]z){Scanner s=new Scanner(System.in);String[] p=s.nextLine().split(",",-1);if(p.length!=3){System.out.println("Invalid Record");return;}System.out.println("Name: "+p[0].trim()+" | Roll No: "+p[1].trim()+" | Dept: "+p[2].trim());}}
