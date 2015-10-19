package es.upm.miw.pd.visitor.figure;

public class Triangle extends Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.setBase(base);;
        this.setHeight(height);
    }

    public double getBase(){
    	return this.base;
    }
    
    public double getHeight(){
    	return this.height;
    }
    
    public void setBase(double base){
    	this.base = base;
    }
    
    public void setHeight(double height){
    	this.height = height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTriangle(this);
	}

}
