
public class Cliente extends Pessoa{
	int NF;
	
	public void verificar_NF() {
		System.out.println("Senhor " + this.name + "sua nota fiscal é: " + this.NF);
		
	}
}
