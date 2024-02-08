package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public class AdditionDecorator extends OperationDecorator {

    private Number numberToAdd;

    public AdditionDecorator(Number number, Number numberToAdd) {
        super(number);
        this.numberToAdd = numberToAdd;
    }

    public double getValue() {
        return number.getValue() + numberToAdd.getValue();
    }


}
