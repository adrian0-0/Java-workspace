
public class Restaurante_BUY {
	
	void realizarPedido(String comida, int quantidade,String bebida) {
		System.out.println("Você pediu um prato de " + comida + ", sendo acompanhado por " + quantidade + " bebidas de " + bebida);
	}
	
	public static void main(String[] args) {
		Restaurante_BUY pedir = new Restaurante_BUY();
		pedir.realizarPedido("Pão", 2, "Heineken");
	}

}
