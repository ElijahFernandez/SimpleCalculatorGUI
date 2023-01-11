package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI extends JFrame {
    private javax.swing.JPanel JPanel;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMult;
    private JButton bDiv;
    private JButton bEquals;
    private JButton bSeven;
    private JButton bEight;
    private JButton bNine;
    private JButton bFour;
    private JButton bFive;
    private JButton bSix;
    private JButton bOne;
    private JButton bTwo;
    private JButton bThree;
    private JButton bZero;
    private JButton backSpaceButton;
    private JTextField tfDisplay;
    private JButton posNegButton;
    private JButton clearButton;

    public CalcGUI() {
        bZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bZero.getText());
            }
        });
        bOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bOne.getText());
            }
        });
        bTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bTwo.getText());
            }
        });
        bThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bThree.getText());

            }
        });
        bFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bFour.getText());

            }
        });
        bFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bFive.getText());

            }
        });
        bSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bSix.getText());

            }
        });
        bSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bSeven.getText());

            }
        });
        bEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bEight.getText());

            }
        });
        bNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText(tfDisplay.getText() + bNine.getText());
            }
        });
    }

    public static void main(String[] args) {
        CalcGUI calc = new CalcGUI();
        calc.setTitle("CSIT227-Finals | Fernandez - F3");
        calc.setContentPane(calc.JPanel);
        calc.setSize(400, 400);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);

    }

}
