
public class AlphaCharactersInTheString {

	public static void main(String[] args) {
		
		
		String given = "wefeqf878979797fewfewrf879797efds&^&^*^*^" ;
		
		given=given.replaceAll("[^A-Za-z]", "");
		
		System.out.println(given.length());
		
		String str="Today is Wendesday and it is Java Class";
		
		String[]arr= str.split(" ");
		
		System.out.println(arr.length);
		
		//Reverse String
		String sum="";
		for(int i=str.length()-1;i>=0;i--) {
			sum=sum+str.charAt(i);
		}
		System.out.println(sum);
		

	}

}
