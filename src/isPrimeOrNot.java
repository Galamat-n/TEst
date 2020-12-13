
public class isPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPrime=true;
		
		int given=37;
		
		if(given>1) {
			for(int i=2;i<given/2;i++) {
				if(given%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		
		System.out.println(isPrime);

	}

}
