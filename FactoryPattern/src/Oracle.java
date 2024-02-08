/**
 * Created by rafal on 15.12.2017.
 */
public class Oracle implements Database {
    @Override
    public void connect() {
        System.out.println("Oracle connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Oreacle execute");
    }

    @Override
    public void execute() {
        System.out.println("Oracle disconnect");
    }
}
