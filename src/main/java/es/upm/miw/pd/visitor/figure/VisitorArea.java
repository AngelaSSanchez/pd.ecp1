package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends Visitor{

	private double area = 0.0;
	
	@Override
	public void visitCircle(Circle circle) {
		this.area = Math.PI * circle.getRadius() * circle.getRadius();
	}

	@Override
	public void visitSquare(Square square) {
		this.area = square.getSide() * square.getSide();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.area = triangle.getBase() * triangle.getHeight() * 0.5;
	}
	
	public double getArea(){
		return this.area;
	}

}
