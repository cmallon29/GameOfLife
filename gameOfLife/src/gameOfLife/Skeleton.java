	package gameOfLife;

	import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Window;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

	import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
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
	private int housePurchaser;
	private boolean gameOn;
	private ArrayList<Player> player = new ArrayList<Player>();
	private JFrame CareerFrame;
	int i = 1;
	int x ;
	private boolean selected = false;
	private boolean spinForMoney = false;
	private JLabel Card1;
	private JLabel numbers;
	private JPanel Left,Middle,Right,Bottom;
	private JButton Prev,Next,Accept;
	final ImageIcon[] degree = new ImageIcon[7];
	public ImageIcon[] family = new ImageIcon[8];
	final ImageIcon[] nonDegree = new ImageIcon[7];
	private ImageIcon[] Family = new ImageIcon[5];
	private String[] collectMoney = new String[20];
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
	private JFrame HouseFrame,HouseCard,CareerCard;
	final ImageIcon[] house = new ImageIcon[5];
	private JPanel player1Panel, player2Panel, player3Panel, player4Panel;
	private CareerCards card;
	private JLabel player6;
	private JLabel houseBack, hChoosen;
	private JLabel cChoosen, careerBack;
	private Random y = new Random();
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
	private JPanel startAllPanels;
	private JFrame lifeFrame;
	private JFrame lifeCard;
	private JLabel lifeBack;
	private JLabel[] familyLabel;

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
		//frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setExtendedState(Frame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon[] images = new ImageIcon[9];
		
		  images[1] = new ImageIcon("src/gameOfLife/imgs/Spinner Numbers/Spinner One.png");
		  images[2] = new ImageIcon("src/gameOfLife/imgs/Spinner Numbers/Spinner Two.png");
		  images[3] = new ImageIcon("src/gameOfLife/imgs/Spinner Numbers/Spinner Three.png");
		  images[4] = new ImageIcon("src/gameOfLife/imgs/Spinner Numbers/Spinner Four.png");
		  images[5] = new ImageIcon("src/gameOfLife/imgs/Spinner Numbers/Spinner Five.png");
		  images[6] = new ImageIcon("src/gameOfLife/imgs/Spinner Numbers/Spinner Six.png");
		  images[7] = new ImageIcon("src/gameOfLife/imgs/movingSpinner.png");
		  images[8] = new ImageIcon("src/gameOfLife/imgs/spinner.png");

		familyLabel = new JLabel[7];
		familyLabel[0] = new JLabel();
		familyLabel[1] = new JLabel();
		familyLabel[2] = new JLabel();
		familyLabel[3] = new JLabel();
		familyLabel[4] = new JLabel();
		familyLabel[5] = new JLabel();
		familyLabel[6] = new JLabel();
		
		Family[1] = new ImageIcon("src/gameOfLife/imgs/Children and Spouse/Male.png");
		Family[2] = new ImageIcon("src/gameOfLife/imgs/Children and Spouse/Female.png");
		Family[3] = new ImageIcon("src/gameOfLife/imgs/Children and Spouse/Boy.png");
		Family[4] = new ImageIcon("src/gameOfLife/imgs/Children and Spouse/Girl.png");
		familyLabel[0].setIcon(Family[1]);
		familyLabel[1].setIcon(Family[2]);
		familyLabel[2].setIcon(Family[3]);
		familyLabel[3].setIcon(Family[4]);
		  
		ImageIcon blueCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/blue_player.png");
		ImageIcon greenCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/green_player.png");
		ImageIcon pinkCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/pink_player.png");
		ImageIcon purpleCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/purple_player.png");
		ImageIcon redCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/red_player.png");
		ImageIcon yellowCar = new ImageIcon("src/gameOfLife/imgs/Profile pics/Cars/yellow_player.png");
			
		numbers= new JLabel();
		numbers.setBounds(533, 325, 350, 350);
		numbers.setVisible(true);
		numbers.setIcon(images[8]);

		frame.getContentPane().add(numbers);
		
		stopButton = new JButton("Stop the Wheel");
		stopButton.setBounds(480, 700, 150, 31);
		stopButton.setVisible(false);
		stopButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				System.out.println(player.get(currentPlayer).getPosition());
				spinButton.setVisible(true);
				stopButton.setVisible(false);
				Random x = new Random();
				randomNum = x.nextInt(7);
				if (randomNum == 0)
				{
					randomNum = 1;
				}
				if(randomNum ==1){
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
				try {
					spinWheel(randomNum);
					updatePos(randomNum);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

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
				numbers.setIcon(images[7]);
				spinButton.setVisible(false);
				stopButton.setVisible(true);
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
				
				bluePlayer = new JLabel();
				bluePlayer.setBounds(660,318,86,31);
				bluePlayer.setIcon(blueCar);
				bluePlayer.setVisible(true);
				frame.add(bluePlayer);
				player.get(i).setCarColour("Blue");
				player.get(i).setCarImage("gameOfLife/src/gameOfLife/imgs/Profile pics/Blue Player.JPG");
		  }
		  if(carChoice == 1)
		  {
				greenPlayer = new JLabel();
				greenPlayer.setBounds(660,318,86,31);
				greenPlayer.setIcon(greenCar);
				greenPlayer.setVisible(true);
				frame.add(greenPlayer);
				player.get(i).setCarColour("Green");
				player.get(i).setCarImage("gameOfLife/src/gameOfLife/imgs/Profile pics/Green Player.JPG");

		  }
		  if(carChoice == 2)
		  {
				pinkPlayer = new JLabel();
				pinkPlayer.setBounds(660,318,86,31);
				pinkPlayer.setIcon(pinkCar);
				pinkPlayer.setVisible(true);
				frame.add(pinkPlayer);
				player.get(i).setCarColour("Pink");
				player.get(i).setCarImage("gameOfLife/src/gameOfLife/imgs/Profile pics/Pink Player.JPG");

		  }
		  if(carChoice == 3)
		  {
				purplePlayer = new JLabel();
				purplePlayer.setBounds(660,318,86,31);
				purplePlayer.setIcon(purpleCar);
				purplePlayer.setVisible(true);
				frame.add(purplePlayer);
				player.get(i).setCarColour("Purple");
				player.get(i).setCarImage("gameOfLife/src/gameOfLife/imgs/Profile pics/Purple Player.JPG");
		  }
		  if(carChoice == 4)
		  {
				redPlayer = new JLabel();
				redPlayer.setBounds(660,318,86,31);
				redPlayer.setIcon(redCar);
				redPlayer.setVisible(true);
				frame.add(redPlayer);
				player.get(i).setCarColour("Red");
				player.get(i).setCarImage("gameOfLife/src/gameOfLife/imgs/Profile pics/Red Player.JPG");
		  }
		  if(carChoice == 5)
		  {
				yellowPlayer = new JLabel();
				yellowPlayer.setBounds(660,318,86,31);
				yellowPlayer.setIcon(yellowCar);
				yellowPlayer.setVisible(true);
				frame.add(yellowPlayer);
				player.get(i).setCarColour("Yellow");
				player.get(i).setCarImage("gameOfLife/src/gameOfLife/imgs/Profile pics/Yellow Player.JPG");
		  }
		}		
		gameOn = true;
		currentPlayer = 0;
		setPlayers();
		ImageIcon background = new ImageIcon("src/gameOfLife/imgs/MainBackground.jpg");
		JLabel backgroundLabel = new JLabel();
		backgroundLabel.setIcon(background);
		backgroundLabel.setVisible(true);
		backgroundLabel.setBounds(150, 10, 1400, 1000);
		frame.getContentPane().add(backgroundLabel);
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
		textField_3.setBounds(764, 357, 66, 31);
		textField_3.setEditable(false);
		textField_3.setText("Pay 40k");
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(240, 230, 140));
		textField_4.setBounds(836, 370, 66, 31);
		textField_4.setEditable(false);
		textField_4.setText("Collect 30K");
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(240, 230, 140));
		textField_5.setBounds(835, 440, 78, 31);
		textField_5.setEditable(false);
		textField_5.setText("Pay 30K");
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(240, 230, 140));
		textField_6.setBounds(820, 508, 75, 45);
		textField_6.setEditable(false);
		textField_6.setText("Collect 20K");
		frame.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(240, 230, 140));
		textField_7.setBounds(800, 570, 75, 45);
		textField_7.setEditable(false);
		textField_7.setText("Collect 10K");
		frame.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(240, 230, 140));
		textField_8.setBounds(750, 620, 78, 45);
		textField_8.setEditable(false);
		textField_8.setText("Sue a player 40k");
		frame.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(240, 230, 140));
		textField_9.setBounds(680, 647, 67, 45);
		textField_9.setEditable(false);
		textField_9.setText("Pay 30K");
		frame.getContentPane().add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(240, 230, 140));
		textField_10.setBounds(625, 641, 75, 45);
		textField_10.setEditable(false);
		textField_10.setText("Collect 40K");
		frame.getContentPane().add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBackground(new Color(240, 230, 140));
		textField_11.setBounds(560, 615, 67, 38);
		textField_11.setEditable(false);
		textField_11.setText("Stop pick career");
		frame.getContentPane().add(textField_11);
		//end of uni path

		//start of career path
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBackground(new Color(240, 230, 140));
		textField_12.setBounds(555, 362, 86, 31);
		textField_12.setEditable(false);
		textField_12.setText("Payday");
		frame.getContentPane().add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBackground(new Color(240, 230, 140));
		textField_13.setBounds(508, 423, 86, 31);
		textField_13.setEditable(false);
		textField_13.setText("Pay 30K");
		frame.getContentPane().add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBackground(new Color(240, 230, 140));
		textField_14.setBounds(475, 496, 86, 31);
		textField_14.setEditable(false);
		textField_14.setText("Sue a payer 40k");
		frame.getContentPane().add(textField_14);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBackground(new Color(240, 230, 140));
		textField_15.setBounds(467, 569, 76, 40);
		textField_15.setEditable(false);
		textField_15.setText("Collect 40k");
		frame.getContentPane().add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBackground(new Color(240, 230, 140));
		textField_16.setBounds(513, 635, 67, 31);
		textField_16.setEditable(false);
		textField_16.setText("Pay 10K");
		frame.getContentPane().add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBackground(new Color(240, 230, 140));
		textField_17.setBounds(584, 682, 75, 31);
		textField_17.setEditable(false);
		textField_17.setText("Collect 50K");
		frame.getContentPane().add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBackground(new Color(240, 230, 140));
		textField_18.setBounds(661, 698, 67, 38);
		textField_18.setEditable(false);
		textField_18.setText("Collect 30K");
		frame.getContentPane().add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBackground(new Color(240, 230, 140));
		textField_19.setBounds(742, 682, 67, 38);
		textField_19.setEditable(false);
		textField_19.setText("Spin to win 100k");
		frame.getContentPane().add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBackground(new Color(240, 230, 140));
		textField_20.setBounds(820, 621, 67, 45);
		textField_20.setEditable(false);
		textField_20.setText("Pay 20k");
		frame.getContentPane().add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBackground(new Color(240, 230, 140));
		textField_21.setBounds(859, 544, 57, 38);
		textField_21.setEditable(false);
		textField_21.setText("Payday");
		frame.getContentPane().add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBackground(new Color(240, 230, 140));
		textField_22.setBounds(878, 462, 75, 45);
		textField_22.setEditable(false);
		textField_22.setText("Collect 20K from each player");
		frame.getContentPane().add(textField_22);


		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBackground(new Color(240, 230, 140));
		textField_24.setBounds(896, 365, 67, 41);
		textField_24.setEditable(false);
		textField_24.setText("Stop (ship off to island one)");
		frame.getContentPane().add(textField_24);
		//end of career path

//		//uni path
//		textField_3 = new JTextField();
//		textField_3.setColumns(10);
//		textField_3.setBackground(new Color(240, 230, 140));
//		textField_3.setBounds(361, 148, 66, 31);
//		textField_3.setEditable(false);
//		textField_3.setText("Pick a Career");
//		frame.getContentPane().add(textField_3);
//		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
//		textField_4.setBackground(new Color(240, 230, 140));
//		textField_4.setBounds(379, 106, 66, 31);
//		textField_4.setEditable(false);
//		textField_4.setText("Collect 30K");
//		frame.getContentPane().add(textField_4);
//		
//		textField_5 = new JTextField();
//		textField_5.setColumns(10);
//		textField_5.setBackground(new Color(240, 230, 140));
//		textField_5.setBounds(328, 190, 78, 31);
//		textField_5.setEditable(false);
//		textField_5.setText("Pay 20K");
//		frame.getContentPane().add(textField_5);
//		
//		textField_6 = new JTextField();
//		textField_6.setColumns(10);
//		textField_6.setBackground(new Color(240, 230, 140));
//		textField_6.setBounds(331, 232, 75, 45);
//		textField_6.setEditable(false);
//		textField_6.setText("Collect 20K");
//		frame.getContentPane().add(textField_6);
//		
//		textField_7 = new JTextField();
//		textField_7.setColumns(10);
//		textField_7.setBackground(new Color(240, 230, 140));
//		textField_7.setBounds(342, 288, 75, 45);
//		textField_7.setEditable(false);
//		textField_7.setText("Collect 100K");
//		frame.getContentPane().add(textField_7);
//		
//		textField_8 = new JTextField();
//		textField_8.setColumns(10);
//		textField_8.setBackground(new Color(240, 230, 140));
//		textField_8.setBounds(379, 344, 78, 45);
//		textField_8.setEditable(false);
//		textField_8.setText("Collect 20K");
//		frame.getContentPane().add(textField_8);
//		
//		textField_9 = new JTextField();
//		textField_9.setColumns(10);
//		textField_9.setBackground(new Color(240, 230, 140));
//		textField_9.setBounds(473, 363, 67, 45);
//		textField_9.setEditable(false);
//		textField_9.setText("Pay 30K");
//		frame.getContentPane().add(textField_9);
//		
//		textField_10 = new JTextField();
//		textField_10.setColumns(10);
//		textField_10.setBackground(new Color(240, 230, 140));
//		textField_10.setBounds(550, 344, 75, 45);
//		textField_10.setEditable(false);
//		textField_10.setText("Collect 40K");
//		frame.getContentPane().add(textField_10);
//		
//		textField_11 = new JTextField();
//		textField_11.setColumns(10);
//		textField_11.setBackground(new Color(240, 230, 140));
//		textField_11.setBounds(632, 324, 67, 38);
//		textField_11.setEditable(false);
//		textField_11.setText("Stop");
//		frame.getContentPane().add(textField_11);
//		//end of uni path
//
//		//start of career path
//		textField_12 = new JTextField();
//		textField_12.setColumns(10);
//		textField_12.setBackground(new Color(240, 230, 140));
//		textField_12.setBounds(631, 96, 86, 31);
//		textField_12.setEditable(false);
//		textField_12.setText("Payday");
//		frame.getContentPane().add(textField_12);
//		
//		textField_13 = new JTextField();
//		textField_13.setColumns(10);
//		textField_13.setBackground(new Color(240, 230, 140));
//		textField_13.setBounds(658, 138, 86, 31);
//		textField_13.setEditable(false);
//		textField_13.setText("Collect 30K");
//		frame.getContentPane().add(textField_13);
//		
//		textField_14 = new JTextField();
//		textField_14.setColumns(10);
//		textField_14.setBackground(new Color(240, 230, 140));
//		textField_14.setBounds(680, 187, 86, 31);
//		textField_14.setEditable(false);
//		textField_14.setText("Pay 20K");
//		frame.getContentPane().add(textField_14);
//		
//		textField_15 = new JTextField();
//		textField_15.setColumns(10);
//		textField_15.setBackground(new Color(240, 230, 140));
//		textField_15.setBounds(708, 238, 76, 40);
//		textField_15.setEditable(false);
//		textField_15.setText("Collect 100K");
//		frame.getContentPane().add(textField_15);
//		
//		textField_16 = new JTextField();
//		textField_16.setColumns(10);
//		textField_16.setBackground(new Color(240, 230, 140));
//		textField_16.setBounds(717, 286, 67, 31);
//		textField_16.setEditable(false);
//		textField_16.setText("Collect 10K");
//		frame.getContentPane().add(textField_16);
//		
//		textField_17 = new JTextField();
//		textField_17.setColumns(10);
//		textField_17.setBackground(new Color(240, 230, 140));
//		textField_17.setBounds(709, 328, 75, 31);
//		textField_17.setEditable(false);
//		textField_17.setText("Collect 30K");
//		frame.getContentPane().add(textField_17);
//		
//		textField_18 = new JTextField();
//		textField_18.setColumns(10);
//		textField_18.setBackground(new Color(240, 230, 140));
//		textField_18.setBounds(682, 370, 67, 38);
//		textField_18.setEditable(false);
//		textField_18.setText("Collect 30K");
//		frame.getContentPane().add(textField_18);
//		
//		textField_19 = new JTextField();
//		textField_19.setColumns(10);
//		textField_19.setBackground(new Color(240, 230, 140));
//		textField_19.setBounds(613, 400, 67, 38);
//		textField_19.setEditable(false);
//		textField_19.setText("Take off");
//		frame.getContentPane().add(textField_19);
//		
//		textField_20 = new JTextField();
//		textField_20.setColumns(10);
//		textField_20.setBackground(new Color(240, 230, 140));
//		textField_20.setBounds(539, 414, 67, 45);
//		textField_20.setEditable(false);
//		textField_20.setText("Spin to Win 100K");
//		frame.getContentPane().add(textField_20);
//		
//		textField_21 = new JTextField();
//		textField_21.setColumns(10);
//		textField_21.setBackground(new Color(240, 230, 140));
//		textField_21.setBounds(473, 417, 57, 38);
//		textField_21.setEditable(false);
//		textField_21.setText("Payday");
//		frame.getContentPane().add(textField_21);
//		
//		textField_22 = new JTextField();
//		textField_22.setColumns(10);
//		textField_22.setBackground(new Color(240, 230, 140));
//		textField_22.setBounds(390, 414, 75, 45);
//		textField_22.setEditable(false);
//		textField_22.setText("Collect 20K from each player");
//		frame.getContentPane().add(textField_22);
//
//		
//		textField_24 = new JTextField();
//		textField_24.setColumns(10);
//		textField_24.setBackground(new Color(240, 230, 140));
//		textField_24.setBounds(63, 302, 67, 41);
//		textField_24.setEditable(false);
//		textField_24.setText("Stop (ship off to island one)");
//		frame.getContentPane().add(textField_24);
//		//end of career path
//		
//		//island one
//		textField_25 = new JTextField();
//		textField_25.setColumns(10);
//		textField_25.setBackground(new Color(240, 230, 140));
//		textField_25.setBounds(140, 299, 57, 31);
//		textField_25.setEditable(false);
//		textField_25.setText("(Give option to buy house)");
//		frame.getContentPane().add(textField_25);
//		
//		textField_26 = new JTextField();
//		textField_26.setColumns(10);
//		textField_26.setBackground(new Color(240, 230, 140));
//		textField_26.setBounds(160, 266, 57, 26);
//		textField_26.setEditable(false);
//		textField_26.setText("Spin to win 100K");
//		frame.getContentPane().add(textField_26);
//		
//		textField_27 = new JTextField();
//		textField_27.setColumns(10);
//		textField_27.setBackground(new Color(240, 230, 140));
//		textField_27.setBounds(171, 217, 46, 38);
//		textField_27.setEditable(false);
//		textField_27.setText("Collect 40K");
//		frame.getContentPane().add(textField_27);
//		
//		textField_28 = new JTextField();
//		textField_28.setColumns(10);
//		textField_28.setBackground(new Color(240, 230, 140));
//		textField_28.setBounds(181, 175, 57, 31);
//		textField_28.setEditable(false);
//		textField_28.setText("(Blank tile)");
//		frame.getContentPane().add(textField_28);
//		
//		textField_29 = new JTextField();
//		textField_29.setColumns(10);
//		textField_29.setBackground(new Color(240, 230, 140));
//		textField_29.setBounds(199, 138, 57, 31);
//		textField_29.setEditable(false);
//		textField_29.setText("Take 50K from another player");
//		frame.getContentPane().add(textField_29);
//		
//		textField_30 = new JTextField();
//		textField_30.setColumns(10);
//		textField_30.setBackground(new Color(240, 230, 140));
//		textField_30.setBounds(217, 96, 57, 31);
//		textField_30.setEditable(false);
//		textField_30.setText("(Blank tile)");
//		frame.getContentPane().add(textField_30);
//		
//		textField_31 = new JTextField();
//		textField_31.setColumns(10);
//		textField_31.setBackground(new Color(240, 230, 140));
//		textField_31.setBounds(207, 21, 67, 31);
//		textField_31.setEditable(false);
//		textField_31.setText("(Blank tile)");
//		frame.getContentPane().add(textField_31);
//		
//		textField_32 = new JTextField();
//		textField_32.setColumns(10);
//		textField_32.setBackground(new Color(240, 230, 140));
//		textField_32.setBounds(140, 11, 63, 31);
//		textField_32.setEditable(false);
//		textField_32.setText("Pay 30K");
//		frame.getContentPane().add(textField_32);
//		
//		textField_33 = new JTextField();
//		textField_33.setColumns(10);
//		textField_33.setBackground(new Color(240, 230, 140));
//		textField_33.setBounds(80, 11, 57, 31);
//		textField_33.setEditable(false);
//		textField_33.setText("(Blank tile)");
//		frame.getContentPane().add(textField_33);
//		
//		textField_34 = new JTextField();
//		textField_34.setColumns(10);
//		textField_34.setBackground(new Color(240, 230, 140));
//		textField_34.setBounds(217, 63, 67, 26);
//		textField_34.setEditable(false);
//		textField_34.setText("(Pub crawl, Pay 20K (Collect pub crawl 		token))");
//		frame.getContentPane().add(textField_34);
//		
//		textField_35 = new JTextField();
//		textField_35.setColumns(10);
//		textField_35.setBackground(new Color(240, 230, 140));
//		textField_35.setBounds(10, 37, 57, 31);
//		textField_35.setEditable(false);
//		textField_35.setText("(Blank tile)");
//		frame.getContentPane().add(textField_35);
//		
//		textField_36 = new JTextField();
//		textField_36.setColumns(10);
//		textField_36.setBackground(new Color(240, 230, 140));
//		textField_36.setBounds(20, 76, 57, 31);
//		textField_36.setEditable(false);
//		textField_36.setText("Stop(Collect 100K)");
//		frame.getContentPane().add(textField_36);
//		
//		textField_37 = new JTextField();
//		textField_37.setColumns(10);
//		textField_37.setBackground(new Color(240, 230, 140));
//		textField_37.setBounds(10, 124, 57, 31);
//		textField_37.setEditable(false);
//		textField_37.setText("(Give option to buy house)");
//		frame.getContentPane().add(textField_37);
//		
//		textField_38 = new JTextField();
//		textField_38.setColumns(10);
//		textField_38.setBackground(new Color(240, 230, 140));
//		textField_38.setBounds(10, 171, 57, 31);
//		textField_38.setEditable(false);
//		textField_38.setText("Collect 20K");
//		frame.getContentPane().add(textField_38);
//		
//		textField_39 = new JTextField();
//		textField_39.setColumns(10);
//		textField_39.setBackground(new Color(240, 230, 140));
//		textField_39.setBounds(20, 213, 57, 31);
//		textField_39.setEditable(false);
//		textField_39.setText("Get a pet");
//		frame.getContentPane().add(textField_39);
//		
//		textField_40 = new JTextField();
//		textField_40.setColumns(10);
//		textField_40.setBackground(new Color(240, 230, 140));
//		textField_40.setBounds(20, 259, 57, 31);
//		textField_40.setEditable(false);
//		textField_40.setText("(Blank tile)");
//		frame.getContentPane().add(textField_40);
//		
//		textField_41 = new JTextField();
//		textField_41.setColumns(10);
//		textField_41.setBackground(new Color(240, 230, 140));
//		textField_41.setBounds(747, 26, 57, 31);
//		textField_41.setEditable(false);
//		textField_41.setText("(Blank tile)");
//		frame.getContentPane().add(textField_41);
//		
//		textField_42 = new JTextField();
//		textField_42.setColumns(10);
//		textField_42.setBackground(new Color(240, 230, 140));
//		textField_42.setBounds(824, 26, 57, 31);
//		textField_42.setEditable(false);
//		textField_42.setText("Take off");
//		frame.getContentPane().add(textField_42);
//		//end of island one
//		
//		//Start of island two
//		textField_43 = new JTextField();
//		textField_43.setColumns(10);
//		textField_43.setBackground(new Color(240, 230, 140));
//		textField_43.setBounds(902, 26, 57, 31);
//		textField_43.setEditable(false);
//		textField_43.setText("Spin to win 100K");
//		frame.getContentPane().add(textField_43);
//		
//		textField_44 = new JTextField();
//		textField_44.setColumns(10);
//		textField_44.setBackground(new Color(240, 230, 140));
//		textField_44.setBounds(970, 26, 57, 31);
//		textField_44.setEditable(false);
//		textField_44.setText("(Blank tile)");
//		frame.getContentPane().add(textField_44);
//		
//		textField_45 = new JTextField();
//		textField_45.setColumns(10);
//		textField_45.setBackground(new Color(240, 230, 140));
//		textField_45.setBounds(1038, 26, 57, 31);
//		textField_45.setEditable(false);
//		textField_45.setText("Sue another player for 50K");
//		frame.getContentPane().add(textField_45);
//		
//		textField_46 = new JTextField();
//		textField_46.setColumns(10);
//		textField_46.setBackground(new Color(240, 230, 140));
//		textField_46.setBounds(1038, 66, 57, 31);
//		textField_46.setEditable(false);
//		textField_46.setText("Have a baby/ get married");
//		frame.getContentPane().add(textField_46);
//		
//		textField_48 = new JTextField();
//		textField_48.setColumns(10);
//		textField_48.setBackground(new Color(240, 230, 140));
//		textField_48.setBounds(1038, 153, 57, 31);
//		textField_48.setEditable(false);
//		textField_48.setText("(Give option to buy a house)");
//		frame.getContentPane().add(textField_48);
//		
//		textField_49 = new JTextField();
//		textField_49.setColumns(10);
//		textField_49.setBackground(new Color(240, 230, 140));
//		textField_49.setBounds(1038, 194, 57, 31);
//		textField_49.setEditable(false);
//		textField_49.setText("Take off");
//		frame.getContentPane().add(textField_49);
//		
//		textField_50 = new JTextField();
//		textField_50.setColumns(10);
//		textField_50.setBackground(new Color(240, 230, 140));
//		textField_50.setBounds(1038, 236, 57, 31);
//		textField_50.setEditable(false);
//		textField_50.setText("Promotion");
//		frame.getContentPane().add(textField_50);
//		
//		textField_51 = new JTextField();
//		textField_51.setColumns(10);
//		textField_51.setBackground(new Color(240, 230, 140));
//		textField_51.setBounds(970, 192, 57, 31);
//		textField_51.setEditable(false);
//		textField_51.setText("Collect 50k");
//		
//		frame.getContentPane().add(textField_51);
//		
//		textField_52 = new JTextField();
//		textField_52.setColumns(10);
//		textField_52.setBackground(new Color(240, 230, 140));
//		textField_52.setBounds(902, 192, 57, 31);
//		textField_52.setEditable(false);
//		textField_52.setText("Payday");
//		frame.getContentPane().add(textField_52);
//		
//		textField_53 = new JTextField();
//		textField_53.setColumns(10);
//		textField_53.setBackground(new Color(240, 230, 140));
//		textField_53.setBounds(824, 192, 57, 31);
//		textField_53.setEditable(false);
//		textField_53.setText("(Blank tile)");
//		frame.getContentPane().add(textField_53);
//		
//		textField_54 = new JTextField();
//		textField_54.setColumns(10);
//		textField_54.setBackground(new Color(240, 230, 140));
//		textField_54.setBounds(796, 143, 57, 31);
//		textField_54.setEditable(false);
//		textField_54.setText("Hospital Pay 100K(Collect cool scar 			token)");
//		frame.getContentPane().add(textField_54);
//		
//		textField_55 = new JTextField();
//		textField_55.setColumns(10);
//		textField_55.setBackground(new Color(240, 230, 140));
//		textField_55.setBounds(777, 85, 57, 31);
//		textField_55.setEditable(false);
//		textField_55.setText("(Blank tile)");
//		frame.getContentPane().add(textField_55);
//		
//		textField_56 = new JTextField();
//		textField_56.setColumns(10);
//		textField_56.setBackground(new Color(240, 230, 140));
//		textField_56.setBounds(1038, 278, 57, 31);
//		textField_56.setEditable(false);
//		textField_56.setText("Pay 70K (choose to go right or 			straight)");
//		frame.getContentPane().add(textField_56);
//		//Straight path joins back to sue another player for 50K
//		
//		//Right path
//		textField_57 = new JTextField();
//		textField_57.setColumns(10);
//		textField_57.setBackground(new Color(240, 230, 140));
//		textField_57.setBounds(1038, 324, 57, 31);
//		textField_57.setEditable(false);
//		textField_57.setText("(Blank tile)");
//		frame.getContentPane().add(textField_57);
//		
//		textField_58 = new JTextField();
//		textField_58.setColumns(10);
//		textField_58.setBackground(new Color(240, 230, 140));
//		textField_58.setBounds(951, 311, 57, 31);
//		textField_58.setEditable(false);
//		textField_58.setText("Payday");
//		frame.getContentPane().add(textField_58);
//		
//		textField_59 = new JTextField();
//		textField_59.setColumns(10);
//		textField_59.setBackground(new Color(240, 230, 140));
//		textField_59.setBounds(882, 292, 57, 31);
//		textField_59.setEditable(false);
//		textField_59.setText("Take off");
//		frame.getContentPane().add(textField_59);
//		//End of island two
//		
//
//		//Island 3
//		textField_60 = new JTextField();
//		textField_60.setColumns(10);
//		textField_60.setBackground(new Color(240, 230, 140));
//		textField_60.setBounds(855, 248, 57, 31);
//		textField_60.setEditable(false);
//		textField_60.setText("Collect 100K");
//		frame.getContentPane().add(textField_60);
//		
//		textField_61 = new JTextField();
//		textField_61.setColumns(10);
//		textField_61.setBackground(new Color(240, 230, 140));
//		textField_61.setBounds(709, 481, 57, 31);
//		textField_61.setEditable(false);
//		textField_61.setText("(Blank tile)");
//		frame.getContentPane().add(textField_61);
//		
//		textField_62 = new JTextField();
//		textField_62.setColumns(10);
//		textField_62.setBackground(new Color(240, 230, 140));
//		textField_62.setBounds(777, 461, 57, 31);
//		textField_62.setEditable(false);
//		textField_62.setText("Have a baby/ get married(choose to go right 		or straight on)");
//		frame.getContentPane().add(textField_62);
//		
//		//Straight path
//		textField_63 = new JTextField();
//		textField_63.setColumns(10);
//		textField_63.setBackground(new Color(240, 230, 140));
//		textField_63.setBounds(844, 448, 57, 31);
//		textField_63.setEditable(false);
//		textField_63.setText("()Blank tile");
//		frame.getContentPane().add(textField_63);
//		
//		textField_64 = new JTextField();
//		textField_64.setColumns(10);
//		textField_64.setBackground(new Color(240, 230, 140));
//		textField_64.setBounds(902, 436, 57, 31);
//		textField_64.setEditable(false);
//		textField_64.setText("Payday");
//		frame.getContentPane().add(textField_64);
//		
//		textField_65 = new JTextField();
//		textField_65.setColumns(10);
//		textField_65.setBackground(new Color(240, 230, 140));
//		textField_65.setBounds(970, 404, 57, 31);
//		textField_65.setEditable(false);
//		textField_65.setText("Uni or Career");
//		frame.getContentPane().add(textField_65);
//		
//		textField_66 = new JTextField();
//		textField_66.setColumns(10);
//		textField_66.setBackground(new Color(240, 230, 140));
//		textField_66.setBounds(1038, 388, 57, 31);
//		textField_66.setEditable(false);
//		textField_66.setText("Collect from each player 30K");
//		frame.getContentPane().add(textField_66);
//		
//		textField_67 = new JTextField();
//		textField_67.setColumns(10);
//		textField_67.setBackground(new Color(240, 230, 140));
//		textField_67.setBounds(1085, 421, 57, 31);
//		textField_67.setEditable(false);
//		textField_67.setText("Give option to buy a house");
//		frame.getContentPane().add(textField_67);
//		
//		textField_68 = new JTextField();
//		textField_68.setColumns(10);
//		textField_68.setBackground(new Color(240, 230, 140));
//		textField_68.setBounds(1115, 461, 57, 31);
//		textField_68.setEditable(false);
//		textField_68.setText("(Blank tile)");
//		frame.getContentPane().add(textField_68);
//		
//		textField_69 = new JTextField();
//		textField_69.setColumns(10);
//		textField_69.setBackground(new Color(240, 230, 140));
//		textField_69.setBounds(1125, 505, 57, 31);
//		textField_69.setEditable(false);
//		textField_69.setText("Take off");
//		frame.getContentPane().add(textField_69);
//		//Straight path joins with right path at Pay 40K
//		
//		//Right path
//		textField_70 = new JTextField();
//		textField_70.setColumns(10);
//		textField_70.setBackground(new Color(240, 230, 140));
//		textField_70.setBounds(1115, 558, 57, 31);
//		textField_70.setEditable(false);
//		textField_70.setText("Collect 20K");
//		frame.getContentPane().add(textField_70);
//		
//		textField_71 = new JTextField();
//		textField_71.setColumns(10);
//		textField_71.setBackground(new Color(240, 230, 140));
//		textField_71.setBounds(1102, 603, 57, 31);
//		textField_71.setEditable(false);
//		textField_71.setText("(Blank tile)");
//		frame.getContentPane().add(textField_71);
//		
//		textField_72 = new JTextField();
//		textField_72.setColumns(10);
//		textField_72.setBackground(new Color(240, 230, 140));
//		textField_72.setBounds(1085, 645, 57, 31);
//		textField_72.setEditable(false);
//		textField_72.setText("Pay 40K");
//		frame.getContentPane().add(textField_72);
//		
//		textField_73 = new JTextField();
//		textField_73.setColumns(10);
//		textField_73.setBackground(new Color(240, 230, 140));
//		textField_73.setBounds(1038, 688, 57, 31);
//		textField_73.setEditable(false);
//		textField_73.setText("(Blank tile)");
//		frame.getContentPane().add(textField_73);
//		
//		textField_74 = new JTextField();
//		textField_74.setColumns(10);
//		textField_74.setBackground(new Color(240, 230, 140));
//		textField_74.setBounds(970, 693, 57, 31);
//		textField_74.setEditable(false);
//		textField_74.setText("Spin to win 100K");
//		frame.getContentPane().add(textField_74);
//		
//		textField_75 = new JTextField();
//		textField_75.setColumns(10);
//		textField_75.setBackground(new Color(240, 230, 140));
//		textField_75.setBounds(902, 693, 57, 31);
//		textField_75.setEditable(false);
//		textField_75.setText("Give option to buy a house");
//		frame.getContentPane().add(textField_75);
//		
//		textField_76 = new JTextField();
//		textField_76.setColumns(10);
//		textField_76.setBackground(new Color(240, 230, 140));
//		textField_76.setBounds(824, 688, 57, 31);
//		textField_76.setEditable(false);
//		textField_76.setText("Get a pet");
//		frame.getContentPane().add(textField_76);
//		
//		textField_77 = new JTextField();
//		textField_77.setColumns(10);
//		textField_77.setBackground(new Color(240, 230, 140));
//		textField_77.setBounds(747, 688, 57, 31);
//		textField_77.setEditable(false);
//		textField_77.setText("(Blank tile)");
//		frame.getContentPane().add(textField_77);
//		
//		textField_78 = new JTextField();
//		textField_78.setColumns(10);
//		textField_78.setBackground(new Color(240, 230, 140));
//		textField_78.setBounds(675, 676, 57, 31);
//		textField_78.setEditable(false);
//		textField_78.setText("Collect 30K");
//		frame.getContentPane().add(textField_78);
//		
//		textField_79 = new JTextField();
//		textField_79.setColumns(10);
//		textField_79.setBackground(new Color(240, 230, 140));
//		textField_79.setBounds(613, 632, 57, 31);
//		textField_79.setEditable(false);
//		textField_79.setText("Uni or Career");
//		frame.getContentPane().add(textField_79);
//		
//		textField_80 = new JTextField();
//		textField_80.setColumns(10);
//		textField_80.setBackground(new Color(240, 230, 140));
//		textField_80.setBounds(613, 590, 57, 31);
//		textField_80.setEditable(false);
//		textField_80.setText("(Blank tile)");
//		frame.getContentPane().add(textField_80);
//		
//		textField_81 = new JTextField();
//		textField_81.setColumns(10);
//		textField_81.setBackground(new Color(240, 230, 140));
//		textField_81.setBounds(613, 548, 57, 31);
//		textField_81.setEditable(false);
//		textField_81.setText("Go to Disney World(Collect disney token)");
//		frame.getContentPane().add(textField_81);
//		//End of island three
//		
//		//Start of island four
//		textField_82 = new JTextField();
//		textField_82.setColumns(10);
//		textField_82.setBackground(new Color(240, 230, 140));
//		textField_82.setBounds(692, 579, 57, 31);
//		textField_82.setEditable(false);
//		textField_82.setText("Collect 50K");
//		frame.getContentPane().add(textField_82);
//		
//		textField_83 = new JTextField();
//		textField_83.setColumns(10);
//		textField_83.setBackground(new Color(240, 230, 140));
//		textField_83.setBounds(766, 568, 57, 31);
//		textField_83.setEditable(false);
//		textField_83.setText("Give option of buying a house");
//		frame.getContentPane().add(textField_83);
//		
//		textField_84 = new JTextField();
//		textField_84.setColumns(10);
//		textField_84.setBackground(new Color(240, 230, 140));
//		textField_84.setBounds(855, 558, 57, 31);
//		textField_84.setEditable(false);
//		textField_84.setText("Spin to win");
//		frame.getContentPane().add(textField_84);
//		
//		textField_85 = new JTextField();
//		textField_85.setColumns(10);
//		textField_85.setBackground(new Color(240, 230, 140));
//		textField_85.setBounds(951, 558, 57, 31);
//		textField_85.setEditable(false);
//		textField_85.setText("(Blank tile)");
//		frame.getContentPane().add(textField_85);
//		
//		textField_86 = new JTextField();
//		textField_86.setColumns(10);
//		textField_86.setBackground(new Color(240, 230, 140));
//		textField_86.setBounds(1038, 558, 57, 31);
//		textField_86.setEditable(false);
//		textField_86.setText("Pay 30K");
//		frame.getContentPane().add(textField_86);
//		
//		textField_87 = new JTextField();
//		textField_87.setColumns(10);
//		textField_87.setBackground(new Color(240, 230, 140));
//		textField_87.setBounds(613, 505, 86, 31);
//		textField_87.setEditable(false);
//		textField_87.setText("Stop (Collect 100K)");
//		frame.getContentPane().add(textField_87);
//		
//		textField_88 = new JTextField();
//		textField_88.setColumns(10);
//		textField_88.setBackground(new Color(240, 230, 140));
//		textField_88.setBounds(58, 461, 57, 31);
//		textField_88.setEditable(false);
//		textField_88.setText("(Blank tile)");
//		frame.getContentPane().add(textField_88);
//		
//		textField_89 = new JTextField();
//		textField_89.setColumns(10);
//		textField_89.setBackground(new Color(240, 230, 140));
//		textField_89.setBounds(132, 481, 57, 31);
//		textField_89.setEditable(false);
//		textField_89.setText("(Blank tile)");
//		frame.getContentPane().add(textField_89);
//		
//		textField_90 = new JTextField();
//		textField_90.setColumns(10);
//		textField_90.setBackground(new Color(240, 230, 140));
//		textField_90.setBounds(199, 505, 57, 31);
//		textField_90.setEditable(false);
//		textField_90.setText("Have a baby/ get married");
//		frame.getContentPane().add(textField_90);
//		
//		textField_91 = new JTextField();
//		textField_91.setColumns(10);
//		textField_91.setBackground(new Color(240, 230, 140));
//		textField_91.setBounds(267, 515, 57, 31);
//		textField_91.setEditable(false);
//		textField_91.setText("Collect 20K");
//		frame.getContentPane().add(textField_91);
//		
//		textField_92 = new JTextField();
//		textField_92.setColumns(10);
//		textField_92.setBackground(new Color(240, 230, 140));
//		textField_92.setBounds(331, 547, 57, 31);
//		textField_92.setEditable(false);
//		textField_92.setText("Payday");
//		frame.getContentPane().add(textField_92);
//		
//		textField_93 = new JTextField();
//		textField_93.setColumns(10);
//		textField_93.setBackground(new Color(240, 230, 140));
//		textField_93.setBounds(364, 590, 57, 31);
//		textField_93.setEditable(false);
//		textField_93.setText("(Blank tile)");
//		frame.getContentPane().add(textField_93);
//		
//		textField_94 = new JTextField();
//		textField_94.setColumns(10);
//		textField_94.setBackground(new Color(240, 230, 140));
//		textField_94.setBounds(387, 632, 57, 31);
//		textField_94.setEditable(false);
//		textField_94.setText("(Blank tile), choose to go right or 			straight path");
//		frame.getContentPane().add(textField_94);
//		
//		//right path
//		textField_95 = new JTextField();
//		textField_95.setColumns(10);
//		textField_95.setBackground(new Color(240, 230, 140));
//		textField_95.setBounds(20, 515, 57, 31);
//		textField_95.setEditable(false);
//		textField_95.setText("Sue another player for 100K");
//		frame.getContentPane().add(textField_95);
//		
//		textField_96 = new JTextField();
//		textField_96.setColumns(10);
//		textField_96.setBackground(new Color(240, 230, 140));
//		textField_96.setBounds(30, 558, 57, 31);
//		textField_96.setEditable(false);
//		textField_96.setText("Tour around Belfast, pay 20K(Collect 			sightseeing token)");
//		frame.getContentPane().add(textField_96);
//		
//		textField_97 = new JTextField();
//		textField_97.setColumns(10);
//		textField_97.setBackground(new Color(240, 230, 140));
//		textField_97.setBounds(54, 608, 57, 31);
//		textField_97.setEditable(false);
//		textField_97.setText("Collect 50K");
//		frame.getContentPane().add(textField_97);
//		//Join back up with textField_85
//		
//		//Straight path
//		textField_98 = new JTextField();
//		textField_98.setColumns(10);
//		textField_98.setBackground(new Color(240, 230, 140));
//		textField_98.setBounds(80, 650, 57, 31);
//		textField_98.setEditable(false);
//		textField_98.setText("End game");
//		frame.getContentPane().add(textField_98);
		
		
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
		player1Panel = new JPanel();
		player1Panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		player1Panel.setLayout(new GridLayout(3,2));
		player1Panel.setBounds(1250, 125, 400, 125);
		ImageIcon playerCar = new ImageIcon(player.get(0).getCarImage());
		familyLabel[6].setIcon(playerCar);
		player1Panel.add(familyLabel[6]);
		player1Panel.setVisible(false);
		frame.add(player1Panel);
		
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
		
		player2Panel = new JPanel();
		player2Panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		player2Panel.setLayout(new GridLayout(3,2));
		player2Panel.setBounds(1250, 250, 400, 125);
		ImageIcon playerCar = new ImageIcon(player.get(1).getCarImage());
		familyLabel[6].setIcon(playerCar);
		player2Panel.add(familyLabel[6]);
		frame.add(player2Panel);
		player2Panel.setVisible(false);

	}
	public void setPlayerThree()
	{
		player3= new JLabel();
		player3.setBounds(1250, 375, 400, 125);
		player3.setVisible(true);
		player3.setText("<html>Player 3 <br>Name: " + player.get(2).getName() + "<br>Money: " + player.get(2).getMoney()
				+ "<br>Car: " + player.get(2).getCarColour()+"</html>");
		player3.setForeground(Color.BLACK);
		player3.setBackground(Color.WHITE);
		player3.setOpaque(true);
		frame.add(player3);
		
		player3Panel = new JPanel();
		player3Panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		player3Panel.setLayout(new GridLayout(3,2));
		player3Panel.setBounds(1250, 625, 400, 200);
		
		ImageIcon playerCar = new ImageIcon(player.get(2).getCarImage());
		familyLabel[6].setIcon(playerCar);
		player3Panel.add(familyLabel[6]);
		frame.add(player3Panel);
		player3Panel.setVisible(false);
	}
	public void setPlayerFour()
	{
		player4= new JLabel();
		player4.setBounds(1250, 500, 400, 125);
		player4.setVisible(true);
		player4.setText("<html>Player 4 <br>Name: " + player.get(3).getName() + "<br>Money: " + player.get(3).getMoney()
				+ "<br>Car: " + player.get(3).getCarColour()+"</html>");
		player4.setForeground(Color.BLACK);
		player4.setBackground(Color.WHITE);
		player4.setOpaque(true);
		frame.add(player4);
		
		player4Panel = new JPanel();
		player4Panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		player4Panel.setLayout(new GridLayout(3,2));
		player4Panel.setBounds(1250, 875, 400, 200);
		ImageIcon playerCar = new ImageIcon(player.get(3).getCarImage());
		familyLabel[6].setIcon(playerCar);
		player4Panel.add(familyLabel[6]);
		frame.add(player4Panel);
		player4Panel.setVisible(false);

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
				+ "<br>House: " + player.get(0).getHouse()+ "<br>Car: " + player.get(0).getCarColour()+"<br>Job: "+player.get(0).getJob()+"</html>");
		player1.setBackground(Color.white);
		ImageIcon playerCar = new ImageIcon(player.get(0).getCarImage());
		familyLabel[6].setIcon(playerCar);
		player1Panel.add(familyLabel[6]);
		for(x = 0; x < player.get(0).getFamily()+1; x++)
		{
			if (x == 1 && player.get(0).isGender())
			{
				player1Panel.add(familyLabel[0]);  
			}
			if (x == 1 && !(player.get(0).isGender()))
			{
				player1Panel.add(familyLabel[1]);  
			}
			if (x == 2 && player.get(0).isGender() && player.get(0).isMarried())
			{
				player1Panel.add(familyLabel[1]);  
			}
			if (x == 2 && !(player.get(0).isGender()) && player.get(0).isMarried())
			{
				player1Panel.add(familyLabel[0]);  
			}
		}
		if(totPlayers>0)
		{
			playerCar = new ImageIcon(player.get(1).getCarImage());
			familyLabel[6].setIcon(playerCar);
			player2Panel.add(familyLabel[6]);
			for(x = 0; x < player.get(1).getFamily()+1; x++)
			{
				if (x == 1 && player.get(1).isGender())
				{
					player2Panel.add(familyLabel[0]);  
				}
				if (x == 1 && !(player.get(1).isGender()))
				{
					player2Panel.add(familyLabel[1]);  
				}
				if (x == 2 && player.get(1).isGender() && player.get(1).isMarried())
				{
					player2Panel.add(familyLabel[1]);  
				}
				if (x == 2 && !(player.get(1).isGender()) && player.get(1).isMarried())
				{
					player2Panel.add(familyLabel[0]);  
				}
			}
			player2.setText("<html>Player 2 <br>Name: " + player.get(1).getName() + "<br>Money: " + player.get(1).getMoney()
					+ "<br>House: " + player.get(1).getHouse()+ "<br>Car: " + player.get(1).getCarColour()+"<br>Job: "+player.get(1).getJob()+"</html>");
			player2.setBackground(Color.white);
			if(totPlayers>1)
			{
				playerCar = new ImageIcon(player.get(2).getCarImage());
				familyLabel[6].setIcon(playerCar);
				player3Panel.add(familyLabel[6]);
				for(x = 0; x < player.get(2).getFamily()+1; x++)
				{
					if (x == 1 && player.get(2).isGender())
					{
						player3Panel.add(familyLabel[0]);  
					}
					if (x == 1 && !(player.get(2).isGender()))
					{
						player3Panel.add(familyLabel[1]);  
					}
					if (x == 2 && player.get(2).isGender() && player.get(2).isMarried())
					{
						player3Panel.add(familyLabel[1]);  
					}
					if (x == 2 && !(player.get(2).isGender()) && player.get(2).isMarried())
					{
						player3Panel.add(familyLabel[0]);  
					}
				}
				player3.setText("<html>Player 3 <br>Name: " + player.get(2).getName() + "<br>Money: " + player.get(2).getMoney()
						+ "<br>House: " + player.get(2).getHouse()+ "<br>Car: " + player.get(2).getCarColour()+"<br>Job: "+player.get(2).getJob()+"</html>");
				player3.setBackground(Color.white);
				if(totPlayers>2)
				{
					playerCar = new ImageIcon(player.get(3).getCarImage());
					familyLabel[6].setIcon(playerCar);
					player4Panel.add(familyLabel[6]);
					for(x = 0; x < player.get(3).getFamily()+1; x++)
					{
						if (x == 1 && player.get(3).isGender())
						{
							player4Panel.add(familyLabel[0]);  
						}
						if (x == 1 && !(player.get(3).isGender()))
						{
							player4Panel.add(familyLabel[1]);  
						}
						if (x == 2 && player.get(3).isGender() && player.get(3).isMarried())
						{
							player4Panel.add(familyLabel[1]);  
						}
						if (x == 2 && !(player.get(3).isGender()) && player.get(3).isMarried())
						{
							player4Panel.add(familyLabel[0]);  
						}
					}
					player4.setText("<html>Player 4 <br>Name: " + player.get(3).getName() + "<br>Money: " + player.get(3).getMoney()
							+ "<br>House: " + player.get(3).getHouse()+ "<br>Car: " + player.get(3).getCarColour()+"<br>Job: "+player.get(3).getJob()+"</html>");
					player4.setBackground(Color.white);
				}
			}
		}
		if(totPlayers > 0)
		{
			player2.setText("<html>Player 2 <br>Name: " + player.get(1).getName() + "<br>Money: " + player.get(1).getMoney()
					+ "<br>House: " + player.get(1).getHouse()+ "<br>Car: " + player.get(1).getCarColour()+"<br>Job: "+player.get(1).getJob()+"</html>");
			if(currentPlayer == 0)
				player2.setBackground(Color.YELLOW);
			if(totPlayers>1)
			{
				player3.setText("<html>Player 3 <br>Name: " + player.get(2).getName() + "<br>Money: " + player.get(2).getMoney()
						+ "<br>House: " + player.get(2).getHouse()+ "<br>Car: " + player.get(2).getCarColour()+"<br>Job: "+player.get(2).getJob()+"</html>");
				if(currentPlayer == 1)
					player3.setBackground(Color.YELLOW);
				if(totPlayers>2)
				{
					player4.setText("<html>Player 4 <br>Name: " + player.get(3).getName() + "<br>Money: " + player.get(3).getMoney()
							+ "<br>House: " + player.get(3).getHouse()+ "<br>Car: " + player.get(3).getCarColour()+"<br>Job: "+player.get(3).getJob()+"</html>");
					if(currentPlayer == 2)
						player4.setBackground(Color.YELLOW);
				}
			}
		}
		if(totPlayers == currentPlayer)
		{
			player1.setBackground(Color.YELLOW);
		}
		if(currentPlayer!=totPlayers)
		{
			currentPlayer++;
		}
		else
			currentPlayer = 0;
		if(selected = true )
		{
			JOptionPane.showMessageDialog( null, "It is now " + player.get(currentPlayer).getName()+"'s turn.","New turn",JOptionPane.OK_CANCEL_OPTION);
		}
	}
	public void checkPos() throws IOException
	{
		if (player.get(currentPlayer).getPosition() == 1)
		{
			//boolean uni = degreeOrJob();
			selected = false;
			String[] options = new String[] { "Degree", "Job" };
			int careerResponse = JOptionPane.showOptionDialog(null,
					"Pick either Degree or Job", "Choose a Career Path",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					null, options, options[0]);
			if (careerResponse == 0)
			{
				player.get(currentPlayer).setUni(true);
			}
			if(careerResponse == 1)
			{
				player.get(currentPlayer).setUni(false);
				careerCards();
			}
		}
	
		if (player.get(currentPlayer).getPosition() == 2)
		{
			payForty(); 
		}
		if (player.get(currentPlayer).getPosition() == 3)
		{
			collectThirty();
		}
		if (player.get(currentPlayer).getPosition() == 4)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 5)
		{
			collectTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 6)
		{
			collectTen();
		}
		if (player.get(currentPlayer).getPosition() == 7)
		{
			suePlayer(40000);
		}
		if (player.get(currentPlayer).getPosition() == 8)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 9)
		{
			collectForty();
		}
		if (player.get(currentPlayer).getPosition() == 10 && player.get(currentPlayer).isUni())
		{
			careerCards();
			//show uniCards END OF UNI
		}
		//CAREER
		if (player.get(currentPlayer).getPosition() == 11)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 12)
		{
			payThirty(); 
		}
		if (player.get(currentPlayer).getPosition() == 13)
		{
			suePlayer(40000);
		}
		if (player.get(currentPlayer).getPosition() == 14)
		{
			collectForty(); 
		}
		//Uni and Career join up
		if (player.get(currentPlayer).getPosition() == 15)
		{
			payTen();
		}
		if (player.get(currentPlayer).getPosition() == 16)
		{
			collectFifty();
		}
		if (player.get(currentPlayer).getPosition() == 17)
		{
			collectThirty();
		}
		if (player.get(currentPlayer).getPosition() == 18)
		{
			spinForMoney();
		}
		if (player.get(currentPlayer).getPosition() == 19)
		{
			payTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 20)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 21)
		{
			collectTwentyFromPlayers();
		}
		if (player.get(currentPlayer).getPosition() == 22)
		{
			//take off
		}
		
		
		//beginning off island 1
		if (player.get(currentPlayer).getPosition() == 23)
		{
			houseCards();
		}
		if (player.get(currentPlayer).getPosition() == 24)
		{
			suePlayer(30000);
		}
		if (player.get(currentPlayer).getPosition() == 25)
		{
			payTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 26)
		{
			spinForMoney();
		}
		if (player.get(currentPlayer).getPosition() == 27)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 28)
		{
			collectTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 29)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 30)
		{
			//life card
		}
		if (player.get(currentPlayer).getPosition() == 31)
		{
			collectTenFromPlayers();
		}
		if (player.get(currentPlayer).getPosition() == 32)
		{
			collectTen();
		}
		if (player.get(currentPlayer).getPosition() == 33)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 34)
		{
			//STOP AND COLLECT 50	
			collectFifty();
		}
		if (player.get(currentPlayer).getPosition() == 35)
		{
			payTen();
		}
		if (player.get(currentPlayer).getPosition() == 36)
		{
			houseCards();
		}
		if (player.get(currentPlayer).getPosition() == 37)
		{
			//FIRST TOKEN
			player.get(currentPlayer).setToken1(true);
			player.get(currentPlayer).setMoney(-20000);
			JOptionPane.showMessageDialog( null, "QUB have organised a fun night out where you travel from pub to pub with your pals, "+
"the next morning won’t be as fun! Pay 20k and collect the pub crawl token.","Pub Crawl!",JOptionPane.OK_CANCEL_OPTION); 
		}
		if (player.get(currentPlayer).getPosition() == 38)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 39)
		{
			collectThirty();
		}
		if (player.get(currentPlayer).getPosition() == 40)
		{
			//life card
		}
		if (player.get(currentPlayer).getPosition() == 41)
		{
			//take off if token collected, else return to 23
		}
		
		
		//beginning of island 2
		if (player.get(currentPlayer).getPosition() == 42)
		{
			collectTen();
		}
		if (player.get(currentPlayer).getPosition() == 43)
		{
			suePlayer(20000);
		}
		if (player.get(currentPlayer).getPosition() == 44)
		{
			collectThirty();
		}
		if (player.get(currentPlayer).getPosition() == 45)
		{
			collectTen();
		}
		if (player.get(currentPlayer).getPosition() == 46)
		{
			houseCards();
		}
		if (player.get(currentPlayer).getPosition() == 47)
		{
			//SECOND TOKEN
			player.get(currentPlayer).setToken2(true);
			player.get(currentPlayer).setMoney(-20000);
			JOptionPane.showMessageDialog( null, "QUB surf club visited Australia and you decided to join them for a fun day of surfing. Pay 20k and collect the surfing token.","Surfing!",JOptionPane.OK_CANCEL_OPTION); 
		}
		if (player.get(currentPlayer).getPosition() == 48)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 49)
		{
			//life card
		}
		if (player.get(currentPlayer).getPosition() == 50)
		{
			payTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 51)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 52)
		{
			//life card
		}
		if (player.get(currentPlayer).getPosition() == 53)
		{
			spinForMoney();
		}
		if (player.get(currentPlayer).getPosition() == 54)
		{
			//choose to go straight or right... straight goes back to 44
			collectTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 55)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 56)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 57)
		{
			//take off or if no token continue back to 42
		}
		
		
		//beginning of island 3
		if (player.get(currentPlayer).getPosition() == 58)
		{
			//choose to go straight or right... straight goes back to 44
			collectTen(); 
		}
		if (player.get(currentPlayer).getPosition() == 59)
		{
			payTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 60)
		{
			//choose to go straight or left... left goes forward to 67
			collectThirty();
		}
		if (player.get(currentPlayer).getPosition() == 61)
		{
			//THIRD TOKEN
			player.get(currentPlayer).setToken3(true);
			player.get(currentPlayer).setMoney(-20000);
			JOptionPane.showMessageDialog( null, "You’re in America you had to try Disney world, you had a great time. Pay 20k and collect the Disney World token.","Disney World!",JOptionPane.OK_CANCEL_OPTION); 
		}
		if (player.get(currentPlayer).getPosition() == 62)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 63)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 64)
		{
			houseCards();
		}
		if (player.get(currentPlayer).getPosition() == 65)
		{
			//life card
		}
		if (player.get(currentPlayer).getPosition() == 66)
		{
			//skip forward to 69
			//collect 20k from each player
			collectTwentyFromPlayers();
		}
		if (player.get(currentPlayer).getPosition() == 67)
		{
			payTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 68)
		{
			suePlayer(30000);
		}
		if (player.get(currentPlayer).getPosition() == 69)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 70)
		{
			payDay(); 
		}
		if (player.get(currentPlayer).getPosition() == 71)
		{
			collectTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 72)
		{
			houseCards();
		}
		if (player.get(currentPlayer).getPosition() == 73)
		{
			collectTen(); 
		}
		if (player.get(currentPlayer).getPosition() == 74)
		{
			collectForty();
		}
		if (player.get(currentPlayer).getPosition() == 75)
		{
			spinForMoney();
		}
		if (player.get(currentPlayer).getPosition() == 76)
		{
			//life card
		}
		if (player.get(currentPlayer).getPosition() == 77)
		{
			//take off, if no token then continue back to 58
		}
		
		
		//beginning of island 4
		if (player.get(currentPlayer).getPosition() == 78)
		{
			collectTen();
		}
		if (player.get(currentPlayer).getPosition() == 79)
		{
			houseCards();
		}
		if (player.get(currentPlayer).getPosition() == 80)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 81)
		{
			//skip forward to 69
			collectTenFromPlayers();
		}
		if (player.get(currentPlayer).getPosition() == 82)
		{
			//stop retire if got 4th token, otherwise too young to retire
		}
		if (player.get(currentPlayer).getPosition() == 83)
		{
			collectTwenty();
		}
		if (player.get(currentPlayer).getPosition() == 84)
		{
			//life
		}
		if (player.get(currentPlayer).getPosition() == 85)
		{
			spinForMoney();
		}
		if (player.get(currentPlayer).getPosition() == 86)
		{
			payDay();
		}
		if (player.get(currentPlayer).getPosition() == 87)
		{
			payThirty();
		}
		if (player.get(currentPlayer).getPosition() == 88)
		{
			suePlayer(20000);
		}
		if (player.get(currentPlayer).getPosition() == 89)
		{
			//go left or straight on .... left advance to 92
			payTen();
		}
		if (player.get(currentPlayer).getPosition() == 90)
		{
			//life
		}
		if (player.get(currentPlayer).getPosition() == 91)
		{
			//do nothing, then next position is 78 again
		}
		if (player.get(currentPlayer).getPosition() == 92)
		{
			collectThirty();
		}
		if (player.get(currentPlayer).getPosition() == 93)
		{
			payTwenty(); 
		}
		if (player.get(currentPlayer).getPosition() == 94)
		{
			//FOURTH TOKEN, then go to 80
			player.get(currentPlayer).setToken4(true);
			player.get(currentPlayer).setMoney(-20000);
			JOptionPane.showMessageDialog( null, "QUB have organised a tour bus for anyone looking to go sightseeing around Ireland! Pay 20k and collect the tour Ireland token.","Tour of Ireland!",JOptionPane.OK_CANCEL_OPTION); 
		}
	}
	public void showUniCards(int response)
	{
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
	
	public void showCareerCards(int response)
	{
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
		System.out.println(player.get(currentPlayer).getPosition());
		int pos = player.get(currentPlayer).getPosition();
		int newPos = movement + pos;
		if(!player.get(currentPlayer).isUni() && pos == 1)
		{
			player.get(currentPlayer).setPosition(movement+10);
			if(!(movement + 10 == 11))
			{
				payDay();
			}
		}
		if(player.get(currentPlayer).isUni() && pos == 1)
		{
			player.get(currentPlayer).setPosition(newPos);
		}
		if (newPos >= 2 && newPos <= 10 && player.get(currentPlayer).isUni()) {
			player.get(currentPlayer).setPosition(newPos);
		}
		if(pos >=2 && pos<10 && newPos>=10 && player.get(currentPlayer).isUni())
		{
			player.get(currentPlayer).setPosition(10);
		}
		if(pos  == 10 && newPos >10 && player.get(currentPlayer).isUni())
		{
			player.get(currentPlayer).setPosition(newPos+5);
		}
		if(pos>10 && newPos <=22)
		{
			player.get(currentPlayer).setPosition(newPos);
		}
		if(pos<20 && newPos >20)
		{
			payDay();
		}
		if(pos<22 && newPos >= 22)
		{
			player.get(currentPlayer).setPosition(22);
		}
		if (pos == 22 && newPos >22)
		{
			player.get(currentPlayer).setPosition(newPos);
			JOptionPane.showMessageDialog( null, "It’s time for you to start a new adventure! Take off.","Good Luck!",JOptionPane.OK_CANCEL_OPTION); 
		}
		if(pos>22 && pos <41 && newPos!= 34)
		{
			player.get(currentPlayer).setPosition(newPos);
		}
		if(pos<34 && newPos>34)
		{
			player.get(currentPlayer).setPosition(34);
		}
		if(pos<41 && newPos>41)
		{
			player.get(currentPlayer).setPosition(41);
		}
		if(pos == 41)
		{
			if(player.get(currentPlayer).isToken1())
			{
				player.get(currentPlayer).setPosition(41 + movement);
				JOptionPane.showMessageDialog( null, "It’s time for you to start a new adventure! Take off.","Good Luck!",JOptionPane.OK_CANCEL_OPTION); 

			}
			else
			{
				player.get(currentPlayer).setPosition(22 + movement);
			}
		}
		if(pos>41 && pos<58)
		{
			if(pos<48 && newPos>48)
			{
				payDay();
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<51 && newPos >51)
			{
				payDay();
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<54 && newPos >54)
			{
				String[] options = new String[] {"Straight", "Right"};
				  int routeResponse = JOptionPane.showOptionDialog(null, "Which way do you wish to travel?", "Choose a route",
				      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				      null, options, options[0]);
				  if (routeResponse == 0)
				  {
					 player.get(currentPlayer).setPosition(44 +(movement-(54-pos)));
				  }
				  else
				  {
					  player.get(currentPlayer).setPosition(newPos);
				  }
			}
			if(pos<57 && newPos>57)
			{
				player.get(currentPlayer).setPosition(57);
			}
			if(pos == 57)
			{
				if(player.get(currentPlayer).isToken2())
				{
					player.get(currentPlayer).setPosition(57 + movement);
					JOptionPane.showMessageDialog( null, "It’s time for you to start a new adventure! Take off.","Good Luck!",JOptionPane.OK_CANCEL_OPTION); 
				}
				else
				{
					player.get(currentPlayer).setPosition(41 + movement);
				}
			}
			if (pos==42)
			{
				player.get(currentPlayer).setPosition(newPos);
			}
		}
		
		if(pos>57 && pos<78)
		{
			if(pos<62 && newPos>62)
			{
				payDay();
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<62 && !(newPos>62))
			{
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<69 && newPos >69)
			{
				payDay();
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<=60 && newPos >=60)
			{
				String[] options = new String[] {"Straight", "Left"};
				  int routeResponse = JOptionPane.showOptionDialog(null, "Which way do you wish to travel?", "Choose a route",
				      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				      null, options, options[0]);
				  if (routeResponse == 0)
				  {
					 player.get(currentPlayer).setPosition(newPos);
				  }
				  else
				  {
					  player.get(currentPlayer).setPosition(67 + (movement -(60-pos)));
				  }
			}
			if(pos<=66 && newPos>66)
			{
				 player.get(currentPlayer).setPosition(68 + (movement -(66-pos)));
			}
			if(pos<77 && newPos>77)
			{
				player.get(currentPlayer).setPosition(77);
			}
			if(pos == 77)
			{
				if(player.get(currentPlayer).isToken3())
				{
					player.get(currentPlayer).setPosition(77 + movement);
					JOptionPane.showMessageDialog( null, "It’s time for you to start a new adventure! Take off.","Good Luck!",JOptionPane.OK_CANCEL_OPTION);
				}
				else
				{
					player.get(currentPlayer).setPosition(57 + movement);
				}
			}
		}
		if(pos>77 && pos<95)
		{
			if(pos<80 && newPos>80)
			{
				payDay();
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<86 && newPos >86)
			{
				payDay();
				player.get(currentPlayer).setPosition(newPos);
			}
			if(pos<=89 && newPos >89)
			{
				String[] options = new String[] {"Straight", "Left"};
				  int routeResponse = JOptionPane.showOptionDialog(null, "Which way do you wish to travel?", "Choose a route",
				      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				      null, options, options[0]);
				  if (routeResponse == 0)
				  {
					 player.get(currentPlayer).setPosition(newPos +2);
				  }
				  else
				  {
					  player.get(currentPlayer).setPosition(newPos);
				  }
			}
			if(pos<92 && newPos>92)
			{
				 player.get(currentPlayer).setPosition(77 + (movement -(91-pos)));
			}
			if(pos<94 && newPos>94)
			{
				player.get(currentPlayer).setPosition((newPos - pos)+movement + 79);
			}
			if(pos == 82)
			{
				if(player.get(currentPlayer).isToken4())
				{
					try {
						player.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					player.get(currentPlayer).setPosition(82 + movement);
				}
			}
			if(pos < 82 && newPos >82)
			{
				player.get(currentPlayer).setPosition(82);
			}
		}
		
		updateCar();
	}
	
	public void updateCar()
	{
		int pos = player.get(currentPlayer).getPosition();
		if(pos == 2)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(764, 357, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(764, 357, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(764, 357, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(764, 357, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(764, 357, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(764, 357, 66, 31);
		}
		if(pos == 3)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(836, 370, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(836, 370, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(836, 370, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(836, 370, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(836, 370, 66, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(836, 370, 66, 31);
		}
		if(pos == 4)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(835, 440, 78, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(835, 440, 78, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(835, 440, 78, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(835, 440, 78, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(835, 440, 78, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(835, 440, 78, 31);
		}
		if(pos == 5)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(820, 508, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(820, 508, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(820, 508, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(820, 508, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(820, 508, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(820, 508, 75, 45);
		}
		if(pos == 6)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(800, 570, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(800, 570, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(800, 570, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(800, 570, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(800, 570, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(800, 570, 75, 45);
		}
		if(pos == 7)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(750, 620, 78, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(750, 620, 78, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(750, 620, 78, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(750, 620, 78, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(750, 620, 78, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(750, 620, 78, 45);
		}
		if(pos == 8)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(680, 647, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(680, 647, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(680, 647, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(680, 647, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(680, 647, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(680, 647, 67, 45);
		}
		if(pos == 9)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(625, 641, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(625, 641, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(625, 641, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(625, 641, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(625, 641, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(625, 641, 75, 45);
		}
		if(pos == 10)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(560, 615, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(560, 615, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(560, 615, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(560, 615, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(560, 615, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(560, 615, 67, 38);
		}
		//start off career
		if(pos == 11)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(555, 362, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(555, 362, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(555, 362, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(555, 362, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(555, 362, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(555, 362, 86, 31);
		}
		if(pos == 12)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(508, 423, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(508, 423, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(508, 423, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(508, 423, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(508, 423, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(508, 423, 86, 31);
		}
		if(pos == 13)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(475, 496, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(475, 496, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(475, 496, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(475, 496, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(475, 496, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(475, 496, 86, 31);
		}
		if(pos == 14)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(467, 569, 76, 40);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(467, 569, 76, 40);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(467, 569, 76, 40);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(467, 569, 76, 40);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(467, 569, 76, 40);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(467, 569, 76, 40);
		}
		
		//uni and career join
		if(pos == 15)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(513, 635, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(513, 635, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(513, 635, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(513, 635, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(513, 635, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(513, 635, 67, 31);
		}
		if(pos == 16)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(584, 682, 75, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(584, 682, 75, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(584, 682, 75, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(584, 682, 75, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(584, 682, 75, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(584, 682, 75, 31);
		}
		if(pos == 17)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(661, 698, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(661, 698, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(661, 698, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(661, 698, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(661, 698, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(661, 698, 67, 38);
		}
		if(pos == 18)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(742, 682, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(742, 682, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(742, 682, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(742, 682, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(742, 682, 67, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(742, 682, 67, 38);
		}
		if(pos == 19)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(820, 621, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(820, 621, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(820, 621, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(820, 621, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(820, 621, 67, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(820, 621, 67, 45);
		}
		if(pos == 20)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(859, 544, 57, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(859, 544, 57, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(859, 544, 57, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(859, 544, 57, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(859, 544, 57, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(859, 544, 57, 38);
		}
		if(pos == 21)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(878, 462, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(878, 462, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(878, 462, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(878, 462, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(878, 462, 75, 45);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(878, 462, 75, 45);
		}
		if(pos == 22)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(896, 365, 67, 41);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(896, 365, 67, 41);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(896, 365, 67, 41);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(896, 365, 67, 41);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(896, 365, 67, 41);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(896, 365, 67, 41);
		}

		if(pos == 23)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(875, 71, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(875, 71, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(875, 71, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(875, 71, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(875, 71, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(875, 71, 57, 31);
		}

		if(pos == 24)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(763, 156, 57, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(763, 156, 57, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(763, 156, 57, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(763, 156, 57, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(763, 156, 57, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(763, 156, 57, 26);
		}

		if(pos == 25)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(729, 207, 46, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(729, 207, 46, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(729, 207, 46, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(729, 207, 46, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(729, 207, 46, 38);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(729, 207, 46, 38);
		}
		if(pos == 26)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(797, 253, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(797, 253, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(797, 253, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(797, 253, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(797, 253, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(797, 253, 57, 31);
		}
		if(pos == 27)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(868, 259, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(868, 259, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(868, 259, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(868, 259, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(868, 259, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(868, 259, 57, 31);
		}
		if(pos == 28)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(908, 197, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(908, 197, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(908, 197, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(908, 197, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(908, 197, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(908, 197, 57, 31);
		}
		if(pos == 29)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(962, 162, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(962, 162, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(962, 162, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(962, 162, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(962, 162, 67, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(962, 162, 67, 31);
		}
		if(pos == 30)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1028, 187, 63, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1028, 187, 63, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1028, 187, 63, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1028, 187, 63, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1028, 187, 63, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1028, 187, 63, 31);
		}
		if(pos == 31)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1054, 241, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1054, 241, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1054, 241, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1054, 241, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1054, 241, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1054, 241, 57, 31);
		}
		if(pos == 32)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1013, 297, 67, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1013, 297, 67, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1013, 297, 67, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1013, 297, 67, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1013, 297, 67, 26);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1013, 297, 67, 26);
		}
		if(pos == 33)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(982, 345, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(982, 345, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(982, 345, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(982, 345, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(982, 345, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(982, 345, 57, 31);
		}
		if(pos == 34)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1015, 413, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1015, 413, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1015, 413, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1015, 413, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1015, 413, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1015, 413, 57, 31);
		}
		if(pos == 35)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1120, 410, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1120, 410, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1120, 410, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1120, 410, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1120, 410, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1120, 410, 57, 31);
		}
		if(pos == 36)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1183, 328, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1183, 328, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1183, 328, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1183, 328, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1183, 328, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1183, 328, 57, 31);
		}
		if(pos == 37)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1195, 222, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1195, 222, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1195, 222, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1195, 222, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1195, 222, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1195, 222, 57, 31);
		}
		if(pos == 38)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1182, 157, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1182, 157, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1182, 157, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1182, 157, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1182, 157, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1182, 157, 57, 31);
		}
		if(pos == 39)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1106, 161, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1106, 161, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1106, 161, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1106, 161, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1106, 161, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1106, 161, 57, 31);
		}
		if(pos == 40)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1050, 136, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1050, 136, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1050, 136, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1050, 136, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1050, 136, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1050, 136, 57, 31);
		}
		if(pos == 41)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1006, 47, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1006, 47, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1006, 47, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1006, 47, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1006, 47, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1006, 47, 57, 31);
		}
		if(pos == 42)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(555, 66, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(555, 66, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(555, 66, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(555, 66, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(555, 66, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(555, 66, 57, 31);
		}
		if(pos == 43)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(494, 81, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(494, 81, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(494, 81, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(494, 81, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(494, 81, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(494, 81, 57, 31);
		}
		if(pos == 44)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(433, 111, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(433, 111, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(433, 111, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(433, 111, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(433, 111, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(433, 111, 57, 31);
		}
		if(pos == 45)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(402, 53, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(402, 53, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(402, 53, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(402, 53, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(402, 53, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(402, 53, 57, 31);
		}
		if(pos == 46)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(293, 52, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(293, 52, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(293, 52, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(293, 52, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(293, 52, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(293, 52, 57, 31);
		}
		if(pos == 47)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(208, 129, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(208, 129, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(208, 129, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(208, 129, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(208, 129, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(208, 129, 57, 31);
		}
		if(pos == 48)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(207, 242, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(207, 242, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(207, 242, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(207, 242, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(207, 242, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(207, 242, 57, 31);
		}
		if(pos == 49)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(189, 317, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(189, 317, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(189, 317, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(189, 317, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(189, 317, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(189, 317, 57, 31);
		}
		if(pos == 50)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(202, 385, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(202, 385, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(202, 385, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(202, 385, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(202, 385, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(202, 385, 57, 31);
		}
		if(pos == 51)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(273, 438, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(273, 438, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(273, 438, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(273, 438, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(273, 438, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(273, 438, 57, 31);
		}
		if(pos == 52)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(322, 361, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(322, 361, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(322, 361, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(322, 361, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(322, 361, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(322, 361, 57, 31);
		}
		if(pos == 53)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(413, 297, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(413, 297, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(413, 297, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(413, 297, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(413, 297, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(413, 297, 57, 31);
		}
		if(pos == 54)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(436, 194, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(436, 194, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(436, 194, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(436, 194, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(436, 194, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(436, 194, 57, 31);
		}
		if(pos == 55)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(526, 230, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(526, 230, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(526, 230, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(526, 230, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(526, 230, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(526, 230, 57, 31);
		}
		if(pos == 56)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(606, 191, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(606, 191, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(606, 191, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(606, 191, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(606, 191, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(606, 191, 57, 31);
		}
		if(pos == 57)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(611, 88, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(611, 88, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(611, 88, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(611, 88, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(611, 88, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(611, 88, 57, 31);
		}
		if(pos == 58)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(233, 910, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(233, 910, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(233, 910, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(233, 910, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(233, 910, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(233, 910, 57, 31);
		}
		if(pos == 59)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(283, 954, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(283, 954, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(283, 954, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(283, 954, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(283, 954, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(283, 954, 57, 31);
		}
		if(pos == 60)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(328, 963, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(328, 963, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(328, 963, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(328, 963, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(328, 963, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(328, 963, 57, 31);
		}
		if(pos == 61)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(441, 958, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(441, 958, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(441, 958, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(441, 958, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(441, 958, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(441, 958, 57, 31);
		}
		if(pos == 62)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(543, 906, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(543, 906, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(543, 906, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(543, 906, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(543, 906, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(543, 906, 57, 31);
		}
		if(pos == 63)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(584, 836, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(584, 836, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(584, 836, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(584, 836, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(584, 836, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(584, 836, 57, 31);
		}
		if(pos == 64)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(540, 793, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(540, 793, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(540, 793, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(540, 793, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(540, 793, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(540, 793, 57, 31);
		}
		if(pos == 65)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(469, 775, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(469, 775, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(469, 775, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(469, 775, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(469, 775, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(469, 775, 57, 31);
		}
		if(pos == 66)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(407, 819, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(407, 819, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(407, 819, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(407, 819, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(407, 819, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(407, 819, 57, 31);
		}
		if(pos == 67)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(353, 921, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(353, 921, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(353, 921, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(353, 921, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(353, 921, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(353, 921, 57, 31);
		}
		if(pos == 68)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(347, 867, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(347, 867, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(347, 867, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(347, 867, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(347, 867, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(347, 867, 57, 31);
		}
		if(pos == 69)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(320, 799, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(320, 799, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(320, 799, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(320, 799, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(320, 799, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(320, 799, 57, 31);
		}
		if(pos == 70)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(292, 729, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(292, 729, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(292, 729, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(292, 729, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(292, 729, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(292, 729, 57, 31);
		}
		if(pos == 71)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(337, 681, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(337, 681, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(337, 681, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(337, 681, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(337, 681, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(337, 681, 57, 31);
		}
		if(pos == 72)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(371, 614, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(371, 614, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(371, 614, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(371, 614, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(371, 614, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(371, 614, 57, 31);
		}
		if(pos == 73)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(326, 569, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(326, 569, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(326, 569, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(326, 569, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(326, 569, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(326, 569, 57, 31);
		}
		if(pos == 74)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(248, 604, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(248, 604, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(248, 604, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(248, 604, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(248, 604, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(248, 604, 57, 31);
		}
		if(pos == 75)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(205, 656, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(205, 656, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(205, 656, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(205, 656, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(205, 656, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(205, 656, 57, 31);
		}
		if(pos == 76)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(188, 728, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(188, 728, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(188, 728, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(188, 728, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(188, 728, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(188, 728, 57, 31);
		}
		if(pos == 77)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(181, 810, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(181, 810, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(181, 810, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(181, 810, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(181, 810, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(181, 810, 57, 31);
		}
		if(pos == 78)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1031, 947, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1031, 947, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1031, 947, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1031, 947, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1031, 947, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1031, 947, 57, 31);
		}
		if(pos == 79)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1110, 887, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1110, 887, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1110, 887, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1110, 887, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1110, 887, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1110, 887, 57, 31);
		}
		if(pos == 80)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1158, 759, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1158, 759, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1158, 759, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1158, 759, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1158, 759, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1158, 759, 57, 31);
		}
		if(pos == 81)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1126, 661, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1126, 661, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1126, 661, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1126, 661, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1126, 661, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1126, 661, 57, 31);
		}
		if(pos == 82)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1071, 581, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1071, 581, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1071, 581, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1071, 581, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1071, 581, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1071, 581, 57, 31);
		}
		if(pos == 83)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(994, 612, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(994, 612, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(994, 612, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(994, 612, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(994, 612, 86, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(994, 612, 86, 31);
		}
		if(pos == 84)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(975, 674, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(975, 674, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(975, 674, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(975, 674, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(975, 674, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(975, 674, 57, 31);
		}
		if(pos == 85)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(892, 715, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(892, 715, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(892, 715, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(892, 715, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(892, 715, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(892, 715, 57, 31);
		}
		if(pos == 86)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(837, 772, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(837, 772, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(837, 772, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(837, 772, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(837, 772, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(837, 772, 57, 31);
		}
		if(pos == 87)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(755, 783, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(755, 783, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(755, 783, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(755, 783, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(755, 783, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(755, 783, 57, 31);
		}
		if(pos == 88)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(754, 842, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(754, 842, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(754, 842, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(754, 842, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(754, 842, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(754, 842, 57, 31);
		}
		if(pos == 89)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(793, 905, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(793, 905, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(793, 905, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(793, 905, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(793, 905, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(793, 905, 57, 31);
		}
		if(pos == 90)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(846, 940, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(846, 940, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(846, 940, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(846, 940, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(846, 940, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(846, 940, 57, 31);
		}
		if(pos == 91)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(919, 961, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(919, 961, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(919, 961, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(919, 961, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(919, 961, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(919, 961, 57, 31);
		}
		if(pos == 92)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(854, 866, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(854, 866, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(854, 866, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(854, 866, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(854, 866, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(854, 866, 57, 31);
		}
		if(pos == 93)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(936, 816, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(936, 816, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(936, 816, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(936, 816, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(936, 816, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(936, 816, 57, 31);
		}
		if(pos == 94)
		{
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Blue"))
				bluePlayer.setBounds(1043, 758, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Green"))
				greenPlayer.setBounds(1043, 758, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Pink"))
				pinkPlayer.setBounds(1043, 758, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Purple"))
				purplePlayer.setBounds(1043, 758, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Red"))
				redPlayer.setBounds(1043, 758, 57, 31);
			if(player.get(currentPlayer).getCarColour().equalsIgnoreCase("Yellow"))
				yellowPlayer.setBounds(1043, 758, 57, 31);
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
    	player.get(currentPlayer).setUni(uni);
	    return uni;
	}
	public void spinWheel(int randomNum) throws IOException
	{
		checkPos();
		System.out.println(randomNum);
		if(randomNum == 6)
		{
			if(player.get(currentPlayer).isSpinForMoney())
			{
				player.get(currentPlayer).setMoney(100000);
				JOptionPane.showMessageDialog( null, "You collected 100k for spinning a 6!","You won!",JOptionPane.OK_CANCEL_OPTION); 
			}
		}
		player.get(currentPlayer).setSpinForMoney(false);
	}
	
	public void spinForMoney()
	{
		player.get(currentPlayer).setSpinForMoney(true);
		JOptionPane.showMessageDialog( null, "Spin the Wheel for the chance to win 100K!\n"
				+ "Simply get 6 on your next spin.","Spin to Win!", JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void payDay()
	{
		player.get(currentPlayer).payDay();
		JOptionPane.showMessageDialog( null, "You collected your salary of "+player.get(currentPlayer).getSalary()
				,"Pay Day!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void suePlayer(int money)
	{
		String[] options = new String[] {"Player One","Player Two", "Player Three", "Player Four"};
		  int playerResponse = JOptionPane.showOptionDialog(null, "Who do you wish to sue for " + money +".", "Choose a player",
		      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		      null, options, options[0]);
		if(playerResponse == (currentPlayer))
		{
			JOptionPane.showMessageDialog( null, "You sued yourself!!","Sue Player", JOptionPane.OK_CANCEL_OPTION);
		}
		if(playerResponse < totPlayers)
		{
			player.get(playerResponse).setMoney(-money);
			player.get(currentPlayer).setMoney(money);
		}
		if(playerResponse > totPlayers)
		{
			JOptionPane.showMessageDialog( null, "There is no such player","Sue Failed!", JOptionPane.OK_CANCEL_OPTION);
		}		
	}
	
	public void collectFifty()
	{
		collectMoney[0] = "You have successfully obtained a job for your placement year. Collect 50K.";
		collectMoney[1] = "You have won an insurance case against your employer collect 50K.";
		Random x = new Random();
		int collectX = x.nextInt(2);
		player.get(currentPlayer).setMoney(50000);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void collectForty()
	{
		collectMoney[0] = "Bank clerical error. Collect 40K.";
		collectMoney[1] = "You won big on a scratch card! Collect 40K.";
		collectMoney[2] = "You placed a bet on who’d win the QUB snooker tournament and your bet came through! Collect 40k.";
		Random x = new Random();
		int collectX = x.nextInt(3);
		player.get(currentPlayer).setMoney(40000);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void collectThirty()
	{
		collectMoney[0] = "You have obtained an average of a first in your second year QUB modules! Collect 30k.";
		collectMoney[1] = "During a QUB night out you won a best dressed competition. Collect 30k.";
		collectMoney[2] = "Win office grand national pool! Collect 30k.";
		collectMoney[3] = "Become Miss/Mr QUB! Collect 30k.";
		collectMoney[4] = "You helped a senior citizen cross the road at the QUB students union. Collect 30k.";
		collectMoney[5] = "You won a game of poker against your friend at the QUB poker club! Collect 30k.";
		Random x = new Random();
		int collectX = x.nextInt(6);
		player.get(currentPlayer).setMoney(30000);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void collectTwenty()
	{
		collectMoney[0] = "You have completed your placement documentation for QUB professional placement. Collect 20k.";
		collectMoney[1] = "You have got a one off promotion in work. Collect 20k.";
		collectMoney[2] = "You won a game of snooker against your friend at the QUB snooker club. Collect 20k.";
		collectMoney[3] = "You found someone's wallet and returned it, they reward you with money. Collect 20k.";
		collectMoney[4] = "You won a small amount on a scratch card. Collect 20k.";
		Random x = new Random();
		int collectX = x.nextInt(5);
		player.get(currentPlayer).setMoney(20000);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void collectTen()
	{
		collectMoney[0] = "Student finance makes a mistake with your loan and pays it all at once. Collect 10k.";
		collectMoney[1] = "You have been to same nightclub every monday night and they give you free entry. Collect 10k.";
		collectMoney[2] = "You have kept your bedroom tidy all year. Collect 10k.";
		collectMoney[3] = "It’s your birthday. Collect 10k.";
		collectMoney[4] = "You have been to work every day. Collect 10k.";
		collectMoney[5] = "You have completed every assignment for your QUB modules. Collect 10k.";
		collectMoney[6] = "You have returned the vacuum hoover to elms reception. Collect 10k.";
		Random x = new Random();
		int collectX = x.nextInt(7);
		player.get(currentPlayer).setMoney(10000);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void collectTwentyFromPlayers()
	{
		collectMoney[0] = "You won a bet against all your friends. Collect 20k from each player.";
		collectMoney[1] = "You won the QUB poker tournament. Collect 20k from each player.";

		Random x = new Random();
		int collectX = x.nextInt(2);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
		player.get(currentPlayer).setMoney(20000*(totPlayers));
		int playersToGive = currentPlayer +1;
		for (int i = 0; i < totPlayers; i++)
		{
			player.get(i).setMoney(-20000);
		}
	}
	
	public void collectTenFromPlayers()
	{
		collectMoney[0] = "You finally called your friends up about always paying for the taxi. Collect 10k from each player.";
		collectMoney[1] = "You won the QUB snooker tournament. Collect 10k from each player.";

		Random x = new Random();
		int collectX = x.nextInt(2);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Collect Money!",JOptionPane.OK_CANCEL_OPTION); 
		player.get(currentPlayer).setMoney(10000*(totPlayers));
		int playersToGive = currentPlayer +1;
		for (int i = 0; i < totPlayers; i++)
		{
			player.get(i).setMoney(-10000);
		}
	}
	
	public void payForty()
	{
		collectMoney[0] = "You crashed your car driving up to elms. Pay 40k.";
		JOptionPane.showMessageDialog( null, collectMoney[0],"Pay Money!",JOptionPane.OK_CANCEL_OPTION); 
		player.get(currentPlayer).setMoney(-40000);
	}
	
	public void payThirty()
	{
		collectMoney[0] = "You missed a deadline in work. Pay 30k.";
		collectMoney[1] = "Jury duty, you need to pay to get out of it. Pay 30k.";
		collectMoney[2] = "Elms kitchen sink needs unclogged. Pay 30k";
		collectMoney[3] = "You had to pay to go to your QUB formal. Pay 30k.";
		collectMoney[4] = "You lost your QUB student card. Pay 30k.";
		collectMoney[5] = "Your fridge freezer broke and you need to replace it. Pay 30k.";
		collectMoney[6] = "You broke a computer in a QUB lab. Pay 30k.";
		collectMoney[7] = "Take a QUB course. Pay 30k";
		Random x = new Random();
		int collectX = x.nextInt(8);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Pay Money!",JOptionPane.OK_CANCEL_OPTION); 
		player.get(currentPlayer).setMoney(-30000);
	}
	
	public void payTwenty()
	{
		collectMoney[0] = "You got caught drinking in the street on a QUB night out. Pay 20k.";
		collectMoney[1] = "You threw up in a taxi on the way home from a QUB night out. Pay 20k.";
		collectMoney[2] = "You ran out of alcohol and had to restock. Pay 20k. ";
		collectMoney[3] = "You forgot to pay your gas bill. Pay 20k.";
		collectMoney[4] = "You lost your keys QUB accommodation. Pay 20k.";
		collectMoney[5] = "You lost a bet against your friends. Pay 20k.";
		Random x = new Random();
		int collectX = x.nextInt(6);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Pay Money!",JOptionPane.OK_CANCEL_OPTION); 
		player.get(currentPlayer).setMoney(-20000);
	}
	
	public void payTen()
	{
		collectMoney[0] = "You had to pay into a nightclub for a QUB night out. Pay 10k.";
		collectMoney[1] = "You payed for a taxi on a QUB night out. Pay 10k.";
		collectMoney[2] = "You lost a snooker game against your friend. Pay 10k.";

		Random x = new Random();
		int collectX = x.nextInt(3);
		JOptionPane.showMessageDialog( null, collectMoney[collectX],"Pay Money!",JOptionPane.OK_CANCEL_OPTION); 
		player.get(currentPlayer).setMoney(-10000);
	}
	
	public void lifeCards(){
			Random x = new Random();
			int lifeType = x.nextInt(4);
			if(lifeType == 0)
			{
				player.get(currentPlayer).setMarried(true);
			}
			if(lifeType == 0 && player.get(currentPlayer).isMarried());
			{
				player.get(currentPlayer).setDaughter(true);
			}
			if(lifeType == 0 && player.get(currentPlayer).isMarried() && player.get(currentPlayer).isDaughter());
			{
				player.get(currentPlayer).setSon(true);
			}
			if(lifeType == 1)
			{
				player.get(currentPlayer).setPet(true);
			}
			if(lifeType == 2)
			{
				//is famous
			}
			if(lifeType == 3)
			{
				///promotion
			}
			if(lifeType == 4)
			{
				///queens award
			}
			if(lifeType == 5)
			{
				///speak at queens
			}
			
			lifeFrame = new JFrame();
			lifeFrame.setTitle("Pick a card");
			lifeFrame.setBounds(400, 15, 675, 270);
			lifeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			lifeFrame.setResizable(false);
			lifeFrame.setVisible(true);
			ImageIcon HouseBg = new ImageIcon(
					"src/gameOfLife/imgs/House Cards/HouseBack.png");
			ImageIcon[] life = new ImageIcon[8];

			life[0] = new ImageIcon(
					"src/gameOfLife/imgs/Life/Married_Baby.png");
			life[1] = new ImageIcon(
					"src/gameOfLife/imgs/Life/pet.png");
			life[2] = new ImageIcon(
					"src/gameOfLife/imgs/Life/fame.png");
			life[3] = new ImageIcon(
					"src/gameOfLife/imgs/Life/promotion.png");
			life[4] = new ImageIcon(
					"src/gameOfLife/imgs/Life/queens award.png");
			life[5] = new ImageIcon(
					"src/gameOfLife/imgs/Life/speak_queens");
			lifeCard = new JFrame();
			lifeCard.setTitle("Your choosen card is:");
			lifeCard.setBounds(1275, 350, 180, 250);
			lifeCard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			lifeCard.setResizable(true);
			lifeCard.setVisible(false);
			lifeBack = new JLabel();
			lifeBack.setIcon(HouseBg);
			lifeBack.setBounds(400, 15, 675, 270);
			lifeBack.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					lifeFrame.dispose();
					lifeCard.setVisible(true);
				}
			});
			hChoosen = new JLabel("");
			hChoosen.setBounds(1275, 350, 180, 250);
			hChoosen.setVisible(true);
			hChoosen.setIcon(life[lifeType]);
			lifeCard.add(hChoosen);
			lifeFrame.add(lifeBack);
			JOptionPane.showMessageDialog( null, "Congradulations on your life event!","Life Event!",JOptionPane.OK_CANCEL_OPTION); 
	}
	
	public void houseCards(){
		if (player.get(currentPlayer).getHouse() == "Homeless") {
			Random x = new Random();
			int home = x.nextInt(4);
			housePurchaser = currentPlayer;
			HouseFrame = new JFrame();
			HouseFrame.setTitle("Pick a card");
			HouseFrame.setBounds(400, 15, 675, 270);
			HouseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			HouseFrame.setResizable(false);
			HouseFrame.setVisible(true);
			ImageIcon HouseBg = new ImageIcon(
					"src/gameOfLife/imgs/House Cards/HouseBack.png");
			house[0] = new ImageIcon(
					"src/gameOfLife/imgs/House Cards/Caravan Card1.png");
			house[1] = new ImageIcon(
					"src/gameOfLife/imgs/House Cards/Country Retreat1.png");
			house[2] = new ImageIcon(
					"src/gameOfLife/imgs/House Cards/Luxury Villa Card1.png");
			house[3] = new ImageIcon(
					"src/gameOfLife/imgs/House Cards/Modern House1.png");
			HouseCard = new JFrame();
			HouseCard.setTitle("Your choosen card is:");
			HouseCard.setBounds(1275, 350, 180, 250);
			HouseCard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			HouseCard.setResizable(true);
			HouseCard.setVisible(false);
			houseBack = new JLabel();
			houseBack.setIcon(HouseBg);
			houseBack.setBounds(400, 15, 675, 270);
			houseBack.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					HouseFrame.dispose();
					HouseCard.setVisible(true);
					showHouseCards(home);

				}
			});
			hChoosen = new JLabel("");
			hChoosen.setBounds(1275, 350, 180, 250);
			hChoosen.setVisible(true);
			hChoosen.setIcon(house[home]);
			HouseCard.add(hChoosen);
			HouseFrame.add(houseBack);
			String[] options = new String[] {"Yes","No"};
			  int playerResponse = JOptionPane.showOptionDialog(null, "Do you wish to purchase insurance for 10k?", "Want insurance?",
			      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			      null, options, options[0]);
			if(playerResponse == 0)
			{
				player.get(currentPlayer).setLoans(10000);
			}
		}
		else
		{
			JOptionPane.showMessageDialog( null, "You already own a house!","House Denial",JOptionPane.OK_CANCEL_OPTION); 
		}
		
		
	}
	public void showHouseCards (int response)
	{
		String name = null;
		int cost = 0;
		int resaleValue = 0;
		
		if (response ==0)
		{
			name = "Caravan";
			cost = 80000;
			resaleValue = 85000;
		}
		if (response == 1)
		{
			name = "Country Retreat";
			cost = 120000;
			resaleValue = 130000;
		}
		if (response == 2)
		{
			name = "Luxury Villa";
			cost = 140000;
			resaleValue = 160000;
		}
		if (response == 3)
		{
			name = "Modern House";
			cost = 100000;
			resaleValue = 105000;
		}
		player.get(housePurchaser).setHouse(name);
		if(player.get(housePurchaser).getMoney()<cost)
		{
			JOptionPane.showMessageDialog( null, "You didnt have enough money for this House. The Bank has loaned you "
					+(cost -player.get(housePurchaser).getMoney())
					,"Ok",JOptionPane.OK_CANCEL_OPTION); 
			player.get(housePurchaser).setMoney(-(player.get(housePurchaser).getMoney()));
			
		} 
		else
		{
		
			JOptionPane.showMessageDialog( null, "You succesfully purchased a "
					+player.get(housePurchaser).getHouse()
								,"woohooo",JOptionPane.OK_CANCEL_OPTION); 	
		player.get(housePurchaser).setMoney(-cost);
		}
	}
	
	public void careerCards()
	{
		CareerFrame = new JFrame();
		CareerFrame.setTitle("Choose a Career");
		//aCareerFrame.setLayout(new BorderLayout());
		CareerFrame.setBounds(400, 15, 1010, 270);
		CareerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		CareerFrame.setResizable(false);
		CareerFrame.setVisible(true);
		
		
		degree[0] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Degree Careers/Astronaut Card1.png");
		degree[1] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Degree Careers/Banker Card1.png");
		degree[2] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Degree Careers/Doctor Card1.png");
		degree[3] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Degree Careers/Game Designer Card1.png");
		degree[4] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Degree Careers/Lawyer Card1.png");
		degree[5] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Degree Careers/Lecturer Card1.png");
		
		nonDegree[0] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Bin Man Card1.png");
		nonDegree[1] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Hairdresser Card1.png");
		nonDegree[2] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Janitor Card1.png");
		nonDegree[3] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Mechanic Card1.png");
		nonDegree[4] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Secretary Card1.png");
		nonDegree[5] = new ImageIcon(
				"src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Shop Assistant Card1.png");
		
		Random x = new Random();
		int career = x.nextInt(6);
		
		
		ImageIcon CareerBg = new ImageIcon("src/gameOfLife/imgs/Career Cards/CareerBack.png");
		
		careerBack = new JLabel();
		careerBack.setIcon(CareerBg);
		careerBack.setBounds(400, 15, 675, 270);
		careerBack.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent arg0) {
				CareerFrame.dispose();
				CareerCard.setVisible(true);	
   }
});
		CareerFrame.add(careerBack);
		
		CareerCard = new JFrame();
		CareerCard.setTitle("Your choosen card is:");
		CareerCard.setBounds(1275, 350, 180, 250);
		CareerCard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		CareerCard.setResizable(true);
		CareerCard.setVisible(false);
		
		
		
		
		cChoosen = new JLabel("");
		cChoosen.setBounds(1275, 350, 180, 250);
		
		cChoosen.setVisible(true);
		//cChoosen.setIcon(house[career]);
		

		if(player.get(currentPlayer).isUni())
		{
			cChoosen.setIcon(degree[career]);;
		}
		if(!player.get(currentPlayer).isUni())
		{
			cChoosen.setIcon(nonDegree[career]);;
		}
		
		if(player.get(currentPlayer).isUni())
		{
			//player.get(currentPlayer).setPosition(2);
			showUniCards(career);
		}
		else
		{
			//player.get(currentPlayer).setPosition(0);
			showCareerCards(career);
		}		
		CareerCard.add(cChoosen);
	}

	
	
}