package gameOfLife;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CareerCards {
	
	private JFrame CareerFrame;
	int i = 1;
	int x ;
	private int choice = -1;
	private JLabel Card1;
	private JPanel Left,Middle,Right,Bottom;
	private JButton Prev,Next,Accept;
	final ImageIcon[] degree = new ImageIcon[7];
	final ImageIcon[] nonDegree = new ImageIcon[7];
	
	public CareerCards(boolean careerResponse) throws IOException 
	{
		CareerFrame = new JFrame();
		CareerFrame.setTitle("Choose a Career");
		CareerFrame.setLayout(new BorderLayout());
		CareerFrame.setBounds(400, 15, 550, 700);
		CareerFrame.getContentPane().setBackground(new Color(240, 64, 40));
		CareerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CareerFrame.setResizable(false);
		JLabel headerImage = new JLabel();
		ImageIcon startIcon = new ImageIcon("src/gameOfLife/imgs/startScreen.jpg");
		headerImage.setIcon(startIcon);
		

		Middle = new JPanel();
		Left = new JPanel();
		Right = new JPanel();
		Bottom = new JPanel();
		Left.setBorder( new EmptyBorder(300,15,3,3));
		Right.setBorder( new EmptyBorder(300,3,3,15));
		Bottom.setBorder( new EmptyBorder(50,3,50,3));
		CareerFrame.add(Middle,BorderLayout.CENTER);
		CareerFrame.add(Left,BorderLayout.LINE_START);
		CareerFrame.add(Right, BorderLayout.LINE_END);
		CareerFrame.add(Bottom, BorderLayout.PAGE_END);

		
		
		
		degree[1] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Degree Careers/Astronaut Card.png");
		degree[2] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Degree Careers/Banker Card.png");
		degree[3] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Degree Careers/Doctor Card.png");
		degree[4] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Degree Careers/Game Designer Card.png");
		degree[5] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Degree Careers/Lawyer Card.png");
		degree[6] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Degree Careers/Lecturer Card.png");
		
		
		
		nonDegree[1] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Bin Man Card.png");
		nonDegree[2] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Hairdresser Card.png");
		nonDegree[3] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Janitor Card.png");
		nonDegree[4] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Mechanic Card.png");
		nonDegree[5] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Secretary Card.png");
		nonDegree[6] = new ImageIcon("src/gameOfLife/imgs/Career Cards/Non-Degree Careers/Shop Assistant Card.png");
		
		
		Card1= new JLabel();
		Card1.setVisible(true);
		if(careerResponse == true){
			Card1.setIcon(degree[1]);
			x=0;
		}
		if(careerResponse == false){
			x=1;
			Card1.setIcon(nonDegree[1]);
		}
		Middle.add(Card1);
		
		Prev = new JButton("Prev");
		Prev.setVisible(true);
		Prev.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (i == 0){
					i=6;
				}
				if(x==0){
				Card1.setIcon(degree[i--]);
				System.out.println(i);
				
				}
				if(x==1){
					Card1.setIcon(nonDegree[i--]);
					System.out.println(i);
					
					}		
			}
		});
		Left.add(Prev);
		
		Next = new JButton("Next");
		Next.setVisible(true);
		Next.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (i == 7){
					i=1;
				}
				
				if(x==0){
				
				Card1.setIcon(degree[i++]);
			}
			
			if (x ==1){
				
				Card1.setIcon(nonDegree[i++]);
			}
			}});
		Right.add(Next);
		
		Accept = new JButton("Ok");
		Accept.setVisible(true);
		Accept.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				CareerFrame.dispose();
				if(careerResponse == false)
				{
					choice = (i + 6);
				}
				else
				choice = (i);
			}});
		Bottom.add(Accept);		
	}
	
	public int Choice()
	{
		return i;
	}
}
