import FileIO.*;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import javax.imageio.*;
import java.util.regex.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener {
    Login login;

    Font font15 = new Font("Cambria", Font.BOLD, 16);

    JTextField usernameTextField, passwordField, confirmPasswordField, fullNameTextField, priceTextField, emailTextField,afullNameTextField, captchaField;
    JComboBox genderComboBox;
	JLabel label1;

    public Signup() {

        super("Signup");
        //super.setIconImage(new ImageIcon("").getImage());
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(960, 800); //width, height
        //super.setLocation(150,0); //X, Y
        super.setResizable(false);
        super.getContentPane().setBackground(new Color(218, 232, 252));
        super.setLocationRelativeTo(null);
        super.setLayout(null);

        try {
            super.setIconImage(ImageIO.read(new File("./Resources/iconn.png")));
        } catch (IOException e) {

        }

        try {
            super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./Resources/Signup.png")))));
        } catch (Exception e) {

        }

        JLabel title = new JLabel(" SIGNUP PAGE ");
        title.setBounds(130, 0, 500, 50); //X,Y,W,H
        title.setFont(new Font("Cambria", Font.BOLD, 30));
        this.add(title);
		
		JLabel afullNameLabel = new JLabel("First Name ");
        afullNameLabel.setBounds(20, 70, 200, 30); //X,Y,W,H
        afullNameLabel.setFont(font15);
        this.add(afullNameLabel);

        afullNameTextField = new JTextField();
        afullNameTextField.setBounds(170, 70, 200, 30); //X,Y,W,H
        afullNameTextField.setFont(font15);
        this.add(afullNameTextField);

        JLabel fullNameLabel = new JLabel("Last Name ");
        fullNameLabel.setBounds(20, 130, 200, 30); //X,Y,W,H
        fullNameLabel.setFont(font15);
        this.add(fullNameLabel);

        fullNameTextField = new JTextField();
        fullNameTextField.setBounds(170, 130, 200, 30); //X,Y,W,H
        fullNameTextField.setFont(font15);
        this.add(fullNameTextField);

        JLabel usernameLabel = new JLabel("Username ");
        usernameLabel.setBounds(20, 190, 200, 30); //X,Y,W,H
        usernameLabel.setFont(font15);
        this.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(170, 190, 200, 30); //X,Y,W,H
        usernameTextField.setFont(font15);
        this.add(usernameTextField);

        JLabel emailLabel = new JLabel("Email ");
        emailLabel.setBounds(20, 250, 200, 30); //X,Y,W,H
        emailLabel.setFont(font15);
        this.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(170, 250, 200, 30); //X,Y,W,H
        emailTextField.setFont(font15);
        this.add(emailTextField);
        JLabel phoneNumberLabel = new JLabel("Phone Number ");
        phoneNumberLabel.setBounds(20, 310, 200, 30); //X,Y,W,H
        phoneNumberLabel.setFont(font15);
        this.add(phoneNumberLabel);

        priceTextField = new JTextField();
        priceTextField.setBounds(170, 310, 200, 30); //X,Y,W,H
        priceTextField.setFont(font15);
        this.add(priceTextField);

        JLabel genderLabel = new JLabel("Gender ");
        genderLabel.setBounds(20, 370, 200, 30); //X,Y,W,H
        genderLabel.setFont(font15);
        this.add(genderLabel);

        genderComboBox = new JComboBox(new String[]{"Male", "Female", "Custom"});
        genderComboBox.setBounds(170, 370, 200, 30);
        genderComboBox.setFont(font15);
        this.add(genderComboBox);

        JLabel passwordLabel = new JLabel("Password ");
        passwordLabel.setBounds(20, 430, 200, 30); //X,Y,W,H
        passwordLabel.setFont(font15);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(170, 430, 200, 30); //X,Y,W,H
        passwordField.setFont(font15);
        this.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password ");
        confirmPasswordLabel.setBounds(20, 490, 200, 30); //X,Y,W,H
        confirmPasswordLabel.setFont(font15);
        this.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(170, 490, 200, 30); //X,Y,W,H
        confirmPasswordField.setFont(font15);
        this.add(confirmPasswordField);
		
		// Captcha Label and Text Field
        JLabel captchaLabel = new JLabel("Captcha");
        captchaLabel.setBounds(20, 550, 200, 30);
        captchaLabel.setFont(font15);
        this.add(captchaLabel);

        captchaField = new JTextField();
        captchaField.setBounds(170, 550, 200, 30);
        //captchaField.setFont(f5);
        this.add(captchaField);
		
		// To get a random number for captcha
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        // Captcha
        label1 = new JLabel();
        label1.setText(" " + a + " + " + b + " ");
        label1.setBounds(100, 550, 200, 30);
        label1.setFont(font15);
        //label1.setForeground(Color.red);
        //label1.setBackground(Color.decode("#FFD3D3"));
        label1.setOpaque(false);
        this.add(label1);
		
		

        JButton signupButton = new JButton("Signup");
        signupButton.setBounds(220, 610, 200, 30);
        signupButton.setForeground(Color.BLACK);
        signupButton.setSize(80, 35);
        signupButton.addActionListener(this);
        super.add(signupButton);

        JLabel logiin = new JLabel("Already have an account?");
        logiin.setBounds(50, 670, 400, 30);
        Font logiinFont = new Font("Varenda", Font.BOLD, 15);
        logiin.setFont(logiinFont);
        logiin.setForeground(Color.BLACK);
        this.add(logiin);

        JButton loginn = new JButton("Login");
        loginn.setBounds(280, 670, 200, 30);
        loginn.setSize(80, 35);
        loginn.addActionListener(this);
        this.add(loginn);

        super.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String user = usernameTextField.getText();
        String pass = passwordField.getText();
        String confpass = confirmPasswordField.getText();
		String aname = afullNameTextField.getText();
        String name = fullNameTextField.getText();
        String em = priceTextField.getText();
        String emm = emailTextField.getText();
        boolean emaillEmpty = emm.isEmpty();

        
		boolean userEmpty = user.isEmpty();
        boolean passEmpty = pass.isEmpty();
        boolean confEmpty = confpass.isEmpty();
		boolean anameEmpty = aname.isEmpty();
        boolean nameEmpty = name.isEmpty();
        boolean emailEmpty = em.isEmpty();
        boolean check = pass.equals(confpass);
        long number = 0;
        int numcount = 0;

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

        String timeAndDate = myDateObj.format(myFormatObj);

        try {
            number = Integer.parseInt(em);
            if (em.length() != 11)
                numcount++;
        } catch (Exception ex) {
            numcount = 1;
        }

        try {
            if (e.getActionCommand().equals("Signup")) {
                // Validate fields
                if (userEmpty || passEmpty || confEmpty || anameEmpty || nameEmpty || emaillEmpty || emailEmpty) {
                    showMessageDialog(null, "Please fill all of the fields.", "Error!", JOptionPane.WARNING_MESSAGE);
                } else if (checkUsername(user)) {
                    showMessageDialog(null, "Username already exists. Please choose a different username.", "Error", JOptionPane.WARNING_MESSAGE);
                } else if (checkEmail(emm)) {
                    showMessageDialog(null, "Email already exists. Please enter a different email address.", "Error!", JOptionPane.WARNING_MESSAGE);
                } else if (emaillEmpty || !isValidEmail(emm)) {
                    showMessageDialog(null, "Please enter a valid email address.", "Error!", JOptionPane.WARNING_MESSAGE);
                } else if (phoneNumberExists(em)) {
                    showMessageDialog(null, "Phone number already exists. Please enter a different phone number.", "Error!", JOptionPane.WARNING_MESSAGE);
                } else if (numcount > 0) {
                    showMessageDialog(null, "Invalid Phone Number", " Error!", JOptionPane.WARNING_MESSAGE);
                } else if (!check) {
                    showMessageDialog(null, "Password is not matching", " Error!", JOptionPane.WARNING_MESSAGE);
                } else if (pass.length() < 8) {
                    showMessageDialog(null, "Password should be at least 8 characters long", " Error!", JOptionPane.WARNING_MESSAGE);
                } else {
                    SignUpFileIO.writeNewUser(user, pass, name, em, genderComboBox.getSelectedItem().toString());
                    SignUpFileIO.writeNewUserInfo(name, user, emm, em, genderComboBox.getSelectedItem().toString(), pass);
                    showMessageDialog(null, "Signup Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    super.setVisible(false);
                    new Login();
                }
            } else {
                try {
                    File file = new File("./FileIO/UserData.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);

                    // User Login file checked
                    int totalLines = 0;
                    BufferedReader readFile = new BufferedReader(new FileReader("./FileIO/UserData.txt"));
                    while (readFile.readLine() != null) {
                        totalLines++;
                    }
                    readFile.close();

                    boolean userflag = false;

                    // for user
                    for (int i = 0; i < totalLines; i++) {
                        String line = Files.readAllLines(Paths.get("./FileIO/UserData.txt")).get(i);
                        if (line.equals("User Name : " + user)) {
                            userflag = true;
                            break;
                        }
                    }

                    if (userflag == false) {
                        printWriter.println("===============================================");
						printWriter.println("First Name : " + aname);
                        printWriter.println("Last Name : " + name);
                        printWriter.println("User Name : " + user);
                        printWriter.println("Password : " + pass);
                        printWriter.println("Phone : " + em);
                        printWriter.println("Time & Date : " + timeAndDate);
                        printWriter.println("===============================================");
                        super.setVisible(false);
                        new Login();

                    } 

                    printWriter.close();

                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } if (e.getActionCommand().equals("Login")) {
                super.setVisible(false);
                new Login();
            }
    }

    public boolean checkUsername(String username) {
        try {
            File file = new File("./FileIO/UserData.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            String usernameRegex = "^" + Pattern.quote(username) + ";";

            Pattern pattern = Pattern.compile(usernameRegex);

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    br.close();
                    return true;
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean checkEmail(String email) {
        try {

            File file = new File("./FileIO/UserInformation.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            String emailRegex = "^.*;" + Pattern.quote(email) + ";.*$";

            Pattern pattern = Pattern.compile(emailRegex);

            while ((line = br.readLine()) != null) {

                if (pattern.matcher(line).matches()) {
                    br.close();
                    return true;
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean phoneNumberExists(String phoneNumber) {
        try {
            File file = new File("./FileIO/UserInformation.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] userInfo = line.split(";");
                if (userInfo.length >= 4 && userInfo[3].equals(phoneNumber)) {
                    br.close();
                    return true;
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean isValidEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Signup signup = new Signup();
    }

}