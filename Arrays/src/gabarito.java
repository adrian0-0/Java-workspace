
public class gabarito {
	
	public static void main (String[]args) {
		final int tam = 7;
		byte nota = 0;
		
		char[] prova = {'a','b','a','c','b','a','d'};
		char[] aluno_respostas = new char [tam];
		aluno_respostas[0] = 'a'; aluno_respostas[1] = 'b'; aluno_respostas[2] = 'c'; aluno_respostas[3] = 'd'; aluno_respostas[4] = 'b'; aluno_respostas[5] = 'd'; aluno_respostas[6] = 'a';

		for (int i = 0; i<tam; i++ ) {
			System.out.println("A resposta da alternativa " + i + " é: " + prova[i] + " | Você marcou nessa alternativa " + aluno_respostas[i]);
			if (prova[i] == aluno_respostas[i]) {
				nota ++;
				System.out.println("Alternativa " + i + " está correta");
			
			} else {
				System.out.println("Alternativa " + i + " está errada");
			}
		}	
		System.out.println("\nSua nota final foi: " + nota);
		
		
	}
}
