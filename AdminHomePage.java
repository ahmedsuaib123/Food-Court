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



public class AdminHomePage extends JFrame implements ActionListener {
	
	private EmployeeList employeeList;
	private UserList userList;
	
    
	Font font15 = new Font("Cambria",Font.BOLD,25);
	private AdminHomePage adminHomePage;
	
	JTextField nameTextField,anameTextField;
    JPasswordField passField,apassField;
	JLabel background;
	private Login login;
	
	private ForgetPassword2 forgetPassword2;
	
	private EmployeeManagement employeeManagement;
	private FoodItemManagement foodItemManagement;
	private UserInformationManagementt userInformationManagementt;
	private AdminInformationManagement adminInformationManagement;
	
	
	public AdminHomePage(){
		super("Food Court Online Order System");
		
		employeeList = new EmployeeList(5);
		
		super.setIconImage(new ImageIcon("").getImage());
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(750, 670); //width, height
		super.setLocation(395,10); //X, Y
		super.setResizable(false);
		//super.getContentPane().setBackground(Color.WHITE);
		super.setLocationRelativeTo(null); 
		super.setLayout(null);
		
		//ImageIcon img = new ImageIcon("./Resources/FoodCourt.jpg");
		
		//background = new JLabel("",img,JLabel.CENTER);
		//background.setBounds(0,0,750,0);
		//super.add(background);
		
		 try {
            super.setIconImage(ImageIO.read(new File("./Resources/iconn.png")));
        } catch (IOException e) {
           
        }
		
		try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/Foodd.jpg")))));
        } catch (Exception e) {
            
        }
		
		JLabel title = new JLabel("Welcome To Admin Homepage");
        title.setBounds(90, 40, 700, 75);
        Font titleFont = new Font("Cambria", Font.BOLD, 40);
		title.setForeground(Color.WHITE);
        title.setFont(titleFont);
        super.add(title);
		
		JButton employeeButton = new JButton("EMPLOYEE MANAGEMENT");
		employeeButton.setBounds(230,150,250,30);
		employeeButton.setBackground(Color.WHITE);
		employeeButton.setForeground(Color.BLACK);
		super.add(employeeButton);
		employeeButton.addActionListener(this);
		//employeeButton.addMouseListener(this);
		
        JButton foodCourtButton = new JButton("SHOW ALL USERS INFORMATIONS");
		foodCourtButton.setBounds(230,200,250,30);
		foodCourtButton.setBackground(Color.WHITE);
		foodCourtButton.setForeground(Color.BLACK);
		super.add(foodCourtButton);
		foodCourtButton.addActionListener(this);
		//foodCourtButton.addMouseListener(this);
		
        
        JButton restaurantButton = new JButton("SHOW ALL ADMINS INFORMATIONS");
		restaurantButton.setBounds(230,250,250,30);
		restaurantButton.setBackground(Color.WHITE);
		restaurantButton.setForeground(Color.BLACK);
		super.add(restaurantButton);
		restaurantButton.addActionListener(this);
		//restaurantButton.addMouseListener(this);
		
		JButton userButton = new JButton("SHOW ALL USERS INFORMATIONS");
		userButton.setBounds(230,300,250,30);
		userButton.setBackground(Color.WHITE);
		userButton.setForeground(Color.BLACK);
		//super.add(userButton);
		userButton.addActionListener(this);
		//userButton.addMouseListener(this);
		
		JButton adminButton = new JButton("SHOW ALL ADMINS INFORMATIONS");
		adminButton.setBounds(230,350,250,30);
		adminButton.setBackground(Color.WHITE);
		adminButton.setForeground(Color.BLACK);
		//super.add(adminButton);
		adminButton.addActionListener(this);
		//adminButton.addMouseListener(this);
		
		JButton orderButton = new JButton("SHOW ALL ORDERS");
		orderButton.setBounds(230,400,250,30);
		orderButton.setBackground(Color.WHITE);
		orderButton.setForeground(Color.BLACK);
		//super.add(orderButton);
		orderButton.addActionListener(this);
		//orderButton.addMouseListener(this);
		
		JButton backButton = new JButton("EXIT");
        backButton.setBounds(90,555,200,30);
       	backButton.setForeground(Color.BLACK);
		//backButton.setBackground(Color.WHITE);
		backButton.setSize(90,35);
		backButton.addActionListener(this);
        super.add(backButton);
		
		JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(575,555,200,30);
       	logoutButton.setForeground(Color.BLACK);
		//logoutButton.setBackground(Color.WHITE);
		logoutButton.setSize(90,35);
		logoutButton.addActionListener(this);
        super.add(logoutButton);
		
		employeeList = new EmployeeList(5);
		userList = new UserList(100);
		
		super.setVisible(true);
		
		
		
	}
	
	    
		
	public void actionPerformed(ActionEvent e) {
		
		employeeList = new EmployeeList(100);
		userList = new UserList(100);


		if (e.getActionCommand().equals("EMPLOYEE MANAGEMENT")) {
            EmployeeList employeeList = new EmployeeList(100);

            EmployeeFileIO.loadFromFile(employeeList);
            EmployeeManagement employeeManagement = new EmployeeManagement(employeeList);
			employeeManagement.reloadAllEmployees();
            employeeManagement.setVisible(true);
            this.dispose();
            super.setVisible(false);
        } else if (e.getActionCommand().equals("FOOD ITEM MANAGEMENT")){
			FoodItemManagement foodItemManagement = new FoodItemManagement();
			foodItemManagement.setVisible(true);
			this.dispose();
			super.setVisible(false);
			
	 	} else if (e.getActionCommand().equals("FOOD COURT MANAGEMENT")){
			FoodCourtManagement foodCourtManagement = new FoodCourtManagement();
			foodCourtManagement.setVisible(true);
			this.dispose();
			super.setVisible(false);
			
	 	} else if (e.getActionCommand().equals("RESTAURANT MANAGEMENT")){
			RestaurantManagement restaurantManagement = new RestaurantManagement();
			restaurantManagement.setVisible(true);
			this.dispose();
			super.setVisible(false);
			
	 	}  else if (e.getActionCommand().equals("SHOW ALL USERS INFORMATIONS")){
			
			UserInformationManagementt userInformationManagementt = new UserInformationManagementt(userList);
			UserFileIO.loadFromFile("./FileIO/UserInformation.txt");
			userInformationManagementt.setVisible(true);
			this.dispose();
			super.setVisible(false);
			
			
	 	} else if (e.getActionCommand().equals("SHOW ALL ADMINS INFORMATIONS")){
			AdminInformationManagement adminInformationManagement = new AdminInformationManagement();
			//AdminFileIO.loadFromFile("./FileIO/AdminData.txt");
			adminInformationManagement.setVisible(true);
			this.dispose();
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

    public static void main(String[] args) {
        new AdminHomePage();
    }
}