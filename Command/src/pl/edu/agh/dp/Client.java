package pl.edu.agh.dp;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Receiver receiver = new UnixReceiver();
        Command open = new OpenFileCommand(receiver);
        Command write = new WriteFileCommand(receiver);
        Command close = new CloseFileCommand(receiver);

        Invoker invoker = new Invoker();
        ServerThread server = new ServerThread(invoker);
        server.start();
        System.in.read();
        invoker.addCommand(open);
        System.in.read();
        invoker.addCommand(open);
        System.in.read();
        invoker.addCommand(write);
        System.in.read();
        invoker.addCommand(close);
        System.in.read();
        System.out.println("Finish");
        server.stopServer();
    }
}
