import java.util.Scanner;
public class Media_Nota {
	
	public static void main (String[] args) {
		int res = 0;
		short quant_notas = 3;
		Scanner input = new Scanner(System.in);
		byte[] array = new byte[quant_notas];

		for (int i = 0; i < 3; i++) {
			array[i] = input.nextByte();
			res =  res + array[i];
			
		}
		System.out.println("Sua m�dia �: " + res/quant_notas);
		
		if (res < 5) {
			System.out.println("Voc� est� reprovado");
		
		}	else if (res >= 5 || res <= 7) {
			System.out.println("Voc� est� em recupera��o");
		
		}	else {
			System.out.println("Voc� est� aprovado");
		}
	}
}
