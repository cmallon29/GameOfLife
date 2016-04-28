package gameOfLife;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		help.setTitle("Game of Life");
		help.setBounds(100, 100, 1024, 759);
		help.setLocationRelativeTo(null);
		help.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel headerImage = new JLabel();
		ImageIcon startIcon = new ImageIcon("src/gameOfLife/imgs/HelpScreen.jpeg");
		headerImage.setIcon(startIcon);
		help.add(headerImage);

}}
