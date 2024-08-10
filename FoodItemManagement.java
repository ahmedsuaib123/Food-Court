import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FoodItemManagement extends JFrame implements ActionListener{
	//JFrame frame;
	
	JTextField item1Quantity;
	JTextField item2Quantity;
	JTextField item3Quantity;
	JTextField item4Quantity;
	JTextField item5Quantity;
	JTextField item6Quantity;
	JTextField item7Quantity;
	JTextField item8Quantity;
	
	String x,y,z,s,a,b,c,d;
	
	ImageIcon image;
	
	Aso obj;
	
	JLabel label;

	JButton button1,button2;
	
	public FoodItemManagement(){
		//superframe=new JFrame();
		
		button1=new JButton();
		button2=new JButton();
		
		image=new ImageIcon("images/Price.jpg");
		
		label=new JLabel(image);
		label.setBounds(760,0,508,720);
		
		button1.setText("Cancel");
		button1.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button1.addActionListener(this);
		button1.setFocusable(false);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		button1.setBounds(250,540,120,35);
		
		button2.setText("Add");
		button2.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button2.addActionListener(this);
		button2.setFocusable(false);
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);
		button2.setBounds(480,540,120,35);
		
		
		// Item 1: Burger
		JLabel item1Image = new JLabel(new ImageIcon("images/Burger2.jpg"));
		item1Image.setBounds(50, 30, 100, 100);

		JLabel item1Name = new JLabel("Burger");
		item1Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
		item1Name.setBounds(50, 140, 100, 25);

		JLabel item1Price = new JLabel("Price");
		item1Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
		item1Price.setBounds(50, 165, 100, 25);

		item1Quantity = new JTextField(obj.x);
		item1Quantity.setBounds(60, 190, 50, 25);
	

		
        // Item 2: Pizza
        JLabel item2Image = new JLabel(new ImageIcon("images/Pizza33.jpg"));
        item2Image.setBounds(250, 30, 100, 100);
        
        JLabel item2Name = new JLabel("Pizza");
		item2Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item2Name.setBounds(250, 140, 100, 25);
        
        JLabel item2Price = new JLabel("Price");
		item2Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item2Price.setBounds(250, 165, 100, 25);
        
        item2Quantity = new JTextField(obj.y);
        item2Quantity.setBounds(260, 190, 50, 25);
        


        // Item 3: Icecream
        JLabel item3Image = new JLabel(new ImageIcon("images/Icecream2.jpg"));
        item3Image.setBounds(450, 30, 100, 100);
       
        JLabel item3Name = new JLabel("IceCream");
		item3Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item3Name.setBounds(450, 140, 100, 25);

        JLabel item3Price = new JLabel("Price");
		item3Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item3Price.setBounds(450, 165, 100, 25);
   
        item3Quantity = new JTextField(obj.z);
        item3Quantity.setBounds(460, 190, 50, 25); 
  

	    // Item 4: Coffee
        JLabel item4Image = new JLabel(new ImageIcon("images/Coffee2.png"));
        item4Image.setBounds(650, 30, 100, 100);
   
        JLabel item4Name = new JLabel("Coffee");
		item4Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item4Name.setBounds(650, 140, 100, 25);

        JLabel item4Price = new JLabel("Price");
		item4Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item4Price.setBounds(650, 165, 100, 25);

        item4Quantity = new JTextField(obj.s);
        item4Quantity.setBounds(660, 190, 50, 25);

		
		
		// Item 5: pie
        JLabel item5Image = new JLabel(new ImageIcon("images/Pie2.jpg"));
        item5Image.setBounds(50, 250, 100, 100);
    
        JLabel item5Name = new JLabel("Pie");
		item5Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item5Name.setBounds(50, 360, 100, 25);
  
        JLabel item5Price = new JLabel("Price");
		item5Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item5Price.setBounds(50, 385, 100, 25);
      
        item5Quantity = new JTextField(obj.a);
        item5Quantity.setBounds(60, 410, 50, 25); 
 


		// Item 6: Sandwich
        JLabel item6Image = new JLabel(new ImageIcon("images/Sandwitch2.jpg"));
        item6Image.setBounds(250, 250, 100, 100);

        JLabel item6Name = new JLabel("Sandwich");
		item6Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item6Name.setBounds(250, 360, 100, 25);
    
        JLabel item6Price = new JLabel("Price");
		item6Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item6Price.setBounds(250, 385, 100, 25);

        item6Quantity = new JTextField(obj.b);
        item6Quantity.setBounds(260, 410, 50, 25);
 


		// Item 7:Shake
        JLabel item7Image = new JLabel(new ImageIcon("images/Shakes3.jpg"));
        item7Image.setBounds(450, 250, 100, 100);
   
        JLabel item7Name = new JLabel("Shakes");
		item7Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item7Name.setBounds(450, 360, 100, 25);
     
        JLabel item7Price = new JLabel("Price");
		item7Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item7Price.setBounds(450, 385, 100, 25);
    
        item7Quantity = new JTextField(obj.c);
        item7Quantity.setBounds(460, 410, 50, 25);
    

			
		// Item 8: Drink
        JLabel item8Image = new JLabel(new ImageIcon("images/Drinks2.jpg"));
        item8Image.setBounds(650, 250, 100, 100);
     
        JLabel item8Name = new JLabel("Drink");
		item8Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item8Name.setBounds(650, 360, 100, 25);

        JLabel item8Price = new JLabel("Price");
		item8Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item8Price.setBounds(650, 385, 100, 25);

        item8Quantity = new JTextField(obj.d);
        item8Quantity.setBounds(660, 410, 50, 25);

		
      
		
		super.setBounds(150,50,1280,720);
		
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(null);
        super.setVisible(true);
		
		super.add(item1Image);
		super.add(item1Name);
		super.add(item1Price);

		super.add(item1Quantity);
		super.add(item2Image);
		super.add(item2Name);
		super.add(item2Price);
		super.add(item2Quantity);
		super.add(item3Image);
		super.add(item3Name);
		super.add(item3Price);

		super.add(item3Quantity);
		super.add(item4Image);
		super.add(item4Name);
		super.add(item4Price);
	
		super.add(item4Quantity);
		super.add(item5Image);
		super.add(item5Name);
		super.add(item5Price);

		super.add(item5Quantity);
		super.add(item6Image);
		super.add(item6Name);
		super.add(item6Price);

		super.add(item6Quantity);
		super.add(item7Image);
		super.add(item7Name);
		super.add(item7Price);

		super.add(item7Quantity);
		super.add(item8Image);
		super.add(item8Name);
		super.add(item8Price);

		super.add(item8Quantity);
		
		super.add(button1);
		super.add(button2);
		
		super.add(label);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			super.dispose();
			 
			 //new AdminOption();
		}
		
		if(e.getActionCommand().equals("Add"))
		{
			x=item1Quantity.getText();
			y=item2Quantity.getText();
			z=item3Quantity.getText();
			s=item4Quantity.getText();
			a=item5Quantity.getText();
			b=item6Quantity.getText();
			c=item7Quantity.getText();
			d=item8Quantity.getText();
			new Aso(x,y,z,s,a,b,c,d);
			new ShowChange();
			super.dispose();
		}
	}
	
	public static void main(String args[]){
		
		FoodItemManagement foodItemManagement = new FoodItemManagement();
		
	}
	
}