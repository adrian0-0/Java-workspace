import java.util.Scanner;
public class Elementos_Operacionais {

	public static void main(String[] args) {
		System.out.println("Esse programa realiza multi-operações com X, Y e Z\n");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de X");
		short x = input.nextShort();
		System.out.println("Digite o valor de Y");
		short y = input.nextShort();
		System.out.println("Digite o valor de Z");
		short z = input.nextShort();		
		System.out.println("Pressione 'a' para exibir a soma de três números\n" + "Pressione 'b' para soma de X com a subtração entre Y e Z\n" + "Pressione 'c' para a multiplicação de Y com a soma de Z e X\n" + "Pressione 'd' para resultado de Z módulo de Y\n" + "Pressione 'e' para A soma entre o resultado da multiplicação de X e Y com o resultado"
				+ " da subtração de Y e Z\n" + "Ou para realizar todas as operações descritas pressione qualquer tecla");
		
		Scanner input_string = new Scanner(System.in);
		String tecla = input_string.nextLine();
		System.out.println(Elementos_Operacionais_Function.operacoes(x,y,z,tecla));

	}

}
