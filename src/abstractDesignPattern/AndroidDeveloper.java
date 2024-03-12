package abstractDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("hi am a android developer");
		return 500000;
	}

	@Override
	public String name() {
		return "Arvind Kumar";
	}

}
