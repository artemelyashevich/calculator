package com.elyashevich.task.calculator;

import javax.swing.*;
import java.awt.*;

public class TextField {
    protected JTextField textField;
    private static final String FONT_NAME = "Sans Serif";

    public JTextField initTextField(int[] columns, int[] rows) {
        textField = new JTextField("");
        textField.setBounds(columns[0], rows[0], 350, 70);
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setFont(new Font(FONT_NAME, Font.PLAIN, 33));
        textField.setMargin(new Insets(0, 10, 0, 0));
        return textField;
    }
}