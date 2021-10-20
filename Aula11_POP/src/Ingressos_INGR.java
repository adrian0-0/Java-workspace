import java.util.Scanner;
public abstract class Ingressos_INGR {
	String evento_nome;
	String evento_local;
	int valor_ingresso;
	int num_camarote;
	
	abstract void imprimir();
	
	public static void main(String[]args) {
		VIP_INGR req = new VIP_INGR(11,"Shopping da Ilha", "BAILE FUNK DOS OTAKU", 120);
		req.confirmar();
		req.imprimir();
	}
}
