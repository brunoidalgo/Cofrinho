package uninter;

public class Dolar extends Moeda {

	public Dolar(double valorInicial) {
		this.valor =  valorInicial;
	}
	
	
	public void info() {
		System.out.println("Dólar - " + valor);
		
	}

	
	public double converter() {
		
		return this.valor * 5.36;
	}
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
	

}
