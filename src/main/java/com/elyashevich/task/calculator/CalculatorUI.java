package com.elyashevich.task.calculator;

import javax.swing.*;
import java.util.List;

public class CalculatorUI extends Button {

    private static final String FONT_NAME = "Comic Sans MS";
    private static final String TITLE = "Calculator";
    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 600;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 60;

    private final TextField text = new TextField();
    int[] columns = {MARGIN_X, MARGIN_X + 90, MARGIN_X + 90 * 2, MARGIN_X + 90 * 3, MARGIN_X + 90 * 4};
    int[] rows = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 100 + 80, MARGIN_Y + 100 + 80 * 2, MARGIN_Y + 100 + 80 * 3, MARGIN_Y + 100 + 80 * 4};
    public final JTextField textField = text.initTextField(columns, rows);
    private final InitButtons btn = new InitButtons();
    private final JFrame window;

    public CalculatorUI() {
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
