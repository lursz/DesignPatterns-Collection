package pl.edu.agh.wpo.mvc;

import pl.edu.agh.wpo.mvc.controller.Controller;
import pl.edu.agh.wpo.mvc.model.Model;
import pl.edu.agh.wpo.mvc.view.View;

import javax.swing.*;

/**
 * Created by rafal on 14.10.2016.
 */
public class AppMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runapp();
            }
        });
    }

    public static void runapp() {
        Model model = new Model();

        View view = new View(model);

        Controller controller = new Controller(model, view);

    }

}
