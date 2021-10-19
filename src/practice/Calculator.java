package practice;
import java.util.Scanner;
public class Calculator{
	Double i;
	Double j,z;
	String oper,cont="yes";
	
	
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	Calculator cal=new Calculator ();
	System.out.println("Please Enter First Number :");
	cal.i=scan.nextDouble();
	System.out.println("Please Enter Second Number :");
	cal.j=scan.nextDouble();
	System.out.println("Please Enter opeartion to perfrom as addition/substraction/multiplication :");
	cal.oper=scan.next();
	

	
	
	switch(cal.oper.toLowerCase()) {
	
	case "addition":
		cal.z=cal.i+cal.j;
		System.out.println("Addition is :"+cal.i +"+" +cal.j +"=" +cal.z);
		break;
	case "substraction":
		cal.z=cal.i-cal.j;
		System.out.println("Substraction is :"+cal.i +"-" +cal.j +"=" +cal.z);
		break;
	
	case "multiplication":
		cal.z=cal.i*cal.j;
		System.out.println("Multiplication is : "+cal.i +"*" +cal.j +"=" +cal.z);
		break;
	
	default:
		System.out.println("Kindly enter any of value: addiition,substraction,multiplication"); 
		
		
		
		
	}
	 

	System.out.println("Do you want to continue [yes/no]:  ");
	
	cal.cont=scan.next();	
	
	if(cal.cont=="yes") {
		
		switch(cal.oper.toLowerCase()) {
		
		case "addition":
			cal.z=cal.i+cal.j;
			System.out.println("Addition is :"+cal.i +"+" +cal.j +"=" +cal.z);
			break;
		case "substraction":
			cal.z=cal.i-cal.j;
			System.out.println("Substraction is :"+cal.i +"-" +cal.j +"=" +cal.z);
			break;
		
		case "multiplication":
			cal.z=cal.i*cal.j;
			System.out.println("Multiplication is : "+cal.i +"*" +cal.j +"=" +cal.z);
			break;
		
		default:
			System.out.println("Kindly enter any of value: addiition,substraction,multiplication"); 
			
			
			
			
		}
		
	}
	
	
	
	
	
	
}






}