package passbyvalue;

public class Driver1 {

	public static void main(String[] args) {
		// create a reference
		InterviewBitTest ibTestObj = new InterviewBitTest(20);
		// Pass the reference to updateObject Method
		updateObject(ibTestObj);
		// After the updateObject is executed, check for the value of num in the object.
		System.out.println(ibTestObj.num);
	}

	public static void updateObject(InterviewBitTest ibObj) {
		// Point the object to new reference
		ibObj = new InterviewBitTest();
		// Update the value
		ibObj.num = 50;
		
	}
}
