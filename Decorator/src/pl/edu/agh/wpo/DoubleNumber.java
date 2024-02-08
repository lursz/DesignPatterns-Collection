package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2016.
 */
public class DoubleNumber implements Number {
    private double value = 0;

    public DoubleNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
