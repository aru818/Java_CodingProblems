package arrayProblem;

public class SumArray {
public static void main(String[] args) {
	int [] arr= {4,4,7,3,5};
	  
	   int targetNum=8;
	 
	   for(int i=0; i<arr.length; i++)
	   
	   {for(int j=i+1; j<arr.length; j++) {
		   
		   if(arr[i]+arr[j]==targetNum) {
			   
			   System.out.println(i+ " "+j);
			   
		   }
		   
	   }
		   
	   }
}
}
