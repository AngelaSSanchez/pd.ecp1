package es.upm.miw.pd.composite.expression;

public abstract class Operacion extends Expresion{
	
	protected Expresion exp1, exp2;
	
	public Operacion(Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public String getOperador(){
		return getOperador();
	}
	
	public String toString(){
		return "("+this.exp1.toString()+ getOperador() +this.exp2.toString()+")";
	}
}
