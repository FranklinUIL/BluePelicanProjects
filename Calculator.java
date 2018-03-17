import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Make your arithmetic selection from the choices below.\n");
		System.out.println("	Add: Addition");
		System.out.println("	Subtract: Subtraction");
		System.out.println("	Multiply: Multiplication");
		System.out.println("	Divde: Division\n");
		System.out.print("			Your Choice?_ ");
		
		String input = scan.nextLine();
		
		System.out.println("Enter first operand:");
		double op1 = scan.nextDouble();
		System.out.println("Enter second operand:");
		double op2 = scan.nextDouble();
		
		switch(input){
		case "Add":
		case "ADD":
		case "add":
			System.out.println(op1 + " plus "+ op2 + " = "+ (op1+op2));
			break;
		case "Subtract":
		case "SUBTRACT":
		case "subtract":
			System.out.println(op1 + " minus "+ op2 + " = "+ (op1-op2));
			break;
		case "Multiply":
		case "MULTIPLY":
		case "multiply":
			System.out.println(op1 + " times "+ op2 + " = "+ (op1*op2));
			break;
		case "Divide":
		case "DIVIDE":
		case "divide":
			System.out.println(op1 + " divided by "+ op2 + " = "+ (op1/op2));
			break;
		default:
			System.out.println("Invalid Arithemetic Selection.");
		}
	}
}
