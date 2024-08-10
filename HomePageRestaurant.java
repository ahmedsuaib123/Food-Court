//package FoodCourtProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;


public class HomePageRestaurant extends JFrame implements ActionListener,MouseListener {
	private static HomePageDhali homePageDhali;
	private MenuTheKitchenBurger menuTheKitchenBurger;
	private MenuTheKitchenMeatBox menuTheKitchenMeatBox;
	private MenuTheKitchenSalad menuTheKitchenSalad;
	private MenuTheKitchenSnacks menuTheKitchenSnacks;
	private MenuTheKitchenCoffeeCooler menuTheKitchenCoffeeCooler;
	private MenuTheKitchenChocolateShakes menuTheKitchenChocolateShakes;
	
	

    public HomePageRestaurant(HomePageDhali homePageDhali) {
        super("The Kitchen");
        super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
        super.setLayout(null);
		super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
            super.setIconImage(ImageIO.read(new File("./Resources/the_kitchen.png")));
        } catch (IOException e) {
           
        }
		
		 try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/the_kitchen.jpg")))));
        } catch (Exception e) {
            
        }
       
		
	    JLabel title = new JLabel("Welcome To The Kitchen");
        title.setBounds(185, 25, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       
        JButton appetizersButton = new JButton("Burger");
		appetizersButton.setBounds(130,100,200,30);
		super.add(appetizersButton);
		appetizersButton.addActionListener(this);
		appetizersButton.addMouseListener(this);
		
        JButton entreesButton = new JButton("Meat Box");
		entreesButton.setBounds(130,200,200,30);
		super.add(entreesButton);
		entreesButton.addActionListener(this);
		entreesButton.addMouseListener(this);
		
        JButton sideButton = new JButton("Snacks");
		sideButton.setBounds(130,300,200,30);
		super.add(sideButton);
		sideButton.addActionListener(this);
		sideButton.addMouseListener(this);
		
        JButton saladButton = new JButton("Salad");
		saladButton.setBounds(130,400,200,30);
		super.add(saladButton);
		saladButton.addActionListener(this);
		saladButton.addMouseListener(this);
		
		
		JButton soupButton = new JButton("Chef's Special");
		soupButton.setBounds(390,100,200,30);
		//super.add(soupButton);
		soupButton.addActionListener(this);
		soupButton.addMouseListener(this);
		
		JButton sandwichesButton = new JButton("Coffee Cooler");
		sandwichesButton.setBounds(390,200,200,30);
		super.add(sandwichesButton);
		sandwichesButton.addActionListener(this);
		sandwichesButton.addMouseListener(this);
		
        JButton dessertsButton = new JButton("Chocolate Shakes");
		dessertsButton.setBounds(390,300,200,30);
		super.add(dessertsButton);
		dessertsButton.addActionListener(this);
		dessertsButton.addMouseListener(this);
		
        JButton beveragesButton = new JButton("Milk Shakes");
		beveragesButton.setBounds(390,400,200,30);
		//super.add(beveragesButton);
		beveragesButton.addActionListener(this);
		beveragesButton.addMouseListener(this);
		
		

		
		JButton backButton = new JButton("Back");
        backButton.setBounds(30,550,200,30);
       	backButton.setForeground(Color.BLACK);
		backButton.setSize(90,45);
		backButton.addActionListener(this);
        super.add(backButton);
		
		JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(610,550,200,30);
       	logoutButton.setForeground(Color.BLACK);
		logoutButton.setSize(90,45);
		logoutButton.addActionListener(this);
        super.add(logoutButton);

        this.homePageDhali = homePageDhali;
        super.setVisible(true);
    }

    public static void main(String[] args) {
        HomePageRestaurant hpr = new HomePageRestaurant(homePageDhali);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Burger")) {
			MenuTheKitchenBurger menuTheKitchenBurger = new MenuTheKitchenBurger(homePageDhali);
			super.setVisible(false);
        } 
		else if (e.getActionCommand().equals("Meat Box")) {
			MenuTheKitchenMeatBox menuTheKitchenMeatBox = new MenuTheKitchenMeatBox(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Snacks")) {
			MenuTheKitchenSnacks menuTheKitchenSnacks = new MenuTheKitchenSnacks(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Salad")) {
		    MenuTheKitchenSalad menuTheKitchenSalad = new MenuTheKitchenSalad(homePageDhali);
			super.setVisible(false);
		} 
		else if (e.getActionCommand().equals("Chef's Special")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Coffee Cooler")) {
			MenuTheKitchenCoffeeCooler menuTheKitchenCoffeeCooler = new MenuTheKitchenCoffeeCooler(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Chocolate Shakes") ){
			MenuTheKitchenChocolateShakes menuTheKitchenChocolateShakes = new MenuTheKitchenChocolateShakes(homePageDhali);
			super.setVisible(false);

			
		} 
		else if (e.getActionCommand().equals("Milk Shakes")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Back")){
			HomePageDhali homePageDhali = new HomePageDhali();
			homePageDhali.setVisible(true);
	 		this.dispose();
			
	 	}
		else if(e.getActionCommand().equals("Logout")){
			Login login = new Login();
			login.setVisible(true);
	 		this.dispose();
		}
		
    }
	
@Override
    public void mouseExited(MouseEvent me) {
        JButton sourceButton = (JButton) me.getSource();
        sourceButton.setBackground(UIManager.getColor("Button.background"));
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        JButton sourceButton = (JButton) me.getSource();
        sourceButton.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }
}
