
public class Casa_Nova extends Casa{
	float adcional;
	
	Casa_Nova(float adcional, float preco, String endereco) {
		this.adcional = adcional;
		super.preco = preco;
		super.endereco = endereco;
		
	}
		
	float imprimir() {
		return super.preco * this.adcional;
	}
	
	String imprimir_endereco() {
		 return endereco;
	}
}
