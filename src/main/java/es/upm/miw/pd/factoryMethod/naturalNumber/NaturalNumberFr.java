package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber{
	
	private String[] textValue;

	public NaturalNumberFr(int value) {
		super(value);
		textValue = new String[] {"zéro", "un", "deux", "trois", "quatre", "cinq"};
		setTextValues(textValue);
	}

}
