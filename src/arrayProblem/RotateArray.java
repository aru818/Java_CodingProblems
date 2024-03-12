package arrayProblem;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 9 };

		int n = 2;

		for (int i = arr.length - n; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		for (int i = 0; i < arr.length - (n); i++) {

			System.out.print(arr[i] + " ");

		}

	}
}
