package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {

	public abstract void visitCircle(Figure f);
	
	public abstract void visitSquare(Figure f);
	
	public abstract void visitTriangle(Figure f);
	
}
