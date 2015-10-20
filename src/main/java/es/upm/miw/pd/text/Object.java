package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Object extends Componente{
	
	protected List<Componente> object;
	
	public Object(){
		this.object = new ArrayList<Componente>();
	}
		
	public String dibujar(boolean b){
		return dibujar(b);
	}
	
	public void remove(Componente h){};
	
	public void add(Componente h){
		throw new UnsupportedOperationException("Acción no permitida");
	};
}
