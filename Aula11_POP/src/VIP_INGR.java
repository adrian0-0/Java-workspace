import java.util.Scanner;

public class VIP_INGR extends Ingressos_INGR {

	VIP_INGR(int num_camarote, String evento_local, String evento_nome, int valor_ingresso) {
		super.num_camarote = num_camarote;
		super.evento_local = evento_local;
		super.evento_nome = evento_nome;
		super.valor_ingresso = valor_ingresso;
		
	}
	
	static void confirmar() {
		System.out.println("A Festa se trata de um Open Bar?\n1 - � Open Bar\n2 - N�o � Open Bar");
		Scanner input = new Scanner(System.in);
		byte open_bar = input.nextByte();
		
		if (open_bar == 1) {
			System.out.println("A Festa � Open Bar, ser� no cabare numero: 11");

		} else {
			System.out.println("A Festa n�o � Open Bar");
		}
	}
	
	void imprimir() {
		System.out.println("A festa ser� no local: " + evento_local + "\nNome da Festa: " + evento_nome +"\nValor do Ingresso: R$" + valor_ingresso);
	}
}
