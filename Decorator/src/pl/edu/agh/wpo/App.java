package pl.edu.agh.wpo;

/**
 * Created by rafal on 11.11.2022.
 */
public class App {

    public static void main(String[] args) {

        Number result = new SqrtDecorator(
                            new AdditionDecorator(
                                new DivisionDecorator(
                                        new DoubleNumber(4),
                                        new DoubleNumber(2)),
                                new DoubleNumber(3)));

        System.out.println(result.getValue());
    }
}
