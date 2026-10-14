// Solution for: Employee Creation Counter
public class W62_q5 {static class Employee{static int count=0;String name;Employee(String n){name=n;count++;}}public static void main(String[]z){new Employee("Asha");new Employee("Ravi");new Employee("Neha");System.out.println("3 Employee objects created");System.out.println("Employees on record: "+Employee.count);}}
