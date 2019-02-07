import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Dylan Hesser
 *program to keep track of the pizza crust panel of the pizza menu
 */
public class PizzaCrust extends JPanel implements ActionListener 
{
	/**
	 * thin crust item on the menu
	 */
	private String thinCrust = "Thin Crust";
	/**
	 * thick crust item on the menu
	 */
	private String thickCrust = "Thick Crust";
	/**
	 * stuffed crust item on the menu
	 */
	private String stuffedCrust = "Stuffed Crust";
	/**
	 * price of thin crust
	 */
	private static double thinCrustPrice = 1.25;
	/**
	 * price of thick crust
	 */
	private static double thickCrustPrice = 1.50;
	/**
	 * price of stuffed crust
	 */
	private static double stuffedCrustPrice = 2.00;
	/**
	 * the cost that is used in the calculate menu
	 */
	private double cost;
	/**
	 * default constructor
	 */
	public PizzaCrust() 
	{
		setLayout(new BorderLayout());
		
		JLabel greeting = new JLabel("Please select crust from menu\n");
		add(greeting, BorderLayout.NORTH);
			
		JRadioButton thickCrustP = new JRadioButton("Thick Crust");
		thickCrustP.addActionListener(this);
		add(thickCrustP,BorderLayout.AFTER_LAST_LINE);
		
		JRadioButton thinCrustP = new JRadioButton("Thin Crust");
		thinCrustP.addActionListener(this);
		add(thinCrustP,BorderLayout.LINE_END);
		
		JRadioButton stuffedCrustP = new JRadioButton ("Stuffed Crust");
		stuffedCrustP.addActionListener(this);
		add(stuffedCrustP);
		
		ButtonGroup crust = new ButtonGroup();
		crust.add(thickCrustP);
		crust.add(thinCrustP);
		crust.add(stuffedCrustP);
			
	}
	/**
	 * return the price of the crust for the menu
	 * @return cost
	 */
	public double getCrustPrice() 
	{
		return cost;
	}
	/**
	 * occurs when a menu item is selected
	 */
	public void actionPerformed(ActionEvent e)
	{
		 System.out.println("Selected: " + e.getActionCommand());   
		 if (e.getActionCommand() == thinCrust) 
		 {
		    cost =  thinCrustPrice;	
		 }
		 else if (e.getActionCommand() == thickCrust) 
		 {
		    cost = thickCrustPrice;
		 }
		 else if (e.getActionCommand() == stuffedCrust) 
		 {
		    cost =   stuffedCrustPrice;
		 }
		  
		 System.out.println(cost); 
	 }
}
