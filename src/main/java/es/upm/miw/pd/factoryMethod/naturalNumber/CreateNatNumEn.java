package es.upm.miw.pd.factoryMethod.naturalNumber;

public class CreateNatNumEn extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEn(value);
	}

}
