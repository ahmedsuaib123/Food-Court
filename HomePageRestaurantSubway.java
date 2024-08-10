import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

public class HomePageRestaurantSubway extends JFrame implements ActionListener,MouseListener {
	private static HomePageDhali homePageDhali;
	
	private MenuSubwaySmoothie menuSubwaySmoothie;
	private MenuSubwayCoffee menuSubwayCoffee;
	private MenuSubwayFaluda menuSubwayFaluda;
	private MenuSubwayRefresher menuSubwayRefresher;
	private MenuSubwayMilkShake menuSubwayMilkShake;
	private MenuSubwayMozito menuSubwayMozito;
	private MenuSubwayLassi menuSubwayLassi;

    public HomePageRestaurantSubway(HomePageDhali homePageDhali) {
        super("SUBWAY.BD");
        super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
		
	    JLabel title = new JLabel("Welcome To SUBWAY.BD");
        title.setBounds(175, 25, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       
        JButton appetizersButton = new JButton("Smoothie");
		appetizersButton.setBounds(130,100,200,30);
		super.add(appetizersButton);
		appetizersButton.addActionListener(this);
		appetizersButton.addMouseListener(this);
		
        JButton entreesButton = new JButton("Coffee & Tea");
		entreesButton.setBounds(130,200,200,30);
		super.add(entreesButton);
		entreesButton.addActionListener(this);
		entreesButton.addMouseListener(this);
		
        JButton sideButton = new JButton("Faluda");
		sideButton.setBounds(130,300,200,30);
		super.add(sideButton);
		sideButton.addActionListener(this);
		sideButton.addMouseListener(this);
		
        JButton saladButton = new JButton("Fresh Juice");
		saladButton.setBounds(130,400,200,30);
		super.add(saladButton);
		saladButton.addActionListener(this);
		saladButton.addMouseListener(this);
		
		
		JButton soupButton = new JButton("Refresher");
		soupButton.setBounds(390,100,200,30);
		super.add(soupButton);
		soupButton.addActionListener(this);
		soupButton.addMouseListener(this);
		
		JButton sandwichesButton = new JButton("Lassi");
		sandwichesButton.setBounds(390,200,200,30);
		super.add(sandwichesButton);
		sandwichesButton.addActionListener(this);
		sandwichesButton.addMouseListener(this);
		
        JButton dessertsButton = new JButton("Milk Shake");
		dessertsButton.setBounds(390,300,200,30);
		super.add(dessertsButton);
		dessertsButton.addActionListener(this);
		dessertsButton.addMouseListener(this);
		
        JButton beveragesButton = new JButton("Mozito");
		beveragesButton.setBounds(390,400,200,30);
		super.add(beveragesButton);
		beveragesButton.addActionListener(this);
		beveragesButton.addMouseListener(this);
		
		
		JButton specialButton = new JButton("Specials");
		specialButton.setBounds(250,500,200,30);
		//super.add(specialButton);
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
   
        HomePageRestaurantSubway hpr = new HomePageRestaurantSubway(homePageDhali);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Smoothie")) {
			MenuSubwaySmoothie menuSubwaySmoothie = new MenuSubwaySmoothie(homePageDhali);
			super.setVisible(false);
        } 
		else if (e.getActionCommand().equals("Coffee & Tea")) {
			MenuSubwayCoffee menuSubwayCoffee = new MenuSubwayCoffee(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Faluda")) {
			MenuSubwayFaluda menuSubwayFaluda = new MenuSubwayFaluda(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Fresh Juice")) {
		    Menu menu = new Menu(homePageDhali);
			super.setVisible(false);
		} 
		else if (e.getActionCommand().equals("Refresher")) {
			MenuSubwayRefresher menuSubwayRefresher = new MenuSubwayRefresher(homePageDhali);
			super.setVisible(false);

        }
		else if (e.getActionCommand().equals("Milk Shake")) {
			MenuSubwayMilkShake menuSubwayMilkShake = new MenuSubwayMilkShake(homePageDhali);
			super.setVisible(false);

        } 
		else if (e.getActionCommand().equals("Lassi") ){
			MenuSubwayLassi menuSubwayLassi = new MenuSubwayLassi(homePageDhali);
			super.setVisible(false);

			
		} 
		else if (e.getActionCommand().equals("Mozito")) {
			MenuSubwayMozito menuSubwayMozito = new MenuSubwayMozito(homePageDhali);
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
