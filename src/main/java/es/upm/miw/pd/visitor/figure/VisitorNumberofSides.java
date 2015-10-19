package es.upm.miw.pd.visitor.figure;

public class VisitorNumberofSides extends Visitor{

	private double numofsides = 0;
	
	@Override
	public void visitCircle(Circle circle) {
		this.numofsides = Double.POSITIVE_INFINITY;
	}

	@Override
	public void visitSquare(Square square) {
		this.numofsides = 4;
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.numofsides = 3;
	}

	public double getNumofSides(){
		return this.numofsides;
	}

}
