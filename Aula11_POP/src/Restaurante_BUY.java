
public class Restaurante_BUY {
	
	void realizarPedido(String comida, int quantidade,String bebida) {
		System.out.println("Voc� pediu um prato de " + comida + ", sendo acompanhado por " + quantidade + " bebidas de " + bebida);
	}
	
	public static void main(String[] args) {
		Restaurante_BUY pedir = new Restaurante_BUY();
		pedir.realizarPedido("P�o", 2, "Heineken");
	}

}
