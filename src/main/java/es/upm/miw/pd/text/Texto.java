package es.upm.miw.pd.text;

public class Texto extends Object{
	
	private String texto;
	
	public Texto(){
		super();
	}
	
	@Override
	public void add(Componente h) throws UnsupportedOperationException{
		if (h.isComposite()){
			this.object.add(h);
		} else {
			throw new UnsupportedOperationException("Acción no permitida");
		}
	}
	
	public void remove(Componente h){
		if (h.isComposite()){
			this.object.remove(h);
		}
	}

	@Override
	public String dibujar(boolean b) {
		this.texto ="";
		for (Componente componente : object){
			this.texto += componente.dibujar(b);
		}
		return this.texto + "---o---\n";
	}

	@Override
	public boolean isComposite() {
		return true;
	}

}
