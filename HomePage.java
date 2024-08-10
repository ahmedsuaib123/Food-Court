import java.lang.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;



public class HomePage extends JFrame implements ActionListener/*,MouseListener */{
	
	private HomePageDhali homePageDhali;
	
    private Login login;
	
	JButton theKitchenButton,backButton,logoutButton;
	JLabel imgLabel;
	ImageIcon img;

    public HomePage() {
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
		/*
        try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/homepage.png")))));
        } catch (Exception e) {
            
        }*/
		
	    JLabel title = new JLabel("Welcome To Our System");
        title.setBounds(185, 6, 500, 35);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
       // super.add(title);
	   
	    try {
            super.setIconImage(ImageIO.read(new File("./Resources/icon.png")));
        } catch (IOException e) {
           
        }
		
        img = new ImageIcon("./Resources/icon.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(90, 40, 550, 500);
		//super.add(imgLabel);
		

       //Left Components
        theKitchenButton = new JButton("Dhali Food Court");
		theKitchenButton.setBounds(240,350,250,80);
		//theKitchenButton.setBackground(Color.WHITE);
		theKitchenButton.setForeground(Color.BLACK);
		//theKitchenButton.setOpaque(false);
		super.add(theKitchenButton);
		theKitchenButton.addActionListener(this);
		//theKitchenButton.addMouseListener(this);
				
			
		backButton = new JButton("EXIT");
        backButton.setBounds(50,585,200,30);
       	backButton.setForeground(Color.BLACK);
		backButton.setSize(90,35);
		backButton.addActionListener(this);
        super.add(backButton);
		
		logoutButton = new JButton("Logout");
        logoutButton.setBounds(586,585,200,30);
       	logoutButton.setForeground(Color.BLACK);
		logoutButton.setSize(90,35);
		logoutButton.addActionListener(this);
        super.add(logoutButton);

        
        super.setVisible(true);
    }

    public static void main(String[] args) {
        HomePage hp = new HomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("Dhali Food Court")) {
			
			HomePageDhali hpd = new HomePageDhali();
            super.setVisible(false);
			
        } else if (e.getActionCommand().equals("EXIT")){
			
	 		this.dispose();
			System.exit(0);
			
	 	}
		else if(e.getActionCommand().equals("Logout")){
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
			super.setVisible(false);
		}
    }
	/*
    @Override
    public void mouseExited(MouseEvent me) {
        JButton sourceButton = (JButton) me.getSource();
        sourceButton.setBackground(UIManager.getColor("Button.background"));
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        JButton sourceButton = (JButton) me.getSource();
        //sourceButton.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }*/
}