package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo veiculo1 = new Veiculo(); //new Veiculo() - construtor da classe
		//Veiculo - tipo do objeto
		//veiculo1 - nome do obejto
		
		System.out.println("Velocidade do veiculo " + veiculo1.obterVelocidade());
		veiculo1.acelerar(10);
		System.out.println("Velocidade atual: " + veiculo1.obterVelocidade());
		veiculo1.frear();
		System.out.println("Veiculo agora têm velocidade de: " + veiculo1.obterVelocidade());

	}

}
