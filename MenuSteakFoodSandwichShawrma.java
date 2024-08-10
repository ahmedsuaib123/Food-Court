
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception.*;



public class MenuSteakFoodSandwichShawrma extends JFrame implements ActionListener{
	JFrame frame ;
	
	private HomePageDhali homePageDhali;
	
	JTextField item1Quantity;
	JTextField item2Quantity;
	JTextField item3Quantity;
	JTextField item4Quantity;
	JTextField item5Quantity;
	JTextField item6Quantity;
	JTextField item7Quantity;
	JTextField item8Quantity,tableNo;	


	
	JLabel label;
	Aso object;
	
	JTextArea bill;
	
	JButton button1,button2,button3,button4;   
	
	int totalBill;
	
	JComboBox<String> comboBox;
	
    public MenuSteakFoodSandwichShawrma(HomePageDhali homePageDhali) {
		frame=new JFrame();
		
		String[] ob=new String[]{"Bkash","Nagad","ROCKET","Cash On Delivery"};
		
		 JLabel title = new JLabel("Welcome To Dhali Food Court");
        title.setBounds(165, 6, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);
		
		JLabel tableNoLabel = new JLabel("Table No :");
        tableNoLabel.setBounds(50, 500, 100, 25);
		frame.add(tableNoLabel);

 
        tableNo = new JTextField();
        tableNo.setBounds(110, 500, 30, 25);
		frame.add(tableNo);
		
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

		// Item 1: Burger
		JLabel item1Image = new JLabel(new ImageIcon("images/Burger2.jpg"));
		item1Image.setBounds(50, 30, 100, 100);
		

		JLabel item1Name = new JLabel("Chicken Club Sandwich");
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
        

        JLabel item2Name = new JLabel("Chicken Shawarma");
        item2Name.setBounds(250, 140, 300, 25);
        

        JLabel item2Price = new JLabel("Price: "+object.y+" TK");
        item2Price.setBounds(250, 165, 100, 25);
        
		
		JLabel item2QuantityLabel = new JLabel("Quantity:");
        item2QuantityLabel.setBounds(250, 190, 100, 25);
        

        item2Quantity = new JTextField();
        item2Quantity.setBounds(310, 190, 30, 25);
        


        // Item 3: Icecream
        JLabel item3Image = new JLabel(new ImageIcon("images/Icecream2.jpg"));
        item3Image.setBounds(450, 30, 100, 100);
       

        JLabel item3Name = new JLabel("Mexican Chicken Sub Sandwich");
        item3Name.setBounds(450, 140, 400, 25);
   

        JLabel item3Price = new JLabel("Price: "+object.z+" TK");
        item3Price.setBounds(450, 165, 100, 25);
 
		
		JLabel item3QuantityLabel = new JLabel("Quantity:");
        item3QuantityLabel.setBounds(450, 190, 100, 25);
   

        item3Quantity = new JTextField();
        item3Quantity.setBounds(510, 190, 30, 25); 
  

	    // Item 4: Coffee
        JLabel item4Image = new JLabel(new ImageIcon("images/Coffee2.png"));
        item4Image.setBounds(650, 30, 100, 100);
   

        JLabel item4Name = new JLabel("Crab Bhuna");
        item4Name.setBounds(650, 140, 100, 25);
    

        JLabel item4Price = new JLabel("Price: "+object.s+" TK");
        item4Price.setBounds(650, 165, 100, 25);
  												
		
		JLabel item4QuantityLabel = new JLabel("Quantity:");
        item4QuantityLabel.setBounds(650, 190, 100, 25);
   

        item4Quantity = new JTextField();
        item4Quantity.setBounds(710, 190, 30, 25);

		
		
		// Item 5: pie
        JLabel item5Image = new JLabel(new ImageIcon("images/Pie2.jpg"));
        item5Image.setBounds(50, 250, 100, 100);
    

        JLabel item5Name = new JLabel("Crab Fry");
        item5Name.setBounds(50, 360, 100, 25);
  

        JLabel item5Price = new JLabel("Price: "+object.a+" TK");
        item5Price.setBounds(50, 385, 100, 25);
      
		
		JLabel item5QuantityLabel = new JLabel("Quantity:");
        item5QuantityLabel.setBounds(50, 410, 100, 25);
      

        item5Quantity = new JTextField();
        item5Quantity.setBounds(110, 410, 30, 25); 
 


		// Item 6: Sandwich
        JLabel item6Image = new JLabel(new ImageIcon("images/Sandwitch2.jpg"));
        item6Image.setBounds(250, 250, 100, 100);


        JLabel item6Name = new JLabel("Fish & Chips");
        item6Name.setBounds(250, 360, 100, 25);
    

        JLabel item6Price = new JLabel("Price: "+object.b+" TK");
        item6Price.setBounds(250, 385, 100, 25);
    
		
		JLabel item6QuantityLabel = new JLabel("Quantity");
        item6QuantityLabel.setBounds(250, 410, 100, 25);
   

        item6Quantity = new JTextField();
        item6Quantity.setBounds(310, 410, 30, 25);
 


		// Item 7:Shake
        JLabel item7Image = new JLabel(new ImageIcon("images/Shakes3.jpg"));
        item7Image.setBounds(450, 250, 100, 100);
   

        JLabel item7Name = new JLabel("Prawn Butter Fry");
        item7Name.setBounds(450, 360, 100, 25);
     

        JLabel item7Price = new JLabel("Price: "+object.c+" TK");
        item7Price.setBounds(450, 385, 100, 25);
 
		
		JLabel item7QuantityLabel = new JLabel("Quantity:");
        item7QuantityLabel.setBounds(450, 410, 100, 25);
    

        item7Quantity = new JTextField();
        item7Quantity.setBounds(510, 410, 30, 25);
    

			
		// Item 8: Drink
        JLabel item8Image = new JLabel(new ImageIcon("images/Drinks2.jpg"));
        item8Image.setBounds(650, 250, 100, 100);
     

        JLabel item8Name = new JLabel("Prawn Butter Fry");
        item8Name.setBounds(650, 360, 100, 25);
    

        JLabel item8Price = new JLabel("Price: "+object.d+" TK");
        item8Price.setBounds(650, 385, 100, 25);
 
		
		JLabel item8QuantityLabel = new JLabel("Quantity:");
        item8QuantityLabel.setBounds(650, 410, 100, 25);
   

        item8Quantity = new JTextField();
        item8Quantity.setBounds(710, 410, 30, 25);
    
		

       
        bill = new JTextArea();
        bill.setBounds(850,50,350,500);
		bill.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		
      
		
		frame.setBounds(150,50,1280,720);
		frame.setTitle("Steak Food");
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
		frame.add(item3Image);
		frame.add(item3Name);
		frame.add(item3Price);
		frame.add(item3QuantityLabel);
		frame.add(item3Quantity);
		frame.add(item4Image);
		frame.add(item4Name);
		frame.add(item4Price);
		frame.add(item4QuantityLabel);
		frame.add(item4Quantity);
		frame.add(item5Image);
		frame.add(item5Name);
		frame.add(item5Price);
		frame.add(item5QuantityLabel);
		frame.add(item5Quantity);
		frame.add(item6Image);
		frame.add(item6Name);
		frame.add(item6Price);
		frame.add(item6QuantityLabel);
		frame.add(item6Quantity);
		frame.add(item7Image);
		frame.add(item7Name);
		frame.add(item7Price);
		frame.add(item7QuantityLabel);
		frame.add(item7Quantity);
		
		frame.add(bill);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(label);
		frame.add(comboBox);
		
		this.homePageDhali = homePageDhali;
		
    }
	public static void main(String []args)
	{
		//new Menu();
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
			
		}
		if(e.getSource()==button1)//cancel
		{
			frame.dispose();
			HomePageRestaurantSteakFood homePageRestaurantSteakFood = new HomePageRestaurantSteakFood(homePageDhali);
			homePageRestaurantSteakFood.setVisible(true);
		}
		if(e.getSource()==button2)//reset
		{
			item1Quantity.setText("");
			item2Quantity.setText("");
			item3Quantity.setText("");
			item4Quantity.setText("");
			item5Quantity.setText("");
			item6Quantity.setText("");
			item7Quantity.setText("");
			item8Quantity.setText("");
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
			if(item1Quantity.getText().equals("") && item2Quantity.getText().equals("") && item3Quantity.getText().equals("") && item4Quantity.getText().equals("") && item5Quantity.getText().equals("") && item6Quantity.getText().equals("") && item7Quantity.getText().equals("") && item8Quantity.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "You Have not select any item.");
			}
			else
			{
				bill.setText("*********** STEAK FOOD ***********\n\n Item       Quantity     Price\n");
			
			if(!item1Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item1Quantity.getText())>0 && Integer.parseInt(item1Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item1Quantity.getText())*Integer.parseInt(object.x);
			
					bill.append(" Chicken Club Sandwich  "+item1Quantity.getText()+"        "+Integer.parseInt(item1Quantity.getText())*Integer.parseInt(object.x)+"\n");
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
			
					bill.append(" Chicken Shawarma   "+item2Quantity.getText()+"        "+Integer.parseInt(item2Quantity.getText())*Integer.parseInt(object.y)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item3Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item3Quantity.getText())>0 && Integer.parseInt(item3Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item3Quantity.getText())*Integer.parseInt(object.z);
		
					bill.append(" Mexican Chicken Sub Sandwich  "+item3Quantity.getText()+"        "+Integer.parseInt(item3Quantity.getText())*Integer.parseInt(object.z)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item4Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item4Quantity.getText())>0 && Integer.parseInt(item4Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item4Quantity.getText())*Integer.parseInt(object.s);
		
					bill.append(" Crab Bhuna         "+item4Quantity.getText()+"        "+Integer.parseInt(item4Quantity.getText())*Integer.parseInt(object.s)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item5Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item5Quantity.getText())>0 && Integer.parseInt(item5Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item5Quantity.getText())*Integer.parseInt(object.a);
			
					bill.append(" Crab Fry            "+item5Quantity.getText()+"        "+Integer.parseInt(item5Quantity.getText())*Integer.parseInt(object.a)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item6Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item6Quantity.getText())>0 && Integer.parseInt(item6Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item6Quantity.getText())*Integer.parseInt(object.b);
			
					bill.append(" Fish & Chips       "+item6Quantity.getText()+"        "+Integer.parseInt(item6Quantity.getText())*Integer.parseInt(object.b)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item7Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item7Quantity.getText())>0 && Integer.parseInt(item7Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item7Quantity.getText())*Integer.parseInt(object.c);
			
					bill.append(" Prawn Butter Fry          "+item7Quantity.getText()+"        "+Integer.parseInt(item7Quantity.getText())*Integer.parseInt(object.c)+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					
				}
			}
			
			if(!item8Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item8Quantity.getText())>0 && Integer.parseInt(item8Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item8Quantity.getText())*Integer.parseInt(object.d);
					
					bill.append(" Drink          "+item8Quantity.getText()+"        "+Integer.parseInt(item8Quantity.getText())*Integer.parseInt(object.d)+"\n");
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

