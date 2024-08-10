import java.lang.*;

public class EmployeeList {
	
    private Employee employees[];

    public EmployeeList() {
        employees = new Employee[100];
    }

    public EmployeeList(int size) {
        employees = new Employee[size];
    }

    public void insert(Employee employee) {
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Insertion Successful");
        } else {
            System.out.println("Insertion Failed");
        }
    }

    public Employee getById(String id) {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null){
			if(employees[i].getEmployeeId().equals(id)) {
				return employees[i];
			}
        }
    }
    return null;
    }

    public void deleteById(String id) {
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
				if(employees[i].getEmployeeId().equals(id)) {
					employees[i] = null;
					flag = true;
					break;
				}
            }
        }
        if (flag) {
            System.out.println("Deletion Successful");
        } else {
            System.out.println("Deletion Failed");
        }
    }


    public String showAll() {
		System.out.println("++++++ List of All Available Employees ++++++");
        StringBuilder allEmployeeInfo = new StringBuilder();
        for (Employee employee : employees) {
			if (employee != null) {
				allEmployeeInfo.append("-------------------------------------------------------------------------------\n");
                allEmployeeInfo.append(employee.getEmployeeInfoAsString()).append("\n");
            }
        }
        allEmployeeInfo.append("--------------------------------------------------------------------------------------------\n");
        return allEmployeeInfo.toString();
	}


   public String getAll(){
	  
		String allEmployeeInfo = "";
		for(int i=0;i<employees.length;i++){
			if(employees[i] != null){ 
				allEmployeeInfo += "----------------- "+  employees[i].getEmployeeId() +" ---------------\n";
				allEmployeeInfo += employees[i].getEmployeeInfoAsString();
			}
		}
		allEmployeeInfo += "----------------------------------------\n";
		return allEmployeeInfo;
	}
	
    public Employee[] getAllEmployees() {
        return employees;
    }
	
	

public void updateById(String id, Employee updatedEmployee) {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null && employees[i].getEmployeeId().equals(id)) {
            employees[i] = updatedEmployee;
            System.out.println("Update Successful");
            return;
        }
    }
    System.out.println("Update Failed: Employee not found");
}


}
