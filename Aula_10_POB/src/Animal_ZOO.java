
public class Animal_ZOO {
	String nome;
	byte num_patas;
	String habitat;
	String animal_class;
	
	public static void main(String[]args) {
		Mamifero_ZOO m = new Mamifero_ZOO();
		m.nome = "Leão";
		m.habitat = "Selva";
		m.num_patas = 4;
		m.animal_class = "Mamifero";
		m.Mamifero();
		
		Peixe_ZOO p = new Peixe_ZOO();
		p.nome = "Peixe ";
		p.habitat = "mar";
		p.Peixe();
		

	}
}
