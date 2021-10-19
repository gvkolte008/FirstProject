import java.util.Scanner;
public class Employee {

Double sal;
String  name,grade;

public void setEmployee() {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter salary :");
	sal=scan.nextDouble();
	System.out.println("Enter name :");
	name=scan.next();
	System.out.println("Enter Grade :");
	grade=scan.next();	
}
public void incrementCal() {
	
switch (grade.toUpperCase()) {

case "SR": sal=sal+(sal*20/100);
break;
case "JR": sal=sal+(sal*10/100);
break;
default:
	sal=sal;	
}
System.out.println(sal);
}
public void display() {
	
System.out.println("Employee Details  "+ this.name  + "Salary is :" +this.sal + " Grade is :" +this.grade);
}
}
	
	