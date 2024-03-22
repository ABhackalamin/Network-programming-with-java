import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JButton b10, b11, b12, b13, b14, b15;
    JButton b[] = new JButton[10];
    int i, r, n1, n2;
    JTextField res;
    char op;

    public Calculator() {
        super("Calculator");
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));

        Color buttonColor = new Color(200, 130, 250);
        for (int i = 0; i <= 9; i++) {
            b[i] = new JButton("" + i);
            b[i].setBackground(buttonColor);
            p.add(b[i]);
            b[i].addActionListener(this);
        }

        // Operator buttons
        b10 = new JButton("+");
        b10.setBackground(Color.GRAY);
        p.add(b10);
        b10.addActionListener(this);

        b11 = new JButton("-");
        b11.setBackground(Color.BLUE);
        p.add(b11);
        b11.addActionListener(this);

        b12 = new JButton("*");
        b12.setBackground(Color.GREEN);
        p.add(b12);
        b12.addActionListener(this);

        b13 = new JButton("/");
        b13.setBackground(Color.ORANGE);
        p.add(b13);
        b13.addActionListener(this);

        b14 = new JButton("=");
        b14.setBackground(Color.PINK);
        p.add(b14);
        b14.addActionListener(this);

        b15 = new JButton("C");
        b15.setBackground(Color.RED);
        p.add(b15);
        b15.addActionListener(this);

        res = new JTextField(10);
        res.setBackground(Color.LIGHT_GRAY);
        add(p, BorderLayout.CENTER);
        add(res, BorderLayout.NORTH);
        setVisible(true);

        setSize(200, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        JButton pb = (JButton) ae.getSource();
        if (pb == b15) {
            r = n1 = n2 = 0;
            res.setText("");
        } else if (pb == b14) {
            n2 = Integer.parseInt(res.getText());
            eval();
            res.setText("" + r);
        } else {
            boolean opf = false;
            if (pb == b10) {
                op = '+';
                opf = true;
            }
            if (pb == b11) {
                op = '-';
                opf = true;
            }
            if (pb == b12) {
                op = '*';
                opf = true;
            }
            if (pb == b13) {
                op = '/';
                opf = true;
            }
            if (!opf) {
                for (i = 0; i < 10; i++) {
                    if (pb == b[i]) {
                        String t = res.getText();
                        t += i;
                        res.setText(t);
                    }
                }
            } else {
                n1 = Integer.parseInt(res.getText());
                res.setText("");
            }
        }
    }

    private void eval() {
        switch (op) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                r = n1 / n2;
                break;
        }
    }

    public static void main(String arg[]) {
        new Calculator();
    }
}
