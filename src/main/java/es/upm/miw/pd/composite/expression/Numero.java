package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion{

	private int numero;

	public Numero(int numero){
		this.numero = numero;
	}
	
	@Override
	public void add(Expresion exp) {
		throw new UnsupportedOperationException("Operación no permitida");
	}

	@Override
	public void remove(Expresion exp) {
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public int operate() {
		return this.numero;
	}

	@Override
	public String toString() {
		return Integer.toString(this.numero);
	}
	
}
