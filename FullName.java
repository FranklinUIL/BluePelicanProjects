import java.io.*;
import java.util.Scanner;



public class FullName {
	
	public static void main (String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.print("What is your first name?_");
			String firstName = scan.next();
			System.out.print("What is your last name?_");
			String lastName = scan.next();
			System.out.println("Your full name is " + firstName +" "+ lastName);
	}
}
