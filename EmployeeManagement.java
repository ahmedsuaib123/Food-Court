

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

public class EmployeeManagement extends JFrame implements ActionListener {
	Font titleFont = new Font("Cambria",Font.BOLD,30);
	Font font15 = new Font("Cambria",Font.BOLD,15);

    JTextField idTextField, nameTextField, ageTextField, phoneNumberTextField, salaryTextField, restaurantTextField,searchTextField,deleteTextField;
    JButton addButton,updateButton,searchButton,deleteButton,clearButton,showAllButton;
    JTextArea setTextArea;
    JComboBox genderComboBox, jobComboBox, restaurantComboBox;
	//private JTextArea textArea;

    EmployeeList employeeList;

    public EmployeeManagement(EmployeeList employeeList) {
        
        super.setTitle("Food Court Online Order System");
		super.setIconImage(new ImageIcon("").getImage());
        super.setSize(960, 800);
		super.setLocationRelativeTo(null); 
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        JLabel title = new JLabel("Employee Management System");
        title.setBounds(245, 0, 500, 50);
        Font titleFont = new Font("Cambria", Font.BOLD, 30);
        title.setFont(titleFont);
        super.add(title);
		
		JLabel subtitle = new JLabel("Employee Informations");
        subtitle.setBounds(323, 40, 500, 50);
        subtitle.setFont(new Font("Cambria", Font.BOLD, 25));
        super.add(subtitle);

        

        JLabel idLabel = new JLabel("Employee ID:");
        idLabel.setBounds(20, 70, 80, 20);
        add(idLabel);

        idTextField = new JTextField();
        idTextField.setBounds(20,100,200,30);
        add(idTextField);

        JLabel nameLabel = new JLabel("Employee Name:");
        nameLabel.setBounds(20,130,200,30);
        super.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setBounds(20,160,200,30);
        add(nameTextField);

        JLabel ageLabel = new JLabel("Employee Age:");
        ageLabel.setBounds(20,190,200,30);
        add(ageLabel);

        ageTextField = new JTextField();
        ageTextField.setBounds(20,220,200,30);
        add(ageTextField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20,250,200,30);
        add(genderLabel);

        genderComboBox = new JComboBox<>(new String[]{"Male", "Female"});
        genderComboBox.setBounds(20,280,200,30);
        add(genderComboBox);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setBounds(20,310,200,30);
        add(phoneNumberLabel);

        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(20,340,200,30);
        add(phoneNumberTextField);

        JLabel jobLabel = new JLabel("Job:");
        jobLabel.setBounds(20,370,200,30);
        add(jobLabel);

        jobComboBox = new JComboBox<>(new String[]{"Kitchen Staff", "Waiter/Waitress", "Manager", "Accountant"});
        jobComboBox.setBounds(20,400,200,30);
        add(jobComboBox);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(20,430,200,30);
        add(salaryLabel);
		
		salaryTextField = new JTextField();
        salaryTextField.setBounds(20,460,200,30);
        add(salaryTextField);
		
		JLabel restaurantLabel = new JLabel("Restaurant Name:");
        restaurantLabel.setBounds(20,490,200,30);
        add(restaurantLabel);
		
		restaurantComboBox = new JComboBox(new String[]{"The Kitchen", "SWARMA HOUSE", "Dhakaiya Chap", "TURKISH TASTE","Indian Dosa","LAZIZ","Meat Craft","Hydrabadi Handi","Waffle Nut","Spicy Varities Kabab & Soup","CHAPAI FOOD","Chayer Mela","STEAK FOOD","Live BBQ & Juice World","LEBANESE KABAB","Kerary Restaurant","DELHI DOSA","SUBWAY.BD","Fuchka Bangla"});
        restaurantComboBox.setBounds(20,520,200,30);
        add(restaurantComboBox);
		
		addButton = new JButton("ADD");
		addButton.setBounds(20,600,200,30); 
		//addButton.setBackground(Color.GREEN);
		addButton.setFont(font15);
		addButton.addActionListener(this);
		//addButton.addMouseListener(this);
		
		updateButton = new JButton("UPDATE");
		updateButton.setBounds(20,640,200,30);
		//updateButton.setBackground(Color.BLUE);
		updateButton.setForeground(Color.BLACK);
		updateButton.setFont(font15);
		updateButton.addActionListener(this);
		
		setTextArea = new JTextArea();
        setTextArea.setBounds(230,150,580,550);
        setTextArea.setFont(new Font("Cambria", Font.BOLD, 15));
		super.add(setTextArea);
		
		//reloadAllEmployees();
		
        setTextArea.setEditable(false);
		
		
		
        JScrollPane jsp = new JScrollPane(setTextArea);
        jsp.setBounds(230,100,460,573);
        add(jsp);
		
		
		JLabel searchLabel = new JLabel("Search By Employee ID");
		searchLabel.setBounds(700,70,200,30); //X,Y,W,H
		searchLabel.setFont(font15);
		super.add(searchLabel);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(700,100,200,30); //X,Y,W,H
		searchTextField.setFont(font15);
		super.add(searchTextField);
		
		searchButton = new JButton("SEARCH");
        searchButton.setBounds(700,130,200,30); //X,Y,W,H
        //deleteButton.setBackground(Color.RED);
        searchButton.setForeground(Color.BLACK);
        searchButton.setFont(font15);
        searchButton.addActionListener(this);
        super.add(searchButton);

        
		
		JLabel deleteLabel = new JLabel("Delete By Employee ID");
		deleteLabel.setBounds(700,160,200,30); //X,Y,W,H
		deleteLabel.setFont(font15);
		super.add(deleteLabel);
		
		
        deleteTextField = new JTextField();
		deleteTextField.setBounds(700,190,200,30); //X,Y,W,H
		deleteTextField.setFont(font15);
		super.add(deleteTextField);
		
		deleteButton = new JButton("DELETE");
		deleteButton.setBounds(700,220,200,30); //X,Y,W,H
		//deleteButton.setBackground(Color.RED);
		deleteButton.setForeground(Color.BLACK);
		deleteButton.setFont(font15);
		deleteButton.addActionListener(this);
		super.add(deleteButton);
		
		showAllButton = new JButton("SHOW ALL");
		showAllButton.setBounds(700,600,200,30); //X,Y,W,H
		//showAllButton.setBackground(Color.PINK);
		showAllButton.setForeground(Color.BLACK);
		showAllButton.setFont(font15);
		showAllButton.addActionListener(this);
		super.add(showAllButton);
	
		
		clearButton = new JButton("CLEAR SCREEN");
		clearButton.setBounds(700,640,200,30); //X,Y,W,H
		//clearButton.setBackground(Color.DARK_GRAY);
		clearButton.setForeground(Color.BLACK);
		clearButton.setFont(font15);
		clearButton.addActionListener(this);
		super.add(clearButton);
		
		
		super.add(addButton);
		super.add(updateButton);
		
		JButton backButton = new JButton("BACK");
        backButton.setBounds(75,685,200,30);
       	backButton.setForeground(Color.BLACK);
		backButton.setSize(90,35);
		backButton.addActionListener(this);
        super.add(backButton);
		
		JButton logoutButton = new JButton("LOGOUT");
        logoutButton.setBounds(755,685,200,30);
       	logoutButton.setForeground(Color.BLACK);
		logoutButton.setSize(90,35);
		logoutButton.addActionListener(this);
        super.add(logoutButton);

        

        setVisible(true);
		
		this.employeeList = employeeList;
    }

   @Override
   public void actionPerformed(ActionEvent e) {
     try {
        if (e.getSource() == addButton) {
            System.out.println("ADD CLICKED");
            
            if (!idTextField.getText().isEmpty() &&
                !nameTextField.getText().isEmpty() &&
                !ageTextField.getText().isEmpty() &&
                genderComboBox.getSelectedItem() != null &&
                !phoneNumberTextField.getText().isEmpty() &&
                jobComboBox.getSelectedItem() != null &&
                !salaryTextField.getText().isEmpty() &&
                restaurantComboBox.getSelectedItem() != null) {

                
                String id = idTextField.getText();
                String name = nameTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());
                String gender = (String) genderComboBox.getSelectedItem();
                String phoneNumber = phoneNumberTextField.getText();
                String job = (String) jobComboBox.getSelectedItem();
                double salary = Double.parseDouble(salaryTextField.getText());
                String restaurantName = (String) restaurantComboBox.getSelectedItem();

                if( employeeList.getById(idTextField.getText()) == null){
                Employee newEmployee = new Employee(id, name, age, gender, phoneNumber, job, salary, restaurantName);
                
                employeeList.insert(newEmployee);
				EmployeeFileIO.writeEmployeeInFile(newEmployee);

                JOptionPane.showMessageDialog(this, "Employee added successfully.");
                clearFields();
				reloadAllEmployees();
				} else{
					JOptionPane.showMessageDialog(this,"This ID is Already in use, Provide Another ID","Provide Unique ID",JOptionPane.ERROR_MESSAGE);
				}
            } else {
                JOptionPane.showMessageDialog(this, "Please Provide all Information for the Employee", "Missing Information", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == searchButton) {
            System.out.println("SEARCH CLICKED");
           
			
			Employee employee = employeeList.getById(searchTextField.getText());
			if(employee!=null){
				setTextArea.setText( employee.getEmployeeInfoAsString() );
			}
			else{
				
				JOptionPane.showMessageDialog(this,"NO EMPLOYEE FOUND.","Alert",JOptionPane.WARNING_MESSAGE);
			}
			searchTextField.setText("");
			//setTextArea.setText( searchTextField.getText() );
        } else if (e.getSource() == deleteButton) {
            System.out.println("Delete Clicked");
			employeeList.deleteById(deleteTextField.getText());
			reloadAllEmployees();
			deleteTextField.setText("");
        } else if (updateButton == e.getSource()) {
            System.out.println("UPDATE CLICKED");

             if (!idTextField.getText().isEmpty()) {
                   Employee employee = employeeList.getById(idTextField.getText());
            if (employee != null) {
            if (!nameTextField.getText().isEmpty()) {
                employee.setName(nameTextField.getText());
            }

            if (!ageTextField.getText().isEmpty()) {
                int age = Integer.parseInt(ageTextField.getText());
                employee.setAge(age);
            }

            if (genderComboBox.getSelectedItem() != null) {
                String gender = (String) genderComboBox.getSelectedItem();
                employee.setGender(gender);
            }

            if (!phoneNumberTextField.getText().isEmpty()) {
                employee.setPhoneNumber(phoneNumberTextField.getText());
            }

            if (jobComboBox.getSelectedItem() != null) {
                String job = (String) jobComboBox.getSelectedItem();
                employee.setJob(job);
            }

            if (!salaryTextField.getText().isEmpty()) {
                double salary = Double.parseDouble(salaryTextField.getText());
                employee.setSalary(salary);
            }

            if (restaurantComboBox.getSelectedItem() != null) {
                String restaurantName = (String) restaurantComboBox.getSelectedItem();
                employee.setRestaurantName(restaurantName);
            }

            
            //employeeList.update(employee);
            EmployeeFileIO.updateEmployeeInFile(employee);

            JOptionPane.showMessageDialog(this, "Employee updated successfully.");
            clearFields();
            reloadAllEmployees();
              } else {
            JOptionPane.showMessageDialog(this, "No Employee found with this ID", "Employee Not Found", JOptionPane.ERROR_MESSAGE);
              }
           } else {
             JOptionPane.showMessageDialog(this, "Please provide the ID of the Employee", "Missing Information", JOptionPane.ERROR_MESSAGE);
          }
        } else if (e.getSource() == showAllButton) {
            System.out.println("SHOW ALL CLICKED");
			setTextArea.setText( employeeList.getAll() );
        } else if (e.getSource() == clearButton) {
            System.out.println("CLEAR CLICKED");
            
            setTextArea.setText("");
		} else if (e.getActionCommand().equals("BACK")){
			AdminHomePage adminHomePage = new AdminHomePage();
			adminHomePage.setVisible(true);
	 		this.dispose();
			
	 	}else if(e.getActionCommand().equals("LOGOUT")){
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
			super.setVisible(false);
		}
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void clearFields() {
    idTextField.setText("");
    nameTextField.setText("");
    ageTextField.setText("");
    genderComboBox.setSelectedIndex(0);
    phoneNumberTextField.setText("");
    jobComboBox.setSelectedIndex(0);
    salaryTextField.setText("");
    restaurantComboBox.setSelectedIndex(0);
}

	
	public static void main(String []args){
		
		EmployeeList employeeList = new EmployeeList();
        EmployeeManagement em = new EmployeeManagement(employeeList);
        em.reloadAllEmployees();
    }
	
	
	public void reloadAllEmployees(){
		
		setTextArea.setText(employeeList.getAll());
	}
}
