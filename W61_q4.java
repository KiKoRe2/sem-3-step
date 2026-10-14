// Solution for: Library ID Card Management
public class W61_q4 {static class IdCard{String name;int booksIssued;IdCard(String n,int b){name=n;booksIssued=b;}}public static void main(String[]z){IdCard a=new IdCard("Ravi",2),b=a;IdCard c=new IdCard("Ravi",2);System.out.println(a==b);System.out.println(a==c);}}
