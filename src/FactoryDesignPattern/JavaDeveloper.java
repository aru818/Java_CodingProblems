package FactoryDesignPattern;

public class JavaDeveloper implements Employee{

	@Override
	public int getSalary() {
		System.out.println("i am a java developer");
		return 50000;
	}

	
}
