package My_Pack;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
	public MyFrame() {
        // Set the layout manager for the content pane
        getContentPane().setLayout(new GridBagLayout());
        
        // Create a constraints object for the text field
        GridBagConstraints textConstraints = new GridBagConstraints();
        textConstraints.gridx = 0;
        textConstraints.gridy = 0;
        textConstraints.weightx = 1.0;
        textConstraints.fill = GridBagConstraints.HORIZONTAL;
        
        // Create the text field and add it to the content pane
        JTextField textField = new JTextField();
        getContentPane().add(textField, textConstraints);
        
        // Create a constraints object for the label
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 1;
        labelConstraints.anchor = GridBagConstraints.WEST;
        
        // Create the label and add it to the content pane
        JLabel label = new JLabel("Enter your name:");
        getContentPane().add(label, labelConstraints);
        
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 2;
        buttonConstraints.anchor = GridBagConstraints.CENTER;
        
        JButton button = new JButton("Submit");
        getContentPane().add(button, buttonConstraints);
        
        setSize(300, 200);
        setVisible(true);
    }
	
	public static void main(String[] args) 
	{
		new MyFrame();
    }
}
