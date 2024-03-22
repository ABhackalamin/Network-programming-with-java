import java.awt.FlowLayout; // Import the FlowLayout class from the java.awt package
import javax.swing.ImageIcon; // Import the ImageIcon class from the javax.swing package
import javax.swing.JFrame; // Import the JFrame class from the javax.swing package
import javax.swing.JLabel; // Import the JLabel class from the javax.swing package

public class DisplayImage extends JFrame { // Define a Java class called DisplayImage that extends JFrame
    public DisplayImage() { // Define a constructor method for the DisplayImage class
        super("Image Display"); // Call the constructor of the JFrame class with a title "Image Display"
        setLayout(new FlowLayout()); // Set the layout manager of the JFrame to FlowLayout
        ImageIcon icon = new ImageIcon("ask1.png"); // Create an ImageIcon object with the image file "ask1.png"
        JLabel imgLabel = new JLabel(icon); // Create a JLabel with the ImageIcon
        add(imgLabel); // Add the the JFram JLabel toe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation to exit on close
        pack(); // Pack the components of the JFrame
        setLocationRelativeTo(null); // Set the location of the JFrame to the center of the screen
        setVisible(true); // Set the visibility of the JFrame to true
    }

    public static void main(String[] args) { // Define the main method
        new DisplayImage(); // Create an instance of the DisplayImage class
    }
}
