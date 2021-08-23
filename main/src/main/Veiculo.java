package main;

public class Veiculo {
	String marca;
	String modelo;
	int velocidade = 0;
	
	public void acelerar(int velocidade) {
		this.velocidade = velocidade; // this.velocidade se refere ao dado de fora, já velocidade ao atributo declarado na função
	}
	
	public void frear() {
		this.velocidade = 0;
	}
	public int obterVelocidade(){
		return this.velocidade;
	}
	
}
