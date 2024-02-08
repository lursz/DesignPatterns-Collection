package pl.edu.agh.wpo.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rafal on 14.10.2016.
 */
public class ButtonObserver implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("MVC test hello"))
            System.out.println("Button observer 1");
        else
            System.out.println("Button observer 2");
    }

}
