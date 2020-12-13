
public class smallestPositiveInArray {
	
	public static int solution(int[] arr) {
		int smallest=1;
		
		for(int i=0;i<arr.length;i++) {
			if(smallest==arr[i]) { //smallest = 3
				smallest++;
				i=0;
			}
		}
		
		if(smallest>0) {
			return smallest;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,1,4,7,8,6,3};
		
		int i=smallestPositiveInArray.solution(arr);
		System.out.println(i);
		
	
}
}


