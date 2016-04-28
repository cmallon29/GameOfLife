package gameOfLife;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Array;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StartScreen 
{
	private JFrame startFrame;
	private JButton startButton;
	private JButton howToPlayButton;
	private JPanel imagePanel;
	private JPanel buttonPanel;
	private JLabel characterName;
	private String[] playerNames;
	private Boolean[] genders;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen window = new StartScreen();
					window.startFrame.setVisible(true);
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
	public StartScreen() throws IOException {
		initialize();
	}
	
	private void initialize() throws IOException 
	{
		startFrame = new JFrame();
		startFrame.setTitle("Game of Life");
		startFrame.setBounds(100, 100, 1198, 780);
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel headerImage = new JLabel();
		ImageIcon startIcon = new ImageIcon("src/gameOfLife/imgs/startScreen.jpg");
		headerImage.setIcon(startIcon);

		playerNames = new String[3];
		genders = new Boolean[3];
		howToPlayButton = new JButton("");
		howToPlayButton.setVisible(true);
		howToPlayButton.setBounds(570 , 425 , 430, 55);
		howToPlayButton.setOpaque(false);
		howToPlayButton.setContentAreaFilled(false);
		howToPlayButton.setBorderPainted(false);
		howToPlayButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Help.main(null);
				startFrame.dispose();
			}
		});
		startButton = new JButton();
		startButton.setVisible(true);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setBounds(570 , 350 , 430, 55);
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Skeleton.main(null);
				startFrame.dispose();
			}
		});
		
		startFrame.add(startButton);
		startFrame.add(howToPlayButton);
		startFrame.add(headerImage);
		
		///frame.add(imagePanel);
		//startFrame.add(buttonPanel);
	}

	public int setPlayerAmount()
	{
		String[] options = new String[] {"1 player", "2 players", "3 players", "4 players"};
	    int response = JOptionPane.showOptionDialog(null, "How many players?", "Choose amount of players",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    return response;
	}
}
