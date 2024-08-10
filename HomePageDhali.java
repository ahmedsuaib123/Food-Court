//package FoodCourtProject;


import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;



public class HomePageDhali extends JFrame implements ActionListener,MouseListener {
	
	private HomePageDhali homePageDhali;
	private HomePage homePage;
    private Login login;
	
	private Menu menu;
	private MenuSpicyVarities menuSpicyVarities;
	private MenuWaffleNut menuWaffleNut;
	private MenuChayerMela menuChayerMela;
	private MenuHydrabadiHandi menuHydrabadiHandi;
	
	

    public HomePageDhali() {
        super("Food Court Online Order System");
		//super.setIconImage(ImageIO.read(new File("icon.png")));
        super.setSize(750, 670);
		super.setLocation(395,10);
		super.setLocationRelativeTo(null); 
		super.setResizable(false);
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 try {
            super.setIconImage(ImageIO.read(new File("./Resources/icon.png")));
        } catch (IOException e) {
           
        }
		
        try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/dhali.jpg")))));
        } catch (Exception e) {
            
        }
		
		
		
		
	    JLabel title = new JLabel("Welcome To Dhali Food Court");
        title.setBounds(165, 6, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

       //Left Components
        JButton theKitchenButton = new JButton("The Kitchen");
		theKitchenButton.setBounds(100,75,200,30);
		super.add(theKitchenButton);
		theKitchenButton.addActionListener(this);
		theKitchenButton.addMouseListener(this);
		
        JButton PLANBButton = new JButton("SWARMA HOUSE");
		PLANBButton.setBounds(100,125,200,30);
		super.add(PLANBButton);
		PLANBButton.addActionListener(this);
		PLANBButton.addMouseListener(this);
		
        JButton dhakaiyaChapButton = new JButton("Dhakaiya Chap");
		dhakaiyaChapButton.setBounds(100,175,200,30);
		super.add(dhakaiyaChapButton);
		dhakaiyaChapButton.addActionListener(this);
		dhakaiyaChapButton.addMouseListener(this);
		
        JButton turkishButton = new JButton("TURKISH TASTE ");
		turkishButton.setBounds(100,225,200,30);
		super.add(turkishButton);
		turkishButton.addActionListener(this);
		turkishButton.addMouseListener(this);
		
		JButton indianDosaButton = new JButton("Indian Dosa");
		indianDosaButton.setBounds(100,275,200,30);
		super.add(indianDosaButton);
		indianDosaButton.addActionListener(this);
		indianDosaButton.addMouseListener(this);
		
		JButton LAZIZButton = new JButton("LAZIZ");
		LAZIZButton.setBounds(100,325,200,30);
		super.add(LAZIZButton);
		LAZIZButton.addActionListener(this);
		LAZIZButton.addMouseListener(this);
		
		
		JButton meatCraftButton = new JButton("Meat Craft");
		meatCraftButton.setBounds(100,375,200,30);
		super.add(meatCraftButton);
		meatCraftButton.addActionListener(this);
		meatCraftButton.addMouseListener(this);
		
	    JButton hydrabadiHandiButton = new JButton("Hydrabadi Handi");
		hydrabadiHandiButton.setBounds(100,425,200,30);
		super.add(hydrabadiHandiButton);
		hydrabadiHandiButton.addActionListener(this);
		hydrabadiHandiButton.addMouseListener(this);
		
		JButton waffleNutButton = new JButton("Waffle Nut");
		waffleNutButton.setBounds(100,475,200,30);
		super.add(waffleNutButton);
		waffleNutButton.addActionListener(this);
		waffleNutButton.addMouseListener(this);
		
		JButton foodTimesButton = new JButton("FOOD TIMES");
		foodTimesButton.setBounds(100,525,200,30);
		super.add(foodTimesButton);
		foodTimesButton.addActionListener(this);
		foodTimesButton.addMouseListener(this);
		
		
		
		//Right Components
		JButton dhakaSpicyButton = new JButton("Spicy Varities Kabab & Soup");
		dhakaSpicyButton.setBounds(450,75,200,30);
		super.add(dhakaSpicyButton);
		dhakaSpicyButton.addActionListener(this);
		dhakaSpicyButton.addMouseListener(this);
		
		JButton chapaiFoodButton = new JButton("CHAPAI FOOD");
		chapaiFoodButton.setBounds(450,125,200,30);
		super.add(chapaiFoodButton);
		chapaiFoodButton.addActionListener(this);
		chapaiFoodButton.addMouseListener(this);
		
		JButton chayerButton = new JButton("Chayer Mela");
		chayerButton.setBounds(450,175,200,30);
		super.add(chayerButton);
		chayerButton.addActionListener(this);
		chayerButton.addMouseListener(this);
		
		JButton steakFoodButton = new JButton("STEAK FOOD");
		steakFoodButton.setBounds(450,225,200,30);
		super.add(steakFoodButton);
		steakFoodButton.addActionListener(this);
		steakFoodButton.addMouseListener(this);
		
		JButton juiceWorldButton = new JButton("Live BBQ & Juice World");
		juiceWorldButton.setBounds(450,275,200,30);
		super.add(juiceWorldButton);
		juiceWorldButton.addActionListener(this);
		juiceWorldButton.addMouseListener(this);
		
		JButton lebaneseButton = new JButton("LEBANESE KABAB");
		lebaneseButton.setBounds(450,325,200,30);
		super.add(lebaneseButton);
		lebaneseButton.addActionListener(this);
		lebaneseButton.addMouseListener(this);
		
		JButton keraryRestaurantButton = new JButton("Kerary Restaurant");
		keraryRestaurantButton.setBounds(450,375,200,30);
		//super.add(keraryRestaurantButton);
		keraryRestaurantButton.addActionListener(this);
		keraryRestaurantButton.addMouseListener(this);
		
		JButton delhiDosaButton = new JButton("DELHI DOSA");
		delhiDosaButton.setBounds(450,425,200,30);
	    super.add(delhiDosaButton);
		delhiDosaButton.addActionListener(this);
		delhiDosaButton.addMouseListener(this);
		
		JButton subwayButton = new JButton("SUBWAY.BD");
		subwayButton.setBounds(450,475,200,30);
		super.add(subwayButton);
		subwayButton.addActionListener(this);
		subwayButton.addMouseListener(this);
		
		JButton fuchkaBanglaButton = new JButton("Fuchka Bangla");
		fuchkaBanglaButton.setBounds(450,525,200,30);
		Font banglaFont = new Font("Arial Unicode MS", Font.BOLD,15);
		fuchkaBanglaButton.setFont(banglaFont);
		super.add(fuchkaBanglaButton);
		fuchkaBanglaButton.addActionListener(this);
		fuchkaBanglaButton.addMouseListener(this);
		
		
		
		JButton backButton = new JButton("Exit");
        backButton.setBounds(78,585,200,30);
       	backButton.setForeground(Color.BLACK);
		backButton.setSize(90,35);
		backButton.addActionListener(this);
        super.add(backButton);
		
		JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(586,585,200,30);
       	logoutButton.setForeground(Color.BLACK);
		logoutButton.setSize(90,35);
		logoutButton.addActionListener(this);
        super.add(logoutButton);

        
        super.setVisible(true);
    }

    public static void main(String[] args) {
        HomePageDhali hp = new HomePageDhali();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("The Kitchen")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurant hpr = new HomePageRestaurant(homePageDhali);
            super.setVisible(false);
			
        } else if (e.getActionCommand().equals("SWARMA HOUSE")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantPlanB pb = new HomePageRestaurantPlanB(homePageDhali);
			super.setVisible(false);
			
        } else if (e.getActionCommand().equals("Dhakaiya Chap")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantDhakaiyaChap dc = new HomePageRestaurantDhakaiyaChap(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("TURKISH TASTE ")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantTurkishTaste tt = new HomePageRestaurantTurkishTaste(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Indian Dosa")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantIndianDosa id = new HomePageRestaurantIndianDosa(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("LAZIZ")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantLaziz id = new HomePageRestaurantLaziz(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Meat Craft")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantMeatCraft mc = new HomePageRestaurantMeatCraft(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Hydrabadi Handi")) {
			MenuHydrabadiHandi menuHydrabadiHandi = new MenuHydrabadiHandi(homePageDhali);
			//HomePageRestaurantHydrabadiHandi pb = new HomePageRestaurantHydrabadiHandi(homePageDhali);
        } else if (e.getActionCommand().equals("Waffle Nut")) {
			MenuWaffleNut menuWaffleNut = new MenuWaffleNut(homePageDhali);
			
        } else if (e.getActionCommand().equals("FOOD TIMES")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantFoodTimes pb = new HomePageRestaurantFoodTimes(homePageDhali);
        } else if (e.getActionCommand().equals("Spicy Varities Kabab & Soup")) {
			MenuSpicyVarities menuSpicyVarities = new MenuSpicyVarities(homePageDhali);
			//HomePageRestaurantDhakaSpicy pb = new HomePageRestaurantDhakaSpicy(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("CHAPAI FOOD")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantChapaiFood pb = new HomePageRestaurantChapaiFood(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Chayer Mela")) {
			MenuChayerMela menuChayerMela = new MenuChayerMela(homePageDhali);
			//HomePageRestaurantChayerMela pb = new HomePageRestaurantChayerMela(homePageDhali);
			super.setVisible(false);
        }else if (e.getActionCommand().equals("STEAK FOOD")) {
			
			HomePageRestaurantSteakFood pb = new HomePageRestaurantSteakFood(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Live BBQ & Juice World")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantLiveBBQ pb = new HomePageRestaurantLiveBBQ(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("LEBANESE KABAB")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantLebaneseKabab pb = new HomePageRestaurantLebaneseKabab(homePageDhali);
			super.setVisible(false);
        }else if (e.getActionCommand().equals("Kerary Restaurant")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantLebaneseKabab pb = new HomePageRestaurantLebaneseKabab(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("DELHI DOSA")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantDelhiDosa pb = new HomePageRestaurantDelhiDosa(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("SUBWAY.BD")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantSubway pb = new HomePageRestaurantSubway(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Fuchka Bangla")) {
			//Menu menu = new Menu(homePageDhali);
			HomePageRestaurantFuchkaBangla pb = new HomePageRestaurantFuchkaBangla(homePageDhali);
			super.setVisible(false);
        } else if (e.getActionCommand().equals("Exit")){
			this.dispose();
			System.exit(0);
			
	 	} else if(e.getActionCommand().equals("Logout")){
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
			super.setVisible(false);
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