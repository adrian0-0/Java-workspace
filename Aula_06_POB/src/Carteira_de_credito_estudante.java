import java.util.Scanner;
public class Carteira_de_credito_estudante {
	
	public static void main (String[]args) {
		float saldo_inicial = 5.00f;
		Scanner input = new Scanner(System.in);
		byte option = 0;
		byte passagem = 0;
		float saldo_total = saldo_inicial;
		float maiobao = 2.90f; float alemanha = 2.50f; float ribamar = 3.10f;
		
		do {
			System.out.println("Digite 1 | Para adcionar credito\nDigite 2 | Pagar passagem\nDigite 3 | Mostrar saldo\nPressione qualquer tecla para finalizar o programa");
			option = input.nextByte();
			if (option == 1) {
				System.out.println("Quanto você vai adcionar ao seu saldo: ");
				float add_saldo = input.nextFloat();
				saldo_total += add_saldo;
			
			}	else if (option == 2) {
				do {
					System.out.println("Qual passagem de ônibus você vai pagar (1 - Maiobão – 2.90, 2 - Alemanha – 2.50, 3 - Ribamar – 3.10)");
					passagem = input.nextByte();
					if (passagem == 1) {
						saldo_total -= maiobao;
						
					}	else if (passagem == 2) {
						saldo_total -= alemanha;
						
					}	else if (passagem == 3) {
						saldo_total -= ribamar;
						
					}	else {
						System.out.println("Não encontrado");

					}
				} while(passagem == 1 || passagem == 2 || passagem == 3);
			}
			else if (option == 3) {
				System.out.println("Seu saldo é R$:" + saldo_total);
			}
		
		} while (option == 1 || option == 2 || option == 3);
		System.out.println("Programa finalizado");
	}
}