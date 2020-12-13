
public class SwapNumbers {
	
	public static int z=10;

	public static void main(String[] args) {
		
		//Swap numbers
	
		int a=10;
		int b=6;
		
		a=a+b; //16
		
		b=a-b; //16-6=10
		
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		// swap strings
		
		String x="Hello";
		String y="Worlds";
		
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
		

	}

}
