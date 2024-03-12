package abstractDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee creatEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
