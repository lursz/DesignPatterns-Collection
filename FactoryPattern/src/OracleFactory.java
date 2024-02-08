/**
 * Created by rafal on 15.12.2017.
 */
public class OracleFactory extends DatabaseFactory {
    @Override
    public Database create() {
        return new Oracle();
    }
}
