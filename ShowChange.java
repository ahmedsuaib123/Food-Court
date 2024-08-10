import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class ShowChange implements ActionListener
{
	JFrame frame;
	
	String x,y,z,s,a,b,c,d;
	
	ImageIcon image;
	
	Aso object;
	
	JLabel label;

	JButton button1,button2;
	
	public ShowChange()
	{
		frame=new JFrame();
		
		button1=new JButton();
		button2=new JButton();
		
		image=new ImageIcon("images/Price.jpg");
		
		label=new JLabel(image);
		label.setBounds(820,0,508,720);
		
		button1.setText("Back");
		button1.setFont(new Font("CONSOLAS",Font.PLAIN,20));
		button1.addActionListener(this);
		button1.setFocusable(false);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		button1.setBounds(250,540,120,35);
		
		button2.setText("Ok");
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

		JLabel item1Price = new JLabel("Price: "+object.x+" TK");
		item1Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
		item1Price.setBounds(50, 165, 150, 25);

		
	

		
        // Item 2: Pizza
        JLabel item2Image = new JLabel(new ImageIcon("images/Pizza33.jpg"));
        item2Image.setBounds(250, 30, 100, 100);
        
        JLabel item2Name = new JLabel("Pizza");
		item2Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item2Name.setBounds(250, 140, 100, 25);
        
        JLabel item2Price = new JLabel("Price: "+object.y+" TK");
		item2Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item2Price.setBounds(250, 165, 150, 25);
        
     
        


        // Item 3: Icecream
        JLabel item3Image = new JLabel(new ImageIcon("images/Icecream2.jpg"));
        item3Image.setBounds(450, 30, 100, 100);
       
        JLabel item3Name = new JLabel("IceCream");
		item3Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item3Name.setBounds(450, 140, 100, 25);

        JLabel item3Price = new JLabel("Price: "+object.z+" TK");
		item3Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item3Price.setBounds(450, 165, 150, 25);
   
    
  

	    // Item 4: Coffee
        JLabel item4Image = new JLabel(new ImageIcon("images/Coffee2.png"));
        item4Image.setBounds(650, 30, 100, 100);
   
        JLabel item4Name = new JLabel("Coffee");
		item4Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item4Name.setBounds(650, 140, 100, 25);

        JLabel item4Price = new JLabel("Price: "+object.s+" TK");
		item4Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item4Price.setBounds(650, 165, 150, 25);



		
		
		// Item 5: pie
        JLabel item5Image = new JLabel(new ImageIcon("images/Pie2.jpg"));
        item5Image.setBounds(50, 250, 100, 100);
    
        JLabel item5Name = new JLabel("Pie");
		item5Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item5Name.setBounds(50, 360, 100, 25);
  
        JLabel item5Price = new JLabel("Price: "+object.a+" TK");
		item5Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item5Price.setBounds(50, 385, 150, 25);
      

 


		// Item 6: Sandwich
        JLabel item6Image = new JLabel(new ImageIcon("images/Sandwitch2.jpg"));
        item6Image.setBounds(250, 250, 100, 100);

        JLabel item6Name = new JLabel("Sandwich");
		item6Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item6Name.setBounds(250, 360, 100, 25);
    
        JLabel item6Price = new JLabel("Price: "+object.b+" TK");
		item6Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item6Price.setBounds(250, 385, 150, 25);

 


		// Item 7:Shake
        JLabel item7Image = new JLabel(new ImageIcon("images/Shakes3.jpg"));
        item7Image.setBounds(450, 250, 100, 100);
   
        JLabel item7Name = new JLabel("Shakes");
		item7Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item7Name.setBounds(450, 360, 100, 25);
     
        JLabel item7Price = new JLabel("Price: "+object.c+" TK");
		item7Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item7Price.setBounds(450, 385, 150, 25);
    

			
		// Item 8: Drink
        JLabel item8Image = new JLabel(new ImageIcon("images/Drinks2.jpg"));
        item8Image.setBounds(650, 250, 100, 100);
     
        JLabel item8Name = new JLabel("Drink");
		item8Name.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item8Name.setBounds(650, 360, 100, 25);

        JLabel item8Price = new JLabel("Price: "+object.d+" TK");
		item8Price.setFont(new Font("CONSOLAS",Font.BOLD,20));
        item8Price.setBounds(650, 385, 150, 25);

      
		
		frame.setBounds(150,50,1280,720);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
        frame.setVisible(true);
		
		frame.add(item1Image);
		frame.add(item1Name);
		frame.add(item1Price);

		
		frame.add(item2Image);
		frame.add(item2Name);
		frame.add(item2Price);
	
		frame.add(item3Image);
		frame.add(item3Name);
		frame.add(item3Price);

		frame.add(item4Image);
		frame.add(item4Name);
		frame.add(item4Price);
	
	
		frame.add(item5Image);
		frame.add(item5Name);
		frame.add(item5Price);

		
		frame.add(item6Image);
		frame.add(item6Name);
		frame.add(item6Price);


		frame.add(item7Image);
		frame.add(item7Name);
		frame.add(item7Price);


		frame.add(item8Image);
		frame.add(item8Name);
		frame.add(item8Price);


		frame.add(button1);
		frame.add(button2);
		
		frame.add(label);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			frame.dispose();
			new FoodItemManagement();
			
		}
		
		if(e.getSource()==button2)
		{
			frame.dispose();
			//new AdminOption();
			
		}
	}
	
	public static void main(String args[]){
		
		ShowChange showChange = new ShowChange();
		
	}
	
}