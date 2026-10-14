// Solution for: Exam Hall Ticket Reference Management
public class W62_q4 {static class HallTicket{String studentName;int seatNumber;HallTicket(String n,int s){studentName=n;seatNumber=s;}}public static void main(String[]z){HallTicket a=new HallTicket("Priya",101),b=a,c=new HallTicket("Priya",101);System.out.println(a==b);System.out.println(a==c);}}
