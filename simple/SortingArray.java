package projectDemo;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int[] Array= {56,45,34,23,12};
		
		
		System.out.println(" Before the array are"+" "+Arrays.toString(Array));
		int number=Array.length;
		for(int i=0;i<number-1;i++) {   
			
			for(int j=0;j<number-1;j++) // this iteration the array
			{
				
				if(Array[j]>Array[j+1])
				{	
					int sort=Array[j];
					Array[j]=Array[j+1];  //here j is 1 elements and j+1 is 2 elements
					Array[j+1]=sort; 
				}
				
			}
			
		}
		
		System.out.println(" After the array are"+" "+Arrays.toString(Array));
		
		// This is build-in method for sort the array 
			
		int[] Array2 = {9,8,7,6,5,4,3,2,1};
		
		System.out.println(" Before the array are"+" "+Arrays.toString(Array2));

		Arrays.sort(Array2);
		
		System.out.println(" After the array are"+" "+Arrays.toString(Array2));
		
		
	}

}
