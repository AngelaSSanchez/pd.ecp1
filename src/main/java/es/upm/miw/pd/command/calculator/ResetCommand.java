package es.upm.miw.pd.command.calculator;

public class ResetCommand extends ComandoAbstracto {

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Reset";
	}
	
	@Override
	public void execute(){
		this.getCalculator().reset();
	}

}
