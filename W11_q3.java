// Solution for: BMI Calculator
import java.util.*;
public class W11_q3 {
 static String status(double b){if(b<18.5)return "Underweight";if(b<25)return "Normal";if(b<30)return "Overweight";return "Obese";}
 public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++){double h=s.nextDouble(),w=s.nextDouble(),b=w/(h*h);System.out.printf("Person %d | Height: %.2f | Weight: %.2f | BMI: %.2f | Status: %s%n",i,h,w,b,status(b));}}
}
