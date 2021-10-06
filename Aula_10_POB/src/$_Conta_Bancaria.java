import java.util.Scanner;
abstract class $_Conta_Bancaria  {
	Scanner input = new Scanner(System.in);
	String nome;
	int saldo;
	
	public static void main(String[] args) {
		$_ContaPoupança poup = new $_ContaPoupança();
		poup.inicio();
		
	}
	
 	
	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
}
