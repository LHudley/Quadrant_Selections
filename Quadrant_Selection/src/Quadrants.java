import java.util.Scanner;

public class Quadrants {

	public static void main(String[] args) {

		int x, y;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your X corrdinate: ");
		x = input.nextInt();
		
		System.out.println("Enter your Y coordinate: ");
		y = input.nextInt();
		
		if (x > 0 && y > 0 ) {
				System.out.println("Your coordinates are located in quadrant 1 ");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Your coordinates are located in quadrant 2 ");
		}
		
		else if (x < 0 && y < 0) {
			System.out.println("Your coordinates are located in quadrant 3 ");
		}
		
		else {
			System.out.println("Your coordinates are located in quadrant 4 ");

		}
	
	}

}
