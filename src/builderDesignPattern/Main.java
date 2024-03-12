package builderDesignPattern;

public class Main {
	public static void main(String[] args) {
		
		User build = new User.UserBuilder().setUserName("Arvind").setUserId("12").setEmailId("abs@gmail.com").build();
		System.out.println(build);
	}
}
