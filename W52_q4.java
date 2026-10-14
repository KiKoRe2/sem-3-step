// Solution for: Match Day Grid Analyzer
import java.util.*; public class W52_q4 {public static void main(String[]z){int[][] scores={{20,30,40},{45,55,60},{10,20,25}};for(int i=0;i<scores.length;i++){int sum=0;for(int x:scores[i])sum+=x;double avg=(double)sum/scores[i].length;System.out.printf("Match %d: total=%d average=%.2f %s%n",i+1,sum,avg,avg>=40?"Power Surge":"Normal");}}}
