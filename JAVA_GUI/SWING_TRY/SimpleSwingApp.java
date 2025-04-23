import javax.swing.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("My First Swing App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // No layout manager

        // Create a label
        JLabel label = new JLabel("Hello, Krish!");
        label.setBounds(100, 50, 150, 30);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 90, 100, 30);

        // Add action to the button
        button.addActionListener(e -> label.setText("Button Clicked!"));

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}
