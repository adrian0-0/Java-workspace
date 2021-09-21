import java.util.Arrays;
import java.util.Scanner;
public class Leitor_de_Algoritmo {
	
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho da array: ");
		int tam = 22^10;
		int[] array = new int[tam];
		
		
		for (int n = 0; n < tam; n++) {
			System.out.println("Digite um numero: ");
			array[n] = input.nextInt();	
			if (array[n] == 0) {
				System.out.println(Arrays.toString(array));
				Arrays.sort(array);
				System.out.println("O maior número digitado foi: " + array[array.length-1]);
			
			}	else {
				
			}
		}		


	}
}
