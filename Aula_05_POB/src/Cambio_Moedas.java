import java.util.Scanner;
public class Cambio_Moedas {

	public static void main(String[]args) {
		float array[] = {5.28f, 6.08f, 0.11f, 0.07f, 0.25f};
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a opção de moeda que irá efetuar o Câmbio:\n1: Dólar(Câmbio: R$:5,28) | 2: Euro(Câmbio: R$:6,08) | 3: Peso(Câmbio: R$:0,11) | 4: Rúpia(Câmbio: R$:0,07) | 5: Iene(Câmbio: R$:0,25)");
		byte opcoes = input.nextByte();
		System.out.println("Quanto irá cambiar em Real(R$) para a moeda escolhida: ");
		int money = input.nextInt();
		
		Object conversao = function(opcoes, money, array);
		float conversao1 = (((Number)conversao).intValue() + 10);
		
		System.out.println("O câmbio para a moeda escolhida será em R$:" + conversao1);
		
	}
	static Object function(byte options, int money, float array[]) {
		if (options == 1) {
			float res = (money*array[0]);
			return res;
		
		}	else if (options == 2) {
			float res = (money*array[1]);
			return res;
		
		}	else if (options == 3) {
			float res = (money*array[2]);
			return res;
		
		}	else if (options == 4) {
			float res = (money*array[3]);
			return res;
		
		}	else if (options == 5) {
			float res = (money*array[4]);
			return res;
		
		}	else  {
			return "Opção não encontrada";	
		}			
	}
}
