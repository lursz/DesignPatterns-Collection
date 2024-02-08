package pl.edu.agh.dp.signletons;

public class AppLazy {
    public static void main(String[] args) {
        Lazy singleton = Lazy.getInstance();

        System.out.println(singleton);
        System.out.println(singleton.getData());
        System.out.println(singleton.getData());
        System.out.println(singleton.getData());

        Lazy secound = Lazy.getInstance();

        System.out.println(secound);
    }


}
