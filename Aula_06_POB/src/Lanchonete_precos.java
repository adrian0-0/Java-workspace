import java.util.Scanner;
public class Lanchonete_precos {
	
	public static void main(String[]args) {
		System.out.println("Opção | Descrição | Preço(R$)\n 1 | Salgadinho | R$2.50\n 2 | Pizza (Brotinho) | R$3.00\n 3 | Refrigerante (Lata) | R$3.00\n 4 | Suco (Copo Grange) | R$1.50\n 5 | Pedir Conta |       ");
		
		Scanner input = new Scanner(System.in);
		byte opcao = 0;
		float money = 0f;
		do {
			opcao = input.nextByte();
			
			if (opcao == 1) {
				float salgadinho = 3.50f;
				money += salgadinho;
				
			}	else if (opcao == 2) {
				float pizza = 3.00f;
				money += pizza;
				
			}	else if (opcao == 3) {
				float refrigerante = 3.00f;
				money += refrigerante;
			
			}	else if (opcao == 4)  {
				float suco = 1.50f;
				money += suco;
			}
		} while(opcao != 5);
		
		System.out.println("O valor total da conta é R$: " + money);
	}
}
