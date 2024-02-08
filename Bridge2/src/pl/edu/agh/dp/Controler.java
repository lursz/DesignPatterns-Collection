package pl.edu.agh.dp;

public abstract class Controler {

    protected Sensor sensor;

    public Controler(Sensor sensor) {
        this.sensor = sensor;
    }

    public abstract void printTemp();
}

class ESP32 extends Controler {
    public ESP32(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void printTemp() {
        System.out.println("ESP32->" + this.sensor.getName() + " temp:" + this.sensor.getTemp());
    }
}

class STM32F413 extends Controler {
    public STM32F413(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void printTemp() {
        System.out.println("STM32F413->" + this.sensor.getName() + " temp:" + this.sensor.getTemp());
    }
}
