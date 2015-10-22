package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends ComandoAbstracto {

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Total";
	}
	
	@Override
	public void execute(){
		IO.getIO().println(this.getCalculator().getTotal());
	}

}
