package es.upm.miw.pd.command.calculator;

public class Calculator implements CalculatorMementable{
    private int total;
    MementoCalculator memento;

    public Calculator() {
        this.reset();
    }

    public int getTotal() {
        return total;
    }

    protected void setTotal(int total) {
        this.total = total;
    }

    public void add(int valor) {
        this.setTotal(this.total + valor);
    }

    public void subtract(int valor) {
        this.setTotal(this.total - valor);
    }

    public void reset() {
        this.setTotal(0);
    }
    
    @Override
    public void save() {
    	this.memento = new MementoCalculator(this.getTotal());
	}

    @Override
	public void undo() {
    	this.total = this.memento.getTotal();
	}


}
