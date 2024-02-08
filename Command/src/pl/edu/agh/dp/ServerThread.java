package pl.edu.agh.dp;

public class ServerThread extends Thread {

    private Invoker invoker;

    private boolean isRunning = true;

    public ServerThread(Invoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void run() {
        while (isRunning) {
            invoker.executeCommand();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopServer() {
        isRunning= false;
    }
}
