
import java.lang.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

public class FoodCourtManagement extends JFrame /*implements ActionListener*/{
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);
	
    public FoodCourtManagement() {
        super.setTitle("Food Court Management");
		super.setIconImage(new ImageIcon("").getImage());
        super.setSize(960, 750);
		super.setResizable(false);
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		super.setVisible(true);
	}
       
	public static void main(String []args){
		new FoodCourtManagement();
	}
}
