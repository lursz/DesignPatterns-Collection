package pl.edu.agh.wpo.mvc.view;

import pl.edu.agh.wpo.mvc.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rafal on 14.10.2016.
 */
public class View extends JFrame {
    private Model model;
    private JButton btHello;
    private JButton btBye;

    public View(Model model) throws HeadlessException {
        super("WPO MVC demo");
        this.model = model;

        btHello = new JButton("Hello");
        btBye = new JButton("Good bye");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx=1;
        gc.gridy=1;
        gc.weightx=1;
        gc.weighty=1;
        gc.fill=GridBagConstraints.NONE;

        add(btHello, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx=1;
        gc.gridy=2;
        gc.weightx=1;
        gc.weighty=1;
        gc.fill=GridBagConstraints.NONE;

        add(btBye);

        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.toString();
            }
        });

        btBye.addActionListener(e -> {
            System.out.println("Observer 2");
        });
    }
}

