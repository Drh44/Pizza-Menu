import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
/**
 * 
 * @author Dylan Hesser
 * program to get drink panel working in the pizza jframe
 */
public class Drinks extends JPanel implements ActionListener 
{
	 /**
	  * cost of tea
	  */
	 private static double teaCost = 1.50;
	 /**
	  * cost of coke
	  */
	 private static double cokeCost = 1.65;
	 /**
	  * cost of diet coke
	  */
	 private static double dietCokeCost = 1.65;
	 /**
	  * cost of water
	  */
	 private static double waterCost = .75;
	 /**
	  * cost of all drinks overall
	  */
	 private double cost;
	 /**
	  * the coke item in the menu
	  */
	 private String Coke = "Coke";
	 /**
	  * the diet coke item in the menu
	  */
	 private String DietCoke = "Diet Coke";
	 /**
	  * the water item in the menu
	  */
	 private String Water = "Water";
	 /**
	  * the tea item in the menu
	  */
	 private String Tea = "Tea";

	 /**
	  * default constructor
	  */
	 public Drinks() 
	 {
		setLayout(new BorderLayout());
		JLabel greeting = new JLabel("Please select drink from menu\n");
		JLabel notice = new JLabel("***May pick more then one");
		add(greeting, BorderLayout.NORTH);
		add(notice, BorderLayout.SOUTH);
		//Menu that will hold the items
		JMenu DrinkMenu = new JMenu("Drink Menu");
		
		JMenuItem CokeItem = new JMenuItem(Coke);
		CokeItem.addActionListener(this);
		DrinkMenu.add(CokeItem);
		
		JMenuItem DietCokeItem = new JMenuItem(DietCoke);
		DietCokeItem.addActionListener(this);
		DrinkMenu.add(DietCokeItem);
		
		JMenuItem WaterItem = new JMenuItem(Water);
		WaterItem.addActionListener(this);
		DrinkMenu.add(WaterItem);
		
		JMenuItem TeaItem = new JMenuItem(Tea);
		TeaItem.addActionListener(this);
		DrinkMenu.add(TeaItem);
		
		JMenuBar bar = new JMenuBar();
		bar.add(DrinkMenu);
		add(bar);
	}
	 /**
	  * gets the overall cost of the drinks
	  * @return cost of all drinks
	  */
	public double getDrinkCost() 
	{
		return cost;
	}
	/**
	 * used when an event happens with a drink being chosen
	 */
	public void actionPerformed(ActionEvent e)
	{
		 System.out.println("Selected: " + e.getActionCommand());   
		 if (e.getActionCommand() == "Tea") 
		 	{
		    	cost = cost + teaCost;	
		    }
		 else if (e.getActionCommand() == "Coke") 
		 	{
		    	cost = cost + cokeCost;
		    }
		 else if (e.getActionCommand() == "Diet Coke") 
		 	{
		    	cost = cost + dietCokeCost;
		    }
		 else if (e.getActionCommand() == "Water") 
		 	{
		    	cost = cost + waterCost;
		    }
		 System.out.println(cost); 
	}
}

