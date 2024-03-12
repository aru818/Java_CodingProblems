package FactoryDesignPattern;

public class MainClass {
public static void main(String[] args) {
	Employee client = FactoryDesign.getClient("java developer");
	System.out.println(client.getSalary());
}
}
