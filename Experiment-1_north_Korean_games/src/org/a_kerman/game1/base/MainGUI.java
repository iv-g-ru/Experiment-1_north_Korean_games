package org.a_kerman.game1.base;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author iv-g-ru
 */
public class MainGUI {

    public MainGUI() {
        Frame frame = new Frame("01");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
            }
        });
        frame.setVisible(true);
    }

}
