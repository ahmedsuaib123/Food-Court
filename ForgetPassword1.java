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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class ForgetPassword1 extends JFrame implements ActionListener {

    private JTextField nameTextField, userField;
    private JButton searchButton, loginButton, signupButton;
    //private int deleteLine;
    private JFrame frame;
    private Login login;
	private ForgetPassword2 forgetPassword2;
	protected int deleteLine;

    Font font15 = new Font("Cambria", Font.BOLD, 25);

    public ForgetPassword1() {

        super("Reset Password");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(750, 670);
        super.setLocation(395, 10);
        super.getContentPane().setBackground(new Color(218, 232, 252));
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
		
		try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/Foodd.jpg")))));
        } catch (Exception e) {
            
        }

        JLabel titleLabel = new JLabel("Reset Password");
        titleLabel.setBounds(195, 25, 500, 50);
        titleLabel.setFont(new Font("Cambria", Font.BOLD, 30));
        this.add(titleLabel);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(100, 215, 200, 30);
        usernameLabel.setForeground(Color.BLACK);
        usernameLabel.setFont(font15);
        this.add(usernameLabel);

        nameTextField = new JTextField();
        nameTextField.setBounds(100, 250, 200, 30);
        nameTextField.setFont(new Font("Cambria", Font.BOLD, 15));
        this.add(nameTextField);

        searchButton = new JButton("Search");
        searchButton.setBounds(150, 300, 200, 30);
        searchButton.setForeground(Color.BLACK);
        searchButton.setSize(90, 35);
        searchButton.addActionListener(this);
        super.add(searchButton);

        loginButton = new JButton("Cancel");
        loginButton.setBounds(100, 400, 200, 30);
        loginButton.setForeground(Color.BLACK);
        loginButton.setSize(90, 35);
        loginButton.addActionListener(this);
        super.add(loginButton);

        signupButton = new JButton("Exit");
        signupButton.setBounds(210, 400, 200, 30);
        signupButton.setForeground(Color.BLACK);
        signupButton.setSize(90, 35);
        signupButton.addActionListener(this);
        super.add(signupButton);

        super.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        String user = "Username : " + nameTextField.getText();
        String user1 = nameTextField.getText();
        boolean userEmpty = user1.isEmpty();
        boolean yes = false;
        int totalLines = 0;

        if (e.getSource() == searchButton) {
            try {
                File userfile = new File(".\\FileIO\\UserData.txt");
                if (userfile.exists()) {
                    BufferedReader readFile = new BufferedReader(new FileReader(".\\FileIO\\UserData.txt"));

                    while (readFile.readLine() != null) {
                        totalLines++;
                    }
                    readFile.close();
                }

                if (userEmpty) {
                    showMessageDialog(null, "Enter Username", "Error", JOptionPane.WARNING_MESSAGE);
                    yes = false;
                } else {

                    for (int i = 0; i < totalLines; i++) {

                        String line = Files.readAllLines(Paths.get(".\\FileIO\\UserData.txt")).get(i);
                        if (line.equals(user)) {
                            deleteLine = i;
                            yes = true;
                            break;

                        }
                    }
                    if (yes) {
                        super.setVisible(false);
                        new ForgetPassword2(); // Need to define ForgetPass2 class
                    } else {
                        showMessageDialog(null, "Username not found", "Error", JOptionPane.WARNING_MESSAGE);
                    }

                }

            } catch (IOException ex) {

                showMessageDialog(null, "Username not found", "Error", JOptionPane.WARNING_MESSAGE);

            }

        } else if (e.getActionCommand().equals("Exit")) {
            this.dispose();
            System.exit(0);

        } else if (e.getActionCommand().equals("Cancel")) {
            login = new Login();
            login.setVisible(true);
            this.dispose();
        }

    }
	

    public static void main(String[] args) {
        new ForgetPassword1();
    }
	
	 public int getDeleteLine() {
        return deleteLine;
    }
}
