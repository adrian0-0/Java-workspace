import java.util.Scanner;
public class Aumento_Salarial {
	
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Selecione uma dessas categorias: A, B, C, D, E, F");
		String categoria = input.nextLine();
		System.out.println("Digite seu salario: ");
		int salario = input.nextInt();
		
		
		byte run = 0;
		while (run == 0) {
			if (categoria.toUpperCase().equals("A") || categoria.toUpperCase().equals("B") || categoria.toUpperCase().equals("C") || categoria.toUpperCase().equals("D") || categoria.toUpperCase().equals("E") || categoria.toUpperCase().equals("F") ) {
				Object salario_com_add = adcional(salario);
				float salario_aprimorado = (((Number)salario_com_add).intValue());
				Object categ = aumento(categoria, salario_aprimorado);
				System.out.println("Seu salario sem alterações é R$:" + salario + "\nA analise de sua renda confirmou que você tera um adcional no seu salario, sendo totalizado o salario com o adcional em: R$" + salario_aprimorado + "\nAlém disso como você se encaixa na categoria " + categoria + " seu salario tera um aumento compulsorio ao seu adcional que totalizara em um valor final de:  R$:" + categ);
				run = 1;
			}	else {
				System.out.println("Selecione uma dessas categorias: A, B, C, D, E, F");
				System.out.printf("Categoria não encontrada digite uma das categorias acima!");
				categoria = input.nextLine();
			}
		}	
	}
	
	static float adcional(int salario) {
		if (salario > 800)  {
			float salario_add = (salario + 100);
			return salario_add;
		
		}	else if (salario >= 600 && salario <=800) {
			float salario_add = (salario + 150);
			return salario_add;
		}	else {
			float salario_add = (salario + 200);
			return salario_add;
		}	}

	static Object aumento(String categoria, float salario_aprimorado) {
		if (categoria.toUpperCase().equals("A") || categoria.toUpperCase().equals("F")) {
			float salario_ratio = (salario_aprimorado*1.10f);
			return salario_ratio;
		
		}	else if (categoria.toUpperCase().equals("B") || categoria.toUpperCase().equals("E")) {
			float salario_ratio = (salario_aprimorado*1.15f);
			return salario_ratio;
		
		}	else {
			float salario_ratio = (salario_aprimorado*1.20f);
			return salario_ratio;
		
			
		}	
	}
}
