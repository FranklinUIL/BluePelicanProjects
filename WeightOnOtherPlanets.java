import java.awt.SystemTray;
import java.util.Scanner;

public class WeightOnOtherPlanets {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your weight on Earth?");
		double weight = scan.nextDouble();
		System.out.println("Choose a Planet:");
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		System.out.println("\n Selection? ");
		int choice = scan.nextInt();
		switch (choice){
		case 1:
			System.out.println("Your weight on Voltar would be "+(weight*.091));
			break;
		case 2:
			System.out.println("Your weight on Krypton would be "+(weight*.720));
			break;
		case 3:
			System.out.println("Your weight on Voltar would be "+(weight*.865));
			break;
		case 4:
			System.out.println("Your weight on Voltar would be "+(weight*4.612));
			break;
		default:
			System.out.println("Incorrect Input");
		}

	}
}
