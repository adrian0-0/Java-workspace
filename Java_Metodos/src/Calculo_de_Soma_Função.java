import java.util.Scanner;

public class Calculo_de_Soma_Função {
	
	static int soma (int n1, int n2){
		int s = n1 + n2;	
		return s;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Faça uma soma: ");
		int sm = soma(input.nextInt(), input.nextInt());
		System.out.println("A soma é igual a: " + sm);
	}

}
