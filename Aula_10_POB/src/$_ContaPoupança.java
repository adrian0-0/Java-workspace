public class $_ContaPoupan�a extends $_Conta_Bancaria {
	int sacar;
	int depositar;
	
	void inicio() {
		System.out.println("Qual seu nome?");
		this.nome = input.nextLine();
		System.out.println("Qual seu saldo?");
		this.saldo = input.nextInt();

	}
	
	void opcoes() {
		
		do {
			System.out.println("1 - Voc� deseja sacar\n2 - Voc� deseja Depositar\n3 - Para fechar o programa ");
			byte solicitar_saque = input.nextByte();
			
			if (solicitar_saque == 1) {
				System.out.println("Quanto ir� sacar?" + this.nome);
				this.sacar = input.nextInt();
				saldo -= this.sacar;
				System.out.println("Seu novo saldo � R$: " + this.saldo);


			} else if (solicitar_saque == 2) {
				System.out.println("Quanto ir� depositar?");
				this.depositar = input.nextInt();
				this.saldo += this.depositar;
				System.out.println("Seu novo saldo � R$: " + this.saldo);
				
			}  else if (solicitar_saque == 3) {
				System.out.println("Fim");
				this.i++;
				break;
			} else {
				System.out.println("Op��o n�o encontrada digite novamente!");

			}
		} while (this.i == 0);
	}
}
