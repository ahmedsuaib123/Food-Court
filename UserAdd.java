import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class UserAdd extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1,title,firstLabel,emailLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField usernameTextField, confirmPasswordField, fullNameTextField, priceTextField, emailTextField,afullNameTextField;
    private JComboBox genderComboBox;
    private JButton btn1, btn2, nBtn;
    private JPasswordField passwordField;
    private Cursor cursor;
	
	Font font15 = new Font("Cambria", Font.BOLD, 15);

    UserAdd() {
        // Frame Layout
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Food Court Online Order System");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(600, 700); //width, height
		super.setLocation(395,10); //X, Y
		super.setResizable(false);
		//super.getContentPane().setBackground(Color.WHITE);
		super.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        //icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        
        f1 = new Font("Cambria", Font.BOLD, 35);
        f2 = new Font("Cambria", Font.BOLD, 25);
        f3 = new Font("Cambria", Font.PLAIN, 35);
        f4 = new Font("Cambria", Font.PLAIN, 25);
        f5 = new Font("Cambria", Font.PLAIN, 19);
        f6 = new Font("Cambria", Font.PLAIN, 25);

       
        title = new JLabel("Enter Information");
        title.setBounds(130, 10, 500, 50);
        title.setFont(f1);
        c.add(title);

        
        JLabel afullNameLabel = new JLabel("First Name ");
        afullNameLabel.setBounds(100, 70, 200, 30); //X,Y,W,H
        afullNameLabel.setFont(font15);
        this.add(afullNameLabel);

        afullNameTextField = new JTextField();
        afullNameTextField.setBounds(250, 70, 200, 30); //X,Y,W,H
        afullNameTextField.setFont(font15);
        this.add(afullNameTextField);

        JLabel fullNameLabel = new JLabel("Last Name ");
        fullNameLabel.setBounds(100, 140, 200, 30); //X,Y,W,H
        fullNameLabel.setFont(font15);
        this.add(fullNameLabel);

        fullNameTextField = new JTextField();
        fullNameTextField.setBounds(250, 140, 200, 30); //X,Y,W,H
        fullNameTextField.setFont(font15);
        this.add(fullNameTextField);

        JLabel usernameLabel = new JLabel("Username ");
        usernameLabel.setBounds(100, 210, 200, 30); //X,Y,W,H
        usernameLabel.setFont(font15);
        this.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(250, 210, 200, 30); //X,Y,W,H
        usernameTextField.setFont(font15);
        this.add(usernameTextField);

        JLabel emailLabel = new JLabel("Email ");
        emailLabel.setBounds(100, 280, 200, 30); //X,Y,W,H
        emailLabel.setFont(font15);
        this.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(250, 280, 200, 30); //X,Y,W,H
        emailTextField.setFont(font15);
        this.add(emailTextField);
        JLabel phoneNumberLabel = new JLabel("Phone Number ");
        phoneNumberLabel.setBounds(100, 350, 200, 30); //X,Y,W,H
        phoneNumberLabel.setFont(font15);
        this.add(phoneNumberLabel);

        priceTextField = new JTextField();
        priceTextField.setBounds(250, 350, 200, 30); //X,Y,W,H
        priceTextField.setFont(font15);
        this.add(priceTextField);

        JLabel genderLabel = new JLabel("Gender ");
        genderLabel.setBounds(100, 420, 200, 30); //X,Y,W,H
        genderLabel.setFont(font15);
        this.add(genderLabel);

        genderComboBox = new JComboBox(new String[]{"Male", "Female", "Custom"});
        genderComboBox.setBounds(250, 420, 200, 30);
        genderComboBox.setFont(font15);
        this.add(genderComboBox);

        JLabel passwordLabel = new JLabel("Password ");
        passwordLabel.setBounds(100, 490, 200, 30); //X,Y,W,H
        passwordLabel.setFont(font15);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(250, 490, 200, 30); //X,Y,W,H
        passwordField.setFont(font15);
        this.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password ");
        confirmPasswordLabel.setBounds(100, 560, 200, 30); //X,Y,W,H
        confirmPasswordLabel.setFont(font15);
        this.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(250, 560, 200, 30); //X,Y,W,H
        confirmPasswordField.setFont(font15);
        this.add(confirmPasswordField);

		
        cursor = new Cursor(Cursor.HAND_CURSOR);
		
        btn1 = new JButton("Back");
        btn1.setBounds(51, 600, 100, 40);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.BLACK);
       // btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        btn2 = new JButton("Add");
        btn2.setBounds(395, 600, 100, 40);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.BLACK);
       // btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
	}


  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        UserAdd ua = new UserAdd();
        ua.setVisible(true); // Make the frame visible
    });
}
}


