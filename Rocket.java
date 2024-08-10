
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rocket implements ActionListener{
	JFrame frame;
	JButton cancelButton,button2,button3;
	JTextField textField1;
	JPasswordField passwordField1;
	JLabel label1,label2,label3,label4;
	JPanel panel;
	ImageIcon image;
	String type="";
	
	
	public Rocket(){
		
		
		frame=new JFrame();
		panel=new JPanel();
		
		image=new ImageIcon("./Resources/Rocket.png");
		
		textField1=new JTextField();
		passwordField1 = new JPasswordField();
		
		textField1.setBounds(600,30,170,30);
		textField1.setFont(new Font("Cambria",Font.PLAIN,15));
		
		passwordField1.setBounds(600,100,170,30);
		passwordField1.setFont(new Font("Cambria",Font.PLAIN,15));
		
		
		cancelButton=new JButton();
		button2=new JButton();
		button3=new JButton();
		
		cancelButton.setBounds(480,230,100,30);
		cancelButton.setText("Cancel");
		cancelButton.setFont(new Font("Cambria",Font.BOLD,17));
		cancelButton.setFocusable(false);
		cancelButton.addActionListener(this);
		
		button2.setBounds(680,230,100,30);
		button2.setText("Proceed");
		button2.setFont(new Font("Cambria",Font.BOLD,16));
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		label1=new JLabel();
		label2=new JLabel();
		label3=new JLabel("Account Number");
		label4=new JLabel("Pin");
		
		label3.setBounds(420,30,200,30);
		label3.setFont(new Font("Cambria",Font.BOLD,20));
		
		label4.setBounds(535,100,200,30);
		label4.setFont(new Font("Cambria",Font.BOLD,20));
		
		label1.setBounds(0,200,1280,580);
		label1.setBackground(new Color(107, 62, 153));
		label1.setOpaque(true);
		label1.add(textField1);
		label1.add(label3);
		label1.add(passwordField1);
		label1.add(label4);
		label1.add(cancelButton);
		label1.add(button2);
		
		label2.setBounds(350,0,1280,230);
		label2.setIcon(image);
		
		panel.setBackground(new Color(107, 62, 153));
		panel.setBounds(0,0,1280,230);
		panel.add(label2);
		
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,50,1280,720);
		frame.setLayout(null);
		
		frame.add(label1);
		frame.add(panel);
		
		frame.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button2)
		{
			char[]password=passwordField1.getPassword();
			for(int i=0;i<password.length;i++)
			{
				type=type+password[i];
			}
			if(textField1.getText().isEmpty()||type.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill up all the field");
			}
			else
			{
				int yesORno = JOptionPane.showConfirmDialog(null, "Payment is Successful...", "Payment",
                    JOptionPane.YES_NO_OPTION);

                if (yesORno == 0) {
					HomePageDhali homePageDhali = new HomePageDhali();
					homePageDhali.setVisible(true);
					frame.dispose();
				}
			}
		}
		if(e.getSource()==cancelButton)
		{
			frame.dispose();
		}
	}
	
	public static void main(String[] args) {
        Rocket hp = new Rocket();
    }
}