package pl.edu.agh.dp;

public interface Receiver {
    void openFile();
    void writeFile();
    void closeFile();
}

class UnixReceiver implements Receiver {
    @Override
    public void openFile() {
        System.out.println("Unix: open file");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix: write file");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix: Close file");
    }
}

class WinReceiver implements Receiver {
    @Override
    public void openFile() {
        System.out.println("Win: open file");
    }

    @Override
    public void writeFile() {
        System.out.println("Win: write file");
    }

    @Override
    public void closeFile() {
        System.out.println("Win: Close file");
    }
}
