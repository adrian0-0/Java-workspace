import java.util.Scanner;
public class Apple_Price {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é o preço das maçãs?");
		float price = input.nextFloat();
		System.out.println("Quantas maçãs são?");
		float quant = input.nextFloat();
		
		float res = quant * price;
		System.out.println("O valor final será: R$:" + res);
	}

}
