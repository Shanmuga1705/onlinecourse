package automationProject;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// Arrays
		int[] arr2 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		// check if array has multiple of 2

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
			} else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Lakshmi");
		a.add("Vignesh");
		a.add("Aravind");
		a.add("Sundar");
		System.out.println(a.get(2));
	}
}
