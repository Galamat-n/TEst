import java.util.Scanner;

public class Staircase {
	
	public static void stair(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		stair(n);
		
		scan.close();
	}
}
