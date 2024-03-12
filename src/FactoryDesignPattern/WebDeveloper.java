package FactoryDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("i am a webdeveloper");
		return 40000;
	}

}
