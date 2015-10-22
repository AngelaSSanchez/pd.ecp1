package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends ComandoAbstracto {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Restar";
	}
	
	@Override
	public void execute(){
		int numero = (int) IO.getIO().readInt();
		this.getCalculator().subtract(numero);
	}

}
