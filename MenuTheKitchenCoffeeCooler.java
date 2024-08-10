
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception.*;



public class MenuTheKitchenCoffeeCooler extends JFrame implements ActionListener{
	JFrame frame ;
	
	private HomePageDhali homePageDhali;
	
	JTextField item1Quantity;
	JTextField item2Quantity,tableNo;
	
	JLabel label;
	Aso object;
	
	JTextArea bill;
	
	JButton button1,button2,button3,button4;   
	
	int totalBill;
	
	JComboBox<String> comboBox;
	
    public MenuTheKitchenCoffeeCooler(HomePageDhali homePageDhali) 
	{
		frame=new JFrame();
		
		String[] ob=new String[]{"Bkash","Nagad","ROCKET","Cash On Delivery"};		
		 JLabel title = new JLabel("Welcome To Dhali Food Court");
        title.setBounds(165, 6, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);
		
		comboBox=new JComboBox<String>(ob);
		comboBox.setBounds(750,545,90,30);
		comboBox.setFont(new Font("CONSOLAS",Font.PLAIN,18));
		comboBox.addActionListener(this);
		comboBox.setVisible(false);
		
		label=new JLabel("Select Payment Method:");
		label.setBounds(520,540,230,40);
		label.setFont(new Font("CONSOLAS",Font.BOLD,18));
		label.setVisible(false);
		
		
		button1=new JButton();
		button2=new JButton();
		button3=new JButton();
		button4=new JButton();
       
		button1.setText("Cancel");
		button1.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button1.addActionListener(this);
		button1.setFocusable(false);
		//button1.setBackground(Color.BLUE);
		button1.setForeground(Color.BLACK);
		button1.setBounds(50,540,120,35);
		
		button2.setText("Reset");
		button2.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button2.addActionListener(this);
		button2.setFocusable(false);
		//button2.setBackground(Color.BLUE);
		button2.setForeground(Color.BLACK);
		button2.setBounds(220,540,120,35);
		
		button3.setText("Bill");
		button3.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button3.addActionListener(this);
		button3.setFocusable(false);
		//button3.setBackground(Color.BLUE);
		button3.setForeground(Color.BLACK);
		button3.setBounds(390,540,120,35);
		
		button4.setText("Pay");
		button4.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button4.addActionListener(this);
		button4.setFocusable(false);
		//button4.setBackground(Color.BLUE);
		button4.setForeground(Color.BLACK);
		button4.setBounds(560,540,120,35);
		
		//burger, pizza, ice cream, coffee, pie, drink, sandwich, shake
		JLabel tableNoLabel = new JLabel("Table No :");
        tableNoLabel.setBounds(50, 500, 100, 25);
		frame.add(tableNoLabel);

 
        tableNo = new JTextField();
        tableNo.setBounds(110, 500, 30, 25);
		frame.add(tableNo);


		// Item 1: Burger
		JLabel item1Image = new JLabel(new ImageIcon("images/Burger2.jpg"));
		item1Image.setBounds(50, 30, 100, 100);
		

		JLabel item1Name = new JLabel("Chocolate Cold Coffee S/L");
		item1Name.setBounds(50, 140, 300, 25);

		JLabel item1Price = new JLabel("Price: "+object.x+" TK");
		item1Price.setBounds(50, 165, 100, 25);
		

		JLabel item1QuantityLabel = new JLabel("Quantity:");
		item1QuantityLabel.setBounds(50, 190, 100, 25);
		

		item1Quantity = new JTextField();
		item1Quantity.setBounds(110, 190, 30, 25);
	
		
		
        // Item 2: Pizza
        JLabel item2Image = new JLabel(new ImageIcon("images/Pizza33.jpg"));
        item2Image.setBounds(250, 30, 100, 100);
        

        JLabel item2Name = new JLabel("Strawberry Cold Coffee S/L");
        item2Name.setBounds(250, 140, 300, 25);
        

        JLabel item2Price = new JLabel("Price: "+object.y+" TK");
        item2Price.setBounds(250, 165, 100, 25);
        
		
		JLabel item2QuantityLabel = new JLabel("Quantity:");
        item2QuantityLabel.setBounds(250, 190, 100, 25);
        

        item2Quantity = new JTextField();
        item2Quantity.setBounds(310, 190, 30, 25);
        
		
        // JTextArea for the bill
        bill = new JTextArea();
        bill.setBounds(850,50,350,500);
		bill.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		
      
		
		frame.setBounds(150,50,1280,720);
		frame.setTitle("The Kitchen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
        frame.setVisible(true);
		
		frame.add(item1Image);
		frame.add(item1Name);
		frame.add(item1Price);
		frame.add(item1QuantityLabel);
		frame.add(item1Quantity);
		frame.add(item2Image);
		frame.add(item2Name);
		frame.add(item2Price);
		frame.add(item2QuantityLabel);
		frame.add(item2Quantity);
		frame.add(bill);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(label);
		frame.add(comboBox);
		
		this.homePageDhali = homePageDhali;
		
    }
	public static void main(String []args){
		HomePageDhali homePageDhali = new HomePageDhali(); // Create an instance of HomePageDhali
		homePageDhali.setVisible(false);
        new MenuTheKitchenCoffeeCooler(homePageDhali); // Pass it to the constructor of MenuIndianDosaSetMenu
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button4)//pay
		{
			//new Login();
			button4.setVisible(false);
			label.setVisible(true);
			comboBox.setVisible(true);
		}
		if(e.getSource()==comboBox)
		{
			if(comboBox.getSelectedIndex()==0)
			{
				bKash ob1=new bKash();
			}
			else if(comboBox.getSelectedIndex()==1)
			{
				Nagad ob2=new Nagad();
			}
			else if(comboBox.getSelectedIndex()==2)
			{
				Rocket ob3=new Rocket();
			}
			else if(comboBox.getSelectedIndex()==3){

				
			}

		}
		if(e.getSource()==button1)//cancel
		{
			frame.dispose();
			HomePageRestaurant homePageRestaurant = new HomePageRestaurant(homePageDhali);
			homePageRestaurant.setVisible(true);
	 		
		}
		if(e.getSource()==button2)//reset
		{
			item1Quantity.setText("");
			item2Quantity.setText("");			
			bill.setText("");
			button3.setEnabled(true);
			button4.setVisible(true);
			label.setVisible(false);
			comboBox.setVisible(false);
			totalBill=0;
		}
		if(e.getSource()==button3)//bill
		{
			button3.setEnabled(false);
			if(item1Quantity.getText().equals("") && item2Quantity.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "You Have not select any item.");
			}
			else
			{
				bill.setText("*********** THE KITCHEN ***********\n\n Item       Quantity     Price\n");
			
			if(!item1Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item1Quantity.getText())>0 && Integer.parseInt(item1Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item1Quantity.getText())*Integer.parseInt(object.x);
			
					bill.append(" Chocolate Cold Coffee S/L        "+item1Quantity.getText()+"        "+Integer.parseInt(item1Quantity.getText())*Integer.parseInt(object.x)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item2Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item2Quantity.getText())>0 && Integer.parseInt(item2Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item2Quantity.getText())*Integer.parseInt(object.y);
			
					bill.append(" Strawberry Cold Coffee S/L       "+item2Quantity.getText()+"        "+Integer.parseInt(item2Quantity.getText())*Integer.parseInt(object.y)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
				bill.append("-------------------------------"+"\n"+"      Total Bill : "+totalBill + "\n" + " Table No : " +Integer.parseInt(tableNo.getText()));  		
			
			
		}
		}
	}
}

