package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class FiguresManagerTest {

    private List<Figure> figure = new ArrayList<Figure>();

    @Before
    public void ini() {
        figure.add(new Circle("Circulo",3.0));
        figure.add(new Square("Square",2.0));
        figure.add(new Triangle("Triangle",1.0,2.0));
    }

    @Test
    public void testVisitorArea() {
        VisitorArea v1 = new VisitorArea();
        for(Figure figures : figure){
        	figures.accept(v1);
        }
        assertEquals(33.2743339,v1.getArea(), 10);
    }

    @Test
    public void testVisitorNumofSides() {
        VisitorNumberofSides v2 = new VisitorNumberofSides();
        for(Figure figures : figure){
        	figures.accept(v2);
        }
        assertEquals(Double.POSITIVE_INFINITY,v2.getNumofSides(),10);
    }
    
    @Test
    public void testVisitorNumofSidesSquareTriangle() {
        VisitorNumberofSides v2 = new VisitorNumberofSides();
        for(int i = 1 ; i < figure.size(); i++){ 
        	figure.get(i).accept(v2);
        }
        assertEquals(7,v2.getNumofSides(), 10);
    }
}
