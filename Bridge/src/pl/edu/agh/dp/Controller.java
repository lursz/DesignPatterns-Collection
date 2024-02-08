package pl.edu.agh.dp;

public abstract class Controller {
    protected TempSensor tempSensor;

    public Controller(TempSensor tempSensor) {
        this.tempSensor = tempSensor;
    }

    public abstract void printTemp();
}



class ESP32 extends Controller {

    public ESP32(TempSensor tempSensor) {
        super(tempSensor);
    }

    @Override
    public void printTemp() {
        System.out.println("ESP32->" + this.tempSensor.getName() + " temp:" + this.tempSensor.getTemp());
    }
}

class STM32F413 extends Controller {

    public STM32F413(TempSensor tempSensor) {
        super(tempSensor);
    }

    @Override
    public void printTemp() {
        System.out.println("STM32F413->" + this.tempSensor.getName() + " temp:" + this.tempSensor.getTemp());
    }

}

