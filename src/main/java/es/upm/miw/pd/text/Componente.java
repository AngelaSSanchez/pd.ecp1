package es.upm.miw.pd.text;

public abstract class Componente {

	public abstract void add(Componente h) throws UnsupportedOperationException;

	public abstract String dibujar(boolean b);
	
	public abstract boolean isComposite();

}
