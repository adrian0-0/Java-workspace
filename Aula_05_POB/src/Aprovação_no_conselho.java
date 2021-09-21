import java.util.Scanner;
public class Aprovação_no_conselho {

	public static void main (String[] args) {
		short total_votos = 513;
		int lei_aprovada = (total_votos/3);
		System.out.println("Digite o número de votos a favor da lei: ");
		
		Scanner input = new Scanner(System.in);
		short votos = input.nextShort();
		
		if (lei_aprovada > votos) {
			System.out.println("Lei não aprovada");
			
		} else {
			System.out.println("Lei aprovada");

		}
		
	}
}
