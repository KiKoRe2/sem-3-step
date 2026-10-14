// Solution for: Traffic Light
public class W72_q4 {static class TrafficLight{private String color="RED";void next(){if(color.equals("RED"))color="GREEN";else if(color.equals("GREEN"))color="YELLOW";else color="RED";}String getColor(){return color;}}public static void main(String[]z){TrafficLight t=new TrafficLight();for(int i=0;i<4;i++){System.out.println(t.getColor());t.next();}}}
