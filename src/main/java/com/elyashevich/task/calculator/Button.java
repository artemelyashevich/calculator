package com.elyashevich.task.calculator;

import org.apache.commons.lang3.math.NumberUtils;

import javax.swing.*;
import java.awt.*;


public abstract class Button {
    protected JButton btn0;
    protected JButton btn1;
    protected JButton btn2;
    protected JButton btn3;
    protected JButton btn4;
    protected JButton btn5;
    protected JButton btn6;
    protected JButton btn7;
    protected JButton btn8;
    protected JButton btn9;
    protected JButton btnPoint;
    protected JButton btnClear;
    protected JButton btnEqual;
    protected JButton btnPlus;
    protected JButton btnMinus;
    protected JButton btnBack;
    protected JButton btnMultiply;
    protected JButton btnDivide;

    private char selectedOperator = ' ';
    private String firstNumber = "0";
    private String secondNumber = "0";
    private int position = 0;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    private static final String FONT_NAME = "Sens Serif";

    private JButton createButton(String label, int x, int y) {
        JButton btn = new JButton(label);
        btn.setBounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn.setFont(new Font(FONT_NAME, Font.PLAIN, 28));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setFocusable(false);
        return btn;
    }

    private boolean checkTextFieldLength(JTextField textField) {
        return textField.getText().length() < 18;
    }


    protected JButton create7Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn7 = createButton("7", columns[0], rows[2]);
        this.btn7.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "7");
            }
        });
        return this.btn7;
    }

    protected JButton create8Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn8 = createButton("8", columns[1], rows[2]);
        this.btn8.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "8");
            }
        });
        return this.btn8;
    }

    protected JButton create9Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn9 = createButton("9", columns[2], rows[2]);
        this.btn9.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "9");
            }
        });
        return this.btn9;
    }

    protected JButton create4Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn4 = createButton("4", columns[0], rows[3]);
        this.btn4.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "4");
            }
        });
        return this.btn4;
    }

    protected JButton create5Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn5 = createButton("5", columns[1], rows[3]);
        this.btn5.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "5");
            }
        });
        return this.btn5;
    }

    protected JButton create6Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn6 = createButton("6", columns[2], rows[3]);
        this.btn6.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "6");
            }
        });
        return this.btn6;
    }

    protected JButton create3Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn3 = createButton("3", columns[2], rows[4]);
        this.btn3.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "3");
            }
        });
        return this.btn3;
    }

    protected JButton create2Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn2 = createButton("2", columns[1], rows[4]);
        this.btn2.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "2");
            }
        });
        return this.btn2;
    }

    protected JButton create1Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn1 = createButton("1", columns[0], rows[4]);
        this.btn1.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "1");
            }
        });
        return this.btn1;
    }

    protected JButton create0Btn(int[] columns, int[] rows, JTextField textField) {
        this.btn0 = createButton("0", columns[1], rows[5]);
        this.btn0.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "0");
            }
        });
        return this.btn0;
    }

    protected JButton createPointBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnPoint = createButton(".", columns[0], rows[5]);
        this.btnPoint.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + ".");
            }
        });
        return this.btnPoint;
    }

    protected JButton createEqualBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnEqual = createButton("=", columns[2], rows[5]);
        this.btnEqual.setSize(2 * BUTTON_WIDTH + 10, BUTTON_HEIGHT);
        this.btnEqual.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                String str = textField.getText();
                for (int i = 0; i < str.length(); i++) {
                    String string = String.valueOf(str.charAt(i));
                    if (NumberUtils.isDigits(string)) {
                        this.firstNumber = this.firstNumber + string;
                    } else {
                        this.position = i;
                        break;
                    }
                }
                for (int i = position; i < str.length(); i++) {
                    String string = String.valueOf(str.charAt(i));
                    if (NumberUtils.isDigits(string)) {
                        this.secondNumber = this.secondNumber + string;
                    }
                }
                var answer = this.calculate(Double.parseDouble(this.firstNumber),
                        Double.parseDouble(this.secondNumber), this.selectedOperator);
                System.out.println(this.firstNumber + " " + this.selectedOperator + " " + this.secondNumber + " = " + answer);
                textField.setText(String.valueOf(answer));
            }
            this.secondNumber = "";
            this.firstNumber = "";
            this.selectedOperator = ' ';
        });
        return this.btnEqual;
    }

    protected JButton createPlusBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnPlus = createButton("+", columns[3], rows[3]);
        this.btnPlus.setSize(BUTTON_WIDTH, 2 * BUTTON_HEIGHT + 10);
        this.btnPlus.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "+");
                this.selectedOperator = '+';
            }
        });
        return this.btnPlus;
    }

    protected JButton createMinusBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnMinus = createButton("-", columns[3], rows[2]);
        this.btnMinus.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "-");
                this.selectedOperator = '-';
            }
        });
        return this.btnMinus;
    }

    protected JButton createClearBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnClear = createButton("C", columns[0], rows[1]);
        this.btnClear.addActionListener(event -> textField.setText(""));
        return this.btnClear;
    }

    protected JButton createBackBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnBack = createButton("<-", columns[1], rows[1]);
        this.btnBack.addActionListener(event -> textField.setText(textField.getText().substring(0, textField.getText().length() - 1)));
        return this.btnBack;
    }

    protected JButton createDivideBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnDivide = createButton("\u00F7", columns[2], rows[1]);
        this.btnDivide.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "/");
                this.selectedOperator = '/';
            }
        });
        return this.btnDivide;
    }

    protected JButton createMultiplyBtn(int[] columns, int[] rows, JTextField textField) {
        this.btnMultiply = createButton("\u00D7", columns[3], rows[1]);
        this.btnMultiply.addActionListener(event -> {
            if (this.checkTextFieldLength(textField)) {
                textField.setText(textField.getText() + "*");
                this.selectedOperator = '*';
            }
        });
        return this.btnMultiply;
    }

    private double calculate(double firstNum, double secondNum, char operator) {
        return switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> firstNum / secondNum;
            default -> secondNum;
        };
    }
}