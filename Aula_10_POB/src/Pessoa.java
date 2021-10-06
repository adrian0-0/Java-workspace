
public class Pessoa {
	String name;
	int idade;
	float peso;
	int altura;
	
	public void tamanho_pessoa() {
		System.out.println("Altura: " + this.altura +"/nPeso: " + this.peso);
	}
	
	public static void main(String[]args) {
		Funcionario f = new Funcionario();
		f.bonus = 10f;
		f.idade = 70;
		f.salario = 1200;
		f.bonus_salario = f.salario + (f.bonus*f.idade);
		f.bonus_salario_idade();
		
		Cliente c = new Cliente();
		c.NF = 1213534146;
		c.name = "Alberto ";
		c.verificar_NF();
	}
}
