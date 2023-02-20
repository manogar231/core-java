package projectDemo;

public class LinearSearch {

	
	//declare thr arrary and set the target value that we want to search
	// create a method for linearsearch in that 
	//check if the array is empty or not if empty return 0
	//use foreach loop to itrator the elements in the array 
	//And check the target element in the array if its equal to target then return 1
	public static void main(String[] args) {
		
		int[] array= {23,34,45,56,67,12};
		int target=34;
		boolean notfound=false;
		//int result=LinearSearch(array,target);
		//System.out.println(result);
		
		if(array.length==0)
			System.out.println("The Array is Empty");
		for(int number:array) {
			
			if(number==target) {
				System.out.println("The target element is found");
				notfound=true;
				break;
			}
		}
			
		if(notfound==false)
			System.out.println("YOur target elements is not in the Array list");

	}

}
      /* static int LinearSearch(int[] array, int target) {
		
		if(array.length==0)
	   return 0;	

		for(int numbers:array) {
			if(numbers==target) {
				
				return 1;
				
			}
		}
		//System.out.print("The target element is not in array :");
		return -1;
	}*/
	

	