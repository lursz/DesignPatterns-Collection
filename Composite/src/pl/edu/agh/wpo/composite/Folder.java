package pl.edu.agh.wpo.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File {
    private String name;
    private String owner;

    private List<File> files = new ArrayList<>();

    public Folder(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void showFile() {
        System.out.println("Folder name, owner: " + this.name + ",: " + this.owner);
        for(File file: files) {
            file.showFile();
        }
    }

    @Override
    public void addFile(File file) {
        this.files.add(file);
    }

    @Override
    public void removeFile(File file) {
        this.files.remove(file);
    }
}
