import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sintéticos, uma criação da humanidade, Helena, uma jovem garota, sendo filha de pais cientistas que trabalhavam para a grande organização chamada Instituto conviveu com diversos deles a sua vida\ninteira, eles não passavam de maquinas segundo a todos que trabalhavam naquele local, maquinas frias controladas por inteligências artificiais que se desenvolviam sozinhas. Por ironia do destino\n"
        		+ "Helena foi diagnosticada com uma severa doença que logo destruiria seus órgãos, então para não perder a filha, os pais de helena substituíram várias partes de as filhas por maquinas para a salvar,\nassim helena acabou sendo considerada uma dos Sintéticos e vivendo em meio aos outros dentro do instituto.\n"
        		+ "\nCom tudo isso em meio a sua vida, helena sentiu na pele o que todas aquelas “pessoas” sentiam, que começou a considerar como semelhantes, então viveu planejando o dia em que iria fugir de lá e ser\nlivre."
        		+ "Após muitos anos de planejamento, helena fugiu, encontrando no mundo exterior a ajuda da Ferrovia, um grupo que tinha ideais contrários ao Instituto, composto por diversos humanos e sintéticos,\nque teriam se tornado algo além de uma máquina, mas um ser pensante e com sentimentos.\n"
        		+ "\nPorém com essa fuga, os pais de Helena foram sentenciados pelo Instituto, pela criação e fornecimento de informação privada a uma, agora considerada, rebelde. Com isso Helena, junto da Ferrovia, está a caminho do Instituto para trazer liberdade para seus pais e todos os Sintéticos possíveis...");
        System.out.println("Personagem Controlave Helena");
        Scanner input = new Scanner (System.in);
        String inventario[] = new String[10];
        String acesso_rapido[] = new String[2];
        
        int ivnt = 1;
        do {
            System.out.println("Acesse seu inventario pressionando: i");
            String acessar_iventario = input.nextLine();
            
            if (acessar_iventario.equalsIgnoreCase("i")) {
            	System.out.println(Arrays.toString(inventario).replace("null", "Espaço Vazio"));
            	ivnt -= 1;
            	
            }	else {
            	System.out.println("Aperte a tecla 'i'");
            	
            }
            } while(ivnt == 1);
        
        
        System.out.println("\nDescrição de cenario: Você está na instituição medica deitado na cama de um quarto, seus pais estão ao seu lado\n\nAções:\n\n1/Levantar da cama\n2/Interagir com seus pais\n3/Fingir que ainda está dormindo");
        int acao = input.nextInt();
        Acao_1(acao);
       

        System.out.println("\nObjetivo: Você têm de sair da instituição, sem que seus pais ou os funcionarios da instituição te descubram");
        System.out.println("O doutor chama seus pais para conversar fora do seu quarto, o que você faz?\n1 - Se esconde de baixo da cama\n2 - Tenta entrar no tubulo de ventilação no teto de seu quarto\n3 - Espera seus pais voltarem");

        
    }
         
    static void Acao_1(int acao) {
    	if (acao == 1) {
        	System.out.println("Você levanta da cama");
        	
    	}	else if (acao == 2) {
        	System.out.println("Você conversa com seus pais");
        	
    	}	else if (acao == 3) {
        	System.out.println("Seus pais pucham sua bocheca, percebendo que você esta fingindo dormir");
        	
    	}	else {
        	System.out.println("Selecione uma das ações: 1/2/3");

    	}
    	
    }
}
