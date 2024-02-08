package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public class SqrtDecorator extends OperationDecorator {

    public SqrtDecorator(Number number) {
        super(number);
    }

    public double getValue() {
        return Math.sqrt(number.getValue());
    }
}