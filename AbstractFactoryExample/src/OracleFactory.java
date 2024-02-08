/**
 * Created by rafal on 20.12.2017.
 */
public class OracleFactory implements DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement creteStatement() {
        return new OracleStatement();
    }
}
