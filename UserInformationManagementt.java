import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

public class UserInformationManagementt extends JFrame implements ActionListener {
    Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);

    JTextField idTextField, nameTextField, ageTextField, phoneNumberTextField, salaryTextField, restaurantTextField,searchTextField,deleteTextField;
    JButton addButton,updateButton,searchButton,deleteButton,clearButton,showAllButton;
    JTextArea setTextArea;
    JComboBox genderComboBox, jobComboBox, restaurantComboBox;
	//private JTextArea textArea;

    UserList userList;

    public UserInformationManagementt(UserList userListList) {
        
        super.setTitle("Food Court Online Order System");
		super.setIconImage(new ImageIcon("").getImage());
        super.setSize(960, 800);
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        JLabel title = new JLabel("User Information Management System");
        title.setBounds(245, 0, 700, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 25);
        title.setFont(titleFont);
        super.add(title);
		
		JLabel subtitle = new JLabel("User  Informations");
        subtitle.setBounds(323, 40, 500, 50);
        subtitle.setFont(new Font("Cambria", Font.BOLD, 20));
        super.add(subtitle);

        

        JLabel idLabel = new JLabel("First Name:");
        idLabel.setBounds(20, 70, 80, 20);
        add(idLabel);

        idTextField = new JTextField();
        idTextField.setBounds(20,100,200,30);
        add(idTextField);

        JLabel nameLabel = new JLabel("Last Name:");
        nameLabel.setBounds(20,130,200,30);
        super.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setBounds(20,160,200,30);
        add(nameTextField);

        JLabel ageLabel = new JLabel("User Name:");
        ageLabel.setBounds(20,190,200,30);
        add(ageLabel);

        ageTextField = new JTextField();
        ageTextField.setBounds(20,220,200,30);
        add(ageTextField);
		
	    JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20,250,200,30);
        add(emailLabel);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(20,280,200,30);
        add(emailTextField);
		
		 JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setBounds(20,310,200,30);
        add(phoneNumberLabel);

        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(20,340,200,30);
        add(phoneNumberTextField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20,370,200,30);
        add(genderLabel);

        genderComboBox = new JComboBox<>(new String[]{"Male", "Female"});
        genderComboBox.setBounds(20,400,200,30);
        add(genderComboBox);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20,430,200,30);
        add(passwordLabel);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(20,460,200,30);
        add(passwordTextField);

        


        addButton = new JButton("ADD");
		addButton.setBounds(20,600,200,30); 
		//addButton.setBackground(Color.GREEN);
		addButton.setFont(font15);
		addButton.addActionListener(this);
		//addButton.addMouseListener(this);
		
		updateButton = new JButton("UPDATE");
		updateButton.setBounds(20,640,200,30);
		//updateButton.setBackground(Color.BLUE);
		updateButton.setForeground(Color.BLACK);
		updateButton.setFont(font15);
		updateButton.addActionListener(this);
		
		setTextArea = new JTextArea();
        setTextArea.setBounds(230,150,580,550);
        setTextArea.setFont(new Font("Cambria", Font.BOLD, 15));
		super.add(setTextArea);
		
		//reloadAllEmployees();
		
        setTextArea.setEditable(false);
		
		
		
        JScrollPane jsp = new JScrollPane(setTextArea);
        jsp.setBounds(230,100,460,573);
        add(jsp);
		
		
		JLabel searchLabel = new JLabel("Search By Username");
		searchLabel.setBounds(700,70,200,30); //X,Y,W,H
		searchLabel.setFont(font15);
		super.add(searchLabel);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(700,100,200,30); //X,Y,W,H
		searchTextField.setFont(font15);
		super.add(searchTextField);
		
		searchButton = new JButton("SEARCH");
        searchButton.setBounds(700,130,200,30); //X,Y,W,H
        //deleteButton.setBackground(Color.RED);
        searchButton.setForeground(Color.BLACK);
        searchButton.setFont(font15);
        searchButton.addActionListener(this);
        super.add(searchButton);

        
		
		JLabel deleteLabel = new JLabel("Delete By Username");
		deleteLabel.setBounds(700,160,200,30); //X,Y,W,H
		deleteLabel.setFont(font15);
		super.add(deleteLabel);
		
		
        deleteTextField = new JTextField();
		deleteTextField.setBounds(700,190,200,30); //X,Y,W,H
		deleteTextField.setFont(font15);
		super.add(deleteTextField);
		
		deleteButton = new JButton("DELETE");
		deleteButton.setBounds(700,220,200,30); //X,Y,W,H
		//deleteButton.setBackground(Color.RED);
		deleteButton.setForeground(Color.BLACK);
		deleteButton.setFont(font15);
		deleteButton.addActionListener(this);
		super.add(deleteButton);
		
		showAllButton = new JButton("SHOW ALL");
		showAllButton.setBounds(700,600,200,30); //X,Y,W,H
		//showAllButton.setBackground(Color.PINK);
		showAllButton.setForeground(Color.BLACK);
		showAllButton.setFont(font15);
		showAllButton.addActionListener(this);
		super.add(showAllButton);
	
		
		clearButton = new JButton("CLEAR SCREEN");
		clearButton.setBounds(700,640,200,30); //X,Y,W,H
		//clearButton.setBackground(Color.DARK_GRAY);
		clearButton.setForeground(Color.BLACK);
		clearButton.setFont(font15);
		clearButton.addActionListener(this);
		super.add(clearButton);
		
		
		super.add(addButton);
		super.add(updateButton);
		
		JButton backButton = new JButton("BACK");
        backButton.setBounds(75,685,200,30);
       	backButton.setForeground(Color.BLACK);
		backButton.setSize(90,35);
		backButton.addActionListener(this);
        super.add(backButton);
		
		JButton logoutButton = new JButton("LOGOUT");
        logoutButton.setBounds(755,685,200,30);
       	logoutButton.setForeground(Color.BLACK);
		logoutButton.setSize(90,35);
		logoutButton.addActionListener(this);
        super.add(logoutButton);

        

        setVisible(true);

        this.userList = userList;
    }
	
	
    public static void main(String[] args) {
        UserList userList = new UserList();
        UserInformationManagementt userManagement = new UserInformationManagementt(userList);
        userManagement.reloadAllUsers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {}

    private void clearFields() {
        ageTextField.setText("");
        idTextField.setText("");
        nameTextField.setText("");
        //emailTextField.setText("");
        phoneNumberTextField.setText("");
    }

    public void reloadAllUsers() {
        setTextArea.setText(userList.showAll());
    }


}
