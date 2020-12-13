
public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPalindrome=true;
		
		String s="race car";
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		
		String str = "Todays is Sunday";
		String reversed = "";
		String[] array = str.split(" ");
		
		for (int i = array.length - 1; i >= 0; i--) {
		reversed = reversed + array[i]+" ";
		}
		System.out.println(reversed);

	}

}
