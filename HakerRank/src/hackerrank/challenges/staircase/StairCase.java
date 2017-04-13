package hackerrank.challenges.staircase;

public class StairCase {

	static void StairCase(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i-1; j > 0; j--) {
				System.out.print(" ");
			}			
			for (int j = i; j >= 0; j--) {
				System.out.print("#");
			}

			System.out.println();

		}
	}

	public static void main(String[] args) {
		StairCase(6);
	}
}
