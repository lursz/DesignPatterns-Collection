package pl.edu.agh.dp.builder;

interface QueryBuilder {
    void setCommand(String command);

    void setParam(String param);

    void addTable(String table);

    void addCondition(String condition);

    Query getQuery();
}
