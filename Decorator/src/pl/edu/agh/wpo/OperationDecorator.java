package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public abstract class OperationDecorator implements Number {

    protected Number number;

    public OperationDecorator(Number number) {
        this.number = number;
    }
}
