import java.util.Scanner;

public class Verificador_de_Divisibilidade {
		
	public static void main(String[] args) {
			int a = 14;
			int b = 3;
			int res = a/b;
			
			if (a % b == 0) {
				System.out.println("É divisivel, resultado: " + res);
				
			} else {
				System.out.println("Não é divisível");
			
			} 
		}
}
