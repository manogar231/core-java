package projectDemo;

public class DuplicateEle{

	public static void main(String[] args) {
		
		//check the duplicate elements is the array list 
		//for loop for getting each elements in array
		//another for loop for check each element is equal
		//if its equal then print the element if it is not print no deplicate
		//declare boolean if there is no duplicate
		
	 	String array[]= {"software","hardware","array","keyboard","java"};
	 	boolean bood=false;
	 	
	 	for(int i=0;i<array.length;i++) { //this for is for getting array elements one by one
	 		for(int j=i+1;j<array.length;j++) {  //this for loop for 
	 			
	 			if(array[i]==array[j]) {
	 				
	 				System.out.println("The duplicate element is:"+ array[i]);
	 				
	 				bood=true;
	 			}
	 			
	 		}
	 		
	 	}
	 	if(bood==false) {
	 		
 				System.out.println("There is no duplicate");
	 	}
	}

}
