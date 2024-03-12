package abstractDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("hello this is webdeveloper");
		return 500000;
	}

	@Override
	public String name() {
		return "John";
	}

}
