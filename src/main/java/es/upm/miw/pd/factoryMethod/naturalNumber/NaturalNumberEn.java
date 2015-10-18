package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber{

	private String[] textValue;
	
	public NaturalNumberEn(int value) {
		super(value);
		textValue = new String[] {"zero", "one", "two", "three", "four", "five"};
		setTextValues(textValue);
	}

}
