import java.util.Scanner;

public class Calculo_de_Soma_Fun��o {
	
	static int soma (int n1, int n2){
		int s = n1 + n2;	
		return s;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Fa�a uma soma: ");
		int sm = soma(input.nextInt(), input.nextInt());
		System.out.println("A soma � igual a: " + sm);
	}

}
