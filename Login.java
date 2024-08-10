//package FoodCourtProject;
import FileIO.*;
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
import java.time.*;
import java.time.format.*;
import java.nio.file.*;


public class Login extends JFrame implements ActionListener {
	
	private Contribution contribution;
    
	Font font15 = new Font("Cambria",Font.BOLD,25);
	private Login login;
	
	JTextField nameTextField,anameTextField;
    JPasswordField passField,apassField;
	
	private HomePageDhali homePageDhali;
	private AboutUs aboutUs;
	
	
	
	public Login(){
		
		super("Food Court Online Order System");
		//super.setIconImage(new ImageIcon("").getImage());
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setResizable(false);
		//super.getContentPane().setBackground(Color.WHITE);
		super.setLocationRelativeTo(null); 
		super.setLayout(null);
		
		 try {
            super.setIconImage(ImageIO.read(new File("./Resources/iconn.png")));
        } catch (IOException e) {
           
        }
		
		/* try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/FOOD_COURT.png")))));
        } catch (Exception e) {
            
        }*/
		
		//Left components 
		
		JLabel titleLabel = new JLabel(" LOGIN PAGE ");
		titleLabel.setBounds(255,25,500,50); //X,Y,W,H
		titleLabel.setFont(new Font("Cambria",Font.BOLD,30));
		this.add(titleLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(100,215,200,30); //X,Y,W,H
		usernameLabel.setForeground(Color.BLACK);
		usernameLabel.setFont(font15);
		this.add(usernameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(100,250,200,30); //X,Y,W,H
		nameTextField.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(nameTextField);
		
		
		JLabel passwordLabel = new JLabel("User Password");
		passwordLabel.setBounds(100,315,200,30); //X,Y,W,H
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setFont(font15);
		this.add(passwordLabel);
		
		passField = new JPasswordField();
		passField.setBounds(100,350,200,30); //X,Y,W,H
		passField.setEchoChar('*');
		passField.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(passField);
		
		JButton loginButton = new JButton("Login");
        loginButton.setBounds(100,400,200,30);
       	loginButton.setForeground(Color.BLACK);
		loginButton.setSize(90,35);
		loginButton.addActionListener(this);
        super.add(loginButton);
		
		JButton signupButton = new JButton("Signup");
        signupButton.setBounds(210,400,200,30);
       	signupButton.setForeground(Color.BLACK);
		signupButton.setSize(90,35);
		signupButton.addActionListener(this);
        super.add(signupButton);
		
		JButton ForgottenButton = new JButton("Forgotten password?");
        ForgottenButton.setBounds(100,450,400,30);
       	ForgottenButton.setForeground(Color.BLACK);
		ForgottenButton.setSize(200,35);
		ForgottenButton.addActionListener(this);
        super.add(ForgottenButton);
		
		//Right components 
		
		JLabel ausernameLabel = new JLabel("Admin Username");
		ausernameLabel.setBounds(400,215,300,30); //X,Y,W,H
		ausernameLabel.setForeground(Color.BLACK);
		ausernameLabel.setFont(font15);
		this.add(ausernameLabel);
		
		anameTextField = new JTextField();
		anameTextField.setBounds(400,250,200,30); //X,Y,W,H
		anameTextField.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(anameTextField);
		
		
		JLabel apasswordLabel = new JLabel("Admin Password");
		apasswordLabel.setBounds(400,315,200,30); //X,Y,W,H
		apasswordLabel.setForeground(Color.BLACK);
		apasswordLabel.setFont(font15);
		this.add(apasswordLabel);
		
		apassField = new JPasswordField();
		apassField.setBounds(400,350,200,30); //X,Y,W,H
		//apassField.setEchoChar('*');
		apassField.setFont(new Font("Cambria",Font.BOLD,15));
		this.add(apassField);
		
		JButton aloginButton = new JButton(" Login");
        aloginButton.setBounds(455,400,200,30);
       	aloginButton.setForeground(Color.BLACK);
		aloginButton.setSize(90,35);
		aloginButton.addActionListener(this);
        super.add(aloginButton);
		
		
		
		JButton AdminForgottenButton = new JButton(" Forgotten password?");
        AdminForgottenButton.setBounds(400,450,400,30);
       	AdminForgottenButton.setForeground(Color.BLACK);
		AdminForgottenButton.setSize(200,35);
		AdminForgottenButton.addActionListener(this);
        super.add(AdminForgottenButton);
		
		JButton ContributionsButton = new JButton("Contributions");
        ContributionsButton.setBounds(290,530,400,30);
       	ContributionsButton.setForeground(Color.BLACK);
		ContributionsButton.setSize(120,35);
		ContributionsButton.addActionListener(this);
        super.add(ContributionsButton);
		
		JButton AboutUsButton = new JButton("About Us");
        AboutUsButton.setBounds(290, 580, 200, 35);
       	AboutUsButton.setForeground(Color.BLACK);
		AboutUsButton.setSize(120,35);
		//AboutUsButton.addActionListener(this);
        super.add(AboutUsButton);
		
		
		
		
		
		super.setVisible(true);
		
	}
	
	    
		
	public void actionPerformed(ActionEvent e) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

        String timeAndDate = myDateObj.format(myFormatObj);
		
        String userName = nameTextField.getText();
        String userPass = new String(passField.getPassword());
		
		String adminName = anameTextField.getText();
        String adminPass = new String(apassField.getPassword());

        try {
            if (e.getSource() instanceof JButton) {
                JButton sourceButton = (JButton) e.getSource();

                if (sourceButton.getText().equals("Login")) {
                    if (UserFileIO.checkUserFromFile(userName, userPass)) {
                        JOptionPane.showMessageDialog(this, "Login Successful");
                        //HomePage hp = new HomePage();
                        //hp.setVisible(true);
						HomePageDhali hpd = new HomePageDhali();
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Login Failed");
                    }
                } else if (sourceButton.getText().equals("Signup")) {
                    this.setVisible(false);
                    Signup signup = new Signup();
                    signup.setVisible(true);
                } else if (e.getActionCommand().equals("Forgotten password?")){
			        ForgetPassword1 login = new ForgetPassword1();
			        login.setVisible(true);
			        this.dispose();
			
	 	        } else if (sourceButton.getText().equals(" Signup")) {
                    this.setVisible(false);
                    //AdminSignup signup = new AdminSignup();
                   // signup.setVisible(true);
                } else if (sourceButton.getText().equals(" Login")) {
                    if (AdminFileIO.checkUserFromFile(adminName, adminPass)) {
                        JOptionPane.showMessageDialog(this, "Login Successful");
                        AdminHomePage hp = new AdminHomePage();
                        hp.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Login Failed");
                    }
                }  else if (e.getActionCommand().equals(" Forgotten password?")){
			        AdminForgetPassword1 login = new AdminForgetPassword1();
			        login.setVisible(true);
			        this.dispose();
			
	 	        } else if (e.getActionCommand().equals("Contributions")){
				Contribution contribution = new Contribution();
				contribution.setVisible(true);
				super.setVisible(false);
			}else if (e.getActionCommand().equals("About Us")){
				AboutUs aboutUs = new AboutUs();
				//aboutUs.setVisible(true);
				super.setVisible(false);
			}
			}	
             

        } catch (Exception ex) {
            
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}