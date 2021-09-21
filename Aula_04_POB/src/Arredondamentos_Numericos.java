
public class Arredondamentos_Numericos {

	public static void main (String[] args) {
		
		double Arredondamento_para_cima = Math.ceil(10.4);
		double Arredondamento_para_baixo = Math.floor(10.4);
		double Arredondamento_aritmetico = Math.round(10.5);
		
		System.out.println("Os arredondamentos são: \nArredondamento para cima: " +  Arredondamento_para_cima + "\nArredondamento para baixo: " + Arredondamento_para_baixo + "\nArredondamento aritmetico: " + Arredondamento_aritmetico);
	}
}
