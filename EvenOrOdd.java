import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter and integer: ");
		int i = scan.nextInt();
		int j=i;
		while(j > 1){
			j -= 2;
		}
		
		if(j==0)
			System.out.println("The integer "+i+" is even.");
		
		else if(j==1)
			System.out.println("The integer "+i+" is odd.");
		
		else
			System.out.println("Well... crap.");
	}
}
