package pl.edu.agh.wpo.mvc.controller;

import pl.edu.agh.wpo.mvc.model.Model;
import pl.edu.agh.wpo.mvc.view.View;

/**
 * Created by rafal on 14.10.2016.
 */
public class Controller {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
