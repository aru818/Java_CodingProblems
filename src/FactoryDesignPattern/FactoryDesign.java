package FactoryDesignPattern;

public class FactoryDesign {
	public static Employee getClient(String empType) {
		if (empType.trim().equalsIgnoreCase("JAVA DEVELOPER")) {

			return new JavaDeveloper();
		}
		if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return new WebDeveloper();
		} else {
			return null;
		}

	}
}
