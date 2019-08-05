package content;

public class MainipulationMethods2 {

	public static void main(String[] args) {
		String str1 = "This is the test string";

		
 
//		System.out.println("substring:" + str1.substring(5 , 16));
//        String str2 = str1.substring(0,4);
//        System.out.println("substring str2 = str1  = 0-4 : " + str2);
//        System.out.println();
        String str3 = "Hello ";
        String str4 = "World";
        String str5;
        System.out.println("str3 concat str4: " + str3.concat(str4));
        str5 = str3.concat(str4);
        System.out.println(str5);
	}

}
