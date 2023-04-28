package com.elyashevich.task.calculator.init;

import com.elyashevich.task.calculator.service.ButtonInterface;
import com.elyashevich.task.calculator.service.impl.Button;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitButtons {
    protected List<JButton> initButtons(int[] columns, int[] rows, JTextField textField) {
        ButtonInterface buttonInterface = new Button();

        List<JButton> buttons = new ArrayList<>();
        buttons.add(buttonInterface.createClearBtn(columns, rows, textField));
        buttons.add(buttonInterface.create9Btn(columns, rows, textField));
        buttons.add(buttonInterface.create8Btn(columns, rows, textField));
        buttons.add(buttonInterface.create7Btn(columns, rows, textField));
        buttons.add(buttonInterface.create6Btn(columns, rows, textField));
        buttons.add(buttonInterface.create5Btn(columns, rows, textField));
        buttons.add(buttonInterface.create4Btn(columns, rows, textField));
        buttons.add(buttonInterface.create3Btn(columns, rows, textField));
        buttons.add(buttonInterface.create2Btn(columns, rows, textField));
        buttons.add(buttonInterface.create1Btn(columns, rows, textField));
        buttons.add(buttonInterface.create0Btn(columns, rows, textField));
        buttons.add(buttonInterface.createPointBtn(columns, rows, textField));
        buttons.add(buttonInterface.createEqualBtn(columns, rows, textField));
        buttons.add(buttonInterface.createPlusBtn(columns, rows, textField));
        buttons.add(buttonInterface.createMinusBtn(columns, rows, textField));
        buttons.add(buttonInterface.createDivideBtn(columns, rows, textField));
        buttons.add(buttonInterface.createBackBtn(columns, rows, textField));
        buttons.add(buttonInterface.createMultiplyBtn(columns, rows, textField));
        return buttons;
    }
}
