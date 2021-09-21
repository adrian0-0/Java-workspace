import java.util.Scanner;
public class Ingressos {
	
	public static void main (String[]args) {
		System.out.println("INGRESSOS\n1 | Deadpool\n2 | Vingadores Guerra Civil\n3 | Batman vs Superman");
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= 5; i+=0) {
			byte filme = input.nextByte();
			if (filme == 1) {
				System.out.println("Escolha a sessão: \n1 | Deadpoll 21:30");
				byte sessao = input.nextByte();
				
				if (sessao == 1) {
					System.out.println("Ingresso Comprado " + i + " de 5");
					i++;
					
				}	else {
					System.out.println("Sessão não encontrado");

				}
			} else if (filme == 2) {
				System.out.println("Escolha a sessão: \n1 | Vingadores Guerra Civil 17:30\n2 | Vingadores Guerra Civil 20:15");
				byte sessao = input.nextByte();
				
				if (sessao == 1) {
					System.out.println("Ingresso Comprado " + i + " de 5");
					i++;

				}	else if (sessao == 2) {
					System.out.println("Ingresso Comprado " + i + " de 5");
					i++;

				}	else {
					System.out.println("Sessão não encontrado");

				}
				
			} else if (filme == 3) {
				System.out.println("Escolha a sessão: \n1 | Batman vs Superman Civil 14:30\n2 | Batman vs Superman 17:15");
				byte sessao = input.nextByte();
				
				if (sessao == 1) {
					System.out.println("Ingresso Comprado " + i + " de 5");
					i++;

				}	else if (sessao == 2) {
					System.out.println("Ingresso Comprado " + i + " de 5");
					i++;

				}	else {
					System.out.println("Sessão não encontrado");

				}
				
			} else {
				System.out.println("Filme não encontrado");

			}
		}
	}
}
