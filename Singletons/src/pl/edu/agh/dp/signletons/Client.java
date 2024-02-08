package pl.edu.agh.dp.signletons;

public class Client implements ServiceSetter {

    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    @Override
    public void setService(Service service) {
        this.service = service;
    }
}
