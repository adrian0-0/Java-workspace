import java.util.Scanner;
public class Void {
	
	static void soma(int n1, int n2) {
		int s = n1 + n2;
		System.out.println("A soma � igual a: " + s);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Fa�a uma soma: ");
		
		soma(input.nextInt(), input.nextInt());
		//void tira a obriga��o de realizar o return de um valor

	}

}
