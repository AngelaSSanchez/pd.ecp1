package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public void visitador1() {
        VisitorArea v1 = new VisitorArea();
        for (Figure figure : figures) {
        	figure.accept(v1);
        }
    }
    
    public void visitador2(){
    	VisitorNumberofSides v2 = new VisitorNumberofSides();
    	for (Figure figure : figures) {
    		figure.accept(v2);
    	}
    }

    public static void main(String[] args) {
        IO.getIO().addView(new FiguresManager());
    }

}
