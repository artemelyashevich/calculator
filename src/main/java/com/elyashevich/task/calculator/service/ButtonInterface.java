package com.elyashevich.task.calculator.service;

import javax.swing.*;

public interface ButtonInterface {
    JButton create1Btn(int[] columns, int[] rows, JTextField textField);

    JButton create2Btn(int[] columns, int[] rows, JTextField textField);

    JButton create3Btn(int[] columns, int[] rows, JTextField textField);

    JButton create4Btn(int[] columns, int[] rows, JTextField textField);

    JButton create5Btn(int[] columns, int[] rows, JTextField textField);

    JButton create6Btn(int[] columns, int[] rows, JTextField textField);

    JButton create7Btn(int[] columns, int[] rows, JTextField textField);

    JButton create8Btn(int[] columns, int[] rows, JTextField textField);

    JButton create9Btn(int[] columns, int[] rows, JTextField textField);

    JButton create0Btn(int[] columns, int[] rows, JTextField textField);

    JButton createPointBtn(int[] columns, int[] rows, JTextField textField);

    JButton createEqualBtn(int[] columns, int[] rows, JTextField textField);

    JButton createPlusBtn(int[] columns, int[] rows, JTextField textField);

    JButton createMinusBtn(int[] columns, int[] rows, JTextField textField);

    JButton createClearBtn(int[] columns, int[] rows, JTextField textField);

    JButton createBackBtn(int[] columns, int[] rows, JTextField textField);

    JButton createDivideBtn(int[] columns, int[] rows, JTextField textField);

    JButton createMultiplyBtn(int[] columns, int[] rows, JTextField textField);
}
