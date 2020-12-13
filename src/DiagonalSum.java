import java.util.Scanner;

public class DiagonalSum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int[][] ar=new int[n][n];
		
		int firstDiagonal=0;
		int secondDiagonal=0;
		
		for(int a=0;a<ar.length;a++) {
			for(int b=0;b<ar[a].length;b++) {
				ar[a][b]=scan.nextInt();
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			firstDiagonal=firstDiagonal+ar[i][i];
		}
		
		for(int i=0;i<ar.length;i++) {
			secondDiagonal=secondDiagonal+ar[i][ar.length-(i+1)];
		}
		
		
		
		System.out.println(Math.abs(firstDiagonal-secondDiagonal));
		
		

	}

}
