package pl.edu.agh.dp.builder;

public class AppMain {
    public static void main(String[] args) {
        QueryBuilder builder = new OracleQueryBuilder();
        builder.setCommand("SELECT");
        builder.setParam("*");
        builder.addTable("STUDENTS");
        builder.addTable("SUBJECTS");
        builder.addCondition("WHERE mark > 2");

        Query query = builder.getQuery();
        System.out.println(query);
    }
}
