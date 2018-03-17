import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter and integer: ");
		int i = scan.nextInt();

		if((i%2) == 0)
			System.out.println("The integer "+i+" is even.");
		
		else
			System.out.println("The integer "+i+" is odd.");
			
	}
}
