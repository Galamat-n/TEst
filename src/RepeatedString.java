import java.util.Scanner;

public class RepeatedString {
	public static void printTable(int n) {
		// Write your code here
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (n > 3 && n < 12) {
					if (row * col >= 10) {
						System.out.print(row * col + " ");
					} else {
						System.out.print(row * col + "  ");
					}
				} else if (n == 12) {
					if (row * col >= 10) {
						System.out.print(row * col + "  ");
					} else if (row * col >= 100) {
						System.out.print(row * col + " ");
					} else {
						System.out.print(row * col + "   ");
					}
				} else {
					System.out.print(row * col + " ");
				}
			}
			System.out.println();
		}
	}

}
