import java.util.Scanner;
public class Elegiblidade_de_votar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Qual sua idade: ");
		byte idade = input.nextByte();
		
		if (idade < 16) {
			System.out.println("O voto n�o � eleg�vel");
		}
		else if (idade >= 16 && idade <= 18 || idade >= 70) {
			System.out.println("O voto � opcional");
		}
		else {
			System.out.println("O voto � eleg�vel");
		}
	}

}
