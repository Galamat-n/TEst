import java.util.Scanner;

public class BirthdayCakeCandels {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int count=0;
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]==max) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
