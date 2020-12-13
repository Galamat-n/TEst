import java.util.Set;
import java.util.TreeSet;

public class MiniMaxSum {

	public static void main(String[] args) {
		
		int minSum=0;
		int maxSum=0;
		
		TreeSet<Integer> tset=new TreeSet<>();
		
		int[] arr= {1,3,5,7,9};
		
		for(int i=0;i<arr.length;i++) {
			tset.add(arr[i]);
		}
		
		for (int i : tset) {
			minSum=minSum+i;
		}
		
		minSum=minSum-tset.last();
		
		System.out.println(minSum);
	}

}
