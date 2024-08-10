import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.*;
import java.nio.file.*;
import javax.imageio.*;
public class HomePageRestaurantLaziz extends JFrame implements ActionListener,MouseListener {
	private static HomePageDhali homePageDhali;
	
	private MenuLazizSoup menuLazizSoup;
	private MenuLazizSnacks menuLazizSnacks;
	private MenuLazizSalad menuLazizSalad;
	private MenuLazizBurger menuLazizBurger;
	private MenuLazizSandwich menuLazizSandwich;
	private MenuLazizChowmein menuLazizChowmein;
	private MenuLazizChicken menuLazizChicken;

    public HomePageRestaurantLaziz(HomePageDhali homePageDhali) {
        super("LAZIZ");
        super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
            super.setIconImage(ImageIO.read(new File("./Resources/the_kitchen.png")));
        } catch (IOException e) {
           
        }
		
		try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/the_kitchen.jpg")))));
        } catch (Exception e) {
            
        }
       
		
	    JLabel title = new JLabel("Welcome To LAZIZ");
        title.setBounds(205, 25, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       
        JButton appetizersButton = new JButton("Soup");
		appetizersButton.setBounds(130,100,200,30);
		super.add(appetizersButton);
		appetizersButton.addActionListener(this);
		appetizersButton.addMouseListener(this);
		
        JButton entreesButton = new JButton("Snacks");
		entreesButton.setBounds(130,200,200,30);
		super.add(entreesButton);
		entreesButton.addActionListener(this);
		entreesButton.addMouseListener(this);
		
        JButton sideButton = new JButton("Burger");
		sideButton.setBounds(130,300,200,30);
		super.add(sideButton);
		sideButton.addActionListener(this);
		sideButton.addMouseListener(this);
		
        JButton saladButton = new JButton("Salad");
		saladButton.setBounds(130,400,200,30);
		super.add(saladButton);
		saladButton.addActionListener(this);
		saladButton.addMouseListener(this);
		
		
		JButton soupButton = new JButton("Sandwiche & Wrap");
		soupButton.setBounds(390,100,200,30);
		super.add(soupButton);
		soupButton.addActionListener(this);
		soupButton.addMouseListener(this);
		
		JButton sandwichesButton = new JButton("Chicken");
		sandwichesButton.setBounds(390,200,200,30);
		super.add(sandwichesButton);
		sandwichesButton.addActionListener(this);
		sandwichesButton.addMouseListener(this);
		
        JButton dessertsButton = new JButton("Chowmein & Chopsuey");
		dessertsButton.setBounds(390,300,200,30);
		super.add(dessertsButton);
		dessertsButton.addActionListener(this);
		dessertsButton.addMouseListener(this);
		
        JButton beveragesButton = new JButton("Rice Bowl");
		beveragesButton.setBounds(390,400,200,30);
		super.add(beveragesButton);
		beveragesButton.addActionListener(this);
		beveragesButton.addMouseListener(this);
		
		
		JButton specialButton = new JButton("Combo");
		specialButton.setBounds(130,500,200,30);
		super.add(specialButton);
		specialButton.addActionListener(this);
		specialButton.addMouseListener(this);
		
		
		
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
   
        HomePageRestaurantLaziz hpr = new HomePageRestaurantLaziz(homePageDhali);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Soup")) {
			MenuLazizSoup menuLazizSoup = new MenuLazizSoup(homePageDhali);
			super.setVisible(false);
        } 
		else if (e.getActionCommand().equals("Snacks")) {
			MenuLazizSnacks menuLazizSnacks = new MenuLazizSnacks(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Burger")) {
			MenuLazizBurger menuLazizBurger = new MenuLazizBurger(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Salad")) {
		    MenuLazizSalad menuLazizSalad = new MenuLazizSalad(homePageDhali);
			super.setVisible(false);
		} 
		else if (e.getActionCommand().equals("Sandwich & Wrap")) {
			MenuLazizSandwich menuLazizSandwich = new MenuLazizSandwich(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Chicken")) {
			MenuLazizChicken menuLazizChicken = new MenuLazizChicken(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Chowmein & Chopsuey") ){
			MenuLazizChowmein menuLazizChowmein = new MenuLazizChowmein(homePageDhali);
			super.setVisible(false);

			
		} 
		else if (e.getActionCommand().equals("Rice Bowl")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Combo")) {
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
