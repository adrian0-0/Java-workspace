import java.util.Random;
public class Cara_ou_Coroa {

	public static void main (String []args) {
		Random n_aleatorio = new Random();
		int gerador = n_aleatorio.nextInt(10);
		
		if (gerador % 2 == 0) {
			System.out.println("Par ou Coroa");
		
		} else {
			System.out.println("Impar ou cara");
		}
	}
}
