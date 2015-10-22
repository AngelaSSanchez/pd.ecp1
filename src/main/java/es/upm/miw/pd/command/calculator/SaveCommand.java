package es.upm.miw.pd.command.calculator;

public class SaveCommand extends ComandoAbstracto{

	public SaveCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Salvar";
	}
	
	@Override
	public void execute(){
		this.getCalculator().save();
	}	

}
