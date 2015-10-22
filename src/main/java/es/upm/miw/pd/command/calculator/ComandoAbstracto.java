package es.upm.miw.pd.command.calculator;

public abstract class ComandoAbstracto implements Comando{
	
	private Calculator calculator;
	
	public ComandoAbstracto(Calculator calculator){
		this.calculator = calculator;
	}
	
	public void execute(){}
	
}
