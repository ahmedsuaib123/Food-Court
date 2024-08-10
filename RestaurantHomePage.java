import java.lang.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RestaurantHomePage extends JFrame implements ActionListener/*,MouseListener */{
	
	private HomePageJamuna homePageJamuna;
	
	JTextField nameTextField,tableTextField;
	
	Font font15 = new Font("Cambria",Font.BOLD,25);

    public RestaurantHomePage() {
        super("Food Court Online Order System");
		//super.setIconImage(ImageIO.read(new File("icon.png")));
        super.setSize(750, 670);
		super.setLocation(395,10);
		super.setLocationRelativeTo(null); 
		super.setResizable(false);
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	    JLabel title = new JLabel("Welcome To Our Restaurant");
        title.setBounds(165,80, 500, 35);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);

        JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(200,215,200,30); //X,Y,W,H
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(300,215,200,30); //X,Y,W,H
		nameTextField.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(nameTextField);
		
		JLabel tableLabel = new JLabel("Table No ");
		tableLabel.setBounds(200,250,200,30); //X,Y,W,H
		tableLabel.setForeground(Color.BLACK);
		tableLabel.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(tableLabel);
		
		tableTextField = new JTextField();
		tableTextField.setBounds(300,250,200,30); //X,Y,W,H
		tableTextField.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(tableTextField);
		
		JButton nextButton = new JButton("Next");
        nextButton.setBounds(350,300,200,30);
       	nextButton.setForeground(Color.BLACK);
		nextButton.setSize(90,35);
		nextButton.addActionListener(this);
        super.add(nextButton);
		
		JButton backButton = new JButton("Back");
        backButton.setBounds(50,585,200,30);
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
        RestaurantHomePage hp = new RestaurantHomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
		if (e.getActionCommand().equals("Back")){
			HomePageJamuna homePageJamuna = new HomePageJamuna();
			homePageJamuna.setVisible(true);
	 		this.dispose();
			
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