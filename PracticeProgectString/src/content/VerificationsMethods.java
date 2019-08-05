package content;

public class VerificationsMethods {

	public static void main(String[] args) {
		String str1 = "This is the test string test test ";

		
 
		System.out.println("upper case :" + str1.toUpperCase());
		System.out.println("lower case :" + str1.toLowerCase());
		System.out.println("Replace to verify insted test  :" + str1.replace("test", "verify"));
		String str2 =   str1.replace("test", "practice");
		System.out.println("srt1 content is: " + str1); 
		System.out.println("srt1 content is: " + str2);

		
		
	
	}

}
