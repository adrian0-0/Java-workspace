import java.util.Scanner;
import java.util.Random;
public class Dice_Roll {
	
	public static void main (String []args) {
		double n1 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantas faces têm o dado: ");
		double dice = input.nextDouble();
		
		
		double res = 1 + Math.random() * (dice - n1);
		double info = Math.round(res);
		System.out.println("Seu dado caio em: " + info);
	}
}
