import java.util.Scanner;
public class Calculo_de_Elevação {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Faça seu calculo de uma potência aqui.\n" + "Digite o numero da base do produto:");
		Double numero_base = input.nextDouble();
		System.out.println("Digite o produto do número: ");
		Double produto = input.nextDouble();
		
		double res = Math.pow(numero_base,  produto);
		System.out.println("O resultado é: " + res);
		
		
	}

}
