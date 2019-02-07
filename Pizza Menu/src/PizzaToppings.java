import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
/**
 * 
 * @author Dylan Hesser
 * program to keep up with the pizza toppings items on the menu
 */
public class PizzaToppings extends JPanel implements ActionListener
{	
	/**
	 * pepperoni on the menu
	 */
	private String Pepperoni = "Pepperoni";
	/**
	 * cheese on the menu
	 */
	private String Cheese = "Cheese";
	/**
	 * olives on the menu
	 */
	private String Olives = "Olives";
	/**
	 * ham on the menu
	 */
	
	private double cost;
	/**
	 * price of pepperoni
	 */
	private static double PepperoniPrice = 1.00;
	/**
	 * price of cheese
	 */
	private static double CheesePrice = .75;
	/**
	 * price of olives
	 */
	private static double OlivePrice = 1.25;
	/**
	 * checkbox for pepperoni
	 */
	private JCheckBox pepperoni = new JCheckBox("Pepperoni");
	/**
	 * checkbox for cheese
	 */
	private JCheckBox cheese = new JCheckBox("Cheese");
	/**
	 * checkbox for olives
	 */
	private JCheckBox olives = new JCheckBox("Olives");
	
	public PizzaToppings() 
	{
	setLayout(new BorderLayout());
	JLabel greeting = new JLabel("Please select toppings from menu");
	add(greeting, BorderLayout.NORTH);

	pepperoni.addActionListener(this);
	add(pepperoni, BorderLayout.CENTER );
	
	
	cheese.addActionListener(this);
	add(cheese, BorderLayout.EAST);
	
	
	olives.addActionListener(this);
	add(olives, BorderLayout.SOUTH);
	
	
	}
	/**
	 * gets overall cost of all toppings
	 * @return cost of toppings
	 */
	public double getToppingCost() 
	{
		return cost;
	}
	/**
	 * occurs when toppings are selected
	 */
	public void actionPerformed(ActionEvent e)
	{
		 
	    if (e.getActionCommand() == Pepperoni) 
	    {
	    	if(pepperoni.isSelected() == true) 
	    	{
	    		cost = cost + PepperoniPrice;	
	    	}
	    	else
	    	{
	    		cost = cost - PepperoniPrice;
	    	}
	    		
	    }
	    else if (e.getActionCommand() == Cheese) 
	    {
	    	if(cheese.isSelected()== true) 
	    	{
	    	cost = cost + CheesePrice;
	    	}
	    	else 
	    	{
	    		cost = cost - CheesePrice;
	    	}
	    }
	    else if (e.getActionCommand() == Olives) 
	    {
	    	if(olives.isSelected() == true)
	    	{
	    		cost = cost + OlivePrice;
	    	}
	    	else
	    	{
	    		cost = cost - OlivePrice;
	    	}
	    }
	  
	    System.out.println("Cost is: " +  cost); 
	 }

}


