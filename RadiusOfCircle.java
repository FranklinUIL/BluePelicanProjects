import java.util.Scanner;

public class RadiusOfCircle {
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the area?_");
		double a = scan.nextDouble();
		System.out.println("Radius of your circle is "+ (Math.sqrt((a/Math.PI))));
	}
}
