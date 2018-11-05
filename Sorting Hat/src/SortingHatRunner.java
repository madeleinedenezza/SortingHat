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
	static JFrame frame5 = new JFrame();
	static JFrame frame6 = new JFrame();
	static JFrame frame7 = new JFrame();
	static JFrame frame8 = new JFrame();
	static JFrame frame9 = new JFrame();
	static JFrame frame10 = new JFrame();
	static int learnMore;
	static String sortingHat;
	static String firstPeriod;
	static String secondPeriod;
	static String thirdPeriod;
	static String fourthPeriod;
	static String fifthPeriod;
	static String yourPet;
	static String pickOwl;
	static String pickCat;
	static String pickToad;
	static String pickRat;
	static String newFriend;
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
		
		JOptionPane.showMessageDialog(frame, "Time for your last period of the day, fifth period!");
		
		String[] periodFive = {"Care of Magical Creatures", "Divination"};
		JFrame frame5 = new JFrame();
		String fifthPeriod = (String) JOptionPane.showInputDialog(frame5, "Which class would you like to take during fifth period?",
				"Fifth Period",
				JOptionPane.QUESTION_MESSAGE,
				null,
				periodFive,
				periodFive[0]);
		
		switch (fifthPeriod)
			{
			case "Care of Magical Creatures":
				{
				ImageIcon icon1 = new ImageIcon(("cOMC.jpg"));
				JOptionPane.showMessageDialog(frame, "Great choice! Professor Hagrid is one of our wisest and most fun teachers here at Hogwarts",
						"Care of Magical Creatures", 0, icon1);
				break;
				}
			case "Divination":
				{
				ImageIcon icon1 = new ImageIcon(("divination.jpg"));
				JOptionPane.showMessageDialog(frame, "Wonderful choice! Divination with Professor Trelawney is a very interesting class!",
						"Divination", 0, icon1);
				}
			}
		
		JOptionPane.showMessageDialog(frame, "Now that your classes are over, you can head back to your dorm room.");
		JOptionPane.showMessageDialog(frame, "Get settled in... Soon you'll have to head down to the Great Hall for dinner.");
		JOptionPane.showMessageDialog(frame, "You get a knock at the door... you open it and you see an animal... possibly your new pet!");
		
		String[] pickYourPet = {"Owl", "Cat", "Toad", "Rat"};
		String yourPet = (String) JOptionPane.showInputDialog(frame, "Which type of pet would you like?",
				"Pick Your Pet",
				JOptionPane.QUESTION_MESSAGE,
				null,
				pickYourPet,
				pickYourPet[0]);
		
		switch (yourPet)
			{
			case "Owl":
				{
				ImageIcon icon1 = new ImageIcon(("owl.jpg"));
				JFrame frame6 = new JFrame();
				String[] pickYourOwl = {"Snowy Owl", "Great Grey Owl", "Eastern Screech Owl", "Scops Owl", "Eurasian Eagle Owl", "Barn Owl"};
				String pickOwl = (String) JOptionPane.showInputDialog(frame6, "Great choice! Having a wise owl by your side can be very useful."
						+ "\nWhat type of owl would you like?",
						"Pick Your Owl",
						JOptionPane.QUESTION_MESSAGE,
						icon1,
						pickYourOwl,
						pickYourOwl[0]);
				break;
				}
			case "Cat":
				{
				ImageIcon icon1 = new ImageIcon(("cat.jpg"));
				JFrame frame7 = new JFrame();
				String [] pickYourCat = {"Black Cat", "Calico Cat", "Tabby Cat", "Ginger Cat", "White Cat", "Black and White Cat"};
				String pickCat = (String) JOptionPane.showInputDialog(frame7, "Classic choice! Cats are very commonly associated with wizards and witches!"
						+ "\nThey are quite clever creatures!"
						+ "\nWhat type of cat would you like?",
						"Pick Your Cat",
						JOptionPane.QUESTION_MESSAGE,
						icon1,
						pickYourCat,
						pickYourCat[0]);
				break;
				}
			case "Toad":
				{
				ImageIcon icon1 = new ImageIcon(("toad.jpg"));
				JFrame frame8 = new JFrame();
				String[] pickYourToad = {"Briar Toad", "Common Toad", "Dragon Toad", "Giant Purple Toad", "Horned Toad"};
				String pickToad = (String) JOptionPane.showInputDialog(frame8, "Interesting choice! What type of toad would you like?",
						"Pick Your Toad",
						JOptionPane.QUESTION_MESSAGE,
						icon1,
						pickYourToad,
						pickYourToad[0]);
				break;
				}
			case "Rat":
				{
				ImageIcon icon1 = new ImageIcon(("rat.jpg"));
				JFrame frame9 = new JFrame();
				String[] pickYourRat = {"Brown/Norway Rat", "Black Rat", "Bush Rat", "Long-haired Rat"};
				String pickRat = (String) JOptionPane.showInputDialog(frame9, "Nice choice. What type of toad would you like?",
						"Pick Your Rat",
						JOptionPane.QUESTION_MESSAGE,
						icon1,
						pickYourRat,
						pickYourRat[0]);
				break;
				}
			}
		JOptionPane.showMessageDialog(frame, "Now that you've picked your pet, it's time to head down to the Great Hall for dinner.");
		
		JOptionPane.showMessageDialog(frame, "You arrive at the Great Hall, but you don't know where to sit..."
				+ "\nYou see someone call you over, though you don't know who they are or how they know you, you head over to them.");
		
		ImageIcon icon1 = new ImageIcon(("friends.jpg"));
		JFrame frame10 = new JFrame();
		String[] friends = {"Harry Potter", "Ron Weasley", "Hermione Granger", "Draco Malfoy", "Neville Longbottom", "Luna Lovegood"};
		String newFriend = (String) JOptionPane.showInputDialog(frame10, "Pick your new friend...",
				"New Friend",
				JOptionPane.QUESTION_MESSAGE,
				icon1,
				friends,
				friends[0]);
		
		switch (newFriend)
			{
			case "Harry Potter":
				{
				ImageIcon icon2 = new ImageIcon(("harry.jpg"));
				JFrame frame11 = new JFrame();
				JOptionPane.showMessageDialog(frame11, "Harry Potter... what a wonderful choice! "
						+ "\nHarry is a loyal friend and will always stand up for what is right.", 
						"Harry Potter", 0, icon2);
				break;
				}
			case "Ron Weasley":
				{
				ImageIcon icon2 = new ImageIcon(("ron.jpg"));
				JFrame frame12 = new JFrame();
				JOptionPane.showMessageDialog(frame12, "Ron Weasley, such a silly fellow he is. "
						+ "\nRon is a great friend and will do anything for the people he loves... good choice!",
						"Ron Weasley", 0, icon2);
				break;
				}
			case "Hermione Granger":
				{
				ImageIcon icon2 = new ImageIcon(("hermione.jpg"));
				JFrame frame13 = new JFrame();
				JOptionPane.showMessageDialog(frame13, "Hermione Granger... truly one of the most hardworking and determined students Hogwarts has ever seen."
						+ "\nShe will be a great friend!",
						"Hermione Granger", 0, icon2);
				break;
				}
			case "Draco Malfoy":
				{
				ImageIcon icon2 = new ImageIcon(("draco.jpg"));
				JFrame frame14 = new JFrame();
				JOptionPane.showMessageDialog(frame14, "Draco Malfoy... very interesting choice."
						+ "\nDraco is a very cunning kid, but he is not the nicest friend. Be warned... be careful with him.",
						"Draco Malfoy", 0, icon2);
				break;
				}
			case "Neville Longbottom":
				{
				ImageIcon icon2 = new ImageIcon(("neville.jpg"));
				JFrame frame15 = new JFrame();
				JOptionPane.showMessageDialog(frame15, "Neville Longbottom is a very good kid."
						+ "\nHe is a little shy, but if you get to know him you will love him.",
						"Neville Longbottom", 0, icon2);
				break;
				}
			case "Luna Lovegood":
				{
				ImageIcon icon2 = new ImageIcon(("luna.jpg"));
				JFrame frame16 = new JFrame();
				JOptionPane.showMessageDialog(frame16, "Luna Lovegood is a wonderful choice!!"
						+ "\nLuna is a weird girl, but she is very smart and caring for others. She will always have your back.",
						"Luna Lovegood", 0, icon2);
				break;
				}
			}	
		}
	}