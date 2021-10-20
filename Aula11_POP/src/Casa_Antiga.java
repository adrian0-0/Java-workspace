import java.util.Scanner;
public class Casa_Antiga extends Casa_Nova {
	
	Casa_Antiga(float adcional, float preco, String endereco) {
		super(adcional, preco, endereco);
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Onde você mora?");
		String localizacao = input.nextLine();
		
		Casa_Nova CC = new Casa_Nova(100f, 20f, localizacao);
		System.out.println("Seu endereço: " + CC.imprimir_endereco() + "\nPAGUE O ALUGUEL: R$:" + CC.imprimir());
		
	}
}
