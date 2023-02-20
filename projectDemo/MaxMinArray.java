package projectDemo;

public class MaxMinArray {

	public static void main(String[]args) {
		
		int val[]= {34,45,24,56,67};
		
		int max=val[0];
		
		for(int i=1;i<val.length;i++) {
			
			if(val[i]>max) {

				max=val[i];
				
			}
		}
	
		System.out.println("The maximum number in the array is :"+ max);

		int val2[]= {200,345,500,10,34};
		
         int min=val2[0];
		
		for(int i=1;i<val2.length;i++) {
			
			if(val2[i]<min) {

				min=val2[i];
				
			}
		}
		
		System.out.println("The minimum number in the array is :"+ min);
		
	}
	
}
