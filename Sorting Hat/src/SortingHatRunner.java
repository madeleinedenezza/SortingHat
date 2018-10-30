import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SortingHatRunner extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static JFrame frame = new JFrame();
	static int learnMore;
	static String sortingHat;
	
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

		}

	}