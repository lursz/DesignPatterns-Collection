package pl.edu.agh.dp;

public class AppMain {

    public static void main(String[] args) {
        Controller controller = new ESP32(new TMP102());
        controller.printTemp();
    }
}
