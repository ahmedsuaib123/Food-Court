import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

public class HomePageRestaurantSteakFood extends JFrame implements ActionListener,MouseListener {
	private static HomePageDhali homePageDhali;
	private MenuSteakFoodAppetizer menuSteakFoodAppetizer;
	private MenuSteakFoodSoup menuSteakFoodSoup;
	private MenuSteakFoodSalad menuSteakFoodSalad;
	private MenuSteakFoodSandwichShawrma menuSteakFoodSandwichShawrma;
	private MenuSteakFoodBurger menuSteakFoodBurger;
	private MenuSteakFoodChowmein menuSteakFoodChowmein;
	private MenuSteakFoodCurryRice menuSteakFoodCurryRice;
	private MenuSteakFoodRiceBowl menuSteakFoodRiceBowl;
	private MenuSteakFoodPlatter menuSteakFoodPlatter;
	private MenuSteakFoodPasta menuSteakFoodPasta;
	

    public HomePageRestaurantSteakFood(HomePageDhali homePageDhali) {
        super("STEAK FOOD");
        super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
		
	    JLabel title = new JLabel("Welcome To STEAK FOOD");
        title.setBounds(175, 25, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       
        JButton appetizersButton = new JButton("Appetizers");
		appetizersButton.setBounds(130,100,200,30);
		super.add(appetizersButton);
		appetizersButton.addActionListener(this);
		appetizersButton.addMouseListener(this);
		
        JButton entreesButton = new JButton("Soup");
		entreesButton.setBounds(130,200,200,30);
		super.add(entreesButton);
		entreesButton.addActionListener(this);
		entreesButton.addMouseListener(this);
		
        JButton sideButton = new JButton("Salad");
		sideButton.setBounds(130,300,200,30);
		super.add(sideButton);
		sideButton.addActionListener(this);
		sideButton.addMouseListener(this);
		
        JButton saladButton = new JButton("Sandwich & Shawarma");
		saladButton.setBounds(130,400,200,30);
		super.add(saladButton);
		saladButton.addActionListener(this);
		saladButton.addMouseListener(this);
		
		
		JButton soupButton = new JButton("Burger");
		soupButton.setBounds(390,100,200,30);
		super.add(soupButton);
		soupButton.addActionListener(this);
		soupButton.addMouseListener(this);
		
		JButton sandwichesButton = new JButton("Chowmein");
		sandwichesButton.setBounds(390,200,200,30);
		super.add(sandwichesButton);
		sandwichesButton.addActionListener(this);
		sandwichesButton.addMouseListener(this);
		
        JButton dessertsButton = new JButton("Pasta");
		dessertsButton.setBounds(390,300,200,30);
		super.add(dessertsButton);
		dessertsButton.addActionListener(this);
		dessertsButton.addMouseListener(this);
		
        JButton beveragesButton = new JButton("Curry & Rice");
		beveragesButton.setBounds(390,400,200,30);
		super.add(beveragesButton);
		beveragesButton.addActionListener(this);
		beveragesButton.addMouseListener(this);
		
		
		JButton specialButton = new JButton("Rice Bowl");
		specialButton.setBounds(130,500,200,30);
		super.add(specialButton);
		specialButton.addActionListener(this);
		specialButton.addMouseListener(this);
		
		JButton speciallButton = new JButton("Platter");
		speciallButton.setBounds(390,500,200,30);
		super.add(speciallButton);
		speciallButton.addActionListener(this);
		speciallButton.addMouseListener(this);
		
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
   
        HomePageRestaurantSteakFood hpr = new HomePageRestaurantSteakFood(homePageDhali);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Appetizers")) {
			MenuSteakFoodAppetizer menuSteakFoodAppetizer = new MenuSteakFoodAppetizer(homePageDhali);
			super.setVisible(false);
        } 
		else if (e.getActionCommand().equals("Soup")) {
			MenuSteakFoodSoup menuSteakFoodSoup = new MenuSteakFoodSoup(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Salad")) {
			MenuSteakFoodSalad menuSteakFoodSalad = new MenuSteakFoodSalad(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Sandwich & Shawarma")) {
			MenuSteakFoodSandwichShawrma menuSteakFoodSandwichShawrma = new MenuSteakFoodSandwichShawrma(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Burger")) {
		    MenuSteakFoodBurger menuSteakFoodBurger = new MenuSteakFoodBurger(homePageDhali);
			super.setVisible(false);
		} 
		else if (e.getActionCommand().equals("Chowmein")) {
			MenuSteakFoodChowmein menuSteakFoodChowmein = new MenuSteakFoodChowmein(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Pasta")) {
			MenuSteakFoodPasta menuSteakFoodPasta = new MenuSteakFoodPasta(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Curry & Rice") ){
			MenuSteakFoodCurryRice menuSteakFoodCurryRice = new MenuSteakFoodCurryRice(homePageDhali);
			super.setVisible(false);

			
		} 
		else if (e.getActionCommand().equals("Rice Bowl")) {
			MenuSteakFoodRiceBowl menuSteakFoodRiceBowl = new MenuSteakFoodRiceBowl(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Platter")) {
			MenuSteakFoodPlatter menuSteakFoodPlatter = new MenuSteakFoodPlatter(homePageDhali);
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
