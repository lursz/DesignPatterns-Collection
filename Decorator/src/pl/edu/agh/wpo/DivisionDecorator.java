package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public class DivisionDecorator extends OperationDecorator {

    private Number numberToDiv;

    public DivisionDecorator(Number number, Number numberToDiv) {
        super(number);
        this.numberToDiv = numberToDiv;
    }

    public double getValue() {
        return number.getValue() / numberToDiv.getValue();
    }
}