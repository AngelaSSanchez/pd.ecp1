package es.upm.miw.pd.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.setSide(side);
    }

    public double getSide(){
    	return this.side;
    }
    
    public void setSide(double side){
    	this.side = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSquare(this);
	}

}
