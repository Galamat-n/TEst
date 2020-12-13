import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		DecimalFormat df=new DecimalFormat(".000000");
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int[] ar=new int[n];
		
		double positive=0;
		double negative=0;
		double zero=0;
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
			
			if(ar[i]>0) {
				positive++;
			}else if(ar[i]<0) {
				negative++;
			} else if(ar[i]==0) {
				zero++;
			}
		}
		
		System.out.println("0"+df.format(positive/n));
		System.out.println("0"+df.format(negative/n));
		System.out.println("0"+df.format(zero/n));
		
		
	}
}
