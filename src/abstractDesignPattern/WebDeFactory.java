package abstractDesignPattern;

public class WebDeFactory  extends EmployeeAbstractFactory{

	@Override
	public Employee creatEmployee() {
		
		return new WebDeveloper();
	}

}
