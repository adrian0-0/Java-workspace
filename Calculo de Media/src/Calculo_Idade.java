import java.util.Scanner;
public class Calculo_Idade {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o ana que você nasceu");
		int nasc = input.nextInt();
		int idade = 2021 - nasc;
		
		if (idade > 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é de menor");
		}
		
	}
	
}
