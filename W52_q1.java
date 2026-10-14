// Solution for: Fantasy Team Score Multiplier
import java.util.*; public class W52_q1 {static void applyMultipliers(double[] s,int captain,int vice){s[captain]*=2;s[vice]*=1.5;}public static void main(String[]z){double[] a={40,55,30,62};applyMultipliers(a,1,3);System.out.println(Arrays.toString(a));}}
