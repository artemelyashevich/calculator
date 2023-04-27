package com.elyashevich.task.calculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitButtons extends Button {
    protected List<JButton> initButtons(int[] columns, int[] rows, JTextField textField) {
        List<JButton> buttons = new ArrayList<>();
        buttons.add(createClearBtn(columns, rows, textField));
        buttons.add(create7Btn(columns, rows, textField));
        buttons.add(create8Btn(columns, rows, textField));
        buttons.add(create9Btn(columns, rows, textField));
        buttons.add(create4Btn(columns, rows, textField));
        buttons.add(create5Btn(columns, rows, textField));
        buttons.add(create6Btn(columns, rows, textField));
        buttons.add(create1Btn(columns, rows, textField));
        buttons.add(create2Btn(columns, rows, textField));
        buttons.add(create3Btn(columns, rows, textField));
        buttons.add(create0Btn(columns, rows, textField));
        buttons.add(createPointBtn(columns, rows, textField));
        buttons.add(createEqualBtn(columns, rows, textField));
        buttons.add(createPlusBtn(columns, rows, textField));
        buttons.add(createMinusBtn(columns, rows, textField));
        buttons.add(createDivideBtn(columns, rows, textField));
        buttons.add(createBackBtn(columns, rows, textField));
        buttons.add(createMultiplyBtn(columns, rows, textField));
        return buttons;
    }
}
