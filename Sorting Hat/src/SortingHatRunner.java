import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SortingHatRunner extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static JFrame frame = new JFrame();
	static JFrame frame1 = new JFrame();
	static JFrame frame2 = new JFrame();
	static JFrame frame3 = new JFrame();	
	static JFrame frame4 = new JFrame();
	static int learnMore;
	static String sortingHat;
	static String firstPeriod;
	static String secondPeriod;
	static String thirdPeriod;
	static String fourthPeriod;
	static String name; 
	
	public static void main(String[] args)
		{
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name + ". Welcome to Hogwarts! We are so excited you are here."
				+ " Today you will be sorted into one of the four houses of Hogwarts.");
		
		Object[] options = {"yes" , "no"};
		learnMore = JOptionPane.showOptionDialog(frame, "Would you like to learn about the different houses?",
				"Learn More",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[0]);
		
		switch(learnMore)
			{
			case 0:
				{
				ImageIcon icon = new ImageIcon(("hogwarts.jpg"));
				JOptionPane.showMessageDialog(frame, "There are four houses at Hogwarts: "
						+ "Gryffindor, Slytherin, Ravenclaw, and Hufflepuff. "
						+ "\nEach house is made up of wizards and witches with specific characteristics that make them a part of that house..."
						+ "\nLet's find out what house you are to be sorted into. Time to meet the Sorting Hat.",
						"About The Houses", 0, icon);
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Very well then. Time to meet the Sorting Hat.");
				break;
				}
			}
		
		JOptionPane.showMessageDialog(frame, "Hello " + name + ". I am the Sorting Hat. I have heard much about you... "
				+ "\nYou need to answer one simple question and then I will sort you into your house.");
		
		ImageIcon icon = new ImageIcon(("sortingHat.jpg"));
		String[] house = {"courageous and determined", "ambitious and clever", "witty and creative", "loyal and hardworking"};
		JFrame frame = new JFrame();
		String sortingHat = (String) JOptionPane.showInputDialog(frame, "Please choose which characteristics define you most accurately..."
					+ "\nRemember to choose wisely and be true to yourself",
					"The Sorting Hat",
		            JOptionPane.QUESTION_MESSAGE, 
		            icon, 
		            house, 
		            house[0]);
		
		switch(sortingHat)
			{
			case "courageous and determined":
				{
				ImageIcon icon1 = new ImageIcon(("gryffindor.jpg"));
				JOptionPane.showMessageDialog(frame, "Hmmm... courageous and determinated, I see. I sort you into Gryffindor."
						+ "\nThe head of your house is Professor McGonagall. I expect great things from you," + name + ".",
						"Gryffindor", 0, icon1);
				break;
				}
			case "ambitious and clever":
				{
				ImageIcon icon1 = new ImageIcon(("slytherin.jpg"));
				JOptionPane.showMessageDialog(frame, "Hmmm... ambitious and clever, I see. I sort you into Slytherin."
						+ "\nThe head of your house is Professor Snape. Don't go getting into too much trouble now," + name + ".",
						"Slytherin", 0, icon1);
				break;
				}
			case "witty and creative":
				{
				ImageIcon icon1 = new ImageIcon(("ravenclaw.jpg"));
				JOptionPane.showMessageDialog(frame, "Hmmm... witty and creative, I see. I sort you into Ravenclaw, truly one of the finest of the four houses."
						+ "\nThe head of your house is Professor Flitwick. I expect much from you," + name + ". Good luck and have a wonderful time here at Hogwarts.",
						"Ravenclaw", 0, icon1);
				break;
				}
			case "loyal and hardworking":
				{
				ImageIcon icon1 = new ImageIcon(("hufflepuff.jpg"));
				JOptionPane.showMessageDialog(frame, "Hmmm... loyal and hardworking, I see. I sort you into Hufflepuff."
						+ "\nThe head of your house is Professor Sprout. I expect great things from you, " + name + ".",
						"Hufflepuff", 0, icon1);
				break;
				}
			}
		
		JOptionPane.showMessageDialog(frame, "Time to start your classes! You'll have 5 classes to go to today.");
		
		String[] periodOne = {"Transfigurations", "Charms"};
		JFrame frame1 = new JFrame();
		String firstPeriod = (String) JOptionPane.showInputDialog(frame1, "Which class would you like to take during first period?",
				"First Period",
				JOptionPane.QUESTION_MESSAGE,
				null,
				periodOne,
				periodOne[0]);
		
		switch(firstPeriod)
			{
			case "Transfigurations":
				{
				ImageIcon icon1 = new ImageIcon(("transfigurations.jpg"));
				JOptionPane.showMessageDialog(frame, "Great choice! Transfiguartions is a great class! Your professor, Professor McGonagall, is a great teacher!",
						"Transfigurations", 0, icon1);
				break;
				}
			case "Charms":
				{
				ImageIcon icon1 = new ImageIcon(("charms.jpg"));
				JOptionPane.showMessageDialog(frame, "Great choice! Charms is a great class! "
						+ "\nYour professor, Professor Flitwick, is one of the best teachers here at Hogwarts! He is also the head of the greatest Hogwarts house, Ravenclaw!",
						"Charms", 0, icon1);
				break;
				}
			}
		
		JOptionPane.showMessageDialog(frame, "Let's move onto second period!");
		
		String[] periodTwo = {"Potions", "History of Magic"};
		JFrame frame2 = new JFrame();
		String secondPeriod = (String) JOptionPane.showInputDialog(frame2, "Which class would you like to take during second period?",
				"Second Period",
				JOptionPane.QUESTION_MESSAGE,
				null,
				periodTwo,
				periodTwo[0]);
		
		switch(secondPeriod)
			{
			case "Potions":
				{
				ImageIcon icon1 = new ImageIcon(("potions.jpg"));
				JOptionPane.showMessageDialog(frame, "Great choice! Potions is a wonderful class. You will learn so much from the great Professor Snape!",
						"Potions", 0, icon1);
				break;
				}
			case "History of Magic":
				{
				ImageIcon icon1 = new ImageIcon(("historyOfMagic.jpg"));
				JOptionPane.showMessageDialog(frame, "Wonderful choice. Professor Binns is full of knowledge on the history of magic!",
						"History of Magic", 0, icon1);
				break;
				}
			}
				
		JOptionPane.showMessageDialog(frame, "Time to move onto third period!");
		
		String[] periodThree = {"Defence Against the Dark Arts", "Astronomy"};
		JFrame frame3 = new JFrame();
		String thirdPeriod = (String) JOptionPane.showInputDialog(frame3, "Which class would you like to take during third period?",
				"Third Period",
				JOptionPane.QUESTION_MESSAGE,
				null,
				periodThree,
				periodThree[0]);
		
		switch(thirdPeriod)
			{
			case "Defence Against the Dark Arts":
				{
				ImageIcon icon1 = new ImageIcon(("dATDA.jpg"));
				JOptionPane.showMessageDialog(frame, "Very good choice! Defence Against the Dark Arts is a very challenging, but rewarding class!"
						+ "\nProfessor Snape is a very good teacher!",
						"Defence Against the Dark Arts", 0, icon1);
				break;
				}
			case "Astronomy":
				{
				ImageIcon icon1 = new ImageIcon(("astronomy.jpg"));
				JOptionPane.showMessageDialog(frame, "Very good choice! Astronomy with Professor Sinistra is a great class!",
						"Astronomy", 0, icon1);
				break;
				}
			}
		
		JOptionPane.showMessageDialog(frame, "Let's go to fourth period now!");
		
		String[] periodFour = {"Herbology", "Flying"};
		JFrame frame4 = new JFrame();
		String fourthPeriod = (String) JOptionPane.showInputDialog(frame4, "Which class would you like to take during fourth period?",
				"Fourth Period",
				JOptionPane.QUESTION_MESSAGE,
				null,
				periodFour,
				periodFour[0]);
		
		switch(fourthPeriod)
			{
			case "Herbology":
				{
				ImageIcon icon1 = new ImageIcon(("herbology.jpg"));
				JOptionPane.showMessageDialog(frame, "Herbology is a great class! Professor Sprout is just wonderful!",
						"Herbology", 0, icon1);
				break;
				}
			case "Flying":
				{
				ImageIcon icon1 = new ImageIcon(("flying.jpg"));
				JOptionPane.showMessageDialog(frame, "Flying with Professor Hooch is a great class, especially if you plan on joining the Quidditch team!",
						"Flying", 0, icon1);
				break;
				}
			}
		}
	}