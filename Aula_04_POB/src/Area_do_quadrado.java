import java.util.Scanner;
public class Area_do_quadrado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a base em cm do quadrado?");
		byte base = input.nextByte();
		System.out.println("Qual a  altura em cm do quadrado?");
		byte altura = input.nextByte();
		
		int res = altura*base; 
		System.out.println("A Área do quadrado em cm é: " + res + "cm");
	}
}
