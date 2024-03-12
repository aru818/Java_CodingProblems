package abstractDesignPattern;

public class Client {
public static void main(String[] args) {
	Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
	employee.name();
	employee.salary();
	
}
}
