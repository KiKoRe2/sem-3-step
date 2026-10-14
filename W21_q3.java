// Solution for: File Extension Validator
import java.util.*; public class W21_q3 {public static void main(String[]z){Scanner s=new Scanner(System.in);String f=s.nextLine().trim();int i=f.lastIndexOf('.');String e=i<0?"":f.substring(i+1);System.out.println(Arrays.asList("pdf","docx","zip").contains(e.toLowerCase())?"Accepted":"Rejected — invalid file type");}}
