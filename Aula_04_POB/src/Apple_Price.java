import java.util.Scanner;
public class Apple_Price {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual � o pre�o das ma��s?");
		float price = input.nextFloat();
		System.out.println("Quantas ma��s s�o?");
		float quant = input.nextFloat();
		
		float res = quant * price;
		System.out.println("O valor final ser�: R$:" + res);
	}

}
