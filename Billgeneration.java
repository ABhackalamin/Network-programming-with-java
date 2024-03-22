import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Billgeneration extends JFrame implements ActionListener {
    JLabel label;
    JCheckBox cb1, cb2, cb3,cb4;
    JButton b;

    Billgeneration() {
        label = new JLabel("ইফতার বাজার ইন রমজান");
        label.setBounds(50, 50, 300, 20);
        
        // Load a custom font that supports Bangla characters
        Font banglaFont = new Font("SolaimanLipi", Font.PLAIN, 14); 
        
        label.setFont(banglaFont); // Set the custom font for the label
        
        cb1 = new JCheckBox("ছোলা ১০০ গ্রাম ২০ টাকা");
        cb1.setBounds(100, 100, 150, 20);
        cb1.setFont(banglaFont); // Set the custom font for the checkbox
        
        cb2 = new JCheckBox("বেগুন ১০০ গ্রাম ৩০ টাকা");
        cb2.setBounds(100, 150, 150, 20);
        cb2.setFont(banglaFont); // Set the custom font for the checkbox
        
        cb3 = new JCheckBox("আলু ১০০ গ্রাম ৩০ টাকা");
        cb3.setBounds(100, 200, 150, 20);
        cb3.setFont(banglaFont); // Set the custom font for the checkbox

        cb4 = new JCheckBox("আনারস ১০০ গ্রাম ৩০ টাকা");
        cb4.setBounds(100, 250, 150, 20);
        cb4.setFont(banglaFont); // Set the custom font for the checkbox

        
        b = new JButton("Order");
        b.setBounds(100, 300, 80, 30);
        b.addActionListener(this);
        
        add(label);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(b);
        
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        
        // Load a custom font that supports Bangla characters
        Font banglaFont = new Font("SolaimanLipi", Font.PLAIN, 14); // Replace "SolaimanLipi" with your Bangla font name
        
        if (cb1.isSelected()) {
            amount += 20; // Changed the price for cb1 to 20
            msg += "ছোলা ১০০ গ্রাম ২০ টাকা\n"; // Adjusted the message accordingly
        }
        if (cb2.isSelected()) {
            amount += 30; // Changed the price for cb2 to 30
            msg += "বেগুন ১০০ গ্রাম ৩০ টাকা\n"; // Adjusted the message accordingly
        }
        if (cb3.isSelected()) {
            amount += 30; // Changed the price for cb3 to 30
            msg += "আলু ১০০ গ্রাম ৩০ টাকা\n"; // Adjusted the message accordingly
        }
        if (cb4.isSelected()) {
            amount += 30; // Changed the price for cb3 to 30
            msg += "আনারস ১০০ গ্রাম ৩০ টাকা\n"; // Adjusted the message accordingly
        }
        msg += "----------------------\n";
        
        // Create a JTextArea to display the message
        JTextArea textArea = new JTextArea(msg + "Total: " + amount + " টাকা");
        textArea.setFont(banglaFont); // Set the custom font for the text area
        textArea.setEditable(false); // Make the text area non-editable
        
        // Show the message in a JOptionPane
        JOptionPane.showMessageDialog(this, new JScrollPane(textArea), "বিল", JOptionPane.PLAIN_MESSAGE); // Adjusted the title accordingly
    }
    

    public static void main(String[] args) {
        new Billgeneration();
    }
}
