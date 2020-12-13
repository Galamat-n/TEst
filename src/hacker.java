import java.util.LinkedHashSet;
import java.util.Set;

public class hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 10, 20, 20, 30 };
		int count = 0;
		Set<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				count++;
				set.remove(arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
		
		System.out.println(count);

	}

}
