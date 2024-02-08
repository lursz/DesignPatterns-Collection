package pl.edu.agh.dp.builder;

public class OracleQueryBuilder implements QueryBuilder {

    private Query query = new OracleQuery();

    @Override
    public void setCommand(String command) {
        query.addElement(command);
    }

    @Override
    public void setParam(String param) {
        query.addElement(param);
    }

    @Override
    public void addTable(String table) {
        query.addElement(table);
    }

    @Override
    public void addCondition(String condition) {
        query.addElement(condition);
    }

    @Override
    public Query getQuery() {
        return query;
    }
}
