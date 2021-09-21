import java.util.Scanner;
public class Tranferencia_bancaria {
	
	public static void main(String[] args) {
	System.out.println("Quanto vai sacar: ");
		
	Scanner input = new Scanner(System.in);
	short dinheiro_em_conta = 50;
	short withdraw = input.nextShort();
	
	if (withdraw <= 50) {
		System.out.println("Transação sucedida de: " + withdraw); 
			
	} else {
		System.out.println("Transação negada saldo insuficiente");
	}
		
	}

}
