package es.upm.miw.pd.command.calculator;

public class MementoCalculator {

	int value;
	
	public MementoCalculator(int value){
		this.value = value;
	}
	
	public int getTotal(){
		return this.value;
	}
}
