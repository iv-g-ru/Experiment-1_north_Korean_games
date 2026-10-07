package org.a_kerman.game1;

import org.a_kerman.game1.GUI.MainGUI;

/**
 * запуск, и передача управления всем компонентам
 *
 * @author iv-g-ru.ru
 */
public class Main {

    public static void main(String[] args) {
        MainGUI mgui = new MainGUI();
        mgui.getGUIthread().start();
    }

}
