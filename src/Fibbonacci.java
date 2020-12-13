
public class Fibbonacci {

	public static void main(String[] args) {
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+" ");
			c=a+b;//1 2 3 
			a=b;//1 1 2
			b=c;//1 2 3
		}

	}

}
