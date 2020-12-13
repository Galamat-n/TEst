
public class SecondLargestInTheArray {

	public static void main(String[] args) {
		
	
		int[] arr= {5,10,23,14,2,8};
		
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			} else if(arr[i]>secondLargest&& arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(secondLargest);

	}

}
