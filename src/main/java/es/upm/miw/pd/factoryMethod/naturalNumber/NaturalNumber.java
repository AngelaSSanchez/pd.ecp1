package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {
	
	private int value;
	
	private String[] textValue;

	public NaturalNumber(int value){
		this.setValue(value);
	}
	
    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void add(int value) {
        this.setValue(this.value + value);
    }
   
    public String[] getTextValues(){
    	return this.getTextValues();
    }
    
    public void setTextValues(){
    	this.textValue = this.getTextValues();
    }
        
    public String getTextValue() {
        if (this.value < this.textValue.length) {
            return this.textValue[this.value];
        } else {
            return "???";
        }
    }
}
