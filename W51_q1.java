// Solution for: Hackathon Score Curve Booster
import java.util.*; public class W51_q1 {static void curveScores(int[] scores,int bonus){for(int i=0;i<scores.length;i++)scores[i]+=bonus;}public static void main(String[]z){int[] a={70,85,60};curveScores(a,10);System.out.println(Arrays.toString(a));}}
