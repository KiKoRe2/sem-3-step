// Solution for: Rock-Paper-Scissors Game
import java.util.*;
public class W11_q1 {
 static String result(String p,String c){ p=p.toLowerCase(); c=c.toLowerCase(); if(p.equals(c))return "Draw"; if((p.equals("rock")&&c.equals("scissors"))||(p.equals("paper")&&c.equals("rock"))||(p.equals("scissors")&&c.equals("paper")))return "Player Wins"; return "Computer Wins"; }
 public static void main(String[] a){ Scanner s=new Scanner(System.in); int n=Integer.parseInt(s.nextLine().trim()),w=0,l=0,d=0; String[] m={"Rock","Paper","Scissors"}; Random r=new Random(); for(int i=1;i<=n;i++){String p=s.nextLine().trim(); String c=m[r.nextInt(3)]; String x=result(p,c); System.out.println("Round "+i+" | Player: "+p+" | Computer: "+c+" | "+x); if(x.equals("Player Wins"))w++;else if(x.equals("Computer Wins"))l++;else d++;} System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",w,l,d,n==0?0:100.0*w/n);}
}
