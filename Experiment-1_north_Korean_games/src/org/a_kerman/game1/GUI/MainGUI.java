package org.a_kerman.game1.GUI;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iv-g-ru
 */
public class MainGUI {

    private final Thread GUIthread;
    private boolean GUIthreadrun;

    public Thread getGUIthread() {
        return GUIthread;
    }

    public MainGUI() {
        Frame frame = new Frame("01");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setVisible(false);
                GUIthreadrun = false;
            }
        });
        frame.setVisible(true);
        this.GUIthread = new Thread(() -> {
            try {
                while (GUIthreadrun) {
                    EventQueue.invokeLater(() -> {
                        frame.repaint();
                    });
                    Thread.sleep(16);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                GUIthreadrun = false;
            }
        }, "GUIthread");
        GUIthreadrun = true;

    }

}
