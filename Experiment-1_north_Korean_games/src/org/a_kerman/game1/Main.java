package org.a_kerman.game1;

import org.a_kerman.game1.GUI.MainGUI;
import org.a_kerman.game1.base.DeltaTime;

/**
 * ������, � �������� ���������� ���� �����������
 *
 * @author iv-g-ru.ru
 */
public class Main {

    public static void main(String[] args) {
        DeltaTime.UpdateTime();
        System.out.println(DeltaTime.dt); // можешь потом удалить, это для проверки дельта тайм
        MainGUI mgui = new MainGUI();
        mgui.getGUIthread().start();
    }

}
