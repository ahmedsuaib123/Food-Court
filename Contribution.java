import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contribution extends JFrame implements ActionListener {
	
	public Contribution(){
		
		super("Food Court Online Order System");
		super.setSize(620, 800);
		super.setLocation(395,10);
		super.setLocationRelativeTo(null); 
		super.setResizable(false);
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("CONTRIBUTORS");
		title.setBounds(200,30,400,30); 
		title.setForeground(Color.BLACK);
		title.setBackground(Color.WHITE);
		title.setFont(new Font("Cambria",Font.BOLD,25));
		this.add(title);
		
		JLabel name1 = new JLabel("1. TASNIM TAZREEN KHAN OISHI");
		name1.setBounds(110,100,400,30); 
		name1.setForeground(Color.BLACK);
		name1.setBackground(Color.WHITE);
		name1.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(name1);
		
		JLabel id1 = new JLabel("ID : 22-49798-3");
		id1.setBounds(131,130,400,30); 
		id1.setForeground(Color.BLACK);
		id1.setBackground(Color.WHITE);
		id1.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(id1);
		
		JLabel email1 = new JLabel("EMAIL : 22-49798-3@student.aiub.edu");
		email1.setBounds(131,160,400,30); 
		email1.setForeground(Color.BLACK);
		email1.setBackground(Color.WHITE);
		email1.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(email1);
		
		JLabel name2 = new JLabel("2. MOST. SHUMAYA JAHAN");
		name2.setBounds(110,250,400,30); 
		name2.setForeground(Color.BLACK);
		name2.setBackground(Color.WHITE);
		name2.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(name2);
		
		
		
		JLabel id2 = new JLabel("ID : 23-51070-1");
		id2.setBounds(131,280,400,30); 
		id2.setForeground(Color.BLACK);
		id2.setBackground(Color.WHITE);
		id2.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(id2);
		
		JLabel email2 = new JLabel("EMAIL : 23-51070-1@student.aiub.edu");
		email2.setBounds(131,310,400,30); 
		email2.setForeground(Color.BLACK);
		email2.setBackground(Color.WHITE);
		email2.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(email2);
		
		JLabel name3 = new JLabel("3. ROCKSANA PARVIN MUNNI");
		name3.setBounds(110,400,400,30); 
		name3.setForeground(Color.BLACK);
		name3.setBackground(Color.WHITE);
		name3.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(name3);
		
		JLabel id3 = new JLabel("ID : 23-53983-3");
		id3.setBounds(131,430,400,30); 
		id3.setForeground(Color.BLACK);
		id3.setBackground(Color.WHITE);
		id3.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(id3);
		
		JLabel email3 = new JLabel("EMAIL : 23-53983-3@student.aiub.edu");
		email3.setBounds(131,460,400,30); 
		email3.setForeground(Color.BLACK);
		email3.setBackground(Color.WHITE);
		email3.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(email3);
		
		JLabel name4 = new JLabel("4. SUAIB AHMMED NAFEES");
		name4.setBounds(110,550,400,30); 
		name4.setForeground(Color.BLACK);
		name4.setBackground(Color.WHITE);
		name4.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(name4);
		
		JLabel id4 = new JLabel("ID : 23-50723-1");
		id4.setBounds(131,580,400,30); 
		id4.setForeground(Color.BLACK);
		id4.setBackground(Color.WHITE);
		id4.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(id4);
		
		JLabel email4 = new JLabel("EMAIL : 23-50723-1@student.aiub.edu");
		email4.setBounds(131,610,400,30); 
		email4.setForeground(Color.BLACK);
		email4.setBackground(Color.RED);
		email4.setFont(new Font("Cambria",Font.BOLD,20));
		this.add(email4);
		
		JButton BackButton = new JButton("BACK");
		BackButton.setBounds(250,680,100,30); 
		BackButton.setForeground(Color.BLACK);
		//BackButton.setBackground(Color.WHITE);
		BackButton.setFont(new Font("Cambria",Font.BOLD,20));
		BackButton.addActionListener(this);
		this.add(BackButton);
		
		
		super.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("BACK")){
			Login login = new Login();
			login.setVisible(true);
	 		this.dispose();
			
	 	}
		
	}
	
	public static void main(String []args){
		new Contribution();
	}
}