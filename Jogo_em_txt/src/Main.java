import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sint�ticos, uma cria��o da humanidade, Helena, uma jovem garota, sendo filha de pais cientistas que trabalhavam para a grande organiza��o chamada Instituto conviveu com diversos deles a sua vida\ninteira, eles n�o passavam de maquinas segundo a todos que trabalhavam naquele local, maquinas frias controladas por intelig�ncias artificiais que se desenvolviam sozinhas. Por ironia do destino\n"
        		+ "Helena foi diagnosticada com uma severa doen�a que logo destruiria seus �rg�os, ent�o para n�o perder a filha, os pais de helena substitu�ram v�rias partes de as filhas por maquinas para a salvar,\nassim helena acabou sendo considerada uma dos Sint�ticos e vivendo em meio aos outros dentro do instituto.\n"
        		+ "\nCom tudo isso em meio a sua vida, helena sentiu na pele o que todas aquelas �pessoas� sentiam, que come�ou a considerar como semelhantes, ent�o viveu planejando o dia em que iria fugir de l� e ser\nlivre."
        		+ "Ap�s muitos anos de planejamento, helena fugiu, encontrando no mundo exterior a ajuda da Ferrovia, um grupo que tinha ideais contr�rios ao Instituto, composto por diversos humanos e sint�ticos,\nque teriam se tornado algo al�m de uma m�quina, mas um ser pensante e com sentimentos.\n"
        		+ "\nPor�m com essa fuga, os pais de Helena foram sentenciados pelo Instituto, pela cria��o e fornecimento de informa��o privada a uma, agora considerada, rebelde. Com isso Helena, junto da Ferrovia, est� a caminho do Instituto para trazer liberdade para seus pais e todos os Sint�ticos poss�veis...");
        System.out.println("Personagem Controlave Helena");
        Scanner input = new Scanner (System.in);
        String inventario[] = new String[10];
        String acesso_rapido[] = new String[2];
        
        int ivnt = 1;
        do {
            System.out.println("Acesse seu inventario pressionando: i");
            String acessar_iventario = input.nextLine();
            
            if (acessar_iventario.equalsIgnoreCase("i")) {
            	System.out.println(Arrays.toString(inventario).replace("null", "Espa�o Vazio"));
            	ivnt -= 1;
            	
            }	else {
            	System.out.println("Aperte a tecla 'i'");
            	
            }
            } while(ivnt == 1);
        
        
        System.out.println("\nDescri��o de cenario: Voc� est� na institui��o medica deitado na cama de um quarto, seus pais est�o ao seu lado\n\nA��es:\n\n1/Levantar da cama\n2/Interagir com seus pais\n3/Fingir que ainda est� dormindo");
        int acao = input.nextInt();
        Acao_1(acao);
       

        System.out.println("\nObjetivo: Voc� t�m de sair da institui��o, sem que seus pais ou os funcionarios da institui��o te descubram");
        System.out.println("O doutor chama seus pais para conversar fora do seu quarto, o que voc� faz?\n1 - Se esconde de baixo da cama\n2 - Tenta entrar no tubulo de ventila��o no teto de seu quarto\n3 - Espera seus pais voltarem");

        
    }
         
    static void Acao_1(int acao) {
    	if (acao == 1) {
        	System.out.println("Voc� levanta da cama");
        	
    	}	else if (acao == 2) {
        	System.out.println("Voc� conversa com seus pais");
        	
    	}	else if (acao == 3) {
        	System.out.println("Seus pais pucham sua bocheca, percebendo que voc� esta fingindo dormir");
        	
    	}	else {
        	System.out.println("Selecione uma das a��es: 1/2/3");

    	}
    	
    }
}
