package projectDemo;

public class MissingArray {

	public static void main(String[] args) {
		//find the missing array 
		
		int array[]= {1,2,3,4,5,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			
			sum=sum+array[i]; //adding the elements in the array.
		}
		
		System.out.println("Sum of elements in the array:"+ sum);
		
		int sum1=0;
		for(int i=1;i<=10;i++) {    
			
			sum1=sum1+i;   //adding the range of array(0-9)
		}
		System.out.println("sum of the range in array:"+ sum1);
		
		System.out.println("Missing number in the array is:" + (sum1-sum));
		
	}

}
