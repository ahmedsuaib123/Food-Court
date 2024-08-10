import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

public class HomePageRestaurantDhakaSpicy extends JFrame implements ActionListener,MouseListener {
	private static HomePageDhali homePageDhali;
	

    public HomePageRestaurantDhakaSpicy(HomePageDhali homePageDhali) {
        super("Dhaka Spicy Varities Kabab & Soup");
        super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
		
	    JLabel title = new JLabel("Welcome To Dhaka Spicy Varities Kabab & Soup");
        title.setBounds(80, 25, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       
        JButton appetizersButton = new JButton("Appetizers");
		appetizersButton.setBounds(130,100,200,30);
		super.add(appetizersButton);
		appetizersButton.addActionListener(this);
		appetizersButton.addMouseListener(this);
		
        JButton entreesButton = new JButton("Entrees");
		entreesButton.setBounds(130,200,200,30);
		super.add(entreesButton);
		entreesButton.addActionListener(this);
		entreesButton.addMouseListener(this);
		
        JButton sideButton = new JButton("Side Dishes");
		sideButton.setBounds(130,300,200,30);
		super.add(sideButton);
		sideButton.addActionListener(this);
		sideButton.addMouseListener(this);
		
        JButton saladButton = new JButton("Salads");
		saladButton.setBounds(130,400,200,30);
		super.add(saladButton);
		saladButton.addActionListener(this);
		saladButton.addMouseListener(this);
		
		
		JButton soupButton = new JButton("Soups");
		soupButton.setBounds(390,100,200,30);
		super.add(soupButton);
		soupButton.addActionListener(this);
		soupButton.addMouseListener(this);
		
		JButton sandwichesButton = new JButton("Sandwiches & Wraps");
		sandwichesButton.setBounds(390,200,200,30);
		super.add(sandwichesButton);
		sandwichesButton.addActionListener(this);
		sandwichesButton.addMouseListener(this);
		
        JButton dessertsButton = new JButton("Desserts");
		dessertsButton.setBounds(390,300,200,30);
		super.add(dessertsButton);
		dessertsButton.addActionListener(this);
		dessertsButton.addMouseListener(this);
		
        JButton beveragesButton = new JButton("Beverages");
		beveragesButton.setBounds(390,400,200,30);
		super.add(beveragesButton);
		beveragesButton.addActionListener(this);
		beveragesButton.addMouseListener(this);
		
		
		JButton specialButton = new JButton("Specials");
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
   
        HomePageRestaurantDhakaSpicy hpr = new HomePageRestaurantDhakaSpicy(homePageDhali);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Appetizers")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);
        } 
		else if (e.getActionCommand().equals("Entrees")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Side Dishes")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Salads")) {
		    Menu menu = new Menu(homePageDhali);
			super.setVisible(false);
		} 
		else if (e.getActionCommand().equals("Soups")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Sandwiches & Wraps")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Desserts") ){
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

			
		} 
		else if (e.getActionCommand().equals("Beverages")) {
			Menu menu = new Menu(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Specials")) {
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
