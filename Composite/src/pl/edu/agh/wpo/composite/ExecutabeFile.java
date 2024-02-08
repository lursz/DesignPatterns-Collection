package pl.edu.agh.wpo.composite;

import pl.edu.agh.wpo.composite.File;

public class ExecutabeFile implements File {

    private String name;

    public ExecutabeFile(String name) {
        this.name = name;
    }

    @Override
    public void showFile() {
        System.out.println("Exe: " + this.name);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFile(File file) {
        throw new UnsupportedOperationException();
    }
}
