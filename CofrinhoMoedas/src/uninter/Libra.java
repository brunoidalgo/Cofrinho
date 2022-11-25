package uninter;

public class Libra extends Moeda {

	public Libra(double valorInicial) {
		this.valor =  valorInicial;
	}
	
	
	public void info() {
		System.out.println("Libra - " + valor);
		
	}

	
	public double converter() {
		
		return this.valor * 6.44;
	}
	
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		
		Libra objetoDeLibra = (Libra) objeto;
		
		
		if (this.valor != objetoDeLibra.valor) {
			return false;
		}
		
		return true;
	}
	

}
