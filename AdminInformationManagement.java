import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import FileIO.*;

public class AdminInformationManagement extends JFrame implements ActionListener {

    private Container c;
    private ImageIcon icon;
    private JLabel title;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton refreshButton, deleteButton, addButton, exitButton, backButton, nBtn, logoutButton;
    private Cursor cursor;

    private String[] column = { "Username", "Password"};
    private String[] rows = new String[4];
	
	private Login login;
	private AdminHomePage adminHomePage;

    AdminInformationManagement() {

        super.setTitle("Food Court Online Order System");
        super.setSize(700, 670);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        f1 = new Font("Cambria", Font.BOLD, 40);
        f2 = new Font("Cambria", Font.BOLD, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        title = new JLabel("Admin Data");
        title.setBounds(230, 10, 400, 80);
        title.setFont(f1);
        c.add(title);

        refreshButton = new JButton("Refresh");
        refreshButton.setBounds(54, 418, 184, 50);
        refreshButton.setFont(f2);
        refreshButton.setCursor(cursor);
        refreshButton.setForeground(Color.BLACK);
        c.add(refreshButton);
		refreshButton.addActionListener(this);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(248, 418, 184, 50);
        deleteButton.setFont(f2);
        deleteButton.setCursor(cursor);
        deleteButton.setForeground(Color.BLACK);
        c.add(deleteButton);
		deleteButton.addActionListener(this);

        addButton = new JButton("Add");
        addButton.setBounds(442, 418, 184, 50);
        addButton.setFont(f2);
        addButton.setCursor(cursor);
        addButton.setForeground(Color.BLACK);
        c.add(addButton);
		addButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setBounds(54, 480, 278, 50);
        exitButton.setFont(f2);
        exitButton.setCursor(cursor);
        exitButton.setForeground(Color.BLACK);
        c.add(exitButton);
		exitButton.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setBounds(342, 480, 284, 50);
        backButton.setFont(f2);
        backButton.setCursor(cursor);
        backButton.setForeground(Color.BLACK);
        c.add(backButton);
		backButton.addActionListener(this);
		
		logoutButton = new JButton("Logout");
        logoutButton.setBounds(54, 550, 575, 50);
        logoutButton.setFont(f2);
        logoutButton.setCursor(cursor);
        logoutButton.setForeground(Color.BLACK);
        c.add(logoutButton);
		logoutButton.addActionListener(this);


        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        //table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(285);
        table.getColumnModel().getColumn(1).setPreferredWidth(290);
        

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 578, 300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

        String file = ".\\FileIO\\UserData.txt";
        String temp = ".\\FileIO\\temp.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Username")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12);
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11);
                    
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Refresh")){
			
	 		this.setVisible(false);
            AdminInformationManagement frame = new AdminInformationManagement();
            frame.setVisible(true);
				
	 	} else if (e.getActionCommand().equals("Back")){
			
			AdminHomePage adminHomePage = new AdminHomePage();
			adminHomePage.setVisible(true);
	 		this.dispose();
			
	 	} else if (e.getActionCommand().equals("Exit")){
			
	 		this.dispose();
			System.exit(0);
			
	 	} else if(e.getActionCommand().equals("Logout")){
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
			super.setVisible(false);
		}
		
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AdminInformationManagement().setVisible(true);
        });
    }
}



