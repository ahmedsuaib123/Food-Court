import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

public class HomePageRestaurantFoodTimes extends JFrame implements ActionListener,MouseListener {
	
	private static HomePageDhali homePageDhali;
	private MenuFoodTimesSeafood menuFoodTimesSeafood;
	private MenuFoodTimesSnacks menuFoodTimesSnacks;
	private MenuFoodTimesBurger menuFoodTimesBurger;
	private MenuFoodTimesSandwich menuFoodTimesSandwich;
	private MenuFoodTimesSetMeal menuFoodTimesSetMeal;
	private MenuFoodTimesWrap menuFoodTimesWrap;
	private MenuFoodTimesRotiParatha menuFoodTimesRotiParatha;
	private MenuFoodTimesRice menuFoodTimesRice;
	private MenuFoodTimesSalad menuFoodTimesSalad;
	

    public HomePageRestaurantFoodTimes(HomePageDhali homePageDhali) {
        super("FOOD TIMES");
        super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
		
	    JLabel title = new JLabel("Welcome To FOOD TIMES");
        title.setBounds(175, 25, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       
        JButton appetizersButton = new JButton("Seafood");
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
		
        JButton saladButton = new JButton("Sandwich");
		saladButton.setBounds(130,400,200,30);
		super.add(saladButton);
		saladButton.addActionListener(this);
		saladButton.addMouseListener(this);
		
		
		JButton soupButton = new JButton("Set Meal");
		soupButton.setBounds(390,100,200,30);
		super.add(soupButton);
		soupButton.addActionListener(this);
		soupButton.addMouseListener(this);
		
		JButton sandwichesButton = new JButton("Wrap");
		sandwichesButton.setBounds(390,200,200,30);
		super.add(sandwichesButton);
		sandwichesButton.addActionListener(this);
		sandwichesButton.addMouseListener(this);
		
        JButton dessertsButton = new JButton("Roti & Paratha");
		dessertsButton.setBounds(390,300,200,30);
		super.add(dessertsButton);
		dessertsButton.addActionListener(this);
		dessertsButton.addMouseListener(this);
		
        JButton beveragesButton = new JButton("Rice");
		beveragesButton.setBounds(390,400,200,30);
		super.add(beveragesButton);
		beveragesButton.addActionListener(this);
		beveragesButton.addMouseListener(this);
		
		
		JButton specialButton = new JButton("Salad");
		specialButton.setBounds(250,500,200,30);
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
   
        HomePageRestaurantFoodTimes hpr = new HomePageRestaurantFoodTimes(homePageDhali);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Seafood")) {
			MenuFoodTimesSeafood menuFoodTimesSeafood = new MenuFoodTimesSeafood(homePageDhali);
			super.setVisible(false);
        } 
		else if (e.getActionCommand().equals("Snacks")) {
			MenuFoodTimesSnacks menuFoodTimesSnacks = new MenuFoodTimesSnacks(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Burger")) {
			MenuFoodTimesBurger menuFoodTimesBurger = new MenuFoodTimesBurger(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Sandwich")) {
		    MenuFoodTimesSandwich menuFoodTimesSandwich = new MenuFoodTimesSandwich(homePageDhali);
			super.setVisible(false);
		} 
		else if (e.getActionCommand().equals("Set Meal")) {
			MenuFoodTimesSetMeal menuFoodTimesSetMeal = new MenuFoodTimesSetMeal(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Wrap")) {
			MenuFoodTimesWrap menuFoodTimesWrap = new MenuFoodTimesWrap(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Roti & Paratha") ){
			MenuFoodTimesRotiParatha menuFoodTimesRotiParatha = new MenuFoodTimesRotiParatha(homePageDhali);
			super.setVisible(false);

			
		} 
		else if (e.getActionCommand().equals("Rice")) {
			MenuFoodTimesRice menuFoodTimesRice = new MenuFoodTimesRice(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Salad")) {
			MenuFoodTimesSalad menuFoodTimesSalad = new MenuFoodTimesSalad(homePageDhali);
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
