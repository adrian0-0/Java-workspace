import java.util.Scanner;
public class Calculo_de_Eleva��o {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fa�a seu calculo de uma pot�ncia aqui.\n" + "Digite o numero da base do produto:");
		Double numero_base = input.nextDouble();
		System.out.println("Digite o produto do n�mero: ");
		Double produto = input.nextDouble();
		
		double res = Math.pow(numero_base,  produto);
		System.out.println("O resultado �: " + res);
		
		
	}

}
