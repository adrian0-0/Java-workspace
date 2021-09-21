
public class Verificar_tamanho_triangulo {
	
	public static void main (String[]args) {
		byte lado1 = 10; byte lado2 = 25; byte lado3 = 12;
		if (lado1+lado2 < lado3 || lado1+lado3 < lado2 || lado3+lado2 < lado1) {
			System.out.println("Triângulo invalido");
		}	else {
			System.out.println("Triângulo valido");
		}
	}

}
