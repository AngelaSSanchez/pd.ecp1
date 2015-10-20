package es.upm.miw.pd.text;

public class Caracter extends Componente{

	private char c;
	
	public Caracter(Character c){
		this.c = c;
	}
	
	public char getCaracter(){
		return this.c;
	}

	@Override
	public void add(Componente h) {
	}

	@Override
	public String dibujar(boolean b) {
		if (b){
			return this.toString().toUpperCase();					
		} 
		return this.toString();
	}

	public String toString() {
		return Character.toString(c);
	}

	@Override
	public boolean isComposite() {
		return false;
	}
}
