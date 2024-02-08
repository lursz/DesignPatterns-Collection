package pl.edu.agh.wpo.composite;

public class AppMain {
    public static void main(String[] args) {
        File root = new Folder("root", "root");
        File file1 = new ExecutabeFile("file1");
        File file2 = new ExecutabeFile("file2");

        root.addFile(file1);
        root.addFile(file2);
        File home = new Folder("home", "mrowka");
        File file3 = new ExecutabeFile("file3");
        File file4 = new ExecutabeFile("file4");

        home.addFile(file3);
        home.addFile(file4);

        root.addFile(home);
        if (file1 instanceof Folder)
            file1.addFile(file2);

        root.showFile();
    }
}
