package gameOfLife;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.*;
import java.io.*;

public class Help {
	
	private JFrame help;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
					window.help.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Help() throws IOException {
		initialize();
	}
	
	private void initialize() throws IOException 
	{
		
	help = new JFrame();
	help.setTitle("Help");
	help.setLocationRelativeTo(null);
	help.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	help.setVisible(true);
	help.setResizable(true);
	help.setSize(1024,759);
	
	
	ImageIcon helpBackground = new ImageIcon("src/gameOfLife/imgs/Help_Screen.png");
	JLabel helpBackgroundLabel = new JLabel();
	helpBackgroundLabel.setIcon(helpBackground);
	helpBackgroundLabel.setVisible(true);
	help.getContentPane().add(helpBackgroundLabel);
	
	
}
	}
