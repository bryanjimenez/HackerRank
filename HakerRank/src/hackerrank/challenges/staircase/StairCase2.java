package hackerrank.challenges.staircase;

public class StairCase2 {

	static void StairCase(int n) {

		int space = n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j<space) {
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			space--;

			System.out.println();

		}
	}

	public static void main(String[] args) {
		StairCase(6);
	}
}
