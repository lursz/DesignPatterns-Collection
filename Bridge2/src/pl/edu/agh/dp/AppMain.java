package pl.edu.agh.dp;

public class AppMain {

    public static void main(String[] args) {
        Controler cpu = new ESP32(new BMP280());
        cpu.printTemp();
    }
}
