package test;

import java.util.Arrays;

public class DemoSplit {

	public static void main(String[] args) {
		String sTest = "Name: Mark";
		// לציין שהמפריד בין  התאים של המערכים הוא : "
//		נקודתים רווח
		String[] aTest = sTest.split(": ");
		
		System.out.println("my array: " + Arrays.toString(aTest));
		
//		 פנייה לערך לפי מספר התא
		System.out.println("cell 1 in array : " + aTest[0]);
		System.out.println("cell 2 in array : " + aTest[1]);

	}

}
