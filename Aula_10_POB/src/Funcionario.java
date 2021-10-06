
public class Funcionario extends Pessoa {
	float salario;
	float bonus;
	float bonus_salario = salario + (bonus*idade);
	
	public void bonus_salario_idade() {
		System.out.println("Seu salario bonificado é R$:" + bonus_salario);
		
	}
}
