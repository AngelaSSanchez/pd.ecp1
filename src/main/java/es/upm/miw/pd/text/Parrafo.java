package es.upm.miw.pd.text;

public class Parrafo extends Object{
	
	private String parrafo;

	public Parrafo(){
		super();
	}
	
	@Override
	public void add(Componente h) throws UnsupportedOperationException{
		if (!h.isComposite()) {
			this.object.add(h);
		} 
		else {
			throw new UnsupportedOperationException("Acción no permitida");
		}
	}
	
	public void remove(Componente h){
		if (!h.isComposite()){
			this.object.remove(h);
		}
	}

	@Override
	public String dibujar(boolean b) {
		this.parrafo = "";
		for (Componente componente : object){
			this.parrafo += componente.dibujar(b);
		}
		return this.parrafo+"\n";
	}

	@Override
	public boolean isComposite() {
		return true;
	}

}
