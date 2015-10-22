package es.upm.miw.pd.command.calculator;

public class UndoCommand extends ComandoAbstracto{

	public UndoCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Deshacer";
	}
	
	@Override
	public void execute(){
		this.getCalculator().undo();
	}	

}
