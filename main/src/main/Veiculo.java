package main;

public class Veiculo {
	String marca;
	String modelo;
	int velocidade = 0;
	
	public void acelerar(int velocidade) {
		this.velocidade = velocidade; // this.velocidade se refere ao dado de fora, j� velocidade ao atributo declarado na fun��o
	}
	
	public void frear() {
		this.velocidade = 0;
	}
	public int obterVelocidade(){
		return this.velocidade;
	}
	
}
