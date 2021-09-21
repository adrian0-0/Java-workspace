import java.util.Scanner;
public class Area_do_Circulo {
	
	public static void main (String[]args ) {
		Scanner input = new Scanner(System.in);
		
		double raio = input.nextDouble();
		double potencia = Math.pow(raio, 2);
		double res = potencia*3.14;
		
		System.out.println("O raio do circulo é igual: " + res);
		
		
	}
	
}
