package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber{   
	
	private String[] textValue;
	
	public NaturalNumberEs(int value) {
        super(value);
		textValue = new String[] {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
		setTextValues(textValue);
	}

}
