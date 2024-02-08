package pl.edu.agh.dp;

public class AppMain {
    public static void main(String[] args) {

        AirFieldFactory airFieldFactory = new AirFieldFactory();

        AirField balice = airFieldFactory.getAirField("BALICE", "CIVIL", "DESC");

        System.out.println(balice);

        balice = airFieldFactory.getAirField("BALICE", "CIVIL", "DESC");
    }
}
