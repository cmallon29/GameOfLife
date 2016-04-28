	package gameOfLife;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;


public class Skeleton
{
	private JFrame frame;
	private int randomNum;
	private int totPlayers;
	private int currentPlayer;
	private JButton spinButton, stopButton;
	private Timer timer;
	private JPanel spinner;
	private boolean gameOn;
	private ArrayList<Player> player = new ArrayList<Player>();
	private JLabel bluePlayer;
	private JLabel greenPlayer;
	private JLabel pinkPlayer;
	private JLabel purplePlayer;
	private JLabel redPlayer;
	private JLabel yellowPlayer;
	private JLabel characterName;
	private JLabel player1;
	private JLabel player2;
	private JLabel player3;
	private JLabel player4;
	private JLabel player5;
	private JLabel player6;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;

	/**
	 * Launch the application.
	 * @param genders 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Skeleton window = new Skeleton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Skeleton() 
	{
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setExtendedState(Frame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon[] images = new ImageIcon[7];
		
		  images[1] = new ImageIcon("src/gameOfLife/imgs/numbers/1.png");
		  images[2] = new ImageIcon("src/gameOfLife/imgs/numbers/2.png");
		  images[3] = new ImageIcon("src/gameOfLife/imgs/numbers/3.png");
		  images[4] = new ImageIcon("src/gameOfLife/imgs/numbers/4.png");
		  images[5] = new ImageIcon("src/gameOfLife/imgs/numbers/5.png");
		  images[6] = new ImageIcon("src/gameOfLife/imgs/numbers/6.png");
		  
		ImageIcon blueCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/blue_player.png");
		ImageIcon greenCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/green_player.png");

		
		ImageIcon spinner = new ImageIcon("src/gameOfLife/imgs/spinner.png");
		ImageIcon spinnerMoving = new ImageIcon("src/gameOfLife/imgs/movingSpinner.png");
		
		JLabel numbers= new JLabel();
		numbers.setBounds(430, 115, 200, 200);
		numbers.setVisible(true);
		
		JLabel spinningImage = new JLabel();
		spinningImage.setBounds(430, 115, 200, 200);
		spinningImage.setIcon(spinnerMoving);
		spinningImage.setVisible(false);
		JLabel spinImage = new JLabel();
		spinImage.setBounds(430, 115, 200, 200);
		spinImage.setIcon(spinner);
		spinImage.setVisible(true);
		
		
		frame.add(spinImage);
		frame.add(spinningImage);
		frame.add(numbers);
		
		stopButton = new JButton("Stop the Wheel");
		stopButton.setBounds(480, 700, 150, 31);
		stopButton.setVisible(false);
		stopButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				spinButton.setVisible(true);
				stopButton.setVisible(false);
				//spinImage.setVisible(true);
				spinningImage.setVisible(false);
				numbers.setVisible(true);
				spinWheel();
				if( randomNum == 0 || randomNum ==1){
					numbers.setIcon(images[1]);
				}
				if(randomNum == 2){
					numbers.setIcon(images[2]);
				}
				if(randomNum == 3){
					numbers.setIcon(images[3]);
				}
				if(randomNum == 4){
					numbers.setIcon(images[4]);
				}
				if(randomNum == 5){
					numbers.setIcon(images[5]);
				}
				if(randomNum == 6){
					numbers.setIcon(images[6]);
				}
			}
		});
		frame.getContentPane().add(stopButton);
		
		
		spinButton = new JButton("Spin the Wheel");
		spinButton.setBounds(480, 700, 150, 31);
		spinButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				spinButton.setVisible(false);
				stopButton.setVisible(true);
				spinImage.setVisible(false);
				spinningImage.setVisible(true);
				numbers.setVisible(false);
			}
		});
		frame.getContentPane().add(spinButton);
		totPlayers = setPlayerAmount();
		for (int i = 0; i <= totPlayers; i++)
		{
			characterName = new JLabel(JOptionPane.showInputDialog("Please enter a name for character number " +(i+1)+ " :"));
			characterName.setForeground(Color.white);
			player.add(new Player());
			player.get(i).setName(characterName.getText());
			String[] options = new String[] {"Male", "Female"};
		  int genderResponse = JOptionPane.showOptionDialog(null, "What gender is your character?", "Choose a gender",
		      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		      null, options, options[0]);
		  if (genderResponse == 0)
		  {
		  	player.get(i).setGender(true);
		  }
		  else
		  {
		  	player.get(i).setGender(false);
		  }
		  String[] carOptions = new String[] {"Blue", "Green", "Pink", "Purple", "Red", "Yellow"};
		  int carChoice = JOptionPane.showOptionDialog(null, "What colour of car do you wish to use?", "Choose a car colour",
		      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		      null, carOptions, carOptions[0]);
		  if(carChoice == 0)
		  {
			  player.get(i).setCarColour("Blue");
		  }
		  if(carChoice == 1)
		  {
			  player.get(i).setCarColour("Green");
		  }
		}		
		gameOn = true;
		currentPlayer = 0;
		bluePlayer = new JLabel();
		bluePlayer.setBounds(528, 37, 86, 31);
		bluePlayer.setIcon(blueCar);
		bluePlayer.setVisible(true);
		frame.add(bluePlayer);

		if( totPlayers>0)
		{
			greenPlayer = new JLabel();
			greenPlayer.setBounds(528, 37, 86, 31);
			greenPlayer.setIcon(greenCar);
			greenPlayer.setVisible(true);
			frame.add(greenPlayer);
		}
		setPlayers();

		//main island
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(240, 230, 140));
		textField_1.setBounds(528, 37, 86, 31);
		textField_1.setEditable(false);
		textField_1.setText("Uni or Career");
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//uni path
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(240, 230, 140));
		textField_3.setBounds(361, 148, 66, 31);
		textField_3.setEditable(false);
		textField_3.setText("Pick a Career");
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(240, 230, 140));
		textField_4.setBounds(379, 106, 66, 31);
		textField_4.setEditable(false);
		textField_4.setText("Collect 30K");
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(240, 230, 140));
		textField_5.setBounds(328, 190, 78, 31);
		textField_5.setEditable(false);
		textField_5.setText("Pay 20K");
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(240, 230, 140));
		textField_6.setBounds(331, 232, 75, 45);
		textField_6.setEditable(false);
		textField_6.setText("Collect 20K");
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(240, 230, 140));
		textField_7.setBounds(342, 288, 75, 45);
		textField_7.setEditable(false);
		textField_7.setText("Collect 100K");
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(240, 230, 140));
		textField_8.setBounds(379, 344, 78, 45);
		textField_8.setEditable(false);
		textField_8.setText("Collect 20K");
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(240, 230, 140));
		textField_9.setBounds(473, 363, 67, 45);
		textField_9.setEditable(false);
		textField_9.setText("Pay 30K");
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(240, 230, 140));
		textField_10.setBounds(550, 344, 75, 45);
		textField_10.setEditable(false);
		textField_10.setText("Collect 40K");
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBackground(new Color(240, 230, 140));
		textField_11.setBounds(632, 324, 67, 38);
		textField_11.setEditable(false);
		textField_11.setText("Stop");
		frame.getContentPane().add(textField_11);
		//end of uni path

		//start of career path
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBackground(new Color(240, 230, 140));
		textField_12.setBounds(631, 96, 86, 31);
		textField_12.setEditable(false);
		textField_12.setText("Payday");
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBackground(new Color(240, 230, 140));
		textField_13.setBounds(658, 138, 86, 31);
		textField_13.setEditable(false);
		textField_13.setText("Collect 30K");
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBackground(new Color(240, 230, 140));
		textField_14.setBounds(680, 187, 86, 31);
		textField_14.setEditable(false);
		textField_14.setText("Pay 20K");
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBackground(new Color(240, 230, 140));
		textField_15.setBounds(708, 238, 76, 40);
		textField_15.setEditable(false);
		textField_15.setText("Collect 100K");
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBackground(new Color(240, 230, 140));
		textField_16.setBounds(717, 286, 67, 31);
		textField_16.setEditable(false);
		textField_16.setText("Collect 10K");
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBackground(new Color(240, 230, 140));
		textField_17.setBounds(709, 328, 75, 31);
		textField_17.setEditable(false);
		textField_17.setText("Collect 30K");
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBackground(new Color(240, 230, 140));
		textField_18.setBounds(682, 370, 67, 38);
		textField_18.setEditable(false);
		textField_18.setText("Collect 30K");
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBackground(new Color(240, 230, 140));
		textField_19.setBounds(613, 400, 67, 38);
		textField_19.setEditable(false);
		textField_19.setText("Take off");
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBackground(new Color(240, 230, 140));
		textField_20.setBounds(539, 414, 67, 45);
		textField_20.setEditable(false);
		textField_20.setText("Spin to Win 100K");
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBackground(new Color(240, 230, 140));
		textField_21.setBounds(473, 417, 57, 38);
		textField_21.setEditable(false);
		textField_21.setText("Payday");
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBackground(new Color(240, 230, 140));
		textField_22.setBounds(390, 414, 75, 45);
		textField_22.setEditable(false);
		textField_22.setText("Collect 20K from each player");
		frame.getContentPane().add(textField_22);

		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBackground(new Color(240, 230, 140));
		textField_24.setBounds(63, 302, 67, 41);
		textField_24.setEditable(false);
		textField_24.setText("Stop (ship off to island one)");
		frame.getContentPane().add(textField_24);
		//end of career path
		
		//island one
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBackground(new Color(240, 230, 140));
		textField_25.setBounds(140, 299, 57, 31);
		textField_25.setEditable(false);
		textField_25.setText("(Give option to buy house)");
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBackground(new Color(240, 230, 140));
		textField_26.setBounds(160, 266, 57, 26);
		textField_26.setEditable(false);
		textField_26.setText("Spin to win 100K");
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBackground(new Color(240, 230, 140));
		textField_27.setBounds(171, 217, 46, 38);
		textField_27.setEditable(false);
		textField_27.setText("Collect 40K");
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBackground(new Color(240, 230, 140));
		textField_28.setBounds(181, 175, 57, 31);
		textField_28.setEditable(false);
		textField_28.setText("(Blank tile)");
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBackground(new Color(240, 230, 140));
		textField_29.setBounds(199, 138, 57, 31);
		textField_29.setEditable(false);
		textField_29.setText("Take 50K from another player");
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBackground(new Color(240, 230, 140));
		textField_30.setBounds(217, 96, 57, 31);
		textField_30.setEditable(false);
		textField_30.setText("(Blank tile)");
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBackground(new Color(240, 230, 140));
		textField_31.setBounds(207, 21, 67, 31);
		textField_31.setEditable(false);
		textField_31.setText("(Blank tile)");
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBackground(new Color(240, 230, 140));
		textField_32.setBounds(140, 11, 63, 31);
		textField_32.setEditable(false);
		textField_32.setText("Pay 30K");
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBackground(new Color(240, 230, 140));
		textField_33.setBounds(80, 11, 57, 31);
		textField_33.setEditable(false);
		textField_33.setText("(Blank tile)");
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBackground(new Color(240, 230, 140));
		textField_34.setBounds(217, 63, 67, 26);
		textField_34.setEditable(false);
		textField_34.setText("(Pub crawl, Pay 20K (Collect pub crawl 		token))");
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBackground(new Color(240, 230, 140));
		textField_35.setBounds(10, 37, 57, 31);
		textField_35.setEditable(false);
		textField_35.setText("(Blank tile)");
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBackground(new Color(240, 230, 140));
		textField_36.setBounds(20, 76, 57, 31);
		textField_36.setEditable(false);
		textField_36.setText("Stop(Collect 100K)");
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBackground(new Color(240, 230, 140));
		textField_37.setBounds(10, 124, 57, 31);
		textField_37.setEditable(false);
		textField_37.setText("(Give option to buy house)");
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBackground(new Color(240, 230, 140));
		textField_38.setBounds(10, 171, 57, 31);
		textField_38.setEditable(false);
		textField_38.setText("Collect 20K");
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBackground(new Color(240, 230, 140));
		textField_39.setBounds(20, 213, 57, 31);
		textField_39.setEditable(false);
		textField_39.setText("Get a pet");
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBackground(new Color(240, 230, 140));
		textField_40.setBounds(20, 259, 57, 31);
		textField_40.setEditable(false);
		textField_40.setText("(Blank tile)");
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBackground(new Color(240, 230, 140));
		textField_41.setBounds(747, 26, 57, 31);
		textField_41.setEditable(false);
		textField_41.setText("(Blank tile)");
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBackground(new Color(240, 230, 140));
		textField_42.setBounds(824, 26, 57, 31);
		textField_42.setEditable(false);
		textField_42.setText("Take off");
		frame.getContentPane().add(textField_42);
		//end of island one
		
		//Start of island two
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBackground(new Color(240, 230, 140));
		textField_43.setBounds(902, 26, 57, 31);
		textField_43.setEditable(false);
		textField_43.setText("Spin to win 100K");
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBackground(new Color(240, 230, 140));
		textField_44.setBounds(970, 26, 57, 31);
		textField_44.setEditable(false);
		textField_44.setText("(Blank tile)");
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBackground(new Color(240, 230, 140));
		textField_45.setBounds(1038, 26, 57, 31);
		textField_45.setEditable(false);
		textField_45.setText("Sue another player for 50K");
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBackground(new Color(240, 230, 140));
		textField_46.setBounds(1038, 66, 57, 31);
		textField_46.setEditable(false);
		textField_46.setText("Have a baby/ get married");
		frame.getContentPane().add(textField_46);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBackground(new Color(240, 230, 140));
		textField_48.setBounds(1038, 153, 57, 31);
		textField_48.setEditable(false);
		textField_48.setText("(Give option to buy a house)");
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBackground(new Color(240, 230, 140));
		textField_49.setBounds(1038, 194, 57, 31);
		textField_49.setEditable(false);
		textField_49.setText("Take off");
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBackground(new Color(240, 230, 140));
		textField_50.setBounds(1038, 236, 57, 31);
		textField_50.setEditable(false);
		textField_50.setText("Promotion");
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBackground(new Color(240, 230, 140));
		textField_51.setBounds(970, 192, 57, 31);
		textField_51.setEditable(false);
		textField_51.setText("Collect 50k");
		
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBackground(new Color(240, 230, 140));
		textField_52.setBounds(902, 192, 57, 31);
		textField_52.setEditable(false);
		textField_52.setText("Payday");
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBackground(new Color(240, 230, 140));
		textField_53.setBounds(824, 192, 57, 31);
		textField_53.setEditable(false);
		textField_53.setText("(Blank tile)");
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBackground(new Color(240, 230, 140));
		textField_54.setBounds(796, 143, 57, 31);
		textField_54.setEditable(false);
		textField_54.setText("Hospital Pay 100K(Collect cool scar 			token)");
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBackground(new Color(240, 230, 140));
		textField_55.setBounds(777, 85, 57, 31);
		textField_55.setEditable(false);
		textField_55.setText("(Blank tile)");
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBackground(new Color(240, 230, 140));
		textField_56.setBounds(1038, 278, 57, 31);
		textField_56.setEditable(false);
		textField_56.setText("Pay 70K (choose to go right or 			straight)");
		frame.getContentPane().add(textField_56);
		//Straight path joins back to sue another player for 50K
		
		//Right path
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBackground(new Color(240, 230, 140));
		textField_57.setBounds(1038, 324, 57, 31);
		textField_57.setEditable(false);
		textField_57.setText("(Blank tile)");
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBackground(new Color(240, 230, 140));
		textField_58.setBounds(951, 311, 57, 31);
		textField_58.setEditable(false);
		textField_58.setText("Payday");
		frame.getContentPane().add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBackground(new Color(240, 230, 140));
		textField_59.setBounds(882, 292, 57, 31);
		textField_59.setEditable(false);
		textField_59.setText("Take off");
		frame.getContentPane().add(textField_59);
		//End of island two
		

		//Island 3
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBackground(new Color(240, 230, 140));
		textField_60.setBounds(855, 248, 57, 31);
		textField_60.setEditable(false);
		textField_60.setText("Collect 100K");
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBackground(new Color(240, 230, 140));
		textField_61.setBounds(709, 481, 57, 31);
		textField_61.setEditable(false);
		textField_61.setText("(Blank tile)");
		frame.getContentPane().add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBackground(new Color(240, 230, 140));
		textField_62.setBounds(777, 461, 57, 31);
		textField_62.setEditable(false);
		textField_62.setText("Have a baby/ get married(choose to go right 		or straight on)");
		frame.getContentPane().add(textField_62);
		
		//Straight path
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBackground(new Color(240, 230, 140));
		textField_63.setBounds(844, 448, 57, 31);
		textField_63.setEditable(false);
		textField_63.setText("()Blank tile");
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBackground(new Color(240, 230, 140));
		textField_64.setBounds(902, 436, 57, 31);
		textField_64.setEditable(false);
		textField_64.setText("Payday");
		frame.getContentPane().add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBackground(new Color(240, 230, 140));
		textField_65.setBounds(970, 404, 57, 31);
		textField_65.setEditable(false);
		textField_65.setText("Uni or Career");
		frame.getContentPane().add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBackground(new Color(240, 230, 140));
		textField_66.setBounds(1038, 388, 57, 31);
		textField_66.setEditable(false);
		textField_66.setText("Collect from each player 30K");
		frame.getContentPane().add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBackground(new Color(240, 230, 140));
		textField_67.setBounds(1085, 421, 57, 31);
		textField_67.setEditable(false);
		textField_67.setText("Give option to buy a house");
		frame.getContentPane().add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBackground(new Color(240, 230, 140));
		textField_68.setBounds(1115, 461, 57, 31);
		textField_68.setEditable(false);
		textField_68.setText("(Blank tile)");
		frame.getContentPane().add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBackground(new Color(240, 230, 140));
		textField_69.setBounds(1125, 505, 57, 31);
		textField_69.setEditable(false);
		textField_69.setText("Take off");
		frame.getContentPane().add(textField_69);
		//Straight path joins with right path at Pay 40K
		
		//Right path
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBackground(new Color(240, 230, 140));
		textField_70.setBounds(1115, 558, 57, 31);
		textField_70.setEditable(false);
		textField_70.setText("Collect 20K");
		frame.getContentPane().add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBackground(new Color(240, 230, 140));
		textField_71.setBounds(1102, 603, 57, 31);
		textField_71.setEditable(false);
		textField_71.setText("(Blank tile)");
		frame.getContentPane().add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBackground(new Color(240, 230, 140));
		textField_72.setBounds(1085, 645, 57, 31);
		textField_72.setEditable(false);
		textField_72.setText("Pay 40K");
		frame.getContentPane().add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBackground(new Color(240, 230, 140));
		textField_73.setBounds(1038, 688, 57, 31);
		textField_73.setEditable(false);
		textField_73.setText("(Blank tile)");
		frame.getContentPane().add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBackground(new Color(240, 230, 140));
		textField_74.setBounds(970, 693, 57, 31);
		textField_74.setEditable(false);
		textField_74.setText("Spin to win 100K");
		frame.getContentPane().add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBackground(new Color(240, 230, 140));
		textField_75.setBounds(902, 693, 57, 31);
		textField_75.setEditable(false);
		textField_75.setText("Give option to buy a house");
		frame.getContentPane().add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBackground(new Color(240, 230, 140));
		textField_76.setBounds(824, 688, 57, 31);
		textField_76.setEditable(false);
		textField_76.setText("Get a pet");
		frame.getContentPane().add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBackground(new Color(240, 230, 140));
		textField_77.setBounds(747, 688, 57, 31);
		textField_77.setEditable(false);
		textField_77.setText("(Blank tile)");
		frame.getContentPane().add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBackground(new Color(240, 230, 140));
		textField_78.setBounds(675, 676, 57, 31);
		textField_78.setEditable(false);
		textField_78.setText("Collect 30K");
		frame.getContentPane().add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBackground(new Color(240, 230, 140));
		textField_79.setBounds(613, 632, 57, 31);
		textField_79.setEditable(false);
		textField_79.setText("Uni or Career");
		frame.getContentPane().add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBackground(new Color(240, 230, 140));
		textField_80.setBounds(613, 590, 57, 31);
		textField_80.setEditable(false);
		textField_80.setText("(Blank tile)");
		frame.getContentPane().add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBackground(new Color(240, 230, 140));
		textField_81.setBounds(613, 548, 57, 31);
		textField_81.setEditable(false);
		textField_81.setText("Go to Disney World(Collect disney token)");
		frame.getContentPane().add(textField_81);
		//End of island three
		
		//Start of island four
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBackground(new Color(240, 230, 140));
		textField_82.setBounds(692, 579, 57, 31);
		textField_82.setEditable(false);
		textField_82.setText("Collect 50K");
		frame.getContentPane().add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBackground(new Color(240, 230, 140));
		textField_83.setBounds(766, 568, 57, 31);
		textField_83.setEditable(false);
		textField_83.setText("Give option of buying a house");
		frame.getContentPane().add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBackground(new Color(240, 230, 140));
		textField_84.setBounds(855, 558, 57, 31);
		textField_84.setEditable(false);
		textField_84.setText("Spin to win");
		frame.getContentPane().add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBackground(new Color(240, 230, 140));
		textField_85.setBounds(951, 558, 57, 31);
		textField_85.setEditable(false);
		textField_85.setText("(Blank tile)");
		frame.getContentPane().add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBackground(new Color(240, 230, 140));
		textField_86.setBounds(1038, 558, 57, 31);
		textField_86.setEditable(false);
		textField_86.setText("Pay 30K");
		frame.getContentPane().add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBackground(new Color(240, 230, 140));
		textField_87.setBounds(613, 505, 86, 31);
		textField_87.setEditable(false);
		textField_87.setText("Stop (Collect 100K)");
		frame.getContentPane().add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBackground(new Color(240, 230, 140));
		textField_88.setBounds(58, 461, 57, 31);
		textField_88.setEditable(false);
		textField_88.setText("(Blank tile)");
		frame.getContentPane().add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBackground(new Color(240, 230, 140));
		textField_89.setBounds(132, 481, 57, 31);
		textField_89.setEditable(false);
		textField_89.setText("(Blank tile)");
		frame.getContentPane().add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBackground(new Color(240, 230, 140));
		textField_90.setBounds(199, 505, 57, 31);
		textField_90.setEditable(false);
		textField_90.setText("Have a baby/ get married");
		frame.getContentPane().add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBackground(new Color(240, 230, 140));
		textField_91.setBounds(267, 515, 57, 31);
		textField_91.setEditable(false);
		textField_91.setText("Collect 20K");
		frame.getContentPane().add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBackground(new Color(240, 230, 140));
		textField_92.setBounds(331, 547, 57, 31);
		textField_92.setEditable(false);
		textField_92.setText("Payday");
		frame.getContentPane().add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBackground(new Color(240, 230, 140));
		textField_93.setBounds(364, 590, 57, 31);
		textField_93.setEditable(false);
		textField_93.setText("(Blank tile)");
		frame.getContentPane().add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBackground(new Color(240, 230, 140));
		textField_94.setBounds(387, 632, 57, 31);
		textField_94.setEditable(false);
		textField_94.setText("(Blank tile), choose to go right or 			straight path");
		frame.getContentPane().add(textField_94);
		
		//right path
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBackground(new Color(240, 230, 140));
		textField_95.setBounds(20, 515, 57, 31);
		textField_95.setEditable(false);
		textField_95.setText("Sue another player for 100K");
		frame.getContentPane().add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBackground(new Color(240, 230, 140));
		textField_96.setBounds(30, 558, 57, 31);
		textField_96.setEditable(false);
		textField_96.setText("Tour around Belfast, pay 20K(Collect 			sightseeing token)");
		frame.getContentPane().add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBackground(new Color(240, 230, 140));
		textField_97.setBounds(54, 608, 57, 31);
		textField_97.setEditable(false);
		textField_97.setText("Collect 50K");
		frame.getContentPane().add(textField_97);
		//Join back up with textField_85
		
		//Straight path
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBackground(new Color(240, 230, 140));
		textField_98.setBounds(80, 650, 57, 31);
		textField_98.setEditable(false);
		textField_98.setText("End game");
		frame.getContentPane().add(textField_98);
}
	public int setPlayerAmount()
	{
		String[] options = new String[] {"1 player", "2 players", "3 players", "4 players"};
	    int response = JOptionPane.showOptionDialog(null, "How many players?", "Choose amount of players",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    return response;
	}
	public void setPlayerOne()
	{
		player1= new JLabel();
		player1.setBounds(1250, 0, 400, 125);
		player1.setVisible(true);
		player1.setText("<html>Player 1 <br>Name: " + player.get(0).getName() + "<br>Money: " + player.get(0).getMoney()
				+ "<br>Car: " + player.get(0).getCarColour()+"</html>");
		player1.setForeground(Color.BLACK);
		player1.setBackground(Color.WHITE);
		player1.setOpaque(true);
		frame.add(player1);
	}
	public void setPlayerTwo()
	{
		player2= new JLabel();
		player2.setBounds(1250, 125, 400, 125);
		player2.setVisible(true);
		player2.setText("<html>Player 2 <br>Name: " + player.get(1).getName() + "<br>Money: " + player.get(1).getMoney()
				+ "<br>Car: " + player.get(1).getCarColour()+"</html>");
		player2.setForeground(Color.BLACK);
		player2.setBackground(Color.WHITE);
		player2.setOpaque(true);
		frame.add(player2);
	}
	public void setPlayerThree()
	{
		player3= new JLabel();
		player3.setBounds(1250, 250, 400, 125);
		player3.setVisible(true);
		player3.setText("<html>Player 3 <br>Name: " + player.get(2).getName() + "<br>Money: " + player.get(2).getMoney()
				+ "<br>Car: " + player.get(2).getCarColour()+"</html>");
		player3.setForeground(Color.BLACK);
		player3.setBackground(Color.WHITE);
		player3.setOpaque(true);
		frame.add(player3);
	}
	public void setPlayerFour()
	{
		player4= new JLabel();
		player4.setBounds(1250, 375, 400, 125);
		player4.setVisible(true);
		player4.setText("<html>Player 4 <br>Name: " + player.get(3).getName() + "<br>Money: " + player.get(3).getMoney()
				+ "<br>Car: " + player.get(3).getCarColour()+"</html>");
		player4.setForeground(Color.BLACK);
		player4.setBackground(Color.WHITE);
		player4.setOpaque(true);
		frame.add(player4);
	}
	public void setPlayers(){
		setPlayerOne();
		if (totPlayers >0)
		{
			setPlayerTwo();
			if (totPlayers >1 )
			{
				setPlayerThree();
				if (totPlayers>2)
				{
					setPlayerFour();
				}
			}
		}
	}
	
	public void updatePlayers()
	{
		player1.setText("<html>Player 1 <br>Name: " + player.get(0).getName() + "<br>Money: " + player.get(0).getMoney()
				+ "<br>Car: " + player.get(0).getCarColour()+"</html>");
		if(totPlayers>0)
		{
			player2.setText("<html>Player 2 <br>Name: " + player.get(1).getName() + "<br>Money: " + player.get(1).getMoney()
					+ "<br>Car: " + player.get(1).getCarColour()+"</html>");
			if(totPlayers>1)
			{
				player3.setText("<html>Player 3 <br>Name: " + player.get(2).getName() + "<br>Money: " + player.get(2).getMoney()
						+ "<br>Car: " + player.get(2).getCarColour()+"</html>");
				if(totPlayers>2)
				{
					player4.setText("<html>Player 4 <br>Name: " + player.get(3).getName() + "<br>Money: " + player.get(3).getMoney()
							+ "<br>Car: " + player.get(3).getCarColour()+"</html>");
				}
			}
		}
		if(currentPlayer!=totPlayers)
		{
			currentPlayer++;
		}
		else
		{
			currentPlayer=0;
		}
	}
	public void checkPos()
	{
		if (player.get(currentPlayer).getPosition() == 1)
		{
			boolean uni = degreeOrJob();
			player.get(currentPlayer).setUni(uni);
			if(uni)
			{
				player.get(currentPlayer).setPosition(2);
			}
			else
			{
				player.get(currentPlayer).setPosition(0);
				showCareerCards();
			}
		}
		if (player.get(currentPlayer).getPosition() == 3)
		{
			player.get(currentPlayer).setMoney(30000);
		}
		if (player.get(currentPlayer).getPosition() == 4)
		{
			showUniCards();
		}
		if (player.get(currentPlayer).getPosition() == 5)
		{
			player.get(currentPlayer).setMoney(-20000);
		}
		if (player.get(currentPlayer).getPosition() == 6)
		{
			player.get(currentPlayer).setMoney(20000);
		}
		if (player.get(currentPlayer).getPosition() == 7)
		{
			player.get(currentPlayer).setMoney(100000);
		}
		if (player.get(currentPlayer).getPosition() == 8)
		{
			player.get(currentPlayer).setMoney(20000);
		}
		if (player.get(currentPlayer).getPosition() == 9)
		{
			player.get(currentPlayer).setMoney(-30000);
		}
		if (player.get(currentPlayer).getPosition() == 10)
		{
			player.get(currentPlayer).setMoney(40000);
		}
		if (player.get(currentPlayer).getPosition() == 11)
		{
			player.get(currentPlayer).setPosition(15);
		}
		if (player.get(currentPlayer).getPosition() == 12)
		{
			player.get(currentPlayer).payDay();;
		}
		if (player.get(currentPlayer).getPosition() == 13)
		{
			player.get(currentPlayer).setMoney(30000);
		}
		if (player.get(currentPlayer).getPosition() == 14)
		{
			player.get(currentPlayer).setMoney(-20000);
		}
		if (player.get(currentPlayer).getPosition() == 15)
		{
			player.get(currentPlayer).setMoney(100000);
		}
		if (player.get(currentPlayer).getPosition() == 16)
		{
			player.get(currentPlayer).setMoney(10000);
		}
		if (player.get(currentPlayer).getPosition() == 17)
		{
			player.get(currentPlayer).setMoney(30000);
		}
		if (player.get(currentPlayer).getPosition() == 18)
		{
			player.get(currentPlayer).setMoney(30000);
		}
		if (player.get(currentPlayer).getPosition() == 19)
		{
			//take off????
		}
		if (player.get(currentPlayer).getPosition() == 20)
		{
			//spin to win 100k
		}
		if (player.get(currentPlayer).getPosition() == 21)
		{
			player.get(currentPlayer).payDay();
		}
		if (player.get(currentPlayer).getPosition() == 22)
		{
			//collect 20k from each player
		}
	}
	
	public void showUniCards()
	{
		String[] options = new String[] {"Astronaut", "Banker", "Doctor", "Game Designer","Lawyer","Lecturer"};
	    int response = JOptionPane.showOptionDialog(null, "Which career do you wish to pursue?", "Choose a career path.",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    String job = null;
	    int salary = 0;
	    if (response == 0)
	    {
	    	job = "Astronaut";
	    	salary = 95000;
	    }
	    if (response == 1)
	    {
	    	job = "Banker";
	    	salary = 75000;
	    }
	    if (response == 2)
	    {
	    	job = "Doctor";
	    	salary = 100000;
	    }
	    if (response == 3)
	    {
	    	job = "Game Designer";
	    	salary = 90000;
	    }
	    if (response == 4)
	    {
	    	job = "Lawyer";
	    	salary = 80000;
	    }
	    if (response == 5)
	    {
	    	job = "Lecturer";
	    	salary = 70000;
	    }
	    player.get(currentPlayer).setJob(job);
	    player.get(currentPlayer).setSalary(salary);
	}
	
	public void showCareerCards()
	{
		String[] options = new String[] {"Bin Man", "Hairdresser", "Janitor", "Mechanic","Secretary","Shop Assistant"};
	    int response = JOptionPane.showOptionDialog(null, "Which career do you wish to pursue?", "Choose a career path.",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    String job = null;
	    int salary = 0;
	    if (response == 0)
	    {
	    	job = "Bin Man";
	    	salary = 35000;
	    }
	    if (response == 1)
	    {
	    	job = "Hairdresser";
	    	salary = 50000;
	    }
	    if (response == 2)
	    {
	    	job = "Janitor";
	    	salary = 25000;
	    }
	    if (response == 3)
	    {
	    	job = "Mechanic";
	    	salary = 40000;
	    }
	    if (response == 4)
	    {
	    	job = "Secretary";
	    	salary = 55000;
	    }
	    if (response == 5)
	    {
	    	job = "Shop Assistant";
	    	salary = 30000;
	    }
	    player.get(currentPlayer).setJob(job);
	    player.get(currentPlayer).setSalary(salary);
	}
	
	public void updatePos(int movement)
	{
		int pos = player.get(currentPlayer).getPosition();
		int newPos = movement + pos;
		if(pos == 2 || pos == 3)
		{
			if(newPos >=4)
			{
				player.get(currentPlayer).setPosition(4);
			}
			else
			{
				player.get(currentPlayer).setPosition(newPos);
			}
		}
		if (pos != 2) 
		{
			if (newPos >= 5 && newPos <= 11) {
				player.get(currentPlayer).setPosition(newPos);
			}
		}
		if(pos >=5 && pos<11 && newPos>=11)
		{
			player.get(currentPlayer).setPosition(11);
		}
		if(pos == 0)
		{
			newPos = movement + 11;
			player.get(currentPlayer).setPosition(newPos);
		}
		if(pos >11)
		{
			player.get(currentPlayer).setPosition(newPos);
		}
		updateCar();
	}
	
	public void updateCar()
	{
		int pos = player.get(currentPlayer).getPosition();
		if(pos == 3)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(379, 106, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(379, 106, 66, 31);
		}
		if(pos == 4)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(361, 148, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(361, 148, 66, 31);
		}
		if(pos == 5)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(328, 190, 78, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(328, 190, 78, 31);
		}
		if(pos == 6)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(331, 232, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(331, 232, 75, 45);
		}
		if(pos == 7)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(342, 288, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(342, 288, 75, 45);
		}
		if(pos == 8)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(379, 344, 78, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(379, 344, 78, 45);
		}
		if(pos == 9)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(473, 363, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(473, 363, 67, 45);
		}
		if(pos == 10)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(550, 344, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(550, 344, 75, 45);
		}
		if(pos == 11)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(632, 324, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(632, 324, 67, 38);
		}
		if(pos == 12)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(631, 96, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(631, 96, 86, 31);
		}
		if(pos == 13)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(658, 138, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(658, 138, 86, 31);
		}
		if(pos == 14)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(680, 187, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(680, 187, 86, 31);
		}
		if(pos == 15)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(708, 238, 76, 40);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(708, 238, 76, 40);
		}
		if(pos == 16)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(717, 286, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(717, 286, 67, 31);
		}
		if(pos == 17)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(709, 328, 75, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(709, 328, 75, 31);
		}
		if(pos == 18)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(682, 370, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(682, 370, 67, 38);
		}
		if(pos == 19)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(613, 400, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(613, 400, 67, 38);
		}
		if(pos == 20)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(539, 414, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(539, 414, 67, 45);
		}
		if(pos == 21)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(473, 417, 57, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(473, 417, 57, 38);
		}
		if(pos == 22)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
			bluePlayer.setBounds(390, 414, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
			greenPlayer.setBounds(390, 414, 75, 45);
		}
		updatePlayers();
	}
	public boolean degreeOrJob()
	{
		String[] options = new String[] {"Uni", "Career"};
	    int response = JOptionPane.showOptionDialog(null, "Choose your path.", "Uni or Career",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    boolean uni = false;
	    if (response == 0)
	    {
	    	uni = true;
	    }
	    return uni;
	}
	public int spinWheel()
	{
		checkPos();
		Random x = new Random();
		randomNum = x.nextInt(7);
		if (randomNum == 0)
		{
			randomNum = 1;
		}
		updatePos(randomNum);
		System.out.println(randomNum);
		return randomNum;
	}
}