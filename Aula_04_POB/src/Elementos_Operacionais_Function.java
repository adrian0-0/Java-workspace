public class Elementos_Operacionais_Function {
	
	public static Object operacoes (short x, short y, short z, String caractere) {
		int res, res2, res3, res4, res5, res6;
		String a = "a", b = "b", c = "c", d = "d", e = "e";
		
		if (a.equals(caractere)) {
			res = (x + y + z);
			System.out.println("O resultada da soma das 3 variaveis �: " + res);
			
		} else if (b.equals(caractere)) {
			res = x + (y-z);
			System.out.println("A soma de X com a subtra��o entre Y e Z � igual a: " + res);
		
		} else if (c.equals(caractere)) {
			res = y * (z + x);
			System.out.println("A multiplica��o de Y com a soma de Z e X � igual a: " + res);
		
		} else if (d.equals(caractere)) {
			res = z%y;
			System.out.println("Resultado de Z m�dulo de Y: " + res);
		
		} else if (e.equals(caractere)) {
			res = (x*y); res2 = (y-z);
			System.out.println("A soma entre o resultado da multiplica��o de X e Y � igual a: " + res + "\nJ� o resultado da subtra��o de Y e Z � igual a: " + res2);
		
		} else {
			res = (x + y + z); res2 = x + (y-z); res3 = y * (z + x); res4 = z%y; res5 = (x*y); res6 = (y-z);
			System.out.println("a)" + res + "\nb)" + res2 + "\nc)" + res3 + "\nd)" + res4 + "\ne)x*y = " + res5 + " | y-z = " + res6);			
		
		}
		
		
		return "Programa Finalizado";
	} 
}
