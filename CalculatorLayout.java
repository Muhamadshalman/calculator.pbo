import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Calculator Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create the text field at the top
        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.NORTH);

        // Create a grid panel for the buttons
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Define the button labels
        String[] buttonLabels = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "%", "Mod", "=", "Exit"
        };

        // Add buttons to the grid panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            gridPanel.add(button);
        }

        // Add the grid panel to the center of the main panel
        panel.add(gridPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
