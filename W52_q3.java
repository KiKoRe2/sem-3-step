// Solution for: Top Performer Tracker
import java.util.*; public class W52_q3 {static String findMinMaxSpread(int[] a){int min=a[0],max=a[0];for(int x:a){min=Math.min(min,x);max=Math.max(max,x);}return "Min: "+min+", Max: "+max+", Spread: "+(max-min);}public static void main(String[]z){System.out.println(findMinMaxSpread(new int[]{40,70,55,90}));}}
