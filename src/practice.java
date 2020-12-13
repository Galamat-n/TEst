import java.util.Scanner;

public class practice {

	public static long aVeryBigSum(int[] ar) {
		long sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		
		System.out.println(aVeryBigSum(ar));

	}

}
