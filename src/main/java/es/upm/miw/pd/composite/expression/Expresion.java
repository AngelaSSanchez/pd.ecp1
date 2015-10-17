package es.upm.miw.pd.composite.expression;

public abstract class Expresion {

	public abstract void add(Expresion exp);
	
	public abstract void remove(Expresion exp);
	
	public abstract boolean isComposite();
	
	public abstract int operate();
	
	public abstract String toString();
}
