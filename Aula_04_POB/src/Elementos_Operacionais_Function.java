public class Elementos_Operacionais_Function {
	
	public static Object operacoes (short x, short y, short z, String caractere) {
		int res, res2, res3, res4, res5, res6;
		String a = "a", b = "b", c = "c", d = "d", e = "e";
		
		if (a.equals(caractere)) {
			res = (x + y + z);
			System.out.println("O resultada da soma das 3 variaveis é: " + res);
			
		} else if (b.equals(caractere)) {
			res = x + (y-z);
			System.out.println("A soma de X com a subtração entre Y e Z é igual a: " + res);
		
		} else if (c.equals(caractere)) {
			res = y * (z + x);
			System.out.println("A multiplicação de Y com a soma de Z e X é igual a: " + res);
		
		} else if (d.equals(caractere)) {
			res = z%y;
			System.out.println("Resultado de Z módulo de Y: " + res);
		
		} else if (e.equals(caractere)) {
			res = (x*y); res2 = (y-z);
			System.out.println("A soma entre o resultado da multiplicação de X e Y é igual a: " + res + "\nJá o resultado da subtração de Y e Z é igual a: " + res2);
		
		} else {
			res = (x + y + z); res2 = x + (y-z); res3 = y * (z + x); res4 = z%y; res5 = (x*y); res6 = (y-z);
			System.out.println("a)" + res + "\nb)" + res2 + "\nc)" + res3 + "\nd)" + res4 + "\ne)x*y = " + res5 + " | y-z = " + res6);			
		
		}
		
		
		return "Programa Finalizado";
	} 
}
