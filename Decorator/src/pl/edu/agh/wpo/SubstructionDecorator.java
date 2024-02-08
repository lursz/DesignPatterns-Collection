package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public class SubstructionDecorator extends OperationDecorator {

    private Number numberToSub;

    public SubstructionDecorator(Number number, Number numberToSub) {
        super(number);
        this.numberToSub = numberToSub;
    }

    public double getValue() {
        return number.getValue() - numberToSub.getValue();
    }
}