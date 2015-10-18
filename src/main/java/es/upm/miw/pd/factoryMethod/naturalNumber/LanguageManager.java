package es.upm.miw.pd.factoryMethod.naturalNumber;

public class LanguageManager {

	private NaturalNumber naturalnumber;
	private NaturalNumberCreator naturalnumbercreator;	
	
	public void createNaturalNumber(int value){
		this.naturalnumber = this.naturalnumbercreator.createNaturalNumber(value);
	}
	
	public void setNaturalNumber(NaturalNumberCreator naturalnumbercreator){
		this.naturalnumbercreator = naturalnumbercreator;
	}
	
	public NaturalNumber getNaturalNumber(){
		return this.naturalnumber;
	}
}
