package es.upm.miw.pd.composite.expression;

public class Sumar extends Operacion{
	
	private String operador;
	
	public Sumar(Expresion exp1, Expresion exp2){
		super(exp1, exp2);
		this.operador = "+";
	}
	
	public String getOperador(){
		return this.operador;
	}

	@Override
	public int operar() {
		return this.exp1.operar() + this.exp2.operar();
	}

}
