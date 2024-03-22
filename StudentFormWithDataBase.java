import javax.swing.*;
import java.awt.event.*;

public class StudentForm implements ActionListener {
    private JTextField nameField, rollField, departmentField;
    private JLabel success;

    public static void main(String[] args) {
        // Ensure Swing components are created on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new StudentForm());
    }

    public StudentForm() {
        JFrame frame = new JFrame("Student Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(100, 20, 200, 25);
        panel.add(nameField);

        JLabel rollLabel = new JLabel("Roll Number:");
        rollLabel.setBounds(10, 60, 80, 25);
        panel.add(rollLabel);

        rollField = new JTextField();
        rollField.setBounds(100, 60, 200, 25);
        panel.add(rollField);

        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(10, 100, 80, 25);
        panel.add(departmentLabel);

        departmentField = new JTextField();
        departmentField.setBounds(100, 100, 200, 25);
        panel.add(departmentField);

        JButton button = new JButton("Save");
        button.setBounds(150, 140, 80, 25);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(130, 180, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String roll = rollField.getText();
        String department = departmentField.getText();
        // Perform action with the entered data (for example, saving to a database)
        // For demonstration purposes, we'll just display a success message
        success.setText("Student " + name + " saved successfully!");
    }
}
