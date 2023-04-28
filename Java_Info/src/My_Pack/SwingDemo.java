package My_Pack;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class SwingDemo
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		JLabel lb = new JLabel("Enter Your Name");
		JTextField tf = new JTextField(20);
		f.add(lb);
		f.add(tf);
		f.setSize(400,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}

}
