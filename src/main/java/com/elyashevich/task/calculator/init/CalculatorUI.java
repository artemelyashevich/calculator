package com.elyashevich.task.calculator.init;

import com.elyashevich.task.calculator.service.TextFieldInterface;
import com.elyashevich.task.calculator.service.impl.Button;
import com.elyashevich.task.calculator.service.impl.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.List;

public class CalculatorUI extends Button {

    private static final String TITLE = "Calculator";
    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 600;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 60;

    private final TextFieldInterface textFieldInterface = new TextField();
    int[] columns = {MARGIN_X, MARGIN_X + 90, MARGIN_X + 90 * 2, MARGIN_X + 90 * 3, MARGIN_X + 90 * 4};
    int[] rows = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 100 + 80, MARGIN_Y + 100 + 80 * 2, MARGIN_Y + 100 + 80 * 3, MARGIN_Y + 100 + 80 * 4};
    public final JTextField textField = textFieldInterface.initTextField(columns, rows);

    public CalculatorUI() {
        InitButtons btn = new InitButtons();
        JFrame window;
        window = new JFrame(TITLE);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocationRelativeTo(null);
        List<JButton> buttons = btn.initButtons(columns, rows, textField);
        for (JButton button : buttons) window.add(button);
        window.add(textField);
        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
