// Solution for: Vowel & Consonant Counter
import java.util.*; public class W21_q1 {public static void main(String[]z){Scanner s=new Scanner(System.in);String x=s.nextLine();int v=0,c=0;for(char ch:x.toLowerCase().toCharArray())if(Character.isLetter(ch)){if("aeiou".indexOf(ch)>=0)v++;else c++;}System.out.println("Vowels: "+v+" | Consonants: "+c);}}
