package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public class MultiDecorator extends OperationDecorator {

    private Number numberToMulti;

    public MultiDecorator(Number number, Number numberToMulti) {
        super(number);
        this.numberToMulti = numberToMulti;
    }

    public double getValue() {
        return number.getValue() * numberToMulti.getValue();
    }
}