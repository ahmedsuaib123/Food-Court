
public class Employee {
	private String employeeId;
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;
    private String job;
    private double salary;
	private String restaurantName;
	
	public Employee(){}

    public Employee(String employeeId,String name, int age, String gender, String phoneNumber, String job, double salary, String restaurantName) {
        this.employeeId = employeeId;
		this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.job = job;
        this.salary = salary;
		this.restaurantName = restaurantName;
    }
	
	public void setEmployeeId(String employeeId) {
         this.employeeId = employeeId;
    }
	
	
	public String getEmployeeId() {
        return employeeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
	
	public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void showEmployeeInfo() {
		System.out.println( "Employee ID   : " + employeeId);
        System.out.println("Employee Name  : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Gender         : " + gender);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("Job            : " + job);
        System.out.println("Salary         : " + salary);
		System.out.println("Restaurant Name: " + restaurantName);
    }
	
	public String getEmployeeInfoAsString() {
    return  "Employee ID      :  " + employeeId + "\n" +
            "Employee Name    :  " + name + "\n"       +
            "Age              :  " + age + "\n"        +
            "Gender           :  " + gender + "\n"     +
            "Job              :  " + job + "\n"        +
            "Salary           :  " + salary            + "\n" +
			"Restaurant Name  :  " + restaurantName            + "\n";
}
}
