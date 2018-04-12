package calc2017;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yakim on 03.09.2015.
 */
public class yakimscor {

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonNull = new JButton("00");
    JButton buttonNull1 = new JButton("000");
    JButton buttonNull2 = new JButton("0000");
    JButton buttonMol = new JButton("Молодец");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JPanel p1;

    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(18);

    yakimscor() {
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        windowContent.add("North", displayField);

        JPanel p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 1);

        p1.setLayout(gl);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        p1.add(buttonNull);
        p1.add(buttonNull1);
        p1.add(buttonNull2);
        p1.add(buttonMol);

        windowContent.add("Center", p1);

        JPanel p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4, 1);

        p2.setLayout(gl2);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultiply);

        windowContent.add("East", p2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();

        frame.setVisible(true);

        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        button0.addActionListener(calculatorEngine);
        button1.addActionListener(calculatorEngine);
        button2.addActionListener(calculatorEngine);
        button3.addActionListener(calculatorEngine);
        button4.addActionListener(calculatorEngine);
        button5.addActionListener(calculatorEngine);
        button6.addActionListener(calculatorEngine);
        button7.addActionListener(calculatorEngine);
        button8.addActionListener(calculatorEngine);
        button9.addActionListener(calculatorEngine);
        buttonNull.addActionListener(calculatorEngine);
        buttonNull1.addActionListener(calculatorEngine);
        buttonNull2.addActionListener(calculatorEngine);
        buttonMol.addActionListener(calculatorEngine);
        buttonPoint.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);
        buttonMinus.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        buttonDivide.addActionListener(calculatorEngine);
        buttonMultiply.addActionListener(calculatorEngine);

    }

    public static void main(String[] args) {
        yakimscor calc = new yakimscor();

    }
}
