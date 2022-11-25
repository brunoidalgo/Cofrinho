package uninter;

public class Real extends Moeda {

	public Real(double valorInicial) {
		this.valor =  valorInicial;
	}
	
	public void info() {
		System.out.println("Real - " + valor);
		
		
	}

	public double converter() {
		return this.valor;
		
	}
	
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		
		Real objetoDeReal = (Real) objeto;
		
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
		
		return true;
	}
	

}
