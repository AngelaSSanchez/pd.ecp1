package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends ComandoAbstracto {

	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Sumar";
	}
	
	@Override
	public void execute(){
		int numero = (int) IO.getIO().readInt();
		this.getCalculator().add(numero);
	}

}
