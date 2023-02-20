package projectDemo;

import java.util.Arrays;

public class CheckArray {

	public static void main(String[]args) {
		
		int arr1[]= {1,2,3,4,5,6};
		
		int arr2[]= {1,2,3,4,5,6};
		
		boolean boo=Arrays.equals(arr1, arr2);
		
		if(boo==true) {
			
			System.out.println("The given array is equal ");
		}else {
			System.out.println("The given array is not equal");
		}
		
		
		
	}
	
}
