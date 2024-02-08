package pl.edu.agh.dp;

public interface Command {
    void execute();
    void undo();
}

class OpenFileCommand implements Command {
    private Receiver fileSystem;

    public OpenFileCommand(Receiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.openFile();
    }

    @Override
    public void undo() {
        fileSystem.closeFile();
    }
}

class WriteFileCommand implements Command {
    private Receiver fileSystem;

    public WriteFileCommand(Receiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.writeFile();
    }

    @Override
    public void undo() {
        System.out.println("undo write");
    }
}

class CloseFileCommand implements Command {
    private Receiver fileSystem;

    public CloseFileCommand(Receiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.closeFile();
    }

    @Override
    public void undo() {
        fileSystem.openFile();
    }
}
