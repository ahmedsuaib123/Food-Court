import java.io.*;
import java.util.*;

public class EmployeeFileIO {

    public static void loadFromFile(EmployeeList employeeList) {
        try {
            Scanner sc = new Scanner(new File("./FileIO/EmployeeData.txt"));
            while (sc.hasNextLine()) {
                String data[] = sc.nextLine().split(";");
				
                String id = data[0];
				String name = data[1];
				int age = Integer.parseInt(data[2]);
                String gender = data[3];
				String phoneNumber = data[4];
				String job = data[5];
				double salary = Double.parseDouble(data[6]);
				String restaurantName = data[7];
				
                Employee employee = new Employee(id, name, age, gender, phoneNumber, job, salary, restaurantName);
				employeeList.insert(employee);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployeeInFile(Employee employee) {
        try {
            FileWriter writer = new FileWriter(new File("./FileIO/EmployeeData.txt"), true);
            String data = employee.getEmployeeId() + ";" + employee.getName() + ";" +
                    employee.getAge() + ";" + employee.getGender() + ";" +
                    employee.getPhoneNumber() + ";" + employee.getJob() + ";" +
                    employee.getSalary() + ";" + employee.getRestaurantName() + ";" + "\n";
            writer.write(data);
			//writer.newLine();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* 
	public static void updateEmployeeInFile(EmployeeList employeeList) {
        try {
            FileWriter writer = new FileWriter(new File("./FileIO/EmployeeData.txt"));
            Employee[] employees = employeeList.getAllEmployees();

            String allData = "";

            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    String data = employees[i].getEmployeeId() + ";" + employees[i].getName() + ";" +
                            employees[i].getAge() + ";" + employees[i].getGender() + ";" +
                            employees[i].getPhoneNumber() + ";" + employees[i].getJob() + ";" +
                            employees[i].getSalary() + ";" + employees[i].getRestaurantName() + "\n";

                    allData += data;
                }
            }
            writer.write(allData);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
	
	public static void saveEmployeesInFile(EmployeeList employeeList){
		try {
		FileWriter writer = new FileWriter("./FileIO/EmployeeData.txt");
		Employee employees[] = employeeList.getAllEmployees();
		
		for(int i=0;i<employees.length;i++){
			if(employees[i]!=null){
				writer.write(employees[i].getEmployeeInfoAsString()+"\n");
			}
		}
		
		writer.close();
		} catch (IOException e) {
			System.out.println("Cannot Write in File");
		}
	}
	
	public static void updateEmployeeInFile(Employee employee) {
    try {
        File file = new File("./FileIO/EmployeeData.txt");
        File tempFile = new File("./FileIO/tempEmployeeData.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String[] data = currentLine.split(";");
            if (data[0].equals(employee.getEmployeeId())) {
                currentLine = employee.getEmployeeId() + ";" + employee.getName() + ";" +
                        employee.getAge() + ";" + employee.getGender() + ";" +
                        employee.getPhoneNumber() + ";" + employee.getJob() + ";" +
                        employee.getSalary() + ";" + employee.getRestaurantName();
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }

        writer.close();
        reader.close();

        boolean successful = tempFile.renameTo(file);
        if (!successful) {
            throw new IOException("Could not rename temp file to overwrite original.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

}
