import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Dylan Hesser
 *Program to create the menu for users to select pizzas on
 */
public class Pizza extends JFrame  
{
	/**
	 * used to convert calculation cost to the correct format
	 */
	private DecimalFormat df = new DecimalFormat("#.00");
	/**
	 * object to get the crust information
	 */
	private PizzaCrust crustPanel = new PizzaCrust(); 
	/**
	 * object to get topping information
	 */
	private PizzaToppings toppings = new PizzaToppings();
	/**
	 * object to get drink information
	 */
	private Drinks drinks = new Drinks();
	/**
	 * panel to keep up with crust 
	 */
	private JPanel PizzaCrust = new JPanel();
	/**
	 * panel to use for toppings
	 */
	private JPanel toppingPanel = new JPanel();
	/**
	 * panel to use for drinks
	 */
	private JPanel drinkPanel = new JPanel();
	/**
	 * panel for calculate and exit button
	 */
	private JPanel button = new JPanel();
	/**
	 * overall cost of everything
	 */
	private double cost;
	/**
	 * default constructor
	 */
	public Pizza() 
	{
		super();
		setSize(800, 200);
		setTitle("Pizza Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 3));

		PizzaCrust.add(crustPanel);
		add(PizzaCrust);

		toppingPanel.add(toppings);
		add(toppingPanel);

		drinkPanel.add(drinks);
		add(drinkPanel);
		
		button = buttonPanel();
		add(button);
	}
	/**
	 * method to create the button panel
	 * @return the JPanel
	 */
	public JPanel buttonPanel() 
	{
		JPanel button = new JPanel() ;
		EndingListener el = new EndingListener();
		ActionListener cl = new CalculateListener();
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(cl);
		button.add(calculate);

		JButton exit = new JButton("Exit");
		exit.addActionListener(el);
		button.add(exit);
		
		return button;
	}
	/**
	 * action listener to calculate button
	 * @author Dylan Hesser
	 *
	 */
	private class CalculateListener implements ActionListener
	{
	/**
	 * keeps up with when the calculate button is pressed and create a pop up menu
	 */
		public void actionPerformed(ActionEvent e) 
		{	
			popUpMenu();	
		}
	}
	/**
	 * class to intiate the exit button action listener
	 * @author Dylan Hesser
	 *
	 */
	private class EndingListener implements ActionListener
	{
		/**
		 * keeps up with when the exit button is pressed
		 */
		public void actionPerformed(ActionEvent e) 
		{
		 System.exit(0);
		}
	}
	/**
	 * method to create a pop up menu with the calculation information
	 */
	private void popUpMenu() 
	{
		double costBeforeTax;
		double  taxRate = .07;
		costBeforeTax = crustPanel.getCrustPrice() + toppings.getToppingCost() + drinks.getDrinkCost();
		double tax = costBeforeTax * taxRate;
		double total = costBeforeTax + tax;
		JPopupMenu costCalculation = new JPopupMenu();
	
		JLabel costPriorToTax = new JLabel("Cost before Tax: " + (df.format(costBeforeTax)));
		JLabel taxCost = new JLabel("Tax: " + df.format(tax));
		JLabel totalCost = new JLabel("Total: " + df.format(total));
		costCalculation.add(costPriorToTax);
		costCalculation.add(taxCost);
		costCalculation.add(totalCost);
	
		costCalculation.show(crustPanel,200,200);
	}
}
