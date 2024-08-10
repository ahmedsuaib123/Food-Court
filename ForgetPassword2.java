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


public class ForgetPassword2 extends JFrame implements ActionListener {

    private JTextField nameTextField, userField;
    private JButton searchButton, loginButton, signupButton;
    //private int deleteLine;
    private JFrame frame;
    private Login login;
	protected int deleteLine;
	
	private ForgetPassword1 forgetPassword1;

    Font font15 = new Font("Cambria", Font.BOLD, 25);

    public ForgetPassword2() {

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
		titleLabel.setForeground(Color.WHITE);
        this.add(titleLabel);

        JLabel usernameLabel = new JLabel("Phone Number");
        usernameLabel.setBounds(100, 215, 200, 30);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(font15);
        this.add(usernameLabel);

        nameTextField = new JTextField();
        nameTextField.setBounds(100, 250, 200, 30);
        nameTextField.setFont(new Font("Cambria", Font.BOLD, 15));
        this.add(nameTextField);

        searchButton = new JButton("Next");
        searchButton.setBounds(150, 300, 200, 30);
        searchButton.setForeground(Color.BLACK);
        searchButton.setSize(90, 35);
        searchButton.addActionListener(this);
        super.add(searchButton);
		
		   try {
            File userfile = new File(".\\files\\UserInformation.txt");
            
            int k = forgetPassword1.getDeleteLine() + 2;  // Assuming ForgetPass.deleteLine is defined elsewhere
            String line1 = Files.readAllLines(Paths.get(".\\files\\UserInformation.txt")).get(k);
            String line2 = "";

            line2 = line2 + line1.charAt(16);
            line2 = line2 + line1.charAt(17);
            line2 = line2 + line1.charAt(18);

            JLabel hintphn = new JLabel("Hint: xxxxxxxx" + line2);
            hintphn.setBounds(60, 180, 180, 30);
            hintphn.setForeground(Color.RED);
            Font hintphnFont = new Font("Verdana", Font.BOLD, 14);
            hintphn.setFont(hintphnFont);
            hintphn.setVisible(true);
            frame.add(hintphn); // Assuming frame is defined elsewhere

        } catch (Exception e) {
            System.out.println(e);
        }


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
                        frame.setVisible(false);
                        //new ForgetPass3(); 
                    } else {
                        showMessageDialog(null, "Phone number not found!", "Error", JOptionPane.WARNING_MESSAGE);
                    }

                }

            } catch (IOException ex) {

                 showMessageDialog(null, "Phone number not found!", "Error", JOptionPane.WARNING_MESSAGE);

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
        new ForgetPassword2();
    }
	
	
}
