/**
 * Created by rafal on 20.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        Database oracle = new OracleDatabase(new OracleFactory());
        oracle.execute();
    }
}
