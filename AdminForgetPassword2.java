import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class AdminForgetPassword2 extends JFrame implements ActionListener {
    
    private Login login;

Font font15 = new Font("Cambria",Font.BOLD,25);
private AdminForgetPassword1 adminForgetPassword1;

JTextField nameTextField, anameTextField;
JPasswordField passField, apassField;

JButton searchButton, loginButton, signupButton;
private int i;

public AdminForgetPassword2(){
    
    super("Reset Password");
    //super.setIconImage(new ImageIcon("").getImage());
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    super.setSize(750, 670); //width, height
    super.setLocation(395,10); //X, Y
    super.getContentPane().setBackground(new Color(218,232,252));
    super.setLayout(null);
    
	try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/Foodd.jpg")))));
        } catch (Exception e) {
            
        }
	
    JLabel titleLabel = new JLabel("Reset Password");
    titleLabel.setBounds(195,25,500,50); //X,Y,W,H
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
    
    searchButton = new JButton("Search");
    searchButton.setBounds(150,300,200,30);
    searchButton.setForeground(Color.BLACK);
    searchButton.setSize(90,35);
    searchButton.addActionListener(this);
    super.add(searchButton);
    
    loginButton = new JButton("Cancel");
    loginButton.setBounds(100,400,200,30);
    loginButton.setForeground(Color.BLACK);
    loginButton.setSize(90,35);
    loginButton.addActionListener(this);
    super.add(loginButton);
    
    signupButton = new JButton("Exit");
    signupButton.setBounds(210,400,200,30);
    signupButton.setForeground(Color.BLACK);
    signupButton.setSize(90,35);
    signupButton.addActionListener(this);
    super.add(signupButton);
            
    super.setVisible(true);
    
}

public void actionPerformed(ActionEvent e) {
    
    if (e.getSource() == searchButton) {
        String user = "Username : " + nameTextField.getText();
        String user1 = nameTextField.getText();
        boolean userEmpty = user1.isEmpty();
        boolean yes = false;
        int totalLines = 0;
        
        try {
			List<String> lines = Files.readAllLines(Paths.get("./FileIO/UserData.txt"));
    String otherline = lines.get(i);
            File userfile = new File("./FileIO/UserData.txt");
            if (userfile.exists()) {
                BufferedReader readFile = new BufferedReader(new FileReader("./FileIO/UserData.txt"));
                
                while (readFile.readLine() != null) {
                    totalLines++;
                }
                readFile.close();
            }
            
            if (userEmpty == true) {
                showMessageDialog(null, "Enter Username", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                
                for (int i = 0; i < totalLines; i++) {
                    
                    String line = lines.get(i); // Assuming 'i' is the index you want to access

                    if (line.equals(user)) {
                        yes = true;
                        break;
                    }
                }
                
                if (yes == true) {
                    this.setVisible(false);
                } else {
                    showMessageDialog(null, "Username not found", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            
        } catch (Exception ex) {
			 ex.printStackTrace();
            showMessageDialog(null, "Error accessing user data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    } else if (e.getActionCommand().equals("Exit")){
        this.dispose();
        System.exit(0);
        
    } else if (e.getActionCommand().equals("Cancel")){
        login = new Login();
        login.setVisible(true);
        this.dispose();
    }
    
}

public static void main(String[] args) {
    new AdminForgetPassword2();
}

}