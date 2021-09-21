import java.util.Arrays;
import java.util.Scanner;

public class array_for {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		short list_numbers = input.nextShort(); 
		final short tam = list_numbers;
		
		int[] L1 = {0,1,3,4,5,6};
		byte[] array = new byte[4];
		byte[] array_tam = new byte[tam]; // tam ajuda a usar de condicionais através do lenght porque podese determinar o fim de um loop através de uma condicional
		array[0] = 26; array[1] = 17; array[2] = 74; array[3] = 45; 
		
		Arrays.sort(array);
		for (int n:array_tam) {
			System.out.println(n);
		}
		
		//Arrays.equals(null, null) --> compara dois arrays e retorna true or false
		//Arrays.fill(null,null) --> Preenche uma lista com um numero determinado 
	}
}
