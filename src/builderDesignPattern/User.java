package builderDesignPattern;
// step to understand is given below

public class User {
	private String userId;
	private String userName;
	private String emailId;

	
	 
	 public String getUserId() { return userId; }
	 
	 public String getUserName() { return userName; }
	  
	  public String getEmailId() { return emailId; }
	 
	 
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
	}

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.emailId = builder.emailId;
		this.userName = builder.userName;
	}

	static class UserBuilder {
		private String userId;
		private String userName;
		private String emailId;

		
		 public UserBuilder() {
		 }

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			 return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
		 return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			 return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}
// first create java class take instance variable private or final make private constructor, getter
// create another inner class and set setter as public do method chaining in setter method
// make a method which create new constructor of main class, give (this) method instance of inner class
// main class constructor will take object of inner class  as a parameter